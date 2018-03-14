package personal.mail;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class MailSender {
    private MailDao mailDao = new MailDaoImpl();

    private Map<Integer, MailGenerator> map = new HashMap<>();

    public MailSender() {
        map.put(1, new WelcomeMailGenerator());
    }

    public void sendMail() {
        MailInfo mailInfo = mailDao.getMailInfo();
        int mailCode = mailInfo.getMailCode();
        String body = MailCodeEnum.findByDbCode(mailCode)
                .getMailGenerator().generateBody(mailInfo);
        send(body);

    }

    private void send(String body) {
        System.out.println("sending... +<html>"+body+"<html>");
    }
}
