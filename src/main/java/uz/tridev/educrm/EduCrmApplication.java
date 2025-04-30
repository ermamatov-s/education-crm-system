package uz.tridev.educrm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EduCrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduCrmApplication.class, args);
    }

}
