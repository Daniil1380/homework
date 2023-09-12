import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PensionFund pensionFund = new PensionFund("Фонд Германии", true, "1990", 50023);
        PensionFund pensionFundSecond = new PensionFund("Фонд всех любителей белок", false, "1990", 50023);
        Worker anna = new Worker();
        anna.setMinSalary(1000);
        anna.setMaxSalary(10000);
        anna.setGender(Gender.FEMALE);

         double result = pensionFund.calculatePensionFor(anna);

        System.out.println(result);


        //pensionFund.info();
        //pensionFundSecond.info();

        //3) В классе пенсионный фонд реализуйте метод double calculatePensionFor. В него вы будете передавать в качестве параметра объект,
        // реализующий интерфейс  AbleToCalculatePension. (подсказка, метод будет выглядеть вот так:
        //
        //public double calculatePensionFor(AbleToCalculatePension obj)
        //
        //4) Реализация метода будет такой: если фонд государственный - просто вызовите метод calculatePension() на объекте (на obj),
        // который передаете в параметрах метода и верните его результат.
        //
        //Если фонд не государственный, то результат всегда равен 0 (деньги из фонда украли)

    }
}