package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The {@link AccountApplication} is a cloud-native Spring Boot application that manages a bounded context for
 *
 * @author Kenny Bastani
 * @author Josh Long
 * @{link Customer},
 * @{link Account}, @{link CreditCard}, and @{link Address}
 */
@SpringBootApplication
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}
