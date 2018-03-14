package personal.mail;

/**
 * @author Evgeny Borisov
 */
public class MailSender {
    private MailDao mailDao = new MailDaoImpl();

    public void sendMail() {
        MailInfo mailInfo = mailDao.getMailInfo();
        if (mailInfo.getMailCode() == 1) {
            //60 lines of code
            System.out.println("Welcome mail was sent to "+mailInfo.getClientName());
        } else if (mailInfo.getMailCode() == 2) {
            //80 lines of code
            System.out.println("don't call we call you mail was sent to " + mailInfo.getClientName());
        }
    }
}
