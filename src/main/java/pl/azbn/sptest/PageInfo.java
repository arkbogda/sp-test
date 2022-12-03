package pl.azbn.sptest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "page-info")
public class PageInfo {

    @Value("${page-info.author}")
    private String author;

    @Value("${page-info.creation-date}")
    private int creationDate; //może być int, automatycznie zamienia typy z application.properties

    @EventListener(ApplicationReadyEvent.class)
    public void get() {
        System.out.println("Author: " + author + ", " + " Creation date: " + creationDate);
    }
}
