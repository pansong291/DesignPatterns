package example;

public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    abstract void add(Company company);

    abstract void remove(Company company);

    abstract void display(int depth); // 显示

    abstract void lineOfDuty(); // 履行职责
} // Company
