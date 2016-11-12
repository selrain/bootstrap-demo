package com.selrain.util;

import java.io.OutputStream;
import java.io.Writer;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonUtils {

	public static String writeObject(Object object, OutputStream os, Writer writer, boolean excludeNull) {
		if (object == null)	return null;
		if(object instanceof Map){
			try{((Map) object).remove(null);}catch(Exception e){}
		}
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(SerializationFeature.WRITE_NULL_MAP_VALUES);
		//不自动关闭流
		mapper.getFactory().disable(Feature.AUTO_CLOSE_TARGET);
		if(excludeNull) {
			mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		}

		try {
			SimpleModule newModule = new SimpleModule("UTCDateDeserializer", PackageVersion.VERSION);
			mapper.registerModule(newModule);
			if(os!=null){
				mapper.writeValue(os, object);
			}else if(writer!=null){
				mapper.writeValue(writer, object);
			}else{
				String data = mapper.writeValueAsString(object);
				return data;
			}
		} catch (Exception e) {
			//dbLogger.error("object:" + object + "\n" + LoggerUtils.getExceptionTrace(e, 15));
		}
		return null;
	}
}
