package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App1 {

    @RequestMapping(value = "/course1")
    public String available() {
        return "Zuul microservice";
    }

    @RequestMapping(value = "/course2")
    public String checkedOut() {
        return "SpringCloud";
    }

    public static void main(String[] args) {
        SpringApplication.run(App1.class, args);
    }
}
