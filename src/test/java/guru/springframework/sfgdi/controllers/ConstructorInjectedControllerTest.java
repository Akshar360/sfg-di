package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller; //this is a property

    @BeforeEach
    void setUp()
    {
      controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting()
    {
        System.out.println( controller.getGreeting());
    }
}