import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Administrador extends javax.swing.JFrame  implements Runnable{
     int hora;
    int minutos;
    int segundos;
    Calendar calendario;
    Thread hilo;
    String us="root";
    String pasword="123flor";  
    String url = "jdbc:mysql://localhost:3306/sistemaventas?serverTimezone=UTC";
    Statement s;//canal de conexion
    Connection conexion;
    PreparedStatement ps;
     static DefaultTableModel tabla = new DefaultTableModel();//tabla de productos 
     static DefaultTableModel tablac = new DefaultTableModel();//tabla que guarda los datos del cajero

    public Administrador() {
        initComponents();
        tabla = (DefaultTableModel)jTable1.getModel();//tabla de productos
        tablac =(DefaultTableModel)jTable2.getModel();// tabla de cajeros 
        setLocationRelativeTo(null);
       hilo=new Thread(this);//hilo
       hilo.start();//iniciar   la ejecucion del hilo
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        administrador = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelcodigo = new javax.swing.JLabel();
        nombreProd = new javax.swing.JTextField();
        codigoProd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7catgoria = new javax.swing.JLabel();
        precioProd = new javax.swing.JTextField();
        labelproovedor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        limpiar = new javax.swing.JButton();
        guarda = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cantidadprod = new javax.swing.JTextField();
        rp = new javax.swing.JLabel();
        buscarprod = new javax.swing.JTextField();
        jcategoria = new javax.swing.JTextField();
        jprovedor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        buscarcajero = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ButtonActualC = new javax.swing.JButton();
        ButtonbuscarC = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        limpiacaj = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabelidempleado = new javax.swing.JLabel();
        jLabelnombre = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelsueldo = new javax.swing.JLabel();
        usuariocaj = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17telefono = new javax.swing.JLabel();
        idcaj = new javax.swing.JTextField();
        nombrecaj = new javax.swing.JTextField();
        apellidocaj = new javax.swing.JTextField();
        sueldocaj = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        dircaj = new javax.swing.JTextArea();
        telefcaj = new javax.swing.JTextField();
        jLabel11contraseña = new javax.swing.JLabel();
        contraseñacaj = new javax.swing.JPasswordField();
        buttonlimpiar = new javax.swing.JButton();
        jButton3guardar = new javax.swing.JButton();
        jLabel14usuario = new javax.swing.JLabel();
        jsexo = new javax.swing.JLabel();
        sexo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        nombreprod = new javax.swing.JLabel();
        jLabel15categoria = new javax.swing.JLabel();
        jLabel18cantidad = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        fondoinven = new javax.swing.JLabel();
        cantidad = new javax.swing.JSpinner();
        cancelarinv = new javax.swing.JButton();
        eliminarinv = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        categoria = new javax.swing.JTextField();
        nomprod = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton7salir = new javax.swing.JButton();
        lblhora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, -1));

        labelcodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelcodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelcodigo.setText("Còdigo:");
        jPanel4.add(labelcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, -1));

        nombreProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProdActionPerformed(evt);
            }
        });
        nombreProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreProdKeyTyped(evt);
            }
        });
        jPanel4.add(nombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 190, -1));

        codigoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoProdActionPerformed(evt);
            }
        });
        jPanel4.add(codigoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Precio");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 50, -1));

        jLabel7catgoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7catgoria.setText("Categoria");
        jPanel4.add(jLabel7catgoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        precioProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioProdActionPerformed(evt);
            }
        });
        precioProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioProdKeyTyped(evt);
            }
        });
        jPanel4.add(precioProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));

        labelproovedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelproovedor.setText("Proovedor");
        jPanel4.add(labelproovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Buscar");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.jpg"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel4.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 130, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "codigo", "precio", "categoria", "proovedor", "cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 590, 160));

        limpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        jPanel4.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, 20));

        guarda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        guarda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        guarda.setText("Guardar");
        guarda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardaMouseClicked(evt);
            }
        });
        guarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardaActionPerformed(evt);
            }
        });
        jPanel4.add(guarda, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        cantidadprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadprodActionPerformed(evt);
            }
        });
        cantidadprod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadprodKeyTyped(evt);
            }
        });
        jPanel4.add(cantidadprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 70, 30));

        rp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rp.setText("Registra su producto ");
        jPanel4.add(rp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        buscarprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarprodActionPerformed(evt);
            }
        });
        buscarprod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarprodKeyTyped(evt);
            }
        });
        jPanel4.add(buscarprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 190, -1));

        jcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcategoriaActionPerformed(evt);
            }
        });
        jPanel4.add(jcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 190, -1));

        jprovedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprovedorActionPerformed(evt);
            }
        });
        jPanel4.add(jprovedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 190, -1));

        administrador.addTab("Registrar  Producto", jPanel4);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Registra cajero ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 220, 20));

        jTabbedPane3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel9.setBackground(new java.awt.Color(0, 102, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Nombre: ");

      
        buscarcajero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarcajeroKeyTyped(evt);
            }
        });

        jTable2.setBackground(new java.awt.Color(204, 204, 204));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Apellidos", "Sexo", "Telefono", "Usuario", "Password", "Sueldo", "direccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cajeros Registrados");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ButtonActualC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonActualC.setText("Actualizar");
        ButtonActualC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActualCActionPerformed(evt);
            }
        });

        ButtonbuscarC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButtonbuscarC.setText("Buscar");
        ButtonbuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonbuscarCActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        limpiacaj.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        limpiacaj.setText("Limpiar");
        limpiacaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiacajActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese el nombre que desea buscar");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscarcajero, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(ButtonbuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(limpiacaj))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonActualC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonbuscarC)
                            .addComponent(limpiacaj))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarcajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(ButtonActualC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Buscar", jPanel9);

        jPanel6.setBackground(new java.awt.Color(0, 102, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Datos ");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 111, -1));

        jLabelidempleado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelidempleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelidempleado.setText("Id empleado");
        jPanel6.add(jLabelidempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabelnombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelnombre.setText("Nombre");
        jPanel6.add(jLabelnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Apellidos");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        jLabelsueldo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelsueldo.setText("Sueldo");
        jPanel6.add(jLabelsueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, 20));
        jPanel6.add(usuariocaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 190, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Dirrecion");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jLabel17telefono.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17telefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17telefono.setText("Telefono");
        jPanel6.add(jLabel17telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        idcaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idcajActionPerformed(evt);
            }
        });
        idcaj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idcajKeyTyped(evt);
            }
        });
        jPanel6.add(idcaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 80, -1));

        nombrecaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrecajActionPerformed(evt);
            }
        });
        nombrecaj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrecajKeyTyped(evt);
            }
        });
        jPanel6.add(nombrecaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 200, 20));

        apellidocaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidocajActionPerformed(evt);
            }
        });
        apellidocaj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidocajKeyTyped(evt);
            }
        });
        jPanel6.add(apellidocaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 140, -1));

        sueldocaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sueldocajActionPerformed(evt);
            }
        });
        sueldocaj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sueldocajKeyTyped(evt);
            }
        });
        jPanel6.add(sueldocaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 140, 20));

        dircaj.setColumns(20);
        dircaj.setRows(5);
        jScrollPane2.setViewportView(dircaj);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 190, 50));

        telefcaj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefcajKeyTyped(evt);
            }
        });
        jPanel6.add(telefcaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 190, -1));

        jLabel11contraseña.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11contraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11contraseña.setText("Contraseña");
        jPanel6.add(jLabel11contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        contraseñacaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñacajActionPerformed(evt);
            }
        });
        jPanel6.add(contraseñacaj, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 190, -1));

        buttonlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.jpg"))); // NOI18N
        buttonlimpiar.setText("Limpiar");
        buttonlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonlimpiarActionPerformed(evt);
            }
        });
        jPanel6.add(buttonlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 110, 30));

        jButton3guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar_1.jpg"))); // NOI18N
        jButton3guardar.setText("Guardar");
        jButton3guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3guardarActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 110, 30));

        jLabel14usuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14usuario.setText("usuario");
        jPanel6.add(jLabel14usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jsexo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jsexo.setText("Sexo");
        jPanel6.add(jsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 40, 10));

        sexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexoActionPerformed(evt);
            }
        });
        sexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sexoKeyTyped(evt);
            }
        });
        jPanel6.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 100, -1));

        jTabbedPane3.addTab("Nuevo", jPanel6);

        jPanel2.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 600, 450));

        administrador.addTab("Registar cajero", jPanel2);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreprod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombreprod.setText("Nombre del producto: ");
        jPanel1.add(nombreprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel15categoria.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15categoria.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15categoria.setText("Categoria: ");
        jPanel1.add(jLabel15categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 90, -1));

        jLabel18cantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18cantidad.setText("Cantidad:");
        jPanel1.add(jLabel18cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        guardar.setBackground(new java.awt.Color(0, 0, 0));
        guardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel1.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, 40));

        fondoinven.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add user.png"))); // NOI18N
        jPanel1.add(fondoinven, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 220, 130));

        cantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 500, 1));
        jPanel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 90, 30));

        cancelarinv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelarinv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.jpg"))); // NOI18N
        cancelarinv.setText("Cancelar");
        cancelarinv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarinvActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarinv, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, -1));

        eliminarinv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eliminarinv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.jpg"))); // NOI18N
        eliminarinv.setText("Eliminar");
        eliminarinv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarinvActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarinv, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 130, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 90, 40));

        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });
        categoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                categoriaKeyTyped(evt);
            }
        });
        jPanel1.add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 180, 30));

        nomprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomprodActionPerformed(evt);
            }
        });
        nomprod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomprodKeyTyped(evt);
            }
        });
        jPanel1.add(nomprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 180, -1));

        administrador.addTab("inventario", jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrador");

        jButton7salir.setBackground(new java.awt.Color(255, 51, 51));
        jButton7salir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7salir.setText("Salir");
        jButton7salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7salirActionPerformed(evt);
            }
        });

        lblhora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7salir)
                .addContainerGap())
            .addComponent(administrador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jButton7salir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblhora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
public void run(){// metodo del hilo del reloj
    Thread actual= Thread.currentThread();
     while(actual==hilo){
         calendario=new GregorianCalendar();
         hora=calendario.get(Calendar.HOUR_OF_DAY);//del calendar obtiene la hora del dia
         minutos=calendario.get(Calendar.MINUTE);
         segundos=calendario.get(Calendar.SECOND);
         lblhora.setText(hora+":"+minutos+":"+segundos);
         try{
             Thread.sleep(1000);// dormir el hilo por 10000 miklisegundos 
         
     }catch(Exception ex){
         
     }}
             
}
    private void jButton7salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7salirActionPerformed
       // preguntar si desea salir 
         JLabel x = new JLabel("Confirma que desea salir" );
            Object[] x1={"",x};
                int si = JOptionPane.showConfirmDialog(null,x1,"Sistema de ventas",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);//preguntamos al usuario si esta confirmando el eliminar
                if(si==JOptionPane.OK_OPTION){
                System.exit(0);
                }
    }//GEN-LAST:event_jButton7salirActionPerformed
//verificar que  el usuario solo ingrese numeros
    private void cantidadprodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadprodKeyTyped
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        JOptionPane.showMessageDialog(null, "Solo se permiten numeros !","SISTEMA VENTAS ",0);
        }

    }//GEN-LAST:event_cantidadprodKeyTyped
   
                                
    private void cantidadprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadprodActionPerformed

    private void guardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardaActionPerformed
    insertarproductobd(); //metodo que inserta los  productos en la base de datos 
    }//GEN-LAST:event_guardaActionPerformed
private void buscarprodKeyTyped(java.awt.event.KeyEvent evt) {                                
     buscarproducto();//metodo de buscar un producto en la base de datos 
    }    
    private void guardaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardaMouseClicked
        //validar los campos no esten vacios
        //    if(nombreprod.getText().equals("") &&precioProd.getText().equals ("")&&codigoProd .getText().equals ("")&&precioProd .getText().equals ("")&& categoriaProd.getText().equals("")&&proovedorPro.getText().equals (""));
    }//GEN-LAST:event_guardaMouseClicked

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        nombreProd.setText("");
        codigoProd.setText("");
        precioProd.setText("");
        cantidadprod.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
      if(Seleccionado()){ // verificar que se selecione un dato en la tabla 
   JLabel x = new JLabel("Confirma que desea eliminar el producto "+ jTable1.getValueAt(jTable1.getSelectedRow(),1)); 
            Object[] x1={"",x};
                int si = JOptionPane.showConfirmDialog(null,x1,"Sistema de ventas",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);//preguntamos al usuario si esta confirmando el eliminar
                if(si==JOptionPane.OK_OPTION){// si la respuesta es si 
                    try{
                       conectandobd();//  conectar a la base de datos
                       String sql="delete from productos where nombre=?";// eliminar el producto donde el nombre sea igual a lo que se eligio en la tabla 
                       PreparedStatement ps= conexion.prepareStatement(sql); 
                       ps.setString(1,(String)jTable1.getValueAt(jTable1.getSelectedRow(),1)); 
                       int op= ps.executeUpdate();
                        muestra();//mostramos la tabla 
                        if (op==-1){// si no se puede eliminar mandar mensaje al usuario
                            JOptionPane.showMessageDialog(this,"Error: El producto  "+jTable1.getValueAt(jTable1.getSelectedRow(),1)+"no se pudo eliminar", "Errror",JOptionPane.ERROR_MESSAGE);
                        }
                    }catch(Exception ex) {
                    System.out.println("Error ");
                    }
                }        
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione un producto en la tabla ", "SISTEMA VENTAS ", JOptionPane.WARNING_MESSAGE);	
        }

    }//GEN-LAST:event_btneliminarActionPerformed

    private void buscarprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarprodActionPerformed
buscarproducto();
    }//GEN-LAST:event_buscarprodActionPerformed

    private void precioProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioProdKeyTyped
    //verificar que solo se ingrese numeros 
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
             JOptionPane.showMessageDialog(null, "Solo se permiten numeros !","SISTEMA VENTAS",0);
        }
    }//GEN-LAST:event_precioProdKeyTyped

   //metodo para conectar a la BD    
public void conectandobd(){
        try{
             //Se registra el driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion= DriverManager.getConnection(url,us,pasword); // conecta a la base de datos   con los datos 
            System.out.println("conexión establecida");
            }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos ", "Sistema ventas", 0);//mensaje de error

         }  
       }//fin del metodo conectando

    private void precioProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioProdActionPerformed
    }//GEN-LAST:event_precioProdActionPerformed

    private void codigoProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoProdActionPerformed
    }//GEN-LAST:event_codigoProdActionPerformed

    private void nombreProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreProdKeyTyped
   //verificar que solo se ingrese letras a las cajas de texto 
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten letras, no puede ingresar un numero !","Sistema ventas",0);
        }
    }//GEN-LAST:event_nombreProdKeyTyped

    private void nombreProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProdActionPerformed
    }//GEN-LAST:event_nombreProdActionPerformed

    private void jButton3guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3guardarActionPerformed
insertarcajerobd();// metodo que inserta los datos del cajero a la base de datos 
    }//GEN-LAST:event_jButton3guardarActionPerformed

    private void buttonlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonlimpiarActionPerformed
//limpiar las cajas de texto donde, registro usuario
idcaj.setText("");
apellidocaj.setText("");
sexo.setText("");
telefcaj.setText("");
usuariocaj.setText("");
contraseñacaj.setText("");
sueldocaj.setText("");
dircaj.setText("");      
    }//GEN-LAST:event_buttonlimpiarActionPerformed

    private void contraseñacajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñacajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñacajActionPerformed

    private void telefcajKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefcajKeyTyped
     //verificar que solo se ingresen numeros 
        char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep(); 
            evt.consume();
              JOptionPane.showMessageDialog(null, "Solo se permiten numeros !","SISTEMA VENTAS",0);
        }
    }//GEN-LAST:event_telefcajKeyTyped

    private void sueldocajKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldocajKeyTyped
     //verificar que solo se ingresen numeros 
      char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
                     JOptionPane.showMessageDialog(null, "Solo se permiten numeros !","SISTEMA VENTAS",0);
        }
    }//GEN-LAST:event_sueldocajKeyTyped

    private void sueldocajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sueldocajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sueldocajActionPerformed

    private void apellidocajKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidocajKeyTyped
       //permitir solo letras
       char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
                JOptionPane.showMessageDialog(null, "Solo se permiten letras, no puede ingresar un numero !","SISTEMA VENTAS",0);

        } 
    }//GEN-LAST:event_apellidocajKeyTyped

    private void apellidocajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidocajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidocajActionPerformed

    private void nombrecajKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrecajKeyTyped
      //verificar que solo se ingresen letras 
     char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten letras, no puede ingresar un numero !","SISTEMA VENTAS",0);

        }
    }//GEN-LAST:event_nombrecajKeyTyped

    private void buscarcajeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarcajeroKeyTyped
      //permitir solo el ingreso de letras
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
               JOptionPane.showMessageDialog(null, "Solo se permiten letras, no puede ingresar un numero !","SISTEMA VENTAS",0);


    }//GEN-LAST:event_buscarcajeroKeyTyped
    }                                        

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
  insertarproductobd(); //metodo que inserta los  productos en la base de datos 

    }//GEN-LAST:event_guardarActionPerformed

    private void actualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualActionPerformed
    }//GEN-LAST:event_actualActionPerformed

    private void nombrecajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrecajActionPerformed
    }//GEN-LAST:event_nombrecajActionPerformed

    private void ButtonActualCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActualCActionPerformed
    }//GEN-LAST:event_ButtonActualCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  if(Seleccionadotablacajero()){ 
   JLabel x = new JLabel("Confirma que desea eliminar el cajero "+ jTable2.getValueAt(jTable2.getSelectedRow(),1)); 
            Object[] x1={"",x};
                int si = JOptionPane.showConfirmDialog(null,x1,"Sistema de ventas",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(si==JOptionPane.OK_OPTION){
                    try{
                       conectandobd();// conectar a la base de datos 
                       String sql="delete from cajero where nombre=?";// eliminar de la tabla cajero donde el nombre sea igual a lo que el usrio seleciona en la tabla 
                       PreparedStatement ps= conexion.prepareStatement(sql); 
                       ps.setString(1,(String)jTable2.getValueAt(jTable2.getSelectedRow(),1)); 
                       int op= ps.executeUpdate();
                       muestracajero();//mostrar  la tabla cajero
                        if (op==-1){
                            JOptionPane.showMessageDialog(null, "Error: El Cajero "+jTable2.getValueAt(jTable2.getSelectedRow(),1)+" no se pudo eliminar!","SISTEMA VENTAS", 0);
                        }
                    }catch(Exception ex) {}
                }        
            
        }else{
              JOptionPane.showMessageDialog(null, "Seleccione un cajero enla tabla en a tabla!", "SISTEMA VENTAS", JOptionPane.WARNING_MESSAGE);	
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtonbuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonbuscarCActionPerformed
buscarcajero();
    }//GEN-LAST:event_ButtonbuscarCActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     	JLabel x = new JLabel("Confirma que desea cancelarr" );
            Object[] x1={"",x};
                int si = JOptionPane.showConfirmDialog(null,x1,"Sistema de ventas",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);//preguntamos al usuario si esta confirmando el eliminar
                if(si==JOptionPane.OK_OPTION){
                //System.exit(0);
                }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void limpiacajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiacajActionPerformed
     buscarcajero.setText("");
    }//GEN-LAST:event_limpiacajActionPerformed

    private void idcajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcajActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idcajActionPerformed

    private void jcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcategoriaActionPerformed

    private void jprovedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprovedorActionPerformed
    }//GEN-LAST:event_jprovedorActionPerformed

    private void cancelarinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarinvActionPerformed
      	JLabel x = new JLabel("Confirma que desea cancelarr" );
            Object[] x1={"",x};
                int si = JOptionPane.showConfirmDialog(null,x1,"Sistema de ventas",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);//preguntamos al usuario si esta confirmando el eliminar
                if(si==JOptionPane.OK_OPTION){
                //System.exit(0);
                }
        
    }//GEN-LAST:event_cancelarinvActionPerformed

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaActionPerformed

    private void nomprodKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomprodKeyTyped
//verificar que solo se ingrese letras a las cajas de texto 
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten letras, no puede ingresar un numero !","Sistema ventas",0);
        }    }//GEN-LAST:event_nomprodKeyTyped

    private void categoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoriaKeyTyped
//verificar que solo se ingrese letras a las cajas de texto 
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten letras, no puede ingresar un numero !","Sistema ventas",0);
        }
    }//GEN-LAST:event_categoriaKeyTyped

    private void idcajKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idcajKeyTyped
       //verificar que solo se ingresen numeros 
      char c=evt.getKeyChar();
        if(Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
                     JOptionPane.showMessageDialog(null, "Solo se permiten numeros !","SISTEMA VENTAS",0);
        }
    }//GEN-LAST:event_idcajKeyTyped

    private void sexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexoActionPerformed

    private void sexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sexoKeyTyped
//verificar que solo se ingrese letras a las cajas de texto 
        char c=evt.getKeyChar();
        if(Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten letras, no puede ingresar un numero !","Sistema ventas",0);
        }    }//GEN-LAST:event_sexoKeyTyped

    private void nomprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomprodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomprodActionPerformed

    private void eliminarinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarinvActionPerformed
  if(Seleccionado()){ // verificar que se selecione un dato en la tabla 
   JLabel x = new JLabel("Confirma que desea eliminar el producto "+ jTable1.getValueAt(jTable1.getSelectedRow(),1)); 
            Object[] x1={"",x};
                int si = JOptionPane.showConfirmDialog(null,x1,"Sistema de ventas",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);//preguntamos al usuario si esta confirmando el eliminar
                if(si==JOptionPane.OK_OPTION){// si la respuesta es si 
                    try{
                       conectandobd();//  conectar a la base de datos
                       String sql="delete from productos where nombre=?";// eliminar el producto donde el nombre sea igual a lo que se eligio en la tabla 
                       PreparedStatement ps= conexion.prepareStatement(sql); 
                       ps.setString(1,(String)jTable1.getValueAt(jTable1.getSelectedRow(),1)); 
                       int op= ps.executeUpdate();
                        muestra();//mostramos la tabla 
                        if (op==-1){// si no se puede eliminar mandar mensaje al usuario
                            JOptionPane.showMessageDialog(this,"Error: El producto  "+jTable1.getValueAt(jTable1.getSelectedRow(),1)+"no se pudo eliminar", "Errror",JOptionPane.ERROR_MESSAGE);
                        }
                    }catch(Exception ex) {
                    System.out.println("Error ");
                    }
                }        
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione un producto en la tabla ", "SISTEMA VENTAS ", JOptionPane.WARNING_MESSAGE);	
        }        
    }//GEN-LAST:event_eliminarinvActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      nomprod.setText("");
      categoria.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
    
   //insertar productos a la tabla productos de la base de datos 
 public void insertarproductobd(){
    String nombre=nombreProd.getText();
    String codigo= codigoProd.getText();
    String precios= precioProd.getText();
    String categoria = jcategoria.getText();
    String proovedor = jprovedor.getText();
    int cantidad=0;    
    String Cantidad= String.valueOf(cantidad);
    Cantidad= cantidadprod.getText();
  
    try{
       
         conectandobd();//conectar a  la base de datos 
          int x=-1;
         String sql="insert into Productos (nombre,codigo,precio,categoria, proovedor,cantidad) values (?,?,?,?,?,?);";
         ps= conexion.prepareStatement(sql);
         ps.setString(1, nombre);
         ps.setString(2,codigo );
         ps.setString(3,precios );
         ps.setString(4,categoria );
          ps.setString(5,proovedor);
         ps.setString(6,Cantidad);
         x=ps.executeUpdate();
         System.out.println(ps.toString()); 
          if (x==-1){
                       JOptionPane.showMessageDialog(null, "Error: producto"+nombreProd.getText()+" no se pudo agregar!", "SISTEMA VENTAS",0);
                   }else{
                       JOptionPane.showMessageDialog(null, "El Producto "+nombreProd.getText()+" se registro correctamente!");
                    }
      //    muestra();
    }catch(Exception ex) {
        System.out.println(ex.getMessage());

    }
     muestra();
 }
 
 public void insertarcajerobd(){//insertar a un cajero en la base de datos
    //obtener lo de las cajas de texto 
    String nombre= nombrecaj.getText();
    String apellidos= apellidocaj.getText();
    String sexoc=sexo.getText();
    String telefono = telefcaj.getText();
    String usuario= usuariocaj.getText();
    String contraseña= contraseñacaj.getText();
    String sueldo= sueldocaj.getText();
    String direccion= dircaj.getText();
  
    try{
         conectandobd();//conectar a la base de datos 
         int x=-1;
 
       String sql="insert into cajero (Nombre,apellidos,sexo,telefono,usuario,contraseña,sueldo,direccion) values (?,?,?,?,?,?,?,?);";
         ps= conexion.prepareStatement(sql);
         ps.setString(1, nombre);
         ps.setString(2,apellidos );
         ps.setString(3,sexoc );
         ps.setString(4,telefono );
         ps.setString(5,usuario);
         ps.setString(6,contraseña);
         ps.setString(7,sueldo);
         ps.setString(8,direccion);
         
         x=ps.executeUpdate();
         System.out.println(ps.toString()); 
          if (x==-1){
                JOptionPane.showMessageDialog(null, "Error: Cajero"+nombrecaj.getText()+" no se pudo REGISTRAR!", "Sistema ventas",0);
                   }else{
                       JOptionPane.showMessageDialog(null, "El Cajero "+nombrecaj.getText()+" se registro correctamente!");
                    }
      //    muestra();
    }catch(Exception ex) {
        System.out.println(ex.getMessage());
      

    }
     muestra();//mostrar la tabla 
 }
  public void muestra(){//mostrar en la tabla los productos 
    LimpiaTabla(); //limpiar la tabla de productos 
      Object[] ob = new Object[7];// array de objetos 
      try{
          conectandobd();//conectando a la base de datos 
           Statement s= conexion.createStatement();//se crea un canal de conexion
           ResultSet rs=s.executeQuery("Select * from Productos");//Un ResultSet mantiene un cursor apuntando a su fila actual de datos
           int cont=1;
           while(rs.next()){
               ob[0] = cont;
               ob[1] = rs.getObject("nombre");
               ob[2] = rs.getObject("codigo");
               ob[3] = rs.getObject("precio");
               ob[4] = rs.getObject("categoria");
               ob[5] = rs.getObject("proovedor");
               ob[6] = rs.getObject("cantidad");
               tabla.addRow(ob);
               cont++;
           }
        
        }catch (Exception e) {
               System.out.println(e.getMessage());// si surgue  un erro lo imprimimos
                JOptionPane.showMessageDialog(null, " Error al carjar usuarios  ", "SISTEMA VENTAS", 0);
            }
            jTable1.setModel(tabla);
            
  }
  
 public  void LimpiaTabla(){
     int a=tabla.getRowCount();    
     while(a!=0){ // Ciclo para Borrar la Tabla 1
         if(a!=0)
             tabla.removeRow(0);                      
         a=tabla.getRowCount();        
     }          
 }
  public  void LimpiaTablaCajero(){
          int a=tablac.getRowCount();    
          
     while(a!=0){ // Ciclo para Borrar la Tabla cajero
         if(a!=0)
            tablac.removeRow(0);                      
            a=tablac.getRowCount();        
     }          
 }
  public void buscarproducto(){
     String buscar=buscarprod.getText();
     String query="SELECT * FROM productos where nombre LIKE '%"+buscar+"%';";
     System.out.println(query);
      LimpiaTabla(); 
      Object[] ob = new Object[7];
      try{
          conectandobd();// se conecta a la base de datos 
          s= conexion.createStatement();//se crea un canal de comunicacion 
          ResultSet rs=s.executeQuery(query);//ejecutar  la consulta 
          int cont=1;

           while(rs.next()){//recorremos la tabla de productos
               ob[0] = rs.getObject("id");
               ob[1] = rs.getObject("nombre");
               ob[2] = rs.getObject("codigo");
               ob[3] = rs.getObject("precio");
               ob[4] = rs.getObject("categoria");
               ob[5] = rs.getObject("proovedor");
               ob[6] = rs.getObject("cantidad");
               tabla.addRow(ob);// se agrega a la tabla de productos los siguientes datos 
               cont++;
           }
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, " El producto no existe en la  base de datos  ", "SISTEMA VENTAS", 0);
            }
            jTable1.setModel(tabla);//tabla de productos 
 }
  public void buscarcajero(){//metodo  para buscar cajeros 
    String buscar=buscarcajero.getText();//obtener lo de la caja de texto 
     String query="SELECT * FROM cajero where nombre LIKE '%"+buscar+"%';";// consulta para buscar el nombre 
     System.out.println(query);//imprimir el query
      LimpiaTablaCajero(); //limpiar la tbla de cajeros
      Object[] ob = new Object[8];// array de objetos 
      try{
          conectandobd();//connectar a la base de datos 
          s= conexion.createStatement();// canal de comunicaciòn 
           ResultSet rs=s.executeQuery(query);
            int cont=1;
           while(rs.next()){ 
               ob[0] = rs.getObject("id");
               ob[1] = rs.getObject("nombre");
               ob[2] = rs.getObject("apellidos");
               ob[3] = rs.getObject("sexo");
               ob[4] = rs.getObject("telefono");
               ob[5] = rs.getObject("usuario");
               ob[6] = rs.getObject("contraseña");
               ob[5] = rs.getObject("sueldo");
               ob[6] = rs.getObject("direccion");
               tablac.addRow(ob);
               cont++;
           }
            
        }catch (Exception e) {
             JOptionPane.showMessageDialog(null, " El  cajero no existe en la base de datos ", "SISTEMA VENTAS", 0);

            }
            jTable2.setModel(tablac);// tabla cajero
 }
  public void muestracajero(){
    LimpiaTablaCajero(); 
      Object[] ob = new Object[7];
      try{
          conectandobd();
          
          Statement s= conexion.createStatement();
           ResultSet rs=s.executeQuery("Select * from cajero");
           int cont=1;
           while(rs.next()){
               ob[0] = rs.getObject("id");
               ob[1] = rs.getObject("nombre");
               ob[2] = rs.getObject("apellidos");
               ob[3] = rs.getObject("sexo");
               ob[4] = rs.getObject("telefono");
               ob[5] = rs.getObject("usuario");
               ob[6] = rs.getObject("contraseña");
               ob[5] = rs.getObject("sueldo");
               ob[6] = rs.getObject("direccion");
               tablac.addRow(ob);
               cont++;
           }
        
        }catch (SQLException e) {
               System.out.println(e.getMessage());
          
            }
            jTable2.setModel(tablac);        
  }

  public boolean Seleccionado(){// seleccionar en la tabla productos 
       if (jTable1.getSelectedRow()!=-1){
           return true;
       }
       else return false;
   }
  public boolean Seleccionadotablacajero(){//  seleccionar en la tabla cajero 
       if (jTable2.getSelectedRow()!=-1){
           return true;
       }
       else return false;
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActualC;
    private javax.swing.JButton ButtonbuscarC;
    private javax.swing.JTabbedPane administrador;
    private javax.swing.JTextField apellidocaj;
    private javax.swing.JButton btneliminar;
    private javax.swing.JTextField buscarcajero;
    private javax.swing.JTextField buscarprod;
    private javax.swing.JButton buttonlimpiar;
    private javax.swing.JButton cancelarinv;
    private javax.swing.JSpinner cantidad;
    private javax.swing.JTextField cantidadprod;
    private javax.swing.JTextField categoria;
    private javax.swing.JTextField codigoProd;
    private javax.swing.JPasswordField contraseñacaj;
    private javax.swing.JTextArea dircaj;
    private javax.swing.JButton eliminarinv;
    private javax.swing.JLabel fondoinven;
    private javax.swing.JButton guarda;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField idcaj;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3guardar;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11contraseña;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel14usuario;
    private javax.swing.JLabel jLabel15categoria;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17telefono;
    private javax.swing.JLabel jLabel18cantidad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel7catgoria;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelidempleado;
    private javax.swing.JLabel jLabelnombre;
    private javax.swing.JLabel jLabelsueldo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jcategoria;
    private javax.swing.JTextField jprovedor;
    private javax.swing.JLabel jsexo;
    private javax.swing.JLabel labelcodigo;
    private javax.swing.JLabel labelproovedor;
    private javax.swing.JLabel lblhora;
    private javax.swing.JButton limpiacaj;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nombreProd;
    private javax.swing.JTextField nombrecaj;
    private javax.swing.JLabel nombreprod;
    private javax.swing.JTextField nomprod;
    private javax.swing.JTextField precioProd;
    private javax.swing.JLabel rp;
    private javax.swing.JTextField sexo;
    private javax.swing.JTextField sueldocaj;
    private javax.swing.JTextField telefcaj;
    private javax.swing.JTextField usuariocaj;
    // End of variables declaration//GEN-END:variables

   
}