/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ema01
 */
public class modelo_libro {
    
    private int cod_libro;
    private String tit_libro,nom_libro,edit_libro;

    public int getCod_libro() {
        return cod_libro;
    }

    public void setCod_libro(int cod_libro) {
        this.cod_libro = cod_libro;
    }

    public String getTit_libro() {
        return tit_libro;
    }

    public void setTit_libro(String tit_libro) {
        this.tit_libro = tit_libro;
    }

    public String getNom_libro() {
        return nom_libro;
    }

    public void setNom_libro(String nom_libro) {
        this.nom_libro = nom_libro;
    }

    public String getEdit_libro() {
        return edit_libro;
    }

    public void setEdit_libro(String edit_libro) {
        this.edit_libro = edit_libro;
    }
    public modelo_libro(int libro,String tit_libro) {
    }
    
     public modelo_libro() {
    }
    
    
}
