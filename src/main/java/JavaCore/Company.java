package JavaCore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {
    private List<Worker> workers;

    public Company() {
        workers = new ArrayList<>();
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void printWorkers() {
        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }

    public void sortWorkers() {
        Collections.sort(workers);
    }

    public void sortWorkersByNameReverse() {
        Collections.sort(workers, new ReverseNameComparator());
    }
}
