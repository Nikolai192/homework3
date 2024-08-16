public class Main {
    public static void main(String[] args) {
        int age = 27;
        if (age >= 18) {
            System.out.println("Если возсраст человека равен " + age + " лет, он совершеннолетний");
        } else {
            System.out.println("Если возсраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
        int temperatureWind = 4;
        if (temperatureWind <= 5) {
            System.out.println("На улице " + temperatureWind + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperatureWind + " градусов, можно идти без шапки");
        }
        int speed = 60;
        if (speed >= 61) {
            System.out.println("Если скорость " + speed + " то, прийдется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то, можно ездить спокойно");
        }
        int ageHuman = 25;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то нужно ходить в детский сад");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то нужно ходить в школу");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то нужно ходить в университет");
        }
        if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + " , то нужно ходить на работу");
        }
        int ageChildren = 14;
        if (ageChildren < 5) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " то ему нельзя кататься на аттракционе");
        }
        if (ageChildren >= 5 && ageChildren < 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " то ему можно кататься в сопровождении взрослого");
        }
        if (ageChildren >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " то ему можно кататься без сопровождения");
        }
        int totalSeats = 102;
        int seats = 60;
        int standingPlaces = totalSeats - seats; //стоячих мест в вагоне
        int occupiedSeats = 59;
        int freeSeats = seats - occupiedSeats;
        int occupiedStandindingPlaces = 41;
        int freeStandingPlaces = standingPlaces - occupiedStandindingPlaces;
        if (freeSeats <= 60 && freeSeats > 0) {
            System.out.println("В вагоне осталось " + freeSeats + " свободных сидячих мест");
        }
        else {
            System.out.println("В вагоне не осталось свободных сидячих мест");
        }
        if (freeStandingPlaces <= standingPlaces && freeStandingPlaces > 0) {
            System.out.println("В вагоне осталось " + freeStandingPlaces + " свободных стоячих мест");
        }
        else {
            System.out.println("В вагоне не осталось свободных стоячих мест");
        }
        if (freeSeats <= 0 && freeStandingPlaces <= 0) {
            System.out.println("В вагоне нет мест");
        }
        int one = 7;
        int two = 60;
        int three = 10;
        if (one > two && one > three) {
            System.out.println("One является самым большим числом");
        }
        if (two > one && two > three) {
            System.out.println("Two является самым большим числом");
        }
        else  {
            System.out.println("Three является самым большим числом");
        }
    }
    }