
package proyecto1;


public class facturacion {
    private String tarjetaNombre;
    private String tarjetaNum;
    
    // ------------------------------
  
    private String nombreCompleto; 
    private String direccion; 
    private String nitF; 
    /////----------------------
    private int peso; 
    private int cantPaquetes; 
    private String origenDep; 
    private String origenMuni; 
    private String origenDir; 
    private String destinoDep; 
    private String destinoMuni; 
    private String destinoDir; 
    //-----------------
    private String contraEntrega;

    

    
    private double estandar; 
    private double  especial; 


    private double totalEstandar;
    private double totalEspecial;

    
    
    
    public facturacion(){
        tarjetaNombre = new String();
        tarjetaNum = new String();
        nombreCompleto = new String();
        direccion = new String();
        contraEntrega = new String();
        nitF = new String();
        
        origenDep=new String();
        origenMuni = new String();
        origenDir = new String();
        destinoDep = new String();
        destinoMuni = new String();
        destinoDir = new String();
        
        estandar=0;
        especial=0;
        peso = 0;
        cantPaquetes = 0;
        totalEstandar=0;
        totalEspecial=0;
        
       
        
    }
    
    

    public String getOrigenDep() {
        return origenDep;
    }

    public void setOrigenDep(String origenDep) {
        this.origenDep = origenDep;
    }

    public String getOrigenMuni() {
        return origenMuni;
    }

    public void setOrigenMuni(String origenMuni) {
        this.origenMuni = origenMuni;
    }

    public String getOrigenDir() {
        return origenDir;
    }

    public void setOrigenDir(String origenDir) {
        this.origenDir = origenDir;
    }

    public String getDestinoDep() {
        return destinoDep;
    }

    public void setDestinoDep(String destinoDep) {
        this.destinoDep = destinoDep;
    }

    public String getDestinoMuni() {
        return destinoMuni;
    }

    public void setDestinoMuni(String destinoMuni) {
        this.destinoMuni = destinoMuni;
    }

    public String getDestinoDir() {
        return destinoDir;
    }

    public void setDestinoDir(String destinoDir) {
        this.destinoDir = destinoDir;
    }

    public String getTarjetaNombre() {
        return tarjetaNombre;
    }

    public void setTarjetaNombre(String tarjetaNombre) {
        this.tarjetaNombre = tarjetaNombre;
    }

    public String getTarjetaNum() {
        return tarjetaNum;
    }

    public void setTarjetaNum(String tarjetaNum) {
        this.tarjetaNum = tarjetaNum;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNitF() {
        return nitF;
    }

    public void setNitF(String nitF) {
        this.nitF = nitF;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCantPaquetes() {
        return cantPaquetes;
    }

    public void setCantPaquetes(int cantPaquetes) {
        this.cantPaquetes = cantPaquetes;
    }

    public String getContraEntrega() {
        return contraEntrega;
    }

    public void setContraEntrega(String contraEntrega) {
        this.contraEntrega = contraEntrega;
    }
    
    public double getEstandar() {
        return estandar;
    }

    public void setEstandar(double estandar) {
        this.estandar = estandar;
    }

    public double getEspecial() {
        return especial;
    }

    public void setEspecial(double especial) {
        this.especial = especial;
    }
        public double getTotalEstandar() {
        return totalEstandar;
    }

    public void setTotalEstandar(double totalEstandar) {
        this.totalEstandar = totalEstandar;
    }

    public double getTotalEspecial() {
        return totalEspecial;
    }

    public void setTotalEspecial(double totalEspecial) {
        this.totalEspecial = totalEspecial;
    }
    
}
