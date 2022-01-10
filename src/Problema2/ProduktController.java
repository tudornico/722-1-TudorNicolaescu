package Problema2;

import java.util.List;

public class ProduktController {
    public ProduktRepo repo;

    public ProduktController(ProduktRepo repo) {
        this.repo = repo;
    }

    public Produkt create(Produkt obj){
        return this.repo.create(obj);
    }


    public List<Produkt> getAll(){
        return repo.getAll();
    }

    public Produkt update(Produkt obj){
        return repo.update(obj);
    }

    public void delete(Produkt obj){
        this.repo.delete(obj);
    }

    public Produkt findByName(String name) throws Exception {
       return this.repo.findByName(name);
    }
}
