package com.company;

public class Main {

    public static void main(String[] args) {
        Boss shaoKahn = new Boss();
        shaoKahn.setHealth(700);
        shaoKahn.setDamage(50);
        shaoKahn.setDefense("какой-то");
        shaoKahn.weapon.setTypeWeapon("огнестрельное оружие");
        shaoKahn.weapon.setNameWeapon("калашников");

//        System.out.println(shaoKahn.getHealth() + " " + shaoKahn.getDamage() + " " + shaoKahn.getDefense() + " " +
//                shaoKahn.weapon.getTypeWeapon() + " " + shaoKahn.weapon.getNameWeapon());

        System.out.println(shaoKahn.printInfo());


        Skeleton firstSkelet = new Skeleton();
        Skeleton secondSkelet = new Skeleton();
        firstSkelet.setHealth(50);
        firstSkelet.setDamage(35);
        firstSkelet.setDefense(" ");
        firstSkelet.weapon.setTypeWeapon(" лук");
        firstSkelet.weapon.setNameWeapon(" лучший");
        firstSkelet.setQuantityArrow(30);
        secondSkelet.setHealth(50);
        secondSkelet.setDamage(35);
        secondSkelet.setDefense(" ");
        secondSkelet.weapon.setTypeWeapon(" лук");
        secondSkelet.weapon.setNameWeapon(" лучший");
        secondSkelet.setQuantityArrow(50);

        System.out.println(firstSkelet.printInfo() + "\n" + secondSkelet.printInfo());






    }
}
