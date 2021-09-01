package com.se.ocjp;

import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		Consumer consumer1 = arg -> System.out.println(arg);

        consumer1.accept("Consumer1");

        Consumer consumer2 = arg -> System.out.println(arg);

        consumer2.accept("Consumer2");

        consumer2.andThen(consumer1).accept("over");

        consumer2.accept("Consumer1 again");

	}

}
