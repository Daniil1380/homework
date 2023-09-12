import java.util.Objects;

public class PensionFund {

    //а) Именование пенсионного фонда
    //б) булеан переменная, явлется ли он государственным
    //в) Дата создания
    //г) количество участников фонда

    private String name;

    private boolean isState;

    private final String dateOfCreation;

    private int countOfPersons;

    public PensionFund(String name, boolean isState, String dateOfCreation, int countOfPersons) {
        this.name = name;
        this.isState = isState;
        this.dateOfCreation = dateOfCreation;
        this.countOfPersons = countOfPersons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isState() {
        return isState;
    }

    public void setState(boolean state) {
        isState = state;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public int getCountOfPersons() {
        return countOfPersons;
    }

    public void setCountOfPersons(int countOfPersons) {
        this.countOfPersons = countOfPersons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return isState == that.isState && countOfPersons == that.countOfPersons && Objects.equals(name, that.name) && Objects.equals(dateOfCreation, that.dateOfCreation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isState, dateOfCreation, countOfPersons);
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", isState=" + isState +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", countOfPersons=" + countOfPersons +
                '}';
    }

    public void info() {
        System.out.println("Имя фонда " + name);
        if (isState) {
            System.out.println("В фонд вложились человек: " + countOfPersons / 1000 + " тыс.");
        }
        else {
            System.out.println("В фонд вложились человек: " + countOfPersons);
        }
    }

    public double calculatePensionFor(AbleToCalculatePension object) {
        if (isState) {
            return object.calculatePension();
        }
        else {
            return 0.0;
        }
    }


}
