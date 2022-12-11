public class Animal {
    final String species ;
    private double  weight ;
    public Animal (String species){
        this.species = species;
        if (species=="ssak"){
            this.weight = 2;
        }
        else{
            this.weight = 10;
        }
    }
    void feed(){
        if(weight>0){
            weight++;
        }
        else{
            System.out.println("Zwierze umarło");
        }

    }
    void takeForAWalk(){
        if(weight>0){
        weight--;
    }
    else{
        System.out.println("Zwierze żyje");
    }

    }
}
