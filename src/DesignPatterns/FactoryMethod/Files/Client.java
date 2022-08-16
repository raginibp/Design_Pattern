package DesignPatterns.FactoryMethod.Files;

import java.io.File;

public class Client {
  public static void main(String[] args) {
    Files file = AbstractFiles.orderFile("zip");
    file.deliver();
  }
}