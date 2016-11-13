package com.selrain.util;

import java.io.Writer;

public class JsonDirectOut {
     private Writer writer;
     
     private Object json;
     
     
     public JsonDirectOut(Writer writer, Object json) {
		super();
		this.writer = writer;
		this.json = json;
	}

	public void write(){
    	 JsonUtils.writeObject(json, null, writer, false);
     }

	public Writer getWriter() {
		return writer;
	}

	public void setWriter(Writer writer) {
		this.writer = writer;
	}

	public Object getJson() {
		return json;
	}

	public void setJson(Object json) {
		this.json = json;
	}
     
     
}
