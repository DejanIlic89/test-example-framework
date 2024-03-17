package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.User;
import org.testng.annotations.Test;
import org.example.testdata.DataSuppliers;

@Slf4j
public class ExampleTest {

    @Test(dataProvider = "users", dataProviderClass = DataSuppliers.class)
    public void exampleTest(User user) {
        log.info(user.getUsername() + " " + user.getPassword());
    }

}
