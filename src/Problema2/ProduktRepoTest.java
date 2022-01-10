package Problema2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class ProduktRepoTest {

    @org.junit.jupiter.api.Test
    void create() {
        Produkt apple = new Produkt("apple",20,2255,30);
        Produkt chiars = new Produkt("chiars",30,2254,30);
        List<Produkt> produktList = new ArrayList<>();
        produktList.add(apple);
        ProduktRepo repo = new ProduktRepo(produktList);
        repo.create(chiars);
        assert(repo.getAll().size() == 2);
        assert(Objects.equals(repo.getAll().get(1).getName(), "chiars"));
    }

    @org.junit.jupiter.api.Test
    void getAll() {
        Produkt apple = new Produkt("apple",20,2255,30);
        Produkt chiars = new Produkt("chiars",30,2254,30);
        List<Produkt> produktList = new ArrayList<>();
        produktList.add(apple);
        produktList.add(chiars);
        ProduktRepo repo = new ProduktRepo(produktList);
        assert(repo.getAll().size() ==2);
        Produkt umbrela = new Produkt("umbrela",25,2245,40);
        repo.create(umbrela);
        assert (repo.getAll().size() == 3);
    }

    @org.junit.jupiter.api.Test
    void update() throws Exception {
        Produkt apple = new Produkt("apple",20,2255,30);
        Produkt chiars = new Produkt("chiars",30,2254,30);
        List<Produkt> produktList = new ArrayList<>();
        produktList.add(apple);
        produktList.add(chiars);
        ProduktRepo repo = new ProduktRepo(produktList);
        Produkt newApple = new Produkt("apple",15,2255,30);
        repo.update(newApple);
        assert (repo.findByName(newApple.getName()).getPreis() == newApple.getPreis());
    }

    @org.junit.jupiter.api.Test
    void delete() throws Exception {
        Produkt apple = new Produkt("apple",20,2255,30);
        Produkt chiars = new Produkt("chiars",30,2254,30);
        List<Produkt> produktList = new ArrayList<>();
        produktList.add(apple);
        produktList.add(chiars);
        ProduktRepo repo = new ProduktRepo(produktList);
        repo.delete(apple);
        Produkt brokenChairs = new Produkt("chiars",30,2254,25);
        assert (repo.getAll().size() ==1);
        repo.delete(brokenChairs);
        assert (repo.findByName(chiars.getName()).getAnzahl() == 5);
    }

    @org.junit.jupiter.api.Test
    void findByName() throws Exception {

        Produkt apple = new Produkt("apple",20,2255,30);
        Produkt chiars = new Produkt("chiars",30,2254,30);
        List<Produkt> produktList = new ArrayList<>();
        produktList.add(apple);
        produktList.add(chiars);
        ProduktRepo repo = new ProduktRepo(produktList);
        assert (repo.findByName("apple").getPreis() == 20);
    }
}