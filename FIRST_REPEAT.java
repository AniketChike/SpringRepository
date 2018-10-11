package com.psx.test;

public class FIRST_REPEAT {
	private String str;
	private int length;
	private char ch,ch1;
	private String status;
	private String ch2,ch3;
	
	public String repeateChar(String str){
		this.str = str;
		
		length = str.length();
	
		for(int i = 0;i<length-1;i++){
			
			ch = str.charAt(i);
			ch2 = Character.toString(ch);
			
			for(int j = i+1;j<length;j++){
			
				ch1 = str.charAt(j);
				ch3 = Character.toString(ch1);
	
				if(ch2.equals(ch3)){
					status = "true";
					break;
				}
				status = "false";
			}
			if(status.equals("true")){
				return ch2;
			}
		}
		return ch2;
	}
}