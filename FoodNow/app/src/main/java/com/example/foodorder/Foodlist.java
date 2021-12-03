package com.example.foodorder;

import java.io.Serializable;

public class Foodlist implements Serializable {

    String nameFood;
    String moTa;
    String moTa1;
    String moTa2;
    int imga;

    public Foodlist(String nameFood, String moTa, String moTa1, String moTa2, int imga) {
        this.nameFood = nameFood;
        this.moTa = moTa;
        this.moTa1 = moTa1;
        this.moTa2 = moTa2;
        this.imga = imga;
    }

    public String getNameFood() {
        return nameFood;
    }

    public void setNameFood(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getMoTa1() {
        return moTa1;
    }

    public void setMoTa1(String moTa1) {
        this.moTa1 = moTa1;
    }

    public String getMoTa2() {
        return moTa2;
    }

    public void setMoTa2(String moTa2) {
        this.moTa2 = moTa2;
    }

    public int getImga() {
        return imga;
    }

    public void setImga(int imga) {
        this.imga = imga;
    }
}
