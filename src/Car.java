public class Car {
    int year;
    double petrol;
    final String model="";
    final String producer="";
}


    public Car( int year, double petrol, final String model, final String producer, double wartosc ){
        this.year = year;
        this.petrol = petrol;
        this.model = model;
        this.producer = producer;
        this.wartosc = wartosc;
    }

    public boolean equals(Car obj) {
        return (this == obj);
    }

    public String toString(){
        return year + " " + petrol + " " + model + " " + producer + " " + wartosc + "\n";
    }
}


