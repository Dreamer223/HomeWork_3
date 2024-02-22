package JavaCore;

public class Freelancer extends Worker {
    private double hourlyRate;

    public Freelancer(String name, double hourlyRate) {
        super(name, 0);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateAverageMonthlySalary() {
        return 20.8 * 8 * hourlyRate;
    }
}
