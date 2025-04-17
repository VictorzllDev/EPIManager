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


    public void addEpi(Epi epi) {
        this.listEpi.add(epi);
    }

    public List<Epi> getAllEpi() {
        return this.listEpi;
    }

    public void updateEpi(String epiCode, String name, int daysUntilExpiration, EPIUpdateReason reason){
        for (Epi epi : listEpi) {
            if (epi.code.equals(epiCode)) {
                epi.update(name, daysUntilExpiration);
                System.out.println("EPI: " + epiCode + " Atualizado, MOTIVO: "+ reason);
                return;
            }
        }
    }
}
