package com.javarush.island.gerasimov.entity.creatures.predators;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.javarush.island.gerasimov.entity.map.Cell;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@JsonPOJOBuilder
public class Wolf extends Predator {

    private String name = "Волк";
    private String icon = "\uD83D\uDC3A";
    private double weight = 50;
    private int maxCountInCell = 30;
    private int maxSpeed = 3;
    private double maxFood = 8;
    private int probabilityEatenHorse = 10;
    private int probabilityEatenBuffalo = 10;
    private int probabilityEatenBoar = 15;
    private int probabilityEatenDuck = 40;
    private int probabilityEatenSheep = 70;
    private int probabilityEatenGoat = 60;
    private int probabilityEatenRabbit = 60;
    private int probabilityEatenDeer = 10;
    private int probabilityEatenBear = 0;
    private int probabilityEatenFox = 0;
    private int probabilityEatenSnake = 0;
    private int probabilityEatenEagle = 0;
    private int probabilityEatenMouse = 80;
    private int probabilityEatenCaterpillar = 0;
    private int probabilityEatenWolf = 0;
    private Cell targetCell;

    @Override
    public String toString() {
        return getIcon();
    }
}
