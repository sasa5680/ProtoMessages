package com.sasa5680;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerialClassConvertor {
	
	public static byte[] ClassToByte(Object o) throws IOException {
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream out = null;
	
		out = new ObjectOutputStream(bos);   
		out.writeObject(o);
		out.flush();
		  
		byte[] bytearry = bos.toByteArray();
		
		return bytearry;
	}
	
	public static Object ByteToClass(byte[] array) throws IOException, ClassNotFoundException {
		
		
		ByteArrayInputStream bis = new ByteArrayInputStream(array);
		ObjectInput in = null;
	
		in = new ObjectInputStream(bis);
		Object o = in.readObject(); 
		
		if (in != null)  in.close();
		    
		//System.out.println(o.list.get(0).ID);
		
		return o;
		
		
	}

}
