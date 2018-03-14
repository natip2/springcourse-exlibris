package personal.mail;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */

@Data
@AllArgsConstructor
public class MailInfo {
    private String clientName;
    private int mailCode;
}
