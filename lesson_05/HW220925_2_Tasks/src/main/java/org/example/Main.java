package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Auto> autos = new ArrayList<>();
        autos.add(new Auto(555555, "BMW M5", 70800, "чёрный"));
        autos.add(new Auto(444444, "Ford Mustang", 40900, "серый"));
        autos.add(new Auto(333333, "Toyota Prius", 30500, "белый"));
        autos.add(new Auto(777777, "Audi Q5", 50000, "красный"));

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValueAsString(autos);

        mapper.writeValue(new File("auto.json"), autos);

        }
    }
