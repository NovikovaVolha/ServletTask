package com.academy.model.entity.semiprecious;

import com.academy.model.entity.Stone;
import lombok.Data;

@Data
public class SemipreciousStone extends Stone {

    private final SemipreciousStoneType semipreciousStoneType;

    public SemipreciousStone(int weightInCarat, int pricePerCarat, SemipreciousStoneType semipreciousStoneType) {
        super(weightInCarat, pricePerCarat);
        this.semipreciousStoneType = semipreciousStoneType;
    }

}
