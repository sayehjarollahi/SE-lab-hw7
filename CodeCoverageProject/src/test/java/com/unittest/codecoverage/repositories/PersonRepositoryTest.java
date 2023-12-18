package com.unittest.codecoverage.repositories;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.unittest.codecoverage.models.Person;

import static org.junit.jupiter.api.Assertions.*;

public class PersonRepositoryTest {

    private PersonRepository repository;

    @BeforeEach
    public void setUp() {
        repository = new PersonRepository();
    }

    @Test
    public void testInsert_shouldInsertPersonSuccessfully() {
        Person person = new Person();
        person.setName("Name");
        person.setAge(21);
        Person result = repository.insert(person);

        assertEquals(person, result);
    }

    @Test
    public void testInsert_shouldThrowNullPointerExceptionWhenPersonIsNull() {
        assertThrows(NullPointerException.class, () -> repository.insert(null));
    }

    @Test
    public void testGet_shouldGetPersonSuccessfully() {
        String name = "Name";
        Person result = repository.get(name);
        assertNull(result);
    }

    @Test
    public void testGet_shouldThrowNullPointerExceptionWhenNameIsNull() {
        assertThrows(NullPointerException.class, () -> repository.get(null));
    }

    @Test
    public void testUpdate_shouldUpdatePersonSuccessfullyWhenNameIsNotNull() {
        Person person = new Person();
        person.setName("Name");
        person.setAge(21);

        assertDoesNotThrow(() -> repository.update(person));
    }

    @Test
    public void testUpdate_shouldThrowNullPointerExceptionWhenPersonIsNull() {
        assertThrows(NullPointerException.class, () -> repository.update(null));
    }

    @Test
    public void testDelete_shouldThrowNullPointerExceptionWhenNameIsNull() {
        assertThrows(NullPointerException.class, () -> repository.delete(null));
    }

    @Test
    public void testDelete_shouldDeletePersonSuccessfullyWhenNameIsNotNull() {
        String name = "Name";
        assertDoesNotThrow(() -> repository.delete(name));
    }
}
