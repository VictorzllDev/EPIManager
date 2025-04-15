package managerepi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

    protected String name;
    protected List<Epi> listEpi;

    public Employee(String name) {
        this.listEpi = new ArrayList<>();
        this.name = name;
    }

    private String generateRegistrationId() {
        int epiCount = this.listEpi.size();
        String registrationId = String.format("EPI%03d", epiCount + 1);  // Gera o ID, começando de EPI001
        return registrationId;
    }

    public void addEpi(String name, int daysUntilExpiration) {
        // calcula a data de validade
        LocalDate expirationDate = LocalDate.now().plusDays(daysUntilExpiration);
        String registration = generateRegistrationId();

        Epi newEpi = new Epi(name, registration, LocalDate.now(), expirationDate);

        this.listEpi.add(newEpi);
    }

    public List<Epi> getAllEpi() {
        return this.listEpi;
    }

}
