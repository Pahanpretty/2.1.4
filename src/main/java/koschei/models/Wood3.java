package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {
    @Autowired
    private Rabbit4 rabbit;


    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}
