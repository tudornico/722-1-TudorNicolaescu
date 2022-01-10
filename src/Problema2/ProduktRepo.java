package Problema2;

import java.util.List;

public class ProduktRepo implements ICRUDRepo<Produkt>{
    public List<Produkt> produkts;

    public ProduktRepo(List<Produkt> produkts) {
        this.produkts = produkts;
    }

    /**
     * fucntion that adds a new object to our repository and in case of the object already existing
     * we just increment the product quantity
     * @param obj  the instance of the object needed
     * @return the current obj
     */
    @Override
    public Produkt create(Produkt obj) {
        for (Produkt produkt:this.produkts
             ) {
            if(produkt.getName().equals(obj.getName())){
                produkt.setAnzahl(produkt.getAnzahl() + obj.getAnzahl());
                return obj;
            }
        }
       this.produkts.add(obj);
       return obj;
    }

    /**
     * fucntion that brings back all the produces
     * @return list of produces
     */
    @Override
    public List<Produkt> getAll() {
        return this.produkts;
    }

    @Override

    public Produkt update(Produkt obj) {
        return null;
    }

    @Override
    /**
     * function that deletes the given object
     */
    public void delete(Produkt obj) {
        for (Produkt produce :this.produkts
        ) {
            if(produce.getAnzahl() <=obj.getAnzahl()){
                this.produkts.remove(produce);
            }
            else
            {
                produce.setAnzahl(produce.getAnzahl() - obj.getAnzahl());
            }
        }
    }

    public Produkt findByName(String name) throws Exception {
        for (Produkt produce: this.produkts
             ) {
            if(produce.getName().equals(name)){
                return produce;
            }
        }
        throw new Exception("Element not found");
    }
}
