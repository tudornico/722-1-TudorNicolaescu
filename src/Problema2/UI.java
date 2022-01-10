package Problema2;

import com.sun.security.auth.NTSidUserPrincipal;

import java.sql.PseudoColumnUsage;
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
        String name;
        int preis;
        int SKU;
        int anzahl;
        while(choice != 0 ){
        switch (choice) {

            case (1):
                System.out.println("Product name is : ");
                name = scanner.nextLine();

                System.out.println("The Price is : ");
                preis = Integer.parseInt(scanner.nextLine());

                System.out.println("SKU is : ");
                SKU = Integer.parseInt(scanner.nextLine());

                System.out.println("The quantity is : ");
                anzahl = Integer.parseInt(scanner.nextLine());

                Produkt produce = new Produkt(name, preis, SKU, anzahl);
                ctrl.create(produce);
                produce = null;
                break;

            case (2):
                System.out.println(ctrl.getAll());
                break;

            case (3):
                System.out.println("Product name is : ");
                name = scanner.nextLine();

                System.out.println("The Price is : ");
                preis = Integer.parseInt(scanner.nextLine());

                System.out.println("SKU is : ");
                SKU = Integer.parseInt(scanner.nextLine());

                System.out.println("The quantity is : ");
                anzahl = Integer.parseInt(scanner.nextLine());
                Produkt prd = new Produkt(name,preis,SKU,anzahl);
                ctrl.update(prd);
                break;
            case (4):
                System.out.println("Product name is : ");
                name = scanner.nextLine();
                System.out.println("Quantity is : ");
                anzahl = Integer.parseInt(scanner.nextLine());
                try {
                    Produkt produkt = this.ctrl.findByName(name);
                    produkt.setAnzahl(anzahl);
                    this.ctrl.delete(produkt);

                } catch (Exception e) {
                    System.out.println("Name is not correct");
                }



                break;

        }
            System.out.println("Choose your operation" +
                    " 1. Create" +
                    " 2. Get All Products" +
                    " 3.Update a product" +
                    " 4. Delete");

            choice = scanner.nextInt();
        }

    }
}
