package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        List<Auto> list = mapper.readValue(new File("auto.json"), new TypeReference<List<Auto>>() {});

        // Сортировка по номеру, по возрастанию
        list.sort((a, b) -> a.getNumber() - b.getNumber());
        list.forEach(System.out::println);
    }
}
