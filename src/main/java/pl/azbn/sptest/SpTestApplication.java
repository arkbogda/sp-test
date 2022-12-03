package pl.azbn.sptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class SpTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpTestApplication.class, args);
    }

    @Bean //adnotacja Bean dodana do klasy POJO, aby była zarządzana przez context
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource(); //klasa odpowiadająca za dostarczanie tłumaczeń
        source.setBasename("classpath:i18n/messages");
        source.setDefaultEncoding("UTF-8"); //ustawienie kodowania, które wspiera polskie znaki
        return source;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("Hello world");
    }
}
