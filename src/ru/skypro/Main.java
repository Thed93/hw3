package ru.skypro;

public class Main {
    public static void main(String[] args) {

//        Задание 1
        byte b = 10;
        short s = 128;
        int i = 1230;
        long l = 12300;
        float f = 12.2f;
        double d = 3.14586d;

        System.out.println("Значение переменной 'b' с типом 'byte' равно " + b);
        System.out.println("Значение переменной 's' с типом 'short' равно " + s);
        System.out.println("Значение переменной 'i' с типом 'int' равно " + i);
        System.out.println("Значение переменной 'l' с типом 'long' равно " + l);
        System.out.println("Значение переменной 'f' с типом 'float' равно " + f);
        System.out.println("Значение переменной 'd' с типом 'double' равно " + d);

//     Задание 2
    float firstValur = 27.12f;
    long secondValue = 987_678_965_549l;
    double thirdValue = 2.786;
    boolean fourthValue = false;
    int fifthValue = 569;
    short sixthValue = -159;
    char seventhValue = 67;

//    Задание 3
        System.out.println();
       int firstClass = 23;
       int secondClass = 27;
       int thirdClass = 30;
       int paper = 480;
       int paperOnOneStudent = paper / (firstClass + secondClass + thirdClass);
        System.out.println( "На каждого ученика рассчитано " + paperOnOneStudent + " листов бумаги.");

//     Задание 4
        System.out.println();
     int fixedTimeWork = 2;
     int fixedPerfomance = 16;
     int firstTaskTime = 20;
     int secondTaskTime = 24 * 60;
     int thirdTaskTime = 3 * 24 * 60;
     int fourthTaskTime = 30 * 24 * 60;
     int firstTask = firstTaskTime / fixedTimeWork * fixedPerfomance;
     int secondTask = secondTaskTime / fixedTimeWork * fixedPerfomance;
     int thirdTask = thirdTaskTime / fixedTimeWork * fixedPerfomance;
     int fourthTask =  fourthTaskTime / fixedTimeWork * fixedPerfomance;
        System.out.println("За " + firstTaskTime + " минут работы машина произвела " + firstTask + " бутылок");
        System.out.println("За " + secondTaskTime + " минут работы машина произвела " + secondTask + " бутылок");
        System.out.println("За " + thirdTaskTime + " минут работы машина произвела " + thirdTask + " бутылок");
        System.out.println("За " + fourthTaskTime + " минут работы машина произвела " + fourthTask + " бутылок");

//        Задание 5
        System.out.println();
        int amountTinOfPain = 120;
      int whiteColorOnOneClass = 2;
      int brownColoOnOneClass = 4;
      int numberOfClasses = amountTinOfPain / (whiteColorOnOneClass + brownColoOnOneClass);
      int totalWhiteColor = whiteColorOnOneClass * numberOfClasses;
      int totalBrownColor = brownColoOnOneClass * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhiteColor + " банок белой краски и " + totalBrownColor + " банок коричневой краски");


//        Задание 6

        System.out.println();
int bananas = 5;
int bananaWeight = 80;
int milk = 200;
int milkWeight = 105 / 100;
    int iceCream = 2;
int iceCreamWeight = 100;
int eggs = 4;
int eggWeight = 70;
int breakfastInGramm = (bananas * bananaWeight) + ( milk * milkWeight) + (iceCream * iceCreamWeight) + (eggs * eggWeight);
float breakfastinKilogramm = breakfastInGramm / 1000;
        System.out.println("Завтрак спортсмена весит "+ breakfastInGramm + " грамм, или " + breakfastinKilogramm + " килограмм");


//        Задание 7

        System.out.println();
        int loosingWeight = 7000;
        int firstLossingWeightAtDay = 250;
        int secondLoosingWaightAtDay = 500;
        int firstTime = loosingWeight / firstLossingWeightAtDay;
        int secondTime = loosingWeight / secondLoosingWaightAtDay;
        int averageTime = (firstTime + secondTime) / 2;
        System.out.println("При потере спортсменом " + firstLossingWeightAtDay + " грамм в день понадобится " + firstTime + " дней, чтобы потерять " + loosingWeight + " грамм.");
        System.out.println("При потере спортсменом " + secondLoosingWaightAtDay + " грамм в день понадобится " + secondTime + " дней, чтобы потерять " + loosingWeight + " грамм.");
        System.out.println("В среднем для потери спортсменом " + loosingWeight + " грамм понадобится " + averageTime + " дней" );



//        Задание 8

        System.out.println();
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int mashaNewSalary = (mashaSalary / 100) * 110;
        int denisNewSalary = (denisSalary / 100) * 110;
        int kristinaNewSalary = (kristinaSalary / 100) * 110;

        int mashaYearSalary = mashaSalary * 12;
        int denisYearSalary = denisSalary * 12;
        int kristinaYearSalary = kristinaSalary * 12;

        int mashaNewYearSalary = mashaNewSalary * 12;
        int denisNewYearSalary = denisNewSalary * 12;
        int kristinaNewYearSalary = kristinaNewSalary * 12;

        int mashaYearSalaryDifference = mashaNewYearSalary - mashaYearSalary;
        int denisYearSalaryDifference = denisNewYearSalary - denisYearSalary;
        int kristinaYearSalaryDifference = kristinaNewYearSalary - kristinaYearSalary;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaYearSalaryDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisYearSalaryDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaYearSalaryDifference + " рублей.");




    }


}
