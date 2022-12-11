public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("ssak");
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();


        dog.takeForAWalk();
        dog.feed();
    }
    public static void main(String[] args) {
        Car c = new Car();
        Human h = new Human();
        h.c = c;
    }

    public static void main(String[] args) {
        Human h = new Human();

    }
    public static void main(String[] args) {
        Car c = new Car();
        Human h = new Human();
        h.c = c;
    }
    {
        public static void main(String[] args) {
        Human h = new Human();
        Car c1 = new Car(2000, 10, "Ford", "Audi", 100);
        Car c2 = new Car(2000, 10, "Ford", "Audi", 100);

        if( !c1.equals(c2) ){
            System.out.println("Takie same");
        }
        else{
            System.out.println("Inne");
        }
        System.out.println(c1);
    }
    }
}