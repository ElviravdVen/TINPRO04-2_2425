package les8.deel1;


import les8.deel1.Auto;

public class Opel extends Auto {
    String type, kleur;

    public Opel(int prijs, String type, String kleur) {
        super(prijs);
        this.type = type;
        this.kleur = kleur;
    }

    public void printAuto(){
        System.out.print("Opel");
        System.out.print(type);
        System.out.print(kleur);
        super.printAuto();

    }

}
