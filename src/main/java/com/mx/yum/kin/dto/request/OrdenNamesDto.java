package com.mx.yum.kin.dto.request;

import java.util.ArrayList;
import java.util.List;

public class OrdenNamesDto {
     private  List<String> names =  new ArrayList<>();

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
