package co.github.martinhermes86;

public class Main {
    public static void main(String[] args) {

        Species species1 = new Species("Esel", 3000);
        Species species2 = new Species("Schildkröte", 500);
        Species species3 = new Species("Schnecke", 15);


        Owner owner1 = new Owner("Hagrid", 55, "Hogwarts");
        Owner owner2 = new Owner("Dumbledore", 73, "Hogwarts");
        Owner owner3 = new Owner("Ron", 15, "Hogwarts");
        Owner owner4 = new Owner("Neville", 15, "Hogwarts");

        Animal animal1 = new Animal(1001, "Herbert", species1, 12, owner1);
        Animal animal2 = new Animal(1002, "Rosinante", species1, 4, owner1);
        Animal animal3 = new Animal(1003, "Hubert", species2, 36, owner3);
        Animal animal4 = new Animal(1004, "Gertrud", species3, 1, owner4);

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
    }
}