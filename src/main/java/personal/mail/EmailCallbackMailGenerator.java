package personal.mail;

/**
 * @author Evgeny Borisov
 */
public class EmailCallbackMailGenerator implements MailGenerator {
    public String generateBody(MailInfo mailInfo) {
        return "don't call us we call you";
    }
}
