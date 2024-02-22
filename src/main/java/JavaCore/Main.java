package JavaCore;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        company.addWorker(new Freelancer("John", 15.0));
        company.addWorker(new HourlyWorker("Alice", 2000.0));
        company.addWorker(new HourlyWorker("Bob", 1800.0));
        company.addWorker(new Freelancer("Eva", 20.0));

        System.out.println("Список сотрудников:");
        company.printWorkers();

        company.sortWorkers();
        System.out.println("\nСписок сотрудников после сортировки по среднемесячной зарплате:");
        company.printWorkers();

        company.sortWorkersByNameReverse();
        System.out.println("\nСписок сотрудников после сортировки по имени в обратном порядке:");
        company.printWorkers();
    }
}