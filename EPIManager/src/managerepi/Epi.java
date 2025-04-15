package managerepi;

import java.time.LocalDate;

// EPI = Equipamento de Proteção Individual
public class Epi {

    protected String name;
    protected String code;
    protected LocalDate createdDate;
    protected LocalDate expirationDate;

    public Epi(String name, String code, LocalDate createdDate, LocalDate expirationDate) {
        this.name = name;
        this.code = code;
        this.createdDate = createdDate;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }
}
