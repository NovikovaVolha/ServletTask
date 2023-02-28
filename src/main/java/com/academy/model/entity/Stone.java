package com.academy.model.entity;

import lombok.Data;

@Data
public abstract class Stone {

    private int weightInCarat;
    private int pricePerCarat;

    public Stone(int weightInCarat, int pricePerCarat) {
        this.weightInCarat = weightInCarat;
        this.pricePerCarat = pricePerCarat;
    }

    public Stone() {
    }

}
