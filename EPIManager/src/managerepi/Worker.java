package managerepi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Worker extends Employee {

    protected String shift;

    public Worker(int id, String name, String shift) {
        super(id, name);
        this.shift = shift;
    }

    public void clockIn() {
        // Obtém a data e hora atual
        LocalDateTime clockInTime = LocalDateTime.now();

        // Formata a data e hora de forma legível
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedTime = clockInTime.format(formatter);

        // Exibe a mensagem
        System.out.println("Employee: " + this.name + " | Clocked in at: " + formattedTime);
    }
}
