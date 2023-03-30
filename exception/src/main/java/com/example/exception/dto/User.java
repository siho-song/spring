package com.example.exception.dto;

import javax.validation.constraints.*;

public class User {
    Object object;

    @NotEmpty
    @Size(min=1,max=10)
    private String name;

    @Min(1)
    @NotNull
    private Integer age;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
