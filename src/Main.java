public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1 ДЗ_1");

        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("К сожалению нужно подождать своего совершеннолетия");
        }

        System.out.println("Задача №2 ДЗ_1");

        int age1 = 8;
        if (age1 >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age1 >= 18) {
            System.out.println("Человек окончил школу и может поступать в университет");
        }
        if (age1 >= 24) {
            System.out.println("Человек окончил университет, ему пора искать работу");
        }

        System.out.println("Задача №3 ДЗ_1");

        int place = 100;
        if (place <= 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (place < 102) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (place > 102) {
            System.out.println("В вагоне нет мест, вагон полностью забит");
        }

        System.out.println("Задача №1 ДЗ_2");

        int age2 = 15;
        if (age2 >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        else {
            System.out.println("К сожалению нужно подождать своего совершеннолетия");
        }

        System.out.println("Задача №2 ДЗ_2");

        int age3 = 12;
        if (age3 >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
       else if (age3 > 18) {
            System.out.println("Человек окончил школу и может поступать в университет");
        }
        else {
            System.out.println("Человек окончил университет, ему пора искать работу");
        }

        System.out.println("Задача №3 ДЗ_2");

        int place1 = 10;
        if (place1 <= 60) {
            System.out.println("В вагоне есть сидячие места");
        }
        else if (place1 < 102) {
            System.out.println("В вагоне есть стоячие места");
        }
        else {
            System.out.println("В вагоне нет мест, вагон полностью забит");
        }

        System.out.println("Задача №1 ДЗ_3");

        age = 25;

        if (age >= 2 && age <= 6) {
            System.out.println("Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age <= 18) {
            System.out.println("Если человек от 7 до 18 лет, то ему нужно ходить в школу");
        }
        else if (age > 18 && age <= 24) {
            System.out.println("Если человеку больше 18 лет, но меньше 24, то его место в университете");
        }
        else {
            System.out.println("Человеку пора ходить на работу");
        }

        System.out.println("Задача №2 ДЗ_3");

        int ageChild = 11;

        if (ageChild < 5) {
            System.out.println("Если ребенку меньше 5 лет, то он не может кататься на аттракционе");
        }
        else if (ageChild >= 5 && ageChild <= 14) {
            System.out.println("Если ребенку больше 5, но меньше 14 лет, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого");
        }

        System.out.println("Задача №3 ДЗ_3");

        int one = 1;
        int two = 2;
        int free = 3;

        if (one >= two && one >= free) {
            System.out.println("Число " + one + " является наибольшим из трех чисел");
        }
        else if (two >= one && two >= free) {
            System.out.println("Число " + two + " является наибольшим из трех чисел");
        }
        else {
            System.out.println("Число " + free + " является наибольшим из трех чисел");
        }

    }
}