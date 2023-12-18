package com.unittest.codecoverage.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testAge() {
        Person person = new Person();
        person.setAge(21);
        int age = person.getAge();
        assertEquals(age, 21);
    }
}