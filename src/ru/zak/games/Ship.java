package ru.zak.games;
import java.util.ArrayList;

/**
 * Класс корабля
 */
public class Ship {
   private ArrayList<String> location;

    public void setLocation(ArrayList<String> location) {
        this.location = location;
    }

    public ArrayList<String> getLocation() {
        return location;
    }

    /**
     * Метод хранит значения для вывода пользователю сообщения о его выстреле.
     * @param shot  - координата выстрела.
     * @return - возвращает "Мимо" - если введёная координата соответствует местоположения корабля.
     * "Попал" - если введёная координата соответствует местоположения корабля.
     * или "Ранил" - если введёные координаты соответствуют всем координатам местоположения корабля.
     */

    public String checkShip(String shot){
        String resut = "Мимо";
        int index = location.indexOf(shot);
        if (index == -1){
            resut = "Мимо";


        }
        if (index != -1){
            resut ="Ранил";
            location.remove(index);
        }
        if (location.isEmpty()){
            resut = "Потопил";
        }

        return resut;
    }


    @Override
    public String toString() {
        return "Корабль" +
                " местоположение = " + location;
    }
}
