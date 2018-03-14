package personal.mail;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
@Getter
public enum MailCodeEnum {
    WELCOME(1, new WelcomeMailGenerator()),
    EMAIL_CALLBACK(2, new EmailCallbackMailGenerator());

    private final int dbCode;
    private final MailGenerator mailGenerator;

    public static MailCodeEnum findByDbCode(int dbCode) {
      /*  MailCodeEnum[] enums = values();
        for (MailCodeEnum anEnum : enums) {
            if (anEnum.dbCode == dbCode) {
                return anEnum;
            }
        }*/
//        throw new RuntimeException();
       return Arrays.stream(values()).filter(mailCodeEnum -> mailCodeEnum.dbCode==dbCode)
                .findAny().get();

    }
}





