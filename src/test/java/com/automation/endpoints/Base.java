package com.automation.endpoints;

import com.automation.pojos.User;
import com.github.javafaker.Faker;

public abstract class Base {
    public final Faker faker = new Faker();
    public User user = new User();
}
