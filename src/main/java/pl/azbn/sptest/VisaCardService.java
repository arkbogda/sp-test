package pl.azbn.sptest;

import org.springframework.stereotype.Service;

@Service
public class VisaCardService implements Card {

    public VisaCardService() {
    }

    public String getInfo() {
        return "VisaCardService";
    }
}
