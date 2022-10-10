public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.workHours = workHours;
        this.hireYear = hireYear;
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Hata: Maaş 0'dan küçük olamaz");
        }
    }

    public double tax() {
        double tax;
        if (this.salary < 1000) {
            return tax = 0.0;
        } else {
            return tax = salary * 0.03;
        }

    }

    public double bonus() {
        double bonusEk;
        if (this.workHours > 40) {
            bonusEk = (this.workHours - 40) * 30;
        } else {
            bonusEk = 0;
        }
        return bonusEk;

    }

    public double raiseSalary() {
        double totalRaise;
        int currentYear = 2021;
        if (currentYear - this.hireYear < 10) {
            totalRaise = this.salary * 0.05;
        } else if (currentYear - this.hireYear > 9 && currentYear - this.hireYear < 20) {
            totalRaise = this.salary * 0.10;
        } else {
            totalRaise = this.salary * 0.15;
        }
        return totalRaise;

    }

    public void printEmployee() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("İşe Başlama yılı : " + this.hireYear);
        System.out.println("Çalışma saati : " + this.workHours);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Maaş Artışı : " + this.raiseSalary() + " TL");
        System.out.println("Bonus : " + this.bonus() + " TL");
        System.out.println("Vergi ve bonuslarla birlikte maaş: " + (this.bonus() + this.salary - this.tax()) + " TL");
        System.out
                .println("Toplam Maaş : " + ((this.raiseSalary() + this.salary + this.bonus()) - (this.tax())) + " TL");
    }

}
