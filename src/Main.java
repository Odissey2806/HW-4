public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


                                // Условный оператор

        // Задача №1
        int agePerson = 20;
        if (agePerson >=18) {
            System.out.println("«Если возраст человека равен " + agePerson + ", то он совершеннолетний».");
        }else {
            System.out.println("«Если возраст человека равен " + agePerson + " он не достиг совершеннолетия, нужно немного подождать».");
        }

        // Задача №2
        int airTemperature = -7;
        if (airTemperature < -5) {
            System.out.println("«На улице " + airTemperature + " градусов, нужно надеть шапку».");
        }
        if (airTemperature > 5) {
            System.out.println("«На улице " + airTemperature + " градусов, можно идти без шапки».");
        }

        // Задача №3
        int driversSpeed = 30;
        if (driversSpeed >60) {
            System.out.println("«Если скорость " + driversSpeed + ", то придется заплатить штраф».");
        } else {
            System.out.println("«Если скорость " + driversSpeed + ", то можно ездить спокойно».");
        }

        // Задача №4
        int personYears = 55;
        if (personYears >= 2 && personYears <= 6){
            System.out.println("«Если возраст человека равен " + personYears + ", то ему нужно ходить в детский сад».");
        }
        if (personYears >= 7 && personYears <= 17){
            System.out.println("«Если возраст человека равен " + personYears + ", то ему нужно ходить в школу».");
        }
        if (personYears >= 18 && personYears <= 24){
            System.out.println("«Если возраст человека равен " + personYears + ", то его место в университете».");
        }
        if (personYears >24){
            System.out.println("«Если возраст человека равен " + personYears + ", то ему пора ходить на работу.");
        }

        // Задача №5
        int ageChild = 13;
        if (ageChild < 5) {
            System.out.println("«Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе».");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("«Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого».");
        }
        if (ageChild >= 14) {
            System.out.println("«Если возраст ребенка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождении взрослого».");
        }

        // Задача №6
        int numberPassengersCarriage = 105;
        if (numberPassengersCarriage <= 60) {
            System.out.println("«Если пассажиров в вагоне " + numberPassengersCarriage + ", то он располагается на сидячих местах».");
        }
        if (numberPassengersCarriage > 60 && numberPassengersCarriage <= 102) {
            System.out.println("«Если пассажиров в вагоне " + numberPassengersCarriage + ", то он располагается в местах предназначенных стоя».");
        } else if (numberPassengersCarriage >102){
            System.out.println("Мест нет, вагон полностью забит!");
        }

        // Задача №7
        int one =7;
        int two = 2;
        int three = 15;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше из трех значении!");
        }
        if (two > one && two > three) {
            System.out.println("Число " + two + " больше из трех значении!");
        } else if (three > one && three >two){
            System.out.println("Число " + three + " больше из трех значении!");
        }


        }

    }
