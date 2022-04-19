public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        //Задача 1

        byte example1 = 127;
        short example2 = 32767;
        int example3 = 2147;
        long example4 = 9223L;
        float example5 = 3.45F;
        double example6 = -1.7;

        //Задача 2

        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;
        float totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксеров - " + totalWeight + " кг");

        //Задача 3

        short banana = 5;
        short milk = 200;
        short iceCream = 2;
        short egg = 4;
        short singleBananaWeight = 80;
        short singleMilkWeight = 105;
        short singleIceCreamWeight = 100;
        short singleEggWeight = 70;
        int totalBananaWeight = banana*singleBananaWeight;
        int totalMilkWeight = milk*singleMilkWeight;
        int totalIceCreamWeight = iceCream*singleIceCreamWeight;
        int totalEggWeight = egg*singleEggWeight;
        int cocktailWeightGr = totalBananaWeight+totalMilkWeight+totalIceCreamWeight+totalIceCreamWeight;
        float cocktailWeightKg =(float)cocktailWeightGr/1000;
        System.out.println("Масса коктейля в граммах: "+cocktailWeightGr+" г");
        System.out.println("Масса коктейля в килограммах: "+cocktailWeightKg+ " кг");

        //Задача 4

        short targetLossKg = 7;
        int targetLossGr = targetLossKg*1000;
        short lossMinGr = 250;
        short lossMaxGr = 500;
        int lossPeriodMin = targetLossGr / lossMinGr;
        int lossPeriodMax = targetLossGr / lossMaxGr;
        int averageLossRate = (lossMaxGr+lossMinGr)/2;
        int averageLossPeriod = targetLossGr/averageLossRate;
        System.out.println("Минимальный срок похудания составляет "+lossPeriodMin+ " дней");
        System.out.println("Максимальный срок похудания составляет "+lossPeriodMax+ " дней");
        System.out.println("В среднем вы похудеете за "+averageLossPeriod+ " дней");

        //Задача 5

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float salaryIncrease = 1.1f;
        float salaryMashaNew = salaryMasha*salaryIncrease;
        float salaryDenisNew = salaryDenis*salaryIncrease;
        float salaryKristinaNew = salaryKristina*salaryIncrease;
        float annualDiffMasha = 12*(salaryMashaNew-salaryMasha);
        float annualDiffDenis = 12*(salaryDenisNew-salaryDenis);
        float annualDiffKristina= 12*(salaryKristinaNew-salaryKristina);
        System.out.println("Маша теперь получает "+salaryMashaNew+" рублей; годовой доход вырос на "+annualDiffMasha+" рублей");
        System.out.println("Денис теперь получает "+salaryDenisNew+" рублей; годовой доход вырос на "+annualDiffDenis+" рублей");
        System.out.println("Кристина теперь получает "+salaryKristinaNew+" рублей; годовой доход вырос на "+annualDiffKristina+" рублей");
    }}