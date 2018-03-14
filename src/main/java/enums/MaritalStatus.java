package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Evgeny Borisov
 */
@Getter
public enum MaritalStatus {
    SINGLE(12,"Ravak"), MARRIED(2,"Nasui"), DIVORCED(7,"Garush");

    private final int dbCode;
    private final String hebrewDesc;

    MaritalStatus(int dbCode, String hebrewDesc) {
        this.dbCode = dbCode;
        this.hebrewDesc = hebrewDesc;
        System.out.println("I was created "+hebrewDesc);
    }

    public static void main(String[] args) {
    }



}
