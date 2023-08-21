package javapractice;
enum Day {
    SUNDAY("Weekend"), MONDAY("Weekday"), TUESDAY("Weekday"), WEDNESDAY("Weekday"),
    THURSDAY("Weekday"), FRIDAY("Weekday"), SATURDAY("Weekend");

    private String typeOfDay;

    // Custom constructor for each enum constant
    private Day(String typeOfDay) {
        this.typeOfDay = typeOfDay;
    }

    public String getTypeOfDay() {
        return typeOfDay;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day + " is a " + day.getTypeOfDay());
        }
    }
}
