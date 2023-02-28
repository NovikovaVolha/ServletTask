package com.academy.model.entity.semiprecious;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum SemipreciousStoneType {

    AGATE("agate", "brown", 3),
    AQUAMARINE("aquamarine", "blue", 1),
    OPAL("opal", "white", 2),
    TANZANITE("tanzanite", "blue", 1),
    TURQUOISE("turquoise", "blue", 3),
    ZIRCON("zircon", "blue", 1);

    @Getter
    private final String name;
    @Getter
    private final String color;
    @Getter
    private final int clarityClass;

}
