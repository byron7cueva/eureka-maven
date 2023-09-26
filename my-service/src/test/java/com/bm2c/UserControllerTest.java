package com.bm2c;

import com.bm2c.controllers.UserController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = MyServiceApplication.class)
@ExtendWith(SpringExtension.class)
public class UserControllerTest {
    @Autowired
    public UserController controller;

    @Test
    public void testHello() {
        String message = controller.hello();
        Assertions.assertNotNull(message);
    }
}
