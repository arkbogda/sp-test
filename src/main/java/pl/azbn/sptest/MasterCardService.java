package pl.azbn.sptest;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class MasterCardService implements Card {

    public MasterCardService() {
    }

    public String getInfo() {
        return "MasterCardService";
    }
}
