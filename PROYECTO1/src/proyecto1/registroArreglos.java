
package proyecto1;


public class registroArreglos {
    private String kioscoNom;
    private String kioscoCod;
    private String codReg;
    
    // REG
    private String region;
    //// ESTABLECER YA LOS PRECIOS EN ADMINISTRADOR 
    private String estandar; 
    private String especial; 
    //-----------
    private String depNom; 
    private String depRegion; 
    private String muniNombre; 
    private int contador = 0;
    private int contadorUsuario = 0;
    
    private int contadorPaquetes = 0;
    private int contadorIngresos=0;
    
    public registroArreglos(){
        kioscoNom = new String();
        kioscoCod = new String();
        codReg = new String();
        region = new String();
        estandar = new String();
        especial = new String();
        depNom = new String();
        depRegion = new String();
        muniNombre = new String();
        contador = 0;
        contadorUsuario = 0;
        contadorPaquetes=0;
        contadorIngresos=0;
    
    }

    public int getContadorIngresos() {
        return contadorIngresos;
    }

    public void setContadorIngresos(int contadorIngresos) {
        this.contadorIngresos = contadorIngresos;
    }

    public int getContadorPaquetes() {
        return contadorPaquetes;
    }

    public void setContadorPaquetes(int contadorPaquetes) {
        this.contadorPaquetes = contadorPaquetes;
    }

    public int getContadorUsuario() {
        return contadorUsuario;
    }

    public void setContadorUsuario(int contadorUsuario) {
        this.contadorUsuario = contadorUsuario;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public String getKioscoNom() {
        return kioscoNom;
    }

    public void setKioscoNom(String kioscoNom) {
        this.kioscoNom = kioscoNom;
    }

    public String getKioscoCod() {
        return kioscoCod;
    }

    public void setKioscoCod(String kioscoCod) {
        this.kioscoCod = kioscoCod;
    }

    public String getCodReg() {
        return codReg;
    }

    public void setCodReg(String codReg) {
        this.codReg = codReg;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEstandar() {
        return estandar;
    }

    public void setEstandar(String estandar) {
        this.estandar = estandar;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public String getDepNom() {
        return depNom;
    }

    public void setDepNom(String depNom) {
        this.depNom = depNom;
    }

    public String getDepRegion() {
        return depRegion;
    }

    public void setDepRegion(String depRegion) {
        this.depRegion = depRegion;
    }

    public String getMuniNombre() {
        return muniNombre;
    }

    public void setMuniNombre(String muniNombre) {
        this.muniNombre = muniNombre;
    }
    
}

