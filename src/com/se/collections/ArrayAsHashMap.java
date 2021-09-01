package com.se.collections;

public class ArrayAsHashMap {
	
	Object [][] hashArr  = new Object [10] [10];
	 int index = 0;

    public void put(Object key, Object value){
        //int index = key.hashCode();
       
        Object [] arr = {key, value};
        hashArr[index] = arr;
        index++;
    }

    public String get(Object key){
        int index = key.hashCode();
        Object [] arr = hashArr[index];
        return (String)arr[1];

    }

}
