package com.test;

import org.apache.commons.collections4.Predicate;
import org.apache.log4j.Logger;

class Project {

 public String getGreeting() {
        return "Hello, From second branch!";
    }

  public static void test() {
    System.out.println("test");
  }

  public static void main(String[] args) {
    System.out.println(new Project().getGreeting());
  }
}
