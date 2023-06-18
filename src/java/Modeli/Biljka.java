/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeli;

/**
 *
 * @author Vukisha
 */
public class Biljka {
     public String getNaziv() {
        return Naziv;
    }

    public void setNaziv(String Naziv) {
        this.Naziv = Naziv;
    }

    public String getCvet() {
        return cvet;
    }

    public void setCvet(String cvet) {
        this.cvet = cvet;
    }

    public String getZalivanje() {
        return zalivanje;
    }

    public void setZalivanje(String zalivanje) {
        this.zalivanje = zalivanje;
    }

    public Biljka(String Naziv, String cvet, String zalivanje) {
        this.Naziv = Naziv;
        this.cvet = cvet;
        this.zalivanje = zalivanje;
    }
    
    public Biljka() {
        this.Naziv = "";
        this.cvet = "";
        this.zalivanje = "";
    }
    
    private String Naziv;
    private String cvet;
    private String zalivanje;
}
