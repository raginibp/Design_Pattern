package DesignPatterns.FactoryMethod.Files;

import java.io.File;

public class AbstractFiles {
  protected static Files creatFile(String variant){
    switch(variant){
      case "zip":
        return new zip();
      case "tar":
        return new tar();
      case "rar":
        return new rar();
    }
    return null;
  }
  public static Files orderFile(String varient){
    return creatFile(varient);
  }
}