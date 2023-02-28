package com.academy.service;

import com.academy.model.entity.semiprecious.SemipreciousStone;
import com.academy.model.entity.semiprecious.SemipreciousStoneType;
import lombok.var;

import java.util.ArrayList;
import java.util.List;

public class SemipreciousStoneService {

    public List<SemipreciousStone> getSemipreciousStones() {
        var semipreciousStones = new ArrayList<SemipreciousStone>();

        var agate = new SemipreciousStone(2, 250, SemipreciousStoneType.AGATE);
        var opal = new SemipreciousStone(5, 150, SemipreciousStoneType.OPAL);
        var zircon = new SemipreciousStone(3, 500, SemipreciousStoneType.ZIRCON);

        semipreciousStones.add(agate);
        semipreciousStones.add(opal);
        semipreciousStones.add(zircon);

        return semipreciousStones;
    }

}
