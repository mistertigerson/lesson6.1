package com.company;

public class Skeleton extends Boss{
    private int quantityArrow;

    public int getQuantityArrow() {
        return quantityArrow;
    }

    public void setQuantityArrow(int quantityArrow) {
        this.quantityArrow = quantityArrow;
    }

    @Override
    public String printInfo() {
        return super.getHealth() + " " + getDamage() + " " + getDefense() + " " +
                weapon.getTypeWeapon() + " " + weapon.getNameWeapon() + getQuantityArrow();
        };

}
