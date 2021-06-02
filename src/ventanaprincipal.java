
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ventanaprincipal extends javax.swing.JFrame implements Runnable  {
   int hora;
    int minutos;
    int segundos;
    Calendar calendario;
    Thread hilo;
    loginus  log = new loginus();// hacer la instancia a la clase login del usuario
    public ventanaprincipal() {
        initComponents();
        setLocationRelativeTo(null);
       hilo=new Thread(this);
       hilo.start();

    }
   
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        iniciarsecion = new javax.swing.JButton();
        ayuda = new javax.swing.JButton();
        salir1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inicialogin = new javax.swing.JPanel();
        iniciaprin = new javax.swing.JPanel();
        jButton1ayuda = new javax.swing.JButton();
        jButton2ingresar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        iniciarsecion.setText("Iniciar secion");
        iniciarsecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarsecionActionPerformed(evt);
            }
        });

        ayuda.setText("Ayuda");
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });

        salir1.setText("salir");
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Sistema de ventas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(iniciarsecion)
                .addGap(40, 40, 40)
                .addComponent(ayuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(salir1)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciarsecion)
                    .addComponent(ayuda)
                    .addComponent(salir1))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 121, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iniciaprin.setBackground(new java.awt.Color(0, 102, 255));
        iniciaprin.setBorder(javax.swing.BorderFactory.createTitledBorder("Sistema de ventas "));

        jButton1ayuda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.jpg"))); // NOI18N
        jButton1ayuda.setText("Ayuda");
        jButton1ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ayudaActionPerformed(evt);
            }
        });

        jButton2ingresar.setBackground(new java.awt.Color(204, 204, 204));
        jButton2ingresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        jButton2ingresar.setText("Ingresar");
        jButton2ingresar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ingresarActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.jpg"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venta.jpg"))); // NOI18N

        lblhora.setBackground(new java.awt.Color(153, 255, 204));
        lblhora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setText("San Mateo Mixtepec");

        javax.swing.GroupLayout iniciaprinLayout = new javax.swing.GroupLayout(iniciaprin);
        iniciaprin.setLayout(iniciaprinLayout);
        iniciaprinLayout.setHorizontalGroup(
            iniciaprinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, iniciaprinLayout.createSequentialGroup()
                .addGroup(iniciaprinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(iniciaprinLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton2ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(jButton1ayuda)
                        .addGap(98, 98, 98)
                        .addComponent(salir))
                    .addGroup(iniciaprinLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(iniciaprinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(iniciaprinLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(iniciaprinLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(57, 57, 57))
        );
        iniciaprinLayout.setVerticalGroup(
            iniciaprinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iniciaprinLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(iniciaprinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1ayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton2ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout inicialoginLayout = new javax.swing.GroupLayout(inicialogin);
        inicialogin.setLayout(inicialoginLayout);
        inicialoginLayout.setHorizontalGroup(
            inicialoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iniciaprin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inicialoginLayout.setVerticalGroup(
            inicialoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iniciaprin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        iniciaprin.getAccessibleContext().setAccessibleDescription("Principal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inicialogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inicialogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_salir1ActionPerformed
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
    private void iniciarsecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarsecionActionPerformed
    }//GEN-LAST:event_iniciarsecionActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
        System.out.println("consulte el manual de usuario");
    }//GEN-LAST:event_ayudaActionPerformed
    private void jButton2ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ingresarActionPerformed
    //System.out.println(" estas iniciando secion");
    log.setVisible(true);// hacer visible la interfaz de usuario
    log.llenacombo();//llama el metodo llenar combo para obtener los datos de la tabla usarios
    this.setVisible(false);//hacer invisible esta interfaz
    }//GEN-LAST:event_jButton2ingresarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
//confirmar si el suario desea salir del sitema...si elige si   se cierra la app
        JLabel x = new JLabel("Confirma que desea salir" );
            Object[] x1={"",x};
                int si = JOptionPane.showConfirmDialog(null,x1,"Sistema de ventas",JOptionPane.OK_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);//preguntamos al usuario si esta confirmando el eliminar
                if(si==JOptionPane.OK_OPTION){
                System.exit(0);
                }
    }//GEN-LAST:event_salirActionPerformed

    private void jButton1ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ayudaActionPerformed
         JOptionPane.showMessageDialog(null, "Consulte el manual de Usuario");       
    }//GEN-LAST:event_jButton1ayudaActionPerformed

    /**
     * @param args the command line arguments
     * @throws javax.swing.UnsupportedLookAndFeelException
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException {
            try{
               UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel" );// agregar el jtatoo
            }catch(Exception e){
             System.out.println(e.getMessage());//impprimir de donde sale el error 
            }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ventanaprincipal().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayuda;
    public static javax.swing.JPanel inicialogin;
    public static javax.swing.JPanel iniciaprin;
    private javax.swing.JButton iniciarsecion;
    private javax.swing.JButton jButton1ayuda;
    private javax.swing.JButton jButton2ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblhora;
    private javax.swing.JButton salir;
    private javax.swing.JButton salir1;
    // End of variables declaration//GEN-END:variables

   
}
