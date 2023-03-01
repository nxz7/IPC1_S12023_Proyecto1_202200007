
package proyecto1;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author natalia
 */
public class frameCliente extends javax.swing.JFrame {

    public static ArrayList <clienteArreglo> aList;
    public static ArrayList <registroArreglos> bList;
    public static ArrayList <facturacion> zList;
    public static ArrayList <envioSol> gList;
    
    private String tarjetaNombre, tarjetaNum, nombreCompleto, direccion,contraEntrega, nitF, origenMuni, origenDir, origenDep, destinoDep, destinoMuni, destinoDir;
    private String cod, tipTot, dest, tipoP;

    private static int paquetesrep=0;
    private static int ingresosrep=0;
            

    private int cantPaquetes, peso; 
    private double estandar, especial, totalEstandar, totalEspecial;
    public static int numeroFact;

    
    public frameCliente() {
        initComponents();
        this.bList = PROYECTO1.bList;
        this.aList = PROYECTO1.aList;
        this.zList = PROYECTO1.zList;
        this.gList =PROYECTO1.gList;
        cod = "";
        tipTot = "";
        dest = "";
        tipoP="";
        tarjetaNombre = "";
        tarjetaNum = "";
        nombreCompleto = "";
        direccion = "";
        contraEntrega = "";
        nitF = "";
        origenDep="";
        origenMuni = "";
        origenDir = "";
        destinoDep = "";
        destinoMuni = "";
        destinoDir = "";
        
        boolean vic = true;
        ///// ARREGLAR REPETIDOS 
        try{ 
            if(vic){
                origenDepGUI.removeAllItems();
                origenDepGUI.setSelectedItem(null);
                destinoDepGUI.removeAllItems();
                destinoDepGUI.setSelectedItem(null);
                origenMuniGUI.removeAllItems();
                origenMuniGUI.setSelectedItem(null);
                destinoMuniGUI.removeAllItems();
                destinoMuniGUI.setSelectedItem(null);
        
               for( int i= 0; i<this.bList.size(); i++){
                   
                String v = this.bList.get(i).getDepNom().toString();
                String f = this.bList.get(i).getDepNom().toString();
                String zz = this.bList.get(i).getMuniNombre().toString();
                
                
                        origenMuniGUI.addItem(zz);
                        destinoMuniGUI.addItem(zz);

                        destinoDepGUI.addItem(f);
                        origenDepGUI.addItem(v);
                        
             }    }}
        
        catch (Exception e) {
           System.out.println(e);
                }
        
        
        
    }
    
    public static void addPaquetesRep(int cant1) {
        paquetesrep += cant1;
    }

    public static int getPaquetesRep() {
        return paquetesrep;
    }
    
    public static void addIngrespsRep(double cant2) {
        ingresosrep += cant2;
    }

    public static double getIngrespsRep() {
        return ingresosrep;
    }
    
 public static ArrayList<String> guiaGen = new ArrayList<String>();
 //----
 

    /**
   
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tarjetaNomGUI = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        tarjetaNumGUI = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nomCompletoGUI = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        registrarFact = new javax.swing.JButton();
        direccionGUI = new javax.swing.JTextField();
        nitFGUI = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        origenDepGUI = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        destinoDepGUI = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        origenMuniGUI = new javax.swing.JComboBox<>();
        destinoMuniGUI = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        origenDicGUI = new javax.swing.JTextField();
        destinoDicGUI = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cotizarGUI = new javax.swing.JButton();
        cantidadGUI = new javax.swing.JTextField();
        pesoGUI = new javax.swing.JFormattedTextField();
        descCotiGUI = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tipoPagoGUI = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        tarjetaFactGUI = new javax.swing.JComboBox<>();
        cvvFactGUI = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        nombreFactGUI = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        registrarTarGUI = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        tipoFactGUI = new javax.swing.JComboBox<>();
        muestraGUI = new javax.swing.JTextField();
        factHTML = new javax.swing.JButton();
        guiaHTML = new javax.swing.JButton();
        verEnviosGUI = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 153, 0));
        jLabel26.setText("TIPO DE PAGO");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(102, 153, 0));
        jLabel27.setText("TIPO DE PAGO");

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(102, 102, 0));
        jLabel29.setText("NOMBRE COMPLETO");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(187, 212, 206));

        jPanel2.setBackground(new java.awt.Color(177, 172, 148));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CLIENTE");

        cerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        cerrarSesion.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(51, 51, 51));
        cerrarSesion.setText("cerrar sesion");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("REGISTRO TARJETA");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 0));
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 0));
        jLabel4.setText("NUMERO");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 0));
        jLabel5.setText("FECHA DE");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 0));
        jLabel6.setText("VENCIMIENTO");

        tarjetaNomGUI.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "23", "24", "25", "26", "27", "28", "29" }));

        tarjetaNumGUI.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaNumGUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("################"))));
        tarjetaNumGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaNumGUIActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(177, 172, 148));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(177, 172, 148));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 0));
        jLabel7.setText("REGISTRO DE FACTURACION");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 0));
        jLabel8.setText("NOMBRE COMPLETO");

        nomCompletoGUI.setBackground(new java.awt.Color(255, 255, 255));
        nomCompletoGUI.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 0));
        jLabel9.setText("DIRECCION");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 0));
        jLabel10.setText("NIT");

        registrarFact.setBackground(new java.awt.Color(153, 153, 0));
        registrarFact.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        registrarFact.setText("REGISTRAR");
        registrarFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarFactActionPerformed(evt);
            }
        });

        direccionGUI.setBackground(new java.awt.Color(255, 255, 255));
        direccionGUI.setForeground(new java.awt.Color(0, 0, 0));

        nitFGUI.setBackground(new java.awt.Color(255, 255, 255));
        nitFGUI.setForeground(new java.awt.Color(0, 0, 0));
        nitFGUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel11.setBackground(new java.awt.Color(102, 102, 0));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("COTIZACION");

        origenDepGUI.setBackground(new java.awt.Color(255, 255, 255));
        origenDepGUI.setForeground(new java.awt.Color(0, 0, 0));
        origenDepGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origenDepGUIActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 0));
        jLabel12.setText("ORIGEN");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 255));
        jLabel13.setText("departamento");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 0));
        jLabel14.setText("DESTINO");

        destinoDepGUI.setBackground(new java.awt.Color(255, 255, 255));
        destinoDepGUI.setForeground(new java.awt.Color(0, 0, 0));
        destinoDepGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoDepGUIActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 255));
        jLabel15.setText("MUNICIPIOS");

        origenMuniGUI.setBackground(new java.awt.Color(255, 255, 255));
        origenMuniGUI.setForeground(new java.awt.Color(0, 0, 0));

        destinoMuniGUI.setBackground(new java.awt.Color(255, 255, 255));
        destinoMuniGUI.setForeground(new java.awt.Color(0, 0, 0));
        destinoMuniGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoMuniGUIActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 0));
        jLabel16.setText("PESO TOTAL");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 255));
        jLabel17.setText("direccion");

        origenDicGUI.setBackground(new java.awt.Color(255, 255, 255));
        origenDicGUI.setForeground(new java.awt.Color(0, 0, 0));

        destinoDicGUI.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(177, 172, 148));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 0));
        jLabel18.setText("NUMERO DE PAQUETES");

        jPanel6.setBackground(new java.awt.Color(102, 102, 0));
        jPanel6.setForeground(new java.awt.Color(153, 153, 0));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel19.setText("pequeño: 1 a 50 libras");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel20.setText("mediano: 11 a 50 libras");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel21.setText("grande: 51 lb en adelante");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cotizarGUI.setBackground(new java.awt.Color(255, 255, 255));
        cotizarGUI.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        cotizarGUI.setForeground(new java.awt.Color(0, 0, 0));
        cotizarGUI.setText("COTIZAR");
        cotizarGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cotizarGUIActionPerformed(evt);
            }
        });

        cantidadGUI.setBackground(new java.awt.Color(255, 255, 255));
        cantidadGUI.setForeground(new java.awt.Color(0, 0, 0));

        pesoGUI.setBackground(new java.awt.Color(255, 255, 255));
        pesoGUI.setForeground(new java.awt.Color(0, 51, 51));
        pesoGUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        descCotiGUI.setBackground(new java.awt.Color(204, 204, 255));
        descCotiGUI.setForeground(new java.awt.Color(51, 0, 51));
        descCotiGUI.setText("DESCARGAR COTIZACION");
        descCotiGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descCotiGUIActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("COMPRA");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 153, 0));
        jLabel23.setText("TIPO DE PAGO");

        tipoPagoGUI.setBackground(new java.awt.Color(255, 255, 255));
        tipoPagoGUI.setForeground(new java.awt.Color(0, 0, 0));
        tipoPagoGUI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "contra entrega", "con tarjeta de credito o debito" }));
        tipoPagoGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPagoGUIActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setForeground(new java.awt.Color(0, 0, 0));

        tarjetaFactGUI.setBackground(new java.awt.Color(255, 255, 255));
        tarjetaFactGUI.setForeground(new java.awt.Color(0, 0, 0));

        cvvFactGUI.setBackground(new java.awt.Color(255, 255, 255));
        cvvFactGUI.setForeground(new java.awt.Color(0, 0, 0));
        cvvFactGUI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("tarjeta                                       cvv");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tarjetaFactGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cvvFactGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tarjetaFactGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvvFactGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel24.setForeground(new java.awt.Color(153, 153, 0));
        jLabel24.setText("* Contra entrega: reargo de Q 5.00 sobre el precio cotizado");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 153, 0));
        jLabel28.setText("Datos de facturacion");

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("NOMBRE");

        nombreFactGUI.setBackground(new java.awt.Color(255, 255, 255));
        nombreFactGUI.setForeground(new java.awt.Color(0, 0, 0));
        nombreFactGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFactGUIActionPerformed(evt);
            }
        });

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("NIT");

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton1.setText("REALIZAR PAGO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        registrarTarGUI.setBackground(new java.awt.Color(255, 255, 255));
        registrarTarGUI.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        registrarTarGUI.setForeground(new java.awt.Color(153, 153, 0));
        registrarTarGUI.setText("REGISTRAR");
        registrarTarGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarTarGUIActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 204, 51));
        jLabel32.setText("Tipo de servicio");

        tipoFactGUI.setBackground(new java.awt.Color(255, 255, 255));
        tipoFactGUI.setForeground(new java.awt.Color(102, 102, 255));
        tipoFactGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoFactGUIActionPerformed(evt);
            }
        });

        muestraGUI.setBackground(new java.awt.Color(255, 255, 255));
        muestraGUI.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        muestraGUI.setForeground(new java.awt.Color(51, 153, 0));

        factHTML.setBackground(new java.awt.Color(153, 153, 0));
        factHTML.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        factHTML.setForeground(new java.awt.Color(255, 255, 255));
        factHTML.setText("Factura");
        factHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factHTMLActionPerformed(evt);
            }
        });

        guiaHTML.setBackground(new java.awt.Color(153, 153, 0));
        guiaHTML.setForeground(new java.awt.Color(255, 255, 255));
        guiaHTML.setText("Guia");
        guiaHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiaHTMLActionPerformed(evt);
            }
        });

        verEnviosGUI.setBackground(new java.awt.Color(255, 255, 255));
        verEnviosGUI.setForeground(new java.awt.Color(153, 153, 0));
        verEnviosGUI.setText("ver envios");
        verEnviosGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verEnviosGUIActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(102, 102, 0));
        jPanel9.setForeground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Descargar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(32, 32, 32)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tarjetaNomGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tarjetaNumGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(registrarTarGUI)
                                        .addGap(4, 4, 4)))
                                .addGap(7, 7, 7)))
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registrarFact)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(30, 30, 30)
                                        .addComponent(nomCompletoGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nitFGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(direccionGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(destinoDepGUI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(destinoMuniGUI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(destinoDicGUI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(120, 120, 120)
                                        .addComponent(cotizarGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cantidadGUI, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                    .addComponent(pesoGUI))))
                                        .addGap(20, 20, 20))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(origenDepGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel17))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(origenMuniGUI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(origenDicGUI))))
                                .addGap(105, 105, 105)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(descCotiGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(tipoPagoGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(90, 90, 90))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(47, 47, 47))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tipoFactGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(23, 23, 23)
                                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(9, 9, 9)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(nombreFactGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addComponent(muestraGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(factHTML, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(guiaHTML, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(verEnviosGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(nomCompletoGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tarjetaNomGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9)
                                .addGap(8, 8, 8)
                                .addComponent(direccionGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel10)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nitFGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registrarFact)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(tarjetaNumGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(registrarTarGUI))))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(origenDepGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(destinoDepGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(origenMuniGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(destinoMuniGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(origenDicGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(destinoDicGUI)))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(cantidadGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(pesoGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cotizarGUI)
                                .addGap(45, 45, 45)))
                        .addGap(27, 27, 27)
                        .addComponent(descCotiGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(tipoPagoGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(nombreFactGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipoFactGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(muestraGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(factHTML)
                            .addComponent(guiaHTML)
                            .addComponent(verEnviosGUI))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tarjetaNumGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaNumGUIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tarjetaNumGUIActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        dispose();
        MenuPrincipal p = new MenuPrincipal();
        p.setVisible(true);
    }//GEN-LAST:event_cerrarSesionActionPerformed
facturacion z= new facturacion();

    private void registrarFactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarFactActionPerformed
        //tarjetaNombre = tarjetaNomGUI.getText();
       // tarjetaNum =tarjetaNumGUI.getText();
        nombreCompleto = nomCompletoGUI.getText();        
        direccion =direccionGUI.getText();
        //contraEntrega  = nombreGUI.getText(); 
        nitF  = nitFGUI.getText();
        
        
        z.setNombreCompleto(nombreCompleto);
        //z.setTarjetaNombre(tarjetaNombre);
       // z.setTarjetaNum(tarjetaNum);
        z.setDireccion(direccion);
        z.setNitF(nitF);
        
        zList.add(z);
        
        jComboBox4.addItem(z.getNitF());
        nombreFactGUI.addItem(z.getNombreCompleto());
         
        JOptionPane.showMessageDialog(null, "DATOS REGISTRADOS ");
        
        
        
        
        
        
    }//GEN-LAST:event_registrarFactActionPerformed

    private void origenDepGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origenDepGUIActionPerformed
        
    }//GEN-LAST:event_origenDepGUIActionPerformed

    private void destinoDepGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoDepGUIActionPerformed
        
    }//GEN-LAST:event_destinoDepGUIActionPerformed

    private void cotizarGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cotizarGUIActionPerformed
        origenDep=origenDepGUI.getSelectedItem().toString();
        origenMuni = origenMuniGUI.getSelectedItem().toString();
        origenDir = origenDicGUI.getText();
        destinoDep = destinoDepGUI.getSelectedItem().toString();
        destinoMuni = destinoMuniGUI.getSelectedItem().toString();
        destinoDir = destinoDicGUI.getText();
        /// PESO TOTAL - HACERLE IFs 
         try{ 
             cantPaquetes=Integer.parseInt(cantidadGUI.getText());
             peso=Integer.parseInt(pesoGUI.getText());
            }
        
        catch (Exception e) {
           System.out.println(e);
           JOptionPane.showMessageDialog(null, "INTRESE UN NUMERO");
                }
       
        
        
        z.setOrigenDep(origenDep);
        z.setOrigenMuni(origenMuni);
        z.setOrigenDir(origenDir);
        z.setDestinoDep(destinoDep);
        z.setDestinoMuni(destinoMuni);
        z.setDestinoDir(destinoDir);
        z.setCantPaquetes(cantPaquetes);
        z.setPeso(peso);
        
        zList.add(z);
        
        if(this.z.getDestinoDep().equals("Guatemala")){
            z.setEstandar( 25);
            z.setEspecial(35);
        }
        else if (this.z.getDestinoDep().equals("Baja Verapaz")||this.z.getDestinoDep().equals("Alta Verapaz") ){
            z.setEstandar( 45.55);
            z.setEspecial(68.50);
        }
        else if(this.z.getDestinoDep().equals("El Progreso")||this.z.getDestinoDep().equals("Izabal")||this.z.getDestinoDep().equals("Zacapa")||this.z.getDestinoDep().equals("Chiquimula")){
            z.setEstandar( 35.48);
            z.setEspecial(56.68);
       }
      else if(this.z.getDestinoDep().equals("Santa Rosa")||this.z.getDestinoDep().equals("Jalapa")||this.z.getDestinoDep().equals("Jutiapa")){
            z.setEstandar( 32.48);
            z.setEspecial(38.68);
       }
      //"Solola" "Totonicapan" "Quetzaltenango" "Suchitepequez" "Retalhuleu" "San Marcos"
      else if(this.z.getDestinoDep().equals("Solola")||this.z.getDestinoDep().equals("Totonicapan")||this.z.getDestinoDep().equals("Quetzaltenango")||this.z.getDestinoDep().equals("Suchitepequez")||this.z.getDestinoDep().equals("Retalhuleu")||this.z.getDestinoDep().equals("San Marcos")){
            z.setEstandar( 29);
            z.setEspecial(34);
       }
      else if(this.z.getDestinoDep().equals("Huehuetenango")||this.z.getDestinoDep().equals("Quiche") ){
            z.setEstandar( 40);
            z.setEspecial(44.50);
   
       }
      else if(this.z.getDestinoDep().equals("Sacatepequez")||this.z.getDestinoDep().equals("Chimaltenango")||this.z.getDestinoDep().equals("Escuintla")){
            z.setEstandar( 38.00);
            z.setEspecial(41.00);
   
       }
      else if(this.z.getDestinoDep().equals("Peten")){
            z.setEstandar( 51);
            z.setEspecial(68);
        
       }
        
        
        totalEstandar= cantPaquetes * peso* this.z.getEstandar();
        totalEspecial = cantPaquetes * peso * this.z.getEspecial();
        
        JOptionPane.showMessageDialog(null, "COTIZACION "+ "\n" + "Total Estandar:Q"+ totalEstandar + "\n" + "total especial:Q " + totalEspecial);
        
        
        
        
    }//GEN-LAST:event_cotizarGUIActionPerformed

    private void descCotiGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descCotiGUIActionPerformed
        StringBuilder html1 = new StringBuilder();
        html1.append("<html><body style='color: blue;'>cotizacion<br><ul>");

        double totalesHTML= totalEstandar;
        double totalespHTML=totalEspecial;
        
        html1.append("destino:" + destinoMuni + ", " + destinoDep + "<br>");
            
        html1.append("total estandar: Q" + totalesHTML+ "<br>");
        html1.append("total especial: Q"+ totalespHTML + "<br>");

        html1.append("</ul></body></html>");

        String html = html1.toString();

        try {
            File doc = new File("cotizacion.html");
            FileWriter writer = new FileWriter(doc);
            writer.write(html);
            writer.close();
            Desktop.getDesktop().open(doc); 

            JOptionPane.showMessageDialog(null, "cotizacion descargada!");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_descCotiGUIActionPerformed

    private void registrarTarGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarTarGUIActionPerformed
        tarjetaNombre = tarjetaNomGUI.getText();
        tarjetaNum =tarjetaNumGUI.getText();
        z.setTarjetaNombre(tarjetaNombre);
        z.setTarjetaNum(tarjetaNum);
        zList.add(z);
        JOptionPane.showMessageDialog(null, "DATOS REGISTRADOS ");
        String zgy = z.getTarjetaNum();
        String remp = "XXXXXXXXXXXX";
        String primDoce = "^.{12}";
        zgy = zgy.replaceAll(primDoce, remp);
        tarjetaFactGUI.addItem(zgy);
        
        
        
        
    }//GEN-LAST:event_registrarTarGUIActionPerformed

    private void tipoPagoGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPagoGUIActionPerformed
        try{
        if(tipoPagoGUI.getSelectedItem().equals("contra entrega")){
            tipoFactGUI.removeAllItems();
            totalEstandar= totalEstandar+5;
            totalEspecial= totalEspecial+5;
            tarjetaFactGUI.removeAllItems();
            String tipo1 = "Estandar: Q";
            String tipo2 = "Especial: Q";
            tipoFactGUI.addItem(tipo1 + totalEstandar );
            tipoFactGUI.addItem(tipo2 + totalEspecial );
            
            
        }
        else if (tipoPagoGUI.getSelectedItem().equals("con tarjeta de credito o debito")){
            tipoFactGUI.removeAllItems();
            String tipo1 = "Estandar: Q";
            String tipo2 = "Especial: Q";
            tipoFactGUI.addItem(tipo1 + totalEstandar );
            tipoFactGUI.addItem(tipo2 + totalEspecial );
        }
              }
        catch (Exception e) {
        System.out.println(e);
      }
        
        
        
    }//GEN-LAST:event_tipoPagoGUIActionPerformed

    private void nombreFactGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFactGUIActionPerformed
       
    }//GEN-LAST:event_nombreFactGUIActionPerformed

    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String guiaAl;
       String mostrarTot;
       // para verificar que no exista y genrar la guia
        do{
        StringBuilder guia = new StringBuilder();
        guia.append("IPC1C");
        String carac = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!%<>$&*/-_";

        for (int i = 0; i < 5; i++) {
            char c = carac.charAt((int)(Math.random() * carac.length()));
            guia.append(c);
        }


        guiaAl = guia.toString();
        }while(guiaGen.contains(guiaAl));
        guiaGen.add(guiaAl);
        
        mostrarTot= tipoFactGUI.getSelectedItem().toString();

        envioSol g = new envioSol();
        
        numeroFact++;
        muestraGUI.setText("Guia:  "+ guiaAl + "\n" + mostrarTot + "\n");
        
        cod= guiaGen.get(numeroFact -1);
        tipTot = tipoFactGUI.getSelectedItem().toString();
        tipoP = tipoPagoGUI.getSelectedItem().toString();
        dest = destinoDepGUI.getSelectedItem().toString();
        
        g.setCod(cod);
        g.setTipTot( tipTot);
        g.setTipoP(tipoP);
        g.setDest(dest);
        
        gList.add(g);
        
        int cant1 =Integer.parseInt(cantidadGUI.getText());
        frameCliente.addPaquetesRep(cant1);
        
        if(mostrarTot.indexOf("Estandar: Q")>-1){
        double cant2 = totalEstandar;
        frameCliente.addIngrespsRep(cant2);
        }
        else { double cant2= totalEspecial;
        frameCliente.addIngrespsRep(cant2);
                }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    
    
    
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        
                
                
                
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void destinoMuniGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoMuniGUIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinoMuniGUIActionPerformed

    private void tipoFactGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoFactGUIActionPerformed
        
        
    }//GEN-LAST:event_tipoFactGUIActionPerformed

    private void factHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factHTMLActionPerformed
        String nombrehtml=nombreFactGUI.getSelectedItem().toString();
        // guiaAl = codigo
        // origen = origenDep
        //destino= destinoDep
        String nitHtml=jComboBox4.getSelectedItem().toString();
        String pagoHtml= tipoPagoGUI.getSelectedItem().toString();
        //numero = cantPaquetes 
        //tamaño= peso 
        String totalHtml= tipoFactGUI.getSelectedItem().toString();

        try {
            File fileN = new File("factura.html");
            FileWriter escribir = new FileWriter(fileN);
            escribir.write("<table class=\"body-wrap\">\n");
                escribir.write("<tbody><tr>\n");
                escribir.write("<td></td>\n");
                escribir.write("<td class=\"container\" width=\"600\">\n");
                escribir.write("<div class=\"content\">\n");
                escribir.write("<table class=\"main\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
                escribir.write("<tbody><tr>\n");
                escribir.write("<td class=\"content-wrap aligncenter\">\n");
                escribir.write("<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
                escribir.write("<tbody><tr>\n");
                escribir.write("<td class=\"content-block\">\n");
                escribir.write("<h2>FACTURA</h2>\n");
                escribir.write("</td>\n");
                escribir.write("</tr>\n");
                escribir.write("<tr>\n");
                escribir.write("<td class=\"content-block\">\n");
                escribir.write("<table class=\"invoice\">\n");
                escribir.write("<tbody><tr>\n");
                escribir.write( "Nombre: " + nombrehtml + "<br> Codigo de paquete #" + guiaGen.get(numeroFact -1) + "<br> Numero de factura" + numeroFact + "<br>\n");
                escribir.write("Origen:" + origenDepGUI.getSelectedItem().toString() + "<br> Destino: " + destinoDepGUI.getSelectedItem().toString() + "<br> Nit: " + nitHtml + "<br>\n");
                escribir.write("<td> Tipo de pago: " + pagoHtml + "<br> Tamaño: " + pesoGUI.getText()  + "(lb) <br> Numero de paquetes:" + cantidadGUI.getText() + "</td>\n");
                escribir.write("</tr>\n");
                escribir.write("<tr>\n");
                escribir.write("<td>\n");
                escribir.write("<table class=\"invoice-items\" cellpadding=\"0\" cellspacing=\"0\">\n");
                escribir.write("<tbody><tr>\n");
                escribir.write("<td class=\"alignright\"> TOTA A PAGAR:  " + totalHtml + "</td>\n");
                escribir.write("</tr>\n");
         
            escribir.close();
            Desktop.getDesktop().open(fileN); 

            JOptionPane.showMessageDialog(null, "factura descargada!");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
    }//GEN-LAST:event_factHTMLActionPerformed

    private void guiaHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiaHTMLActionPerformed
        String nombrehtml=nombreFactGUI.getSelectedItem().toString();
        // guiaAl = codigo
        // origen = origenDep
        //destino= destinoDep
        String nitHtml=jComboBox4.getSelectedItem().toString();
        String pagoHtml= tipoPagoGUI.getSelectedItem().toString();
        //numero = cantPaquetes 
        //tamaño= peso 
        String totalHtml= tipoFactGUI.getSelectedItem().toString();
        java.util.Date fecha = new java.util.Date();
        

        try {
            File fileN = new File("factura.html");
            FileWriter escribir = new FileWriter(fileN);
            escribir.write("<table class=\"body-wrap\">\n");
                escribir.write("<tbody><tr>\n");
                escribir.write("<td></td>\n");
                escribir.write("<td class=\"container\" width=\"600\">\n");
                escribir.write("<div class=\"content\">\n");
                escribir.write("<table class=\"main\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
                escribir.write("<tbody><tr>\n");
                escribir.write("<td class=\"content-wrap aligncenter\">\n");
                escribir.write("<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
                escribir.write("<tbody><tr>\n");
                escribir.write("<td class=\"content-block\">\n");
                escribir.write("<h2> GUIA [etiqueta de envio] </h2>\n");
                escribir.write("</td>\n");
                escribir.write("</tr>\n");
                escribir.write("<tr>\n");
                escribir.write("<td class=\"content-block\">\n");
                escribir.write("<table class=\"invoice\">\n");
                escribir.write("<tbody><tr>\n");
                escribir.write( "Nombre: " + nombrehtml + "<br> Codigo de paquete #" + guiaGen.get(numeroFact -1) + "<br>\n");
                escribir.write("Origen:" + origenDepGUI.getSelectedItem().toString() + "<br> Destino: " + destinoDepGUI.getSelectedItem().toString() + "<br>\n");
                escribir.write("Fecha de envio:" + fecha + "<br>\n");
                escribir.write("<td> Tipo de pago: " + pagoHtml + "<br> Tamaño: " + pesoGUI.getText()  + "(lb) <br> Numero de paquetes:" + cantidadGUI.getText() + "</td>\n");
                escribir.write("<br>\n");
                escribir.write("</tr>\n");
                escribir.write("<tr>\n");
                escribir.write("<td>\n");
                escribir.write("<table class=\"invoice-items\" cellpadding=\"0\" cellspacing=\"0\">\n");
                escribir.write("<tbody><tr>\n");
                escribir.write("<td class=\"alignright\"> TOTA A PAGAR:  " + totalHtml + "</td>\n");
                escribir.write("<br>\n");
                escribir.write("</tr>\n");
                escribir.write("<img src=\"https://www.dynamicinventory.net/wp-content/uploads/2017/11/Barcode.jpg\" alt=\"codigo\" width=\"500\" height=\"150\">");
         
            escribir.close();
            Desktop.getDesktop().open(fileN); 

            JOptionPane.showMessageDialog(null, "guia descargada!");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
    }//GEN-LAST:event_guiaHTMLActionPerformed

    private void verEnviosGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verEnviosGUIActionPerformed
        dispose();
        enviosSolicitados pi = new enviosSolicitados();
        pi.setVisible(true);
    }//GEN-LAST:event_verEnviosGUIActionPerformed

    /**
     
       }
     
      
      
        
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadGUI;
    private javax.swing.JButton cerrarSesion;
    private javax.swing.JButton cotizarGUI;
    private javax.swing.JFormattedTextField cvvFactGUI;
    private javax.swing.JButton descCotiGUI;
    private javax.swing.JComboBox<String> destinoDepGUI;
    private javax.swing.JTextField destinoDicGUI;
    private javax.swing.JComboBox<String> destinoMuniGUI;
    private javax.swing.JTextField direccionGUI;
    private javax.swing.JButton factHTML;
    private javax.swing.JButton guiaHTML;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField muestraGUI;
    private javax.swing.JFormattedTextField nitFGUI;
    private javax.swing.JTextField nomCompletoGUI;
    private javax.swing.JComboBox<String> nombreFactGUI;
    private javax.swing.JComboBox<String> origenDepGUI;
    private javax.swing.JTextField origenDicGUI;
    private javax.swing.JComboBox<String> origenMuniGUI;
    private javax.swing.JFormattedTextField pesoGUI;
    private javax.swing.JButton registrarFact;
    private javax.swing.JButton registrarTarGUI;
    private javax.swing.JComboBox<String> tarjetaFactGUI;
    private javax.swing.JTextField tarjetaNomGUI;
    private javax.swing.JFormattedTextField tarjetaNumGUI;
    private javax.swing.JComboBox<String> tipoFactGUI;
    private javax.swing.JComboBox<String> tipoPagoGUI;
    private javax.swing.JButton verEnviosGUI;
    // End of variables declaration//GEN-END:variables
}
