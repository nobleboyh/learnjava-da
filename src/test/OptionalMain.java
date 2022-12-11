package test;

import javax.swing.text.html.Option;
import java.util.Collection;
import java.util.Collections;
import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        //Optional constructor
        Optional<String> optional = Optional.of("123");
        Optional<String> optional1 = Optional.empty();
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<Optional<Optional<String>>> optionalS = Optional.ofNullable(Optional.ofNullable(Optional.ofNullable("123")));

        //Method
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());
        System.out.println(optional.get()); //Only accept not null

        //Lambda method
        optional.ifPresent(System.out::println);
        Optional<String> a = optional2.map(String::toUpperCase);    //Return new Optional var
        Optional<String> b = optionalS.flatMap(q -> q).flatMap(q->q);

        //Set default value
        String str = optional.orElse("");   //The default value is always be prepared
        String str2 = optional.orElseGet(() -> ""); //Only run if null
    }
}
