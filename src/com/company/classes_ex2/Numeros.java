package com.company.classes_ex2;

import java.util.ArrayList;
import java.util.List;

public class Numeros {

    public List<Integer> print_list(List<Integer> list, IntegerVerify interfac) {
        List<Integer> sum_list = new ArrayList<>();
        for(int i = 0; i < list.size() - 1; i++){
            sum_list.add(interfac.verifica(list.get(i), list.get(i + 1)));
        }
        return sum_list;
    }


}
