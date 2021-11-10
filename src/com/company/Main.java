package com.company;

import com.company.classes.Frutas;
import com.company.classes.StringRepeat;
import com.company.classes_ex2.IntegerVerify;
import com.company.classes_ex2.Numeros;
import com.company.classes_ex3.intToStr;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void Test_Exerc_1(){
          /*
        recebe uma string retorna uma nova
        uso da interface deve ser uma lista de strings
        e retorna uma nova lista de strings
        use o método passando diferentes funções lambda como parametro
         */
        Frutas fruta = new Frutas();
        List<String> list = new ArrayList<>();
        list.add("maca");
        list.add("pera");
        list.add("melancia");
        list.add("banana");
        list.add("morango");

        for(String frutas : list){
            fruta.print_List(list, s -> "-" + s + "-");
        }

    }
    public static void Test_Exerc_2(){
        Numeros numero = new Numeros();
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
     //

        System.out.println(numero.print_list(list, (Integer n, Integer n2) -> (n + n2)));

        System.out.println(numero.print_list(list, (Integer n, Integer n2) -> (n + n2) / 2 ));

        System.out.println(numero.print_list(list, (Integer n, Integer n2) -> {
            if(n > n2) {
                return n;
            }else
                return n2;
        }));

    }

    public static void PrintApp(List<Integer> list, intToStr interfac){
        for(int i =0; i < list.size(); i++){
            System.out.println("R$" + list.get(i) + interfac.intToStr(i));
        }
    }

    public static void Test_Exerc_3() {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(-200);
        list.add(150);
        list.add(-100);

        PrintApp(list, (int n) -> {
            if(n > 0) {
                return("<C>");
            }else
                return("<D>");
        });

        //com operação ternaria
        PrintApp(list, (int n) -> (n>=0) ? n + "<C>" : n + "<D>" );

    }

    public static void main(String[] args) {
	    Test_Exerc_1();
        Test_Exerc_2();
        Test_Exerc_3();

    }
}
