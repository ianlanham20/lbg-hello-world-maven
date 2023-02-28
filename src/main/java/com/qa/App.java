package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Alice"));
        System.out.println(sayHelloToSomeone("Bob"));
        System.out.println(sayHelloToSomeone("Charlie"));
        System.out.println(sayHelloToSomeone("Zena"));
        System.out.println(sayHelloToSomeone("Help me. im trapped in jenkins"));
        System.out.println(sayHelloToSomeone("Help me. im trapped in jenkins again"));
        System.out.println(sayHelloToSomeone("I keep forgetting -m on commits"));
        System.out.println(sayHelloToSomeone("I will get it right this time "));
        System.out.println(sayHelloToSomeone("Beats a day in the office"));
        System.out.println(sayHelloToSomeone("testing static Ip "));
        System.out.println(sayGoodbye());
  
    }

    public static String sayHello(){
        return "Hello World!";
    }

    public static String sayGoodbye(){
        return "Goodbye World!";
    }

    public static String sayHelloToSomeone(String name){
        return "Hello " + name ;
    }
}
