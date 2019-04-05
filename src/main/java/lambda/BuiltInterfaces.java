package lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInterfaces {

  public static void main(String[] args) {
    //проверяет выполнение условия
    Predicate<Integer> isPositive = x -> x > 0;
    System.out.println(isPositive.test(2));

    //представляет функцию перехода от объекта типа T к объекту типа R
    Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
    System.out.println(convert.apply(5));

    //Consumer<T> выполняет некоторое действие над объектом типа T, при этом ничего не возвращая:
    Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);
    printer.accept(20);

    //Supplier<T> не принимает никаких аргументов, но должен возвращать объект типа T:
    Supplier<String> stringSupplier = () -> "Hello world!";
    System.out.println(stringSupplier.get());
  }
}
