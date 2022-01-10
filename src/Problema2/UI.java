package Problema2;

import java.util.Scanner;

public class UI {
    ProduktController ctrl;

    public UI(ProduktController ctrl) {
        this.ctrl = ctrl;
    }

    public void start(){
        System.out.println("Choose your operation" +
                " 1. Create" +
                " 2. Get All Products" +
                " 3.Update a product" +
                " 4. Delete");
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice){
            String name;
            int preis;
            int SKU;
            int anzahl;
            case(1):
                System.out.println("Product name is : ");
                name = scanner.nextLine();
                System.out.println("The Price is : ");
                preis = Integer.parseInt(scanner.nextLine());
                System.out.println("SKU is : ");
                SKU  = Integer.parseInt(scanner.nextLine());
                System.out.println("The quantity is : ");
                anzahl = Integer.parseInt(scanner.nextLine());
                Produkt produce = new Produkt(name,preis,SKU,anzahl);
                ctrl.create(produce);
                produce = null;
                break;

            case(2):
                System.out.println(ctrl.getAll());
                break;

            case (3):
                //todo make the update

            case(4):
                System.out.println("Product name is : ");
                name = scanner.nextLine();
                System.out.println();
                anzahl = Integer.parseInt(scanner.nextLine());
                

        }

    }
}
