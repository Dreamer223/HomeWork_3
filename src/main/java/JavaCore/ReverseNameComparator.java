package JavaCore;

import java.util.Comparator;

public class ReverseNameComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker w1, Worker w2) {
        return w2.name.compareTo(w1.name);
    }
}
