package com.codewithazam;

public class StringTutorial {

    public static void main(StringTutorial[] args) {
	// Two ways to code Strings in Java : 1.Literal; 2.with new Keyword(object)

        // 1. Literal  (stores in String pool inside the Heap)
        String text = "Java is a programming language. ";
        System.out.println(text);
        text = text.concat("Hello World!");
        System.out.println(text);
        System.out.println(text.hashCode());
        System.out.println(text.length());
        System.out.println(text.toUpperCase());
        String text1 = "Happy Thursday.";
        if( text == text1)
            System.out.println("text == text1");
        else
            System.out.println("text != text1");

        if (text.equals(text1))
            System.out.println("equal.");
        else
            System.out.println("not equal");

        // 2.Using new keyword.(creates instance of object inside Heap.)
        String ufc = new java.lang.String("Ultimate Fighting Championship.");
        System.out.println(ufc);
        String ufc1 = new java.lang.String();
        ufc1 = "Welcome to the main event! ";
        System.out.println(ufc1);
        java.lang.String ufc2 = ufc.concat(ufc1);
        System.out.println(ufc2);
        System.out.println(ufc.hashCode());

        //StringBuffer and StringBuilder

        //StringBuffer mutable, multi thread safe.
        StringBuffer buffer = new StringBuffer("Hello ");
        buffer.append("World!");
        System.out.println(buffer);
        System.out.println(buffer.capacity());
        System.out.println(buffer.reverse());

        //StringBuilder mutable, for single threaded program, faster than StringBuffer.
        StringBuilder builder = new StringBuilder("Happy ");
        builder.append("Birthday!");
        System.out.println(builder);
        System.out.println(builder.insert(5,69));

    }
}
