package com.coinvs.entity;

import java.io.Serializable;
/**
 * 
 * @author 
 *
 */
public class TotalNote implements Serializable {
	private String error_code;
	private String error_message;
	private Object data;
	private static final long serialVersionUID = 1110L;
	public TotalNote(){}
	
	public TotalNote(String error_code, String error_message, Object data) {
		super();
		this.error_code = error_code;
		this.error_message = error_message;
		this.data = data;
	}

	public String getError_code() {
		return error_code;
	}
	public void setError_code(String error_code) {
		this.error_code = error_code;
	}
	public String getError_message() {
		return error_message;
	}
	public void setError_message(String error_message) {
		this.error_message = error_message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((error_code == null) ? 0 : error_code.hashCode());
		result = prime * result + ((error_message == null) ? 0 : error_message.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TotalNote other = (TotalNote) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (error_code == null) {
			if (other.error_code != null)
				return false;
		} else if (!error_code.equals(other.error_code))
			return false;
		if (error_message == null) {
			if (other.error_message != null)
				return false;
		} else if (!error_message.equals(other.error_message))
			return false;
		return true;
	}
	@Override
	public String toString(){
		return error_code+","+error_message+","+data;
	}

	public static String getJson(TotalNote note){
		
		StringBuffer result = new StringBuffer(); 
		result.append("{\"error_code\":");
		if(note.getError_code()==null){
			result.append("null");
			
		}else{
			result.append("\"");
			result.append(note.getError_code());
			result.append("\"");
		}
		result.append(",\"error_message\":");
		if(note.getError_message() == null){
			result.append("null");
		}else{
			result.append("\"");
			result.append(note.getError_message());
			result.append("\"");
		}
		result.append(",\"data\":");
		if(note.getData() == null){
			result.append("null}");
		}
		 return result.toString();
	}
	
	public static void main(String[]args){
		TotalNote note = new TotalNote();
		note.setError_code("1");
		note.setError_message("adsfjdshjfkl");
		note.setData("sdafdsafs");
		String noteStr = getJson(note);
		System.out.println(noteStr);
		
		Object obj = new TotalNote();
		String className = obj.getClass().getName();
		
		
		System.out.println(className);
	}
}
