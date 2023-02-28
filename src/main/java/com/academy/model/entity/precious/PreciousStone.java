package com.academy.model.entity.precious;

import com.academy.model.entity.Stone;
import lombok.Data;

@Data
public class PreciousStone extends Stone {

    private final PreciousStoneType preciousStoneType;

    public PreciousStone(int weightInCarat, int pricePerCarat, PreciousStoneType preciousStoneType) {
        super(weightInCarat, pricePerCarat);
        this.preciousStoneType = preciousStoneType;
    }

}
