public class Human {
    public Animal pet;
    double salary;
    public Car c;

    public void set_salary(double salary) {
        if (salary < 0) {
            System.out.println("Podano ujemna wartosc wynagrodzenia");
        } else {
            this.salary = salary;
            System.out.println("Wyslano do systemu ksiegowego");
            System.out.println("Prosze zglosic sie do dzialu kadr");
            System.out.println("Zglosic sie do ZUS i US");
        }
    }

    public double get_salary() {
        System.out.println(" Pobrano we wtorek i wynosila: " + salary);
        return salary;
    }
    public Car get_car(){
        return c;
    }
    public void set_car( Car c ){
        if( this.salary > c.wartosc ){
            System.out.println("Zakupiono auto");
            this.c = c;
        }
        else if( this.salary > (1/12)*c.wartosc ){
            System.out.println("Zakupiono auto na raty");
            this.c = c;
        }
        else{
            System.out.println("Idz do pracy biedaku");
        }
    }
    public String toString(){
        return salary + "\n";
    }
}









