package org.example.testdata;

import io.github.sskorol.core.DataSupplier;
import one.util.streamex.IntStreamEx;
import org.example.entity.User;

import java.util.stream.Stream;

public class DataSuppliers {

    @DataSupplier
    public Stream<User> users() {
        return IntStreamEx
                .rangeClosed(1, 5)
                .mapToObj(i -> new User("User"+i, "Password"+i));
    }

//    @DataSupplier
//    public Stream<User> users() {
//        return Stream.of(
//                        new User("Max", "password2")
//        );
//    }

}
