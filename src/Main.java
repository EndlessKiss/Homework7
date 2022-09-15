public class Main {
    public static void main(String[] args) {
        int salary = 29000;
        int total = 0;
        int u = 0;
        while (total < 2459000) {
            total = total + total / 100;
            total = total + salary;
            u++;
            System.out.println("Месяц " + u + " сумма накоплений равна " + total);

        }
        int i = 10;
        while (i > 0) {
            System.out.print(" " + i);
            i--;
        }
        System.out.println();
        for (int a = 1; a <= 10; a++) {
            System.out.print(" " + a);
        }
        System.out.println();

        int population = 12_000_000;
        double deathRate = (double) 8 / 1000;
        double birthRate = (double) 17 / 1000;
        while (i <= 12) {
            population = (int) (population - (population * deathRate) + (population * birthRate));
            System.out.println("Год " + i + " население " + population);
            i++;
        }
        int deposit = 15000;
        for (int b = 1; b <= 108; b++) {
            double depositRate = (double) ((deposit *0.07)/ 12);
            deposit = (int) (depositRate + deposit);
            if (b % 6 == 0) {
                System.out.println("Месяц " + b + "," + "сумма накоплений " + deposit);
            }
        }
        int friday = 2;
        for (; friday <= 31; friday=friday+7) {
            System.out.println("Сегодня пятница " + friday + " число, нужно сдать отчет.");
        }


        int year = 2022;
        int pastYear= year -200;
        int futureYear= year+100;
        for(int y = pastYear; y<=futureYear; y++){
            if (y % 79==0) {
            System.out.println(y);}
        }
        int a=2;
        int b=1;
        for(; b <=10; b++) {
        System.out.println(a + " * " + b + " = " + a*b); }
    }

}


