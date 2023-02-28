package com.academy.model.entity.precious;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum PreciousStoneType {

    DIAMOND("diamond", "clear", 1),
    EMERALD("emerald", "green", 3),
    RUBY("ruby", "red", 2),
    SAPPHIRE("sapphire", "blue", 2);

    @Getter
    private final String name;
    @Getter
    private final String color;
    @Getter
    private final int clarityClass;

}
