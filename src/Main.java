public class Main {
    public static void main(String[] args)
    {
        System.out.println("*** task 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
// add 4 for each variable
        System.out.println("*** task 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
// вычитание
        System.out.println("*** task 3");
        dog = dog - 3;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
// task 4
        System.out.println("*** task 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend + 2 = " + friend);
        friend = friend / 3;
        System.out.println("friend / 3 = " + friend);
// task 5
        System.out.println("*** task 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog = frog + 4;
        System.out.println("frog + 4 = " + frog);
// task 6,7
        System.out.println("*** task 6,7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var sumWeight = weightBoxer1 + weightBoxer2;
        System.out.println("суммарный вес боксеров = " + sumWeight + " кг");
        var difWeight = weightBoxer2 - weightBoxer1;
        System.out.println("второй боксер тяжелее на " + difWeight + " кг");
        difWeight = weightBoxer2 % weightBoxer1;
        System.out.println("разница в весе боксеров = " + difWeight + " кг");
// task 8
        System.out.println("*** task 8");
        var workH = 640;
        var numWorker = workH / 8;
        System.out.println("Всего работников в компании – " + numWorker + " человек");
        numWorker = numWorker + 94;
        workH = numWorker * 8;
        System.out.println("Если в компании работает " + numWorker + " человека, то всего " + workH + " часов работы может быть поделено между сотрудниками");
        System.out.println("********");
    }
}