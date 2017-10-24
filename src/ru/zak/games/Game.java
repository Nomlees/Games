package ru.zak.games;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Класс запуска игры и задания расположения корабля.
 */
public class Game {
    public static void main(String[] args) {
        ArrayList<String> location = new ArrayList<>();
        randomLocation(location);
        Ship ship = new Ship();
        ship.setLocation(location);
        int attemp = 1;
        while (!ship.getLocation().isEmpty()){
            System.out.println(ship.checkShip(scan()));
            System.out.println("Вы использовали попыток " +attemp++);
        }

    }

    /**
     * Метод для определения места корабля с помощью рандома.
     * @param location - arraylist который хранит расположение корабля.
     */

    public static void randomLocation(ArrayList<String> location) {
        location.add(String.valueOf((int)((Math.random() * 4))));
        location.add(String.valueOf(Integer.parseInt(location.get(0))+1));
        location.add(String.valueOf(Integer.parseInt(location.get(1))+1));
    }

    /**
     * Метод взаимодействия пользователя с программой.
     * @return - возращает введённую пользователем строковую координату.
     *
     */
    public static String scan(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату выстрела от 0 до 6");
        int shot = scanner.nextInt();
        return String.valueOf(shot);
    }

}
