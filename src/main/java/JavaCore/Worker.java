package JavaCore;

abstract class Worker implements Comparable<Worker> {
    protected String name;
    protected double monthlyPayment;

    public Worker(String name, double monthlyPayment) {
        this.name = name;
        this.monthlyPayment = monthlyPayment;
    }

    public abstract double calculateAverageMonthlySalary();

    @Override
    public int compareTo(Worker other) {
        return Double.compare(this.calculateAverageMonthlySalary(), other.calculateAverageMonthlySalary());
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Monthly Payment: " + monthlyPayment;
    }
}

