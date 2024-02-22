package JavaCore;

import java.util.Comparator;

public class HourlyWorker extends Worker {
    public HourlyWorker(String name, double monthlyPayment) {
        super(name, monthlyPayment);
    }

    @Override
    public double calculateAverageMonthlySalary() {
        return monthlyPayment;
    }
}


