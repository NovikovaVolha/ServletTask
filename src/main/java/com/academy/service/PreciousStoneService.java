package com.academy.service;

import com.academy.model.entity.precious.PreciousStone;
import com.academy.model.entity.precious.PreciousStoneType;
import com.academy.model.entity.semiprecious.SemipreciousStone;
import com.academy.model.entity.semiprecious.SemipreciousStoneType;
import lombok.var;

import java.util.ArrayList;
import java.util.List;

public class PreciousStoneService {

    public List<PreciousStone> getPreciousStones() {
        var preciousStones = new ArrayList<PreciousStone>();

        var ruby = new PreciousStone(4, 1050, PreciousStoneType.RUBY);
        var diamond = new PreciousStone(2, 1590, PreciousStoneType.DIAMOND);
        var emerald = new PreciousStone(3, 1350, PreciousStoneType.EMERALD);


        preciousStones.add(ruby);
        preciousStones.add(diamond);
        preciousStones.add(emerald);

        return preciousStones;
    }

}
