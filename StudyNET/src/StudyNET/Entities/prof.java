/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyNET.Entities;

/**
 *
 * @author nourhene
 */
public class prof {
    
    private int id;
    private String nom;

    public prof(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    
    public prof(){}
    
     public prof( String nom) {
     
        this.nom = nom;
    }
    
            
            

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
}
