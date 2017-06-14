package hello;

import hello.Filter.Filterpart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import hello.Filter.Filterpart;

@EnableZuulProxy
@SpringBootApplication
public class App2 {

    public static void main(String[] args) {
        SpringApplication.run(App2.class, args);
    }

    @Bean
    public Filterpart simpleFilter() {
        return new Filterpart();
    }

}
