import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1) Создайте тип данных, описывающий различные профессии в формате enum (перечисления). Профессии (для примера):
        // строитель, программист, слесарь
        //
        //2) Создайте новое поле в классе Worker - множество профессий, на которых успел поработать человек. (тип данных - Set)
        //
        //3) В методе рассчета пенсии добавьте новый коэффициент. к финальной рассчитанной пенсии добавляется 5%
        // за каждые три профессии. Соответственно, если человек поработал на 9 профессиях, то его бонус составит 15% к пенсии.

        Worker anna = new Worker();
        anna.setMinSalary(1000);
        anna.setMaxSalary(10000);
        anna.setGender(Gender.FEMALE);

        Worker daniil = new Worker();
        anna.setMinSalary(2000);
        anna.setMaxSalary(50000);
        anna.setGender(Gender.MALE);

        List<Worker> workerList = new ArrayList<>();
        workerList.add(anna);
        workerList.add(daniil);


        PensionFund pensionFund = new PensionFund("Фонд Германии", true, "1990", workerList);
        PensionFund pensionFundSecond = new PensionFund("Фонд всех любителей белок", false, "1990", workerList);

        double stateFundAveragePension = pensionFund.calculateMedianPension();
        double notStateFundAveragePension = pensionFundSecond.calculateMedianPension();

        System.out.println(stateFundAveragePension);
        System.out.println(notStateFundAveragePension);

    }
}