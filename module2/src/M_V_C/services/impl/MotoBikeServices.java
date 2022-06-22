package M_V_C.services.impl;

import M_V_C.model.Manufacturer;
import M_V_C.services.IMotoBikeServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MotoBikeServices implements IMotoBikeServices {
    Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Manufacturer> MANUFACTURER_MOTO_LIST= new ArrayList<>();
    // Khong thay doi duoc danh sach hang san xuat
    static {
        MANUFACTURER_MOTO_LIST.add(new Manufacturer(1,"Honda","Japan"));
        MANUFACTURER_MOTO_LIST.add(new Manufacturer(2,"Yamaha","Japan"));
        MANUFACTURER_MOTO_LIST.add(new Manufacturer(3,"Ducati","Italy"));
    }


    @Override
    public void add() {

    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }
}
