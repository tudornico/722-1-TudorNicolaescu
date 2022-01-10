import Problema2.Produkt;
import Problema2.ProduktController;
import Problema2.ProduktRepo;
import Problema2.UI;

import java.util.ArrayList;
import java.util.List;

public class FIrst{
    public static void main(String[] args) {
        Produkt apples = new Produkt("Apples",5,215244,100);
        Produkt chairs = new Produkt("Chairs",20,223454,30);
        Produkt umbrelas = new Produkt("Umbrelas",10,223225,14);
        List<Produkt> produkts = new ArrayList<>();
        produkts.add(apples);
        produkts.add(chairs);
        produkts.add(umbrelas);
        ProduktRepo repo = new ProduktRepo(produkts);
        ProduktController ctrl = new ProduktController(repo);

        UI ui = new UI(ctrl);
        ui.start();

    }
}