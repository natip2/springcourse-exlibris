package enums;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Person moshe = Person.builder().name("Moshe").maritalStatus(MaritalStatus.SINGLE).build();
        Person shilo = Person.builder().name("Shilo").maritalStatus(MaritalStatus.SINGLE).build();
        System.out.println(shilo.getMaritalStatus()==moshe.getMaritalStatus());
    }
}
