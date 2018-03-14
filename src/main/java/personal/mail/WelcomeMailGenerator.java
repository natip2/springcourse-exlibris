package personal.mail;

/**
 * @author Evgeny Borisov
 */
public class WelcomeMailGenerator implements MailGenerator {
    public String generateBody(MailInfo mailInfo) {
        return "Welcome " + mailInfo.getClientName() + " !!!";
    }
}
