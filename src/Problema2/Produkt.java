package Problema2;

public class Produkt{
    public String Name;
    public int Preis;
    public int SKU;
    public int anzahl;

    public Produkt(String name, int preis, int SKU, int anzahl) {
        this.Name = name;
        this.Preis = preis;
        this.SKU = SKU;
        this.anzahl = anzahl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPreis() {
        return Preis;
    }

    public void setPreis(int preis) {
        Preis = preis;
    }

    public int getSKU() {
        return SKU;
    }

    public void setSKU(int SKU) {
        this.SKU = SKU;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "Name='" + Name + '\'' +
                ", Preis=" + Preis +
                ", SKU=" + SKU +
                ", anzahl=" + anzahl +
                '}';
    }
}
