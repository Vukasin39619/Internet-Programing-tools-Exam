/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeli;

/**
 *
 * @author Vukisha
 */
public class Osoba {
    
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getNivo() {
        return nivo;
    }

    public void setNivo(String nivo) {
        this.nivo = nivo;
    }

    public Osoba(String ime, String nivo) {
        this.ime = ime;
        this.nivo = nivo;
    }
    
    public Osoba() {
        this.ime = "";
        this.nivo = "";
    }
    
    private String ime;
    private String nivo;
    
}
