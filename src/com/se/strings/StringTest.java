package com.se.strings;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringTest  extends Thread{



	public static void main(String[] args) {


        StringTest st = new StringTest();
        st.start();
		

	}

}

class Test2
{
    public int value;
    public int hashCode(){
        return (int)(value^5);
    }
}
