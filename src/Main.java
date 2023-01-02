public class Main {
    public static void main(String[] args) {
        // Задача №1
        int man = 18;
        if (man>=18){           // Проверка условия
            System.out.println("Если возраст человека равен "+man+" то он совершеннолетний");
        }
        else {
            System.out.println("Он не достиг совершенолетия, нужно немного подождать");
        }
        // Задача №2
        int temperatura = 4;
        if (temperatura>=5){
            System.out.println("На улице "+temperatura+" градусов,нужно надеть шапку");
        }
        else {
            System.out.println("На улице "+temperatura+" градусов,можно идти без шапки");
        }
        // Задача №3
        int speed = 60;
        if (speed<=60){
            System.out.println("Если скорость  "+speed+" то,можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость  "+speed+" то,придеться заплатить штраф");
        }
        // Задача №4
        int age = 18;
        if (age>=2 && age<=6){
            System.out.println("Если возраст человека равен  "+age+" то,ему нужно ходить в детский сад");
        }
        else if(age>=7 && age<=18){
            System.out.println("Если возраст человека равен  "+age+" то,ему нужно ходить в школу");
        }
        else if(age>=18 && age<=24){
            System.out.println("Если возраст человека равен  "+age+" то,его место в усниверситете");
        }
        else if (age>24){
            System.out.println("Если возраст человека равен  "+age+" то,ему пора ходить на работу");
        }

        // Задача №5
        int childAge = 14;
        if (childAge < 5){
            System.out.println("Если возраст ребенка равен  "+childAge+" нельзя кататься на аттракционе");
        }
        else if (childAge > 5 && childAge < 14){
            System.out.println("Если возраст ребенка равен  "+childAge+" можно кататься на аттракционе в сопровождении");
        }
        else if (childAge > 14){
            System.out.println("Если возраст ребенка равен  "+childAge+" можно кататься на аттракционе без сопровождения взрослого");
        }

        // Задача №6

        int fullWagon = 102;
        int seatPlace = 60;
        int people = 150;
        if (people < fullWagon && people < seatPlace){  // Проверяем  если людей меньше чем в полном вагоне и людей меньше чем сидячих мест то
            System.out.println("В вагоне есть сидячие места, их осталось "+(seatPlace-people));
        }
        if (people < fullWagon && people > seatPlace){ // Проверяем если людей меньше чем в полном вагоне и людей больше чем сидячих мест то
            System.out.println("В вагоне остались стоячие места, их осталось "+(fullWagon-people));
        }
        else if(people>fullWagon){ // В противном случае, если ни одно из других условий не совпадает выводим на экран "Вагон полон"
            System.out.println("Вагон полон");
        }

        // Задача №7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println("Число "+one+" больше");
        }
        else  if (two > one && two > three){
            System.out.println("Число "+two+" больше");
        }
        else  if (three > one && three > two){
            System.out.println("Число "+three+" больше");
        }


    }
}