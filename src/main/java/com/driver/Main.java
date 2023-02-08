package com.driver;

public class Main {
   void main(){
     RWOnly obj = new RWOnly();
    // System.out.println(obj.name);

     // error: name has private access in RWOnly
     obj.setter("Rohit");
     System.out.println(obj.getter());
    }
}