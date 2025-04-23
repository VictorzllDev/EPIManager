package managerepi;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    protected List<Worker> listWorker;

    public Manager(int id, String name) {
        super(id, name);
    }

    public void addWorker(Worker worker) {
        this.listWorker.add(worker);
    }

    public void deleteWorker(Worker worker) {
        for (int i = 0; i < listWorker.size(); i++) {
            if (listWorker.get(i).id == worker.id) {
                listWorker.remove(i);
                return;
            }
        }
    }

    public void getAllWorkerByShift(String Shift) {
        List<Worker> tempWorkerList = new ArrayList<>();
        // terminando fase beta ;)
    }

    public void generateReport();

    public void getEpisExpiration();
}
