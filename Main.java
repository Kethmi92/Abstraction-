package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        A objA = new A();
        objA.aMethod();

        B objB = new B();
        objB.bMethod();
        objB.a.aMethod();// Has a relationship
    }
}


class A{
    public void aMethod(){
        System.out.println("I can do A things.");
    }
}

class B{
         //A a; // member variable
        A a = new A();
        int d;

    public void  bMethod() {
        System.out.println("I can do B things.");
        System.out.println("I cannot do A things.");
    }
}
