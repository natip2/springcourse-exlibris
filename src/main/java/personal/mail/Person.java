package personal.mail;

import lombok.*;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private int age;
    @NonNull
    private String name;
    private int salary;

    @Singular
    private Map<String, Integer> beers;
}
