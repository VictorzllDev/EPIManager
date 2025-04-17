package managerepi;

import java.time.LocalDate;
import java.time.LocalDateTime;

// EPI = Equipamento de Proteção Individual
public class Epi {

    protected String name;
    protected String code;
    protected LocalDateTime createdDate;
    protected LocalDateTime updatedDate;
    protected LocalDateTime expirationDate;

    public Epi(int id, String name, int daysUntilExpiration) {
        this.name = name;
        this.code = String.format("EPI%03d", id);
        this.createdDate = LocalDateTime.now();
        this.updatedDate = LocalDateTime.now();
        this.expirationDate = LocalDateTime.now().plusDays(daysUntilExpiration);
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public void update(String name, int daysUntilExpiration){
        this.name = name;
        this.updatedDate = LocalDateTime.now();
        this.expirationDate = LocalDateTime.now().plusDays(daysUntilExpiration);
    }
}
