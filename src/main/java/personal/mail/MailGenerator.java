package personal.mail;

/**
 * @author Evgeny Borisov
 */
public interface MailGenerator {
    String generateBody(MailInfo mailInfo);
}
