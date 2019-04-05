package lambda;

import java.util.function.Predicate;

@FunctionalInterface
interface Test {

  static void print() {
    System.out.println("default");
  }

  String execute();
}

public class Lambdatest {

  public static void main(String[] args) {

    //Anonymus
    Test old = new Test() {
      @Override
      public String execute() {
        return "anonymus";
      }
    };

    System.out.println(old.execute());

    Test lmbd = () -> "new";
    System.out.println(lmbd.execute());

    Test.print();
  }
}
