
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class loginus extends javax.swing.JFrame  implements Runnable{
Administrador  ta=  new Administrador ();
    
//variables para el reloj
int hora;
int minutos;
int segundos;
Calendar calendario;
Thread hilo;
cajero  caj = new  cajero();
Statement s;
Connection conexion;
 
 String us="root";
 String pasword="123flor";  
 String url = "jdbc:mysql://localhost:3306/sistemaventas?serverTimezone=UTC";

// String url="jdbc:mysql://localhost?serverTimezone=UTC/sistemaventas";

 int rs1;
 private Object administrador;
    
    public loginus() {
        initComponents();
        setLocationRelativeTo(null);
        hilo=new Thread(this);
       hilo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1ingresar = new javax.swing.JButton();
        jButton2limpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3salir = new javax.swing.JButton();
        jpass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combousuario = new javax.swing.JComboBox<>();
        lblhora = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jButton1ingresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1ingresar.setText("Ingresar");
        jButton1ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ingresarActionPerformed(evt);
            }
        });

        jButton2limpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2limpiar.setText("Limpiar");
        jButton2limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2limpiarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        jButton3salir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.jpg"))); // NOI18N
        jButton3salir.setText("Salir");
        jButton3salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3salirActionPerformed(evt);
            }
        });

        jpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpassActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingrese sus datos ");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cemento.jpg"))); // NOI18N

        combousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combousuarioActionPerformed(evt);
            }
        });

        lblhora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Seleccione el usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpass, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1ingresar)
                        .addGap(41, 41, 41)
                        .addComponent(jButton2limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton3salir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1ingresar)
                    .addComponent(jButton2limpiar)
                    .addComponent(jButton3salir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void run(){
    Thread actual= Thread.currentThread();
     while(actual==hilo){
         calendario=new GregorianCalendar();
         hora=calendario.get(Calendar.HOUR_OF_DAY);//del calendar obtiene la hora del dia
         minutos=calendario.get(Calendar.MINUTE);
         segundos=calendario.get(Calendar.SECOND);
         lblhora.setText(hora+":"+minutos+":"+segundos);
         try{
             Thread.sleep(1000);
         
     }catch(Exception ex){
         
     }}
             
}
public  void llenacombo(){//llenar el combo de usuarios con los datos que ya estan en la base de datos 
     combousuario.removeAllItems();
     String query="SELECT * FROM usuarios;";
      try{
         // CN.conectando();
         conectando();
         s= conexion.createStatement();
           ResultSet rs=s.executeQuery(query);
           while(rs.next()){
                 combousuario.addItem(rs.getString("nombre"));
            }
         }catch(Exception e){
             System.out.println(e.getMessage());
         }
}

    
    private void jButton1ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ingresarActionPerformed
        String nombreBD = (String) combousuario.getSelectedItem();
        String ContraseñaBD = new String(jpass.getPassword());
        String contraseña="",nombre="";
        
        if(!ContraseñaBD.equals("")){//si la contraseña es vacio 
           try{
          conectando();// conectar a la base de datos 
         s= conexion.createStatement();// crear el canal de comunicacion 
            ResultSet rs= s.executeQuery("select * from usuarios");//consultamos la tabla usuarios
                while(rs.next()){
                      nombre=rs.getString("nombre");
                      contraseña=rs.getString("contraseña");
                       if(nombre.equals(nombreBD)){//comparar si  el nombre es igual a los datos de la tabla usuario
                          if(contraseña.equals(ContraseñaBD)){// si la contraseña es igual a la contraseña de la tabla usuario se hacen visibles las interfaces 
                             
                            //  caj.setVisible(true);//interfaz cajero
                            ta.setVisible(true);//interfaz del administrador
                          }
                    }
                }       
                
            }catch(Exception e){
              System.out.println(e.getMessage());
            //  JOptionPane.showMessageDialog(null, "Error al obtener usuarios ", "Sistema ventas", 0);
            }
        }
        else
                JOptionPane.showMessageDialog(null, "Introduzca la contraseña!");
    }//GEN-LAST:event_jButton1ingresarActionPerformed

    private void jButton3salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3salirActionPerformed
 //confirmar si se desea salir
        JLabel x = new JLabel("Confirma que desea salir" );
            Object[] x1={"",x};
                int si = JOptionPane.showConfirmDialog(null,x1,"Sistema de ventas",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);//preguntamos al usuario si esta confirmando el eliminar
                if(si==JOptionPane.OK_OPTION){
                System.exit(0);
                }
    }//GEN-LAST:event_jButton3salirActionPerformed

    private void jButton2limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2limpiarActionPerformed
 jpass.setText("");
    }//GEN-LAST:event_jButton2limpiarActionPerformed

    private void jpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpassActionPerformed

    private void combousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combousuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combousuarioActionPerformed
 //método para conectar a la base de datos del servidor 
    public void conectando(){
        try{
             //Se registra el driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion= DriverManager.getConnection(url,us,pasword);// hacemos la conexion a la BD
            System.out.println("conexión establecida");
            }catch(Exception e){
            //  System.out.println(e.getMessage());// si surgue un error lo imprimimos 
             System.out.println("error de conexion en la clase de login usuario");
         }  
       }//fin del mètodo conectando
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combousuario;
    private javax.swing.JButton jButton1ingresar;
    private javax.swing.JButton jButton2limpiar;
    private javax.swing.JButton jButton3salir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JLabel lblhora;
    // End of variables declaration//GEN-END:variables

    
}
