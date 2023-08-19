package com.jsf.springboot.beans;

import jakarta.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Component
@ViewScoped
public class HelloMBean implements Serializable {

    @Serial
    private static final long serialVersionUID = -2862960054229704221L;

    private String firstName = "John";
    private String lastName = "Doe";

    public String showGreeting() {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
