package application.gaming;

import application.models.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class Simulation {

    private List<Computer> computers;

    @Autowired
    public Simulation(@Qualifier("listOfAll") List<Computer> computers) {
        this.computers = computers;
    }

    public void run() {
        // logic...
    }

}
