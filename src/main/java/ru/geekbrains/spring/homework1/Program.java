package ru.geekbrains.spring.homework1;

import com.google.gson.Gson;

public class Program {
    public static void main(String[] args) {
        Person user = new Person("Ivan", "Ivanov", 30);

        // Сериализация
        Gson gson = new Gson();
        String json = gson.toJson(user);
        System.out.println("Сериализованный user: " + json);

        // Десериализация
        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println("Десериализованный user: " + deserializedPerson);
    }
}
