
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
 
public class Factura extends javax.swing.JFrame implements Runnable {

    ArrayList<Articulos> Lista = new ArrayList<>();
    Calculos Cantidades = new Calculos(); 

    
    String Hora, Minutos, Segundos, ampm;
    Calendar calendario;
    Thread h1;
    
    
    
    
    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        
        while(ct==h1){
            calcula();
            jLHora.setText("Hora: "+Hora+":"+Minutos+":"+Segundos+" "+ampm);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){}
            
        }
   }
    
    private void calcula(){
        Calendar calendario = new GregorianCalendar();
        Date HoraActual = new Date();
        
        calendario.setTime(HoraActual);
        ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        if(ampm.equals("PM")){
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            Hora = h>9?""+h:"0"+h;
        }else{
            Hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        }
        Minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        Segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);

    }

    
    public static String Fecha(){
        Date Fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY"); 
        return formatofecha.format(Fecha);
    }
    
    
    

    public Factura() {
        initComponents();       
        h1= new Thread(this);
        h1.start();         
        jLFecha.setText("Fecha: "+Fecha());
        LbNfactura.setText(Integer.toString((int)Math.floor((Math.random()*999999)+100000)));
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlSubTotal = new javax.swing.JLabel();
        jLIsv = new javax.swing.JLabel();
        jLTotalPagar = new javax.swing.JLabel();
        jLCreditoCuota = new javax.swing.JLabel();
        jTextNombreCliente = new javax.swing.JTextField();
        jTextid2 = new javax.swing.JTextField();
        jTextid3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextid1 = new javax.swing.JTextField();
        jBCalcular = new javax.swing.JButton();
        jBanhadir = new javax.swing.JButton();
        txtPrecioU = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNombreArt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jBClienteNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaArticulos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LbNfactura = new javax.swing.JLabel();
        JlNClienteNuevo = new javax.swing.JLabel();
        jLIdClienteN = new javax.swing.JLabel();
        jLFormaDePago = new javax.swing.JLabel();
        JlTipoDeCliente = new javax.swing.JLabel();
        jLTarjetaClienteN = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        jLHora = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supermercados Plaza de Juan");
        setBackground(new java.awt.Color(153, 255, 153));
        setLocationByPlatform(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE DEL CLIENTE:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 20, 152, 22));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 20, -1, 22));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("-");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 24, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("-");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 24, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("TIPO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 65, 22));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MÉTODO DE PAGO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, 20));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pago al Crédito:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SUBTOTAL");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(969, 589, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ISV 15%");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(982, 624, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TOTAL A PAGAR");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 662, -1, -1));

        jlSubTotal.setBackground(new java.awt.Color(204, 255, 204));
        jlSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jlSubTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jlSubTotal.setOpaque(true);
        getContentPane().add(jlSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 589, 198, 20));

        jLIsv.setBackground(new java.awt.Color(204, 255, 204));
        jLIsv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLIsv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLIsv.setOpaque(true);
        getContentPane().add(jLIsv, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 618, 198, 20));

        jLTotalPagar.setBackground(new java.awt.Color(204, 255, 204));
        jLTotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLTotalPagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLTotalPagar.setOpaque(true);
        getContentPane().add(jLTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 656, 198, 20));

        jLCreditoCuota.setBackground(new java.awt.Color(204, 255, 204));
        jLCreditoCuota.setText("0.00");
        jLCreditoCuota.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLCreditoCuota.setOpaque(true);
        getContentPane().add(jLCreditoCuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, 133, -1));
        getContentPane().add(jTextNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 21, 183, -1));
        getContentPane().add(jTextid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 21, 40, -1));
        getContentPane().add(jTextid3, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 21, 50, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NATURAL", "JURIDICA" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTADO", "CRÉDITO" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, -1, -1));
        getContentPane().add(jTextid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 21, 40, -1));

        jBCalcular.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(jBCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 640, 204, 44));

        jBanhadir.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jBanhadir.setText("Añadir Artículo");
        jBanhadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBanhadirActionPerformed(evt);
            }
        });
        getContentPane().add(jBanhadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 536, 179, 44));
        getContentPane().add(txtPrecioU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 62, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Precio Unitario ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 422, -1, -1));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 498, 69, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Unidades");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 478, -1, -1));
        getContentPane().add(txtNombreArt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 391, 149, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nombre Del Articulo");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 371, -1, -1));

        jBClienteNuevo.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jBClienteNuevo.setText("Añadir Cliente");
        jBClienteNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClienteNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jBClienteNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 60, 225, 32));

        jTablaArticulos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTablaArticulos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N°", "CODIGO", "NOMBRE", "PRECIO U.", "UNIDADES", "PRECIO T"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablaArticulos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTablaArticulos.setGridColor(new java.awt.Color(153, 204, 255));
        jTablaArticulos.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jTablaArticulos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTablaArticulos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 233, 955, 347));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Factura # ");

        LbNfactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LbNfactura.setText("#");

        JlNClienteNuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JlNClienteNuevo.setForeground(new java.awt.Color(255, 255, 255));
        JlNClienteNuevo.setText("Nombre del Cliente");

        jLIdClienteN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLIdClienteN.setForeground(new java.awt.Color(255, 255, 255));
        jLIdClienteN.setText("ID");

        jLFormaDePago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLFormaDePago.setForeground(new java.awt.Color(255, 255, 255));
        jLFormaDePago.setText("Forma de Pago");

        JlTipoDeCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JlTipoDeCliente.setForeground(new java.awt.Color(255, 255, 255));
        JlTipoDeCliente.setText("Tipo de Persona");

        jLTarjetaClienteN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLTarjetaClienteN.setForeground(new java.awt.Color(255, 255, 255));
        jLTarjetaClienteN.setText("# Cuenta");

        jLFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLFecha.setForeground(new java.awt.Color(255, 255, 255));
        jLFecha.setText("Fecha");

        jLHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLHora.setForeground(new java.awt.Color(255, 255, 255));
        jLHora.setText("Hora");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLIdClienteN, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLTarjetaClienteN, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LbNfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(JlNClienteNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JlTipoDeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLHora, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLFormaDePago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLFecha)
                    .addComponent(jLHora)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlNClienteNuevo)
                    .addComponent(jLFormaDePago)
                    .addComponent(JlTipoDeCliente))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLIdClienteN))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLTarjetaClienteN)))
                .addGap(17, 17, 17)
                .addComponent(LbNfactura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 110, -1, 117));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Edelberto Rz\\Pictures\\images.png")); // NOI18N
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.setPreferredSize(new java.awt.Dimension(153, 99));
        jLabel15.setRequestFocusEnabled(false);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 253, 199));

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Edelberto Rz\\Pictures\\Saved Pictures\\ingenieros-informaticos.jpg")); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Presionar Boton Añadir;
    private void jBanhadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBanhadirActionPerformed
    
        Calculos articulos = new Calculos(txtNombreArt.getText(), txtCantidad.getText(), txtPrecioU.getText());
            Lista.add(articulos);
            Mostrar();

        //Volver a inicial los Cuadros d Texto en donde se agrean los Articulos
        txtNombreArt.setText("");
        txtPrecioU.setText("");
        txtCantidad.setText("");
        
    }//GEN-LAST:event_jBanhadirActionPerformed

    
    //Preionar Boton Calcular;
    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
        jComboBox1ActionPerformed(evt);
        
        if(jComboBox1.getSelectedIndex()==1 || jComboBox2.getSelectedIndex()==1){
                jLCreditoCuota.setText(Cantidades.getCreditoC());
                jlSubTotal.setText("0.00");
                jLIsv.setText("0.00");
                jLTotalPagar.setText("0.00");     
            
        }else{  
                jlSubTotal.setText(Cantidades.getSubtotal());
                jLIsv.setText(Cantidades.getISV());
                jLTotalPagar.setText(Cantidades.getTotalPagar());

        }
        //Desactivar toda la edicion

        txtNombreArt.setEditable(false);
        txtCantidad.setEditable(false);
        txtPrecioU.setEditable(false);
        jBCalcular.setEnabled(false);
        jBanhadir.setEnabled(false);

        JOptionPane.showMessageDialog(null, "El Programa ha Finalizado");

    }//GEN-LAST:event_jBCalcularActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex()==1){
           jComboBox2.setSelectedIndex(1);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jBClienteNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClienteNuevoActionPerformed
        JlNClienteNuevo.setText("Nombre del Cliente: "+jTextNombreCliente.getText());
        jLIdClienteN.setText("ID: "+jTextid1.getText()+" - "+jTextid2.getText()+" - "+jTextid3.getText());
       
        if(jComboBox1.getSelectedIndex()==0){
            JlTipoDeCliente.setText("Persona Natural");
        }else{JlTipoDeCliente.setText("Persona Juridica");}  
        
        if(jComboBox2.getSelectedIndex()==0){
            jLFormaDePago.setText("Pago al Contado");
        }else{jLFormaDePago.setText("Pago al Crédito");}  
        
        if(jComboBox2.getSelectedIndex()==1){
            jLTarjetaClienteN.setText("XXX XXX XXXX "+(int)Math.floor((Math.random()*9999)+1000));
        }else{
             jLTarjetaClienteN.setText("Cuenta N/D");
        }
        
        jTextNombreCliente.setEditable(false);
        jTextid1.setEditable(false);
        jTextid2.setEditable(false);
        jTextid3.setEditable(false);
        jComboBox1.setEnabled(false);
        jComboBox2.setEnabled(false);
        
     
        
    }//GEN-LAST:event_jBClienteNuevoActionPerformed

    public void Mostrar(){
      String matriz[][] = new String[Lista.size()][6];
      
      String Contador ; 
      Integer AuxiliardeContador = 1;
      float subtotal=0;
      
      for (int i = 0; i < Lista.size(); i++) {
            Contador = Integer.toString(AuxiliardeContador);
            matriz[i][0]=Contador;
            matriz[i][1]=Integer.toString((int)Math.floor((Math.random()*9999)+1000));  //Error: Me genera cada vez numero aleatorios;
            matriz[i][2]=Lista.get(i).Nombre;
            matriz[i][3]=Lista.get(i).PrecioU;
            matriz[i][4]=Integer.toString((int)Math.floor(Double.parseDouble(Lista.get(i).Unidades)));
            matriz[i][5]=Lista.get(i).getPrecioT(); 
            
            subtotal = subtotal+(Float.parseFloat(matriz[i][5]));
            
            AuxiliardeContador++;
        }
      
      //Añadir Datos a La Matriz 
         jTablaArticulos.setModel(new javax.swing.table.DefaultTableModel(
           matriz,
            new String [] {
                "N°", "CODIGO", "NOMBRE", "PRECIO U.", "CANTIDAD", "PRECIO T"
            }
         )
         );
      //Añadir Datos a La Matriz   
         
      //Envir la suma de las cantidades de precio total como un subtotal para calcular isv, y posterior el total a pagar
       Cantidades.setSubtotal(Float.toString(subtotal));
    
    }
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Factura().setVisible(true);
   
                }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlNClienteNuevo;
    private javax.swing.JLabel JlTipoDeCliente;
    private javax.swing.JLabel LbNfactura;
    private javax.swing.JButton jBCalcular;
    private javax.swing.JButton jBClienteNuevo;
    private javax.swing.JButton jBanhadir;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLCreditoCuota;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLFormaDePago;
    private javax.swing.JLabel jLHora;
    private javax.swing.JLabel jLIdClienteN;
    private javax.swing.JLabel jLIsv;
    private javax.swing.JLabel jLTarjetaClienteN;
    private javax.swing.JLabel jLTotalPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaArticulos;
    private javax.swing.JTextField jTextNombreCliente;
    private javax.swing.JTextField jTextid1;
    private javax.swing.JTextField jTextid2;
    private javax.swing.JTextField jTextid3;
    private javax.swing.JLabel jlSubTotal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombreArt;
    private javax.swing.JTextField txtPrecioU;
    // End of variables declaration//GEN-END:variables


}
