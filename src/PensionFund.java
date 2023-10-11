import java.util.List;
import java.util.Objects;

public class PensionFund {

    //а) Именование пенсионного фонда
    //б) булеан переменная, явлется ли он государственным
    //в) Дата создания
    //г) количество участников фонда

    private String name;

    private boolean isState;

    private final String dateOfCreation;

    private List<Worker> persons;

    public PensionFund(String name, boolean isState, String dateOfCreation, List<Worker> persons) {
        this.name = name;
        this.isState = isState;
        this.dateOfCreation = dateOfCreation;
        this.persons = persons;
    }

    public List<Worker> getPersons() {
        return persons;
    }

    public void setPersons(List<Worker> persons) {
        this.persons = persons;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return isState == that.isState && Objects.equals(name, that.name) && Objects.equals(dateOfCreation, that.dateOfCreation) && Objects.equals(persons, that.persons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isState, dateOfCreation, persons);
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", isState=" + isState +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", persons=" + persons +
                '}';
    }

    public void info() {
        System.out.println("Имя фонда " + name);

        int count = (persons != null) ? persons.size() : 0;

        if (isState) {
            System.out.println("В фонд вложились человек: " + count / 1000 + " тыс.");
        }
        else {
            System.out.println("В фонд вложились человек: " + count);
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

    public double calculateMedianPension() {
        if (persons == null || persons.size() == 0) {
            return 0.0;
        }

        double sum = 0.0;

        for (Worker worker : persons) {
            sum += calculatePensionFor(worker);
        }

        return sum / persons.size();
    }

}
