/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author natalia
 */
public class envioSol {

    
     private String cod;
     private String tipTot;
     private String dest;
     private String tipoP;
     
     public envioSol (){
         cod = new String();
         tipTot = new String();
         dest = new String();
         tipoP= new String();
         
     }
     public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getTipTot() {
        return tipTot;
    }

    public void setTipTot(String tipTot) {
        this.tipTot = tipTot;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }
    
}
