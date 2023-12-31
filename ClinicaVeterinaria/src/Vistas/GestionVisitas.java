package Vistas;

import Entidades.Cliente;
import Entidades.Mascota;
import Entidades.Tratamiento;
import Entidades.Visita;
import Ticket.TicketJon;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GestionVisitas extends javax.swing.JInternalFrame {

    private JDesktopPane escritorio;
    private int idVisita = 0;
    private Image backgroundImage = new ImageIcon(getClass().getResource("/IMG/Borde.png")).getImage();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen de fondo
        g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
    }

    public GestionVisitas() {
        initComponents();
        wallpaper();
        fechaHoy();
        cargarComboTratamiento();
        desactivarCampos();

    }

    public GestionVisitas(JDesktopPane escritorio) {
        initComponents();
        wallpaper();
        fechaHoy();
        cargarComboTratamiento();
        desactivarCampos();
        this.escritorio = escritorio;
    }

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbListaMascotas = new javax.swing.JComboBox<>();
        jbListaClientes = new javax.swing.JButton();
        jbNuevoCliente = new javax.swing.JButton();
        jbHistorialDeVisitas = new javax.swing.JButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtDetalles = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtPeso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jcbTratamiento = new javax.swing.JComboBox<>();
        jbNueva = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jbNuevaMascota = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        JFondoVistas = new javax.swing.JLabel();
        jcbPago = new javax.swing.JCheckBox();
        BotonFactura = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Dni Cliente:");

        jtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtDniKeyTyped(evt);
            }
        });

        jLabel3.setText("Mascotas:");

        jbListaClientes.setText("Lista Clientes");
        jbListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListaClientesActionPerformed(evt);
            }
        });

        jbNuevoCliente.setText("+");
        jbNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoClienteActionPerformed(evt);
            }
        });

        jbHistorialDeVisitas.setText("Historial de visitas");
        jbHistorialDeVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHistorialDeVisitasActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha:");

        jLabel6.setText("Detalles:");

        jLabel9.setText("Peso:");

        jtPeso.setToolTipText("Utiliza punto \".\"");
        jtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPesoKeyTyped(evt);
            }
        });

        jLabel7.setText("Tratamiento:");

        jbNueva.setText("Nueva");
        jbNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setText("VISITA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jbNuevaMascota.setText("+");
        jbNuevaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaMascotaActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jcbPago.setText("Pago Saldado");

        BotonFactura.setText("Factura");
        BotonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbListaMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbNuevaMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(jbNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jbHistorialDeVisitas)
                                        .addComponent(jbListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jcbPago)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BotonFactura)
                                .addGap(42, 42, 42))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbLimpiar)
                        .addGap(26, 26, 26)
                        .addComponent(jbNueva, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JFondoVistas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevoCliente)
                    .addComponent(jbListaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcbListaMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbHistorialDeVisitas)
                        .addComponent(jbNuevaMascota)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcbPago))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jcbTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbNueva)
                            .addComponent(jbGuardar)
                            .addComponent(jbEliminar)
                            .addComponent(jbSalir)
                            .addComponent(jbLimpiar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(BotonFactura)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(JFondoVistas, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaMascotaActionPerformed
        GestionMascota gest = new GestionMascota();
        escritorio.repaint();
        gest.setVisible(true);
        gest.isFocusable();
        escritorio.add(gest);
        escritorio.moveToFront(gest);
    }//GEN-LAST:event_jbNuevaMascotaActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        if (idVisita != 0) {
            int response;
            response = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar esta visita?", "Eliminar", JOptionPane.YES_NO_OPTION);

            if (response == JOptionPane.YES_OPTION) {
                Menu.visitaData.eliminarVisita(idVisita);
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se elimino la visita");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No selecciono ninguna visita");

        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbHistorialDeVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHistorialDeVisitasActionPerformed
        listaVisitas();
    }//GEN-LAST:event_jbHistorialDeVisitasActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        if (jdcFecha.toString().isEmpty() || jtDetalles.getText().isEmpty() || jtPeso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llene los campos correctamente");
        } else {
            try {
                LocalDate fechaV = jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                double peso = Double.parseDouble(jtPeso.getText().toString());
                String detalles = jtDetalles.getText().toString();
                String[] comboBoxM = jcbListaMascotas.getSelectedItem().toString().split(",");
                int idMascota = Integer.parseInt(comboBoxM[0].trim());
                Mascota mascota = new Mascota();
                mascota = Menu.mascotaData.buscarMascotaPorId(idMascota);
                String[] comboBoxT = jcbTratamiento.getSelectedItem().toString().split(",");
                int idTratamiento = Integer.parseInt(comboBoxT[0].trim());
                Tratamiento tratamiento = new Tratamiento();
                tratamiento = Menu.tratamientoData.buscarTratamiento(idTratamiento);
                boolean pago;
                if (jcbPago.isSelected()) {
                    pago = true;
                } else {
                    pago = false;
                }
                Visita visita = new Visita(mascota, fechaV, detalles, peso, tratamiento, pago);
                if (idVisita == 0) {
                    Menu.visitaData.guardarVisita(visita);
                    limpiar();
                } else {
                    visita.setIdVisita(idVisita);
                    Menu.visitaData.editarVisita(visita);
                    limpiar();
                }
            } catch (NumberFormatException ex) {
            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoClienteActionPerformed
        GestionCliente gest = new GestionCliente();
        escritorio.repaint();
        gest.setVisible(true);
        gest.isFocusable();
        escritorio.add(gest);
        escritorio.moveToFront(gest);
    }//GEN-LAST:event_jbNuevoClienteActionPerformed

    private void jbNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaActionPerformed
        this.idVisita = 0;
        jtDetalles.setText("");
        jtPeso.setText("");
        fechaHoy();
        jcbTratamiento.setSelectedIndex(0);
        jbEliminar.setEnabled(false);
    }//GEN-LAST:event_jbNuevaActionPerformed

    private void jbListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListaClientesActionPerformed
        listaClientes();
    }//GEN-LAST:event_jbListaClientesActionPerformed

    private void jtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesoKeyTyped
        if ((Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) && (evt.getKeyChar() != '.')) {
            evt.consume();
        }
        String regex = "^([^,]*,){0,1}(\\d{0,3}(\\.\\d{0,3})?){0,1}$"; //CHEQUEA QUE SOLO ESTE UNA COMA Y QUE ESTE LIMITADO EL NUMERO A INGRESAR POR 3numeros COMA Y 3 DECIMALES

        if (!(jtPeso.getText() + evt.getKeyChar()).matches(regex)) {
            evt.consume();

        }
    }//GEN-LAST:event_jtPesoKeyTyped

    private void jtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyTyped
        if (Character.isLetter(evt.getKeyChar()) || evt.getKeyChar() == KeyEvent.VK_SPACE || !Character.isLetterOrDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jtDniKeyTyped

    private void jtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDniKeyPressed
        char c = evt.getKeyChar();
        if (evt.getKeyCode() != KeyEvent.VK_ENTER) {
            if (Character.isDigit(c) || evt.isActionKey()) {
                jtDni.getDocument().addDocumentListener(new DocumentListener() {
                    @Override
                    public void insertUpdate(DocumentEvent e) {
                        buscarDni();
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                        buscarDni();
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) {
                        buscarDni();
                    }
                });
            } else {
                desactivarCampos();
            }
        }
    }//GEN-LAST:event_jtDniKeyPressed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void BotonFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFacturaActionPerformed
        Visita v = Menu.visitaData.buscarVisitaPorId(idVisita);
        TicketJon nueva = new TicketJon(v);
        
        escritorio.repaint();
        nueva.setVisible(true);
        nueva.isFocusable();
        escritorio.add(nueva);
        escritorio.moveToFront(nueva);
    }//GEN-LAST:event_BotonFacturaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFactura;
    private javax.swing.JLabel JFondoVistas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbHistorialDeVisitas;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbListaClientes;
    private javax.swing.JButton jbNueva;
    private javax.swing.JButton jbNuevaMascota;
    private javax.swing.JButton jbNuevoCliente;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbListaMascotas;
    private javax.swing.JCheckBox jcbPago;
    private javax.swing.JComboBox<String> jcbTratamiento;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTextField jtDetalles;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtPeso;
    // End of variables declaration//GEN-END:variables

    private void buscarDni() {
        try {
            if (!jtDni.getText().isEmpty()) {
                jcbListaMascotas.removeAllItems();
                Cliente cliente = new Cliente();
                cliente = Menu.clienteData.buscarClientePorDni(Integer.parseInt(jtDni.getText()));
                if (cliente != null) {
                    activarCampos();
                    for (Mascota mascota : Menu.mascotaData.buscarMascotaPorCliente(cliente.getIdCliente())) {
                        jcbListaMascotas.addItem(mascota.getIdMascota() + ", " + mascota.getAlias());
                    }
                } else {
                    desactivarCampos();
                }
            } else {
                jcbListaMascotas.removeAllItems();
            }
            if (jcbListaMascotas.getItemAt(0) == null) {
                desactivarCampos();
                jbNuevaMascota.setEnabled(true);
            }
        } catch (NumberFormatException e) {
        }
    }

    public void listaClientes() {
        JFrame frame = new JFrame("Lista de Clientes");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        };
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();

        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

        model.addColumn("ID");
        model.addColumn("Apellido");
        model.addColumn("Nombre");
        model.addColumn("DNI");
        model.addColumn("Nombre Alternativo");

        JTable table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        table.getColumnModel().getColumn(0).setPreferredWidth(30);

        for (Cliente cliente : Menu.clienteData.listarClientes()) {
            model.addRow(new Object[]{cliente.getIdCliente(),
                cliente.getApellido(),
                cliente.getNombre(),
                cliente.getDni(),
                cliente.getNombreAlterno()});
        }

        frame.add(new JScrollPane(table));
        table.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = table.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    int idCliente = (int) table.getValueAt(filaSeleccionada, 0);
                    for (Cliente cliente : Menu.clienteData.listarClientes()) {
                        if (cliente.getIdCliente() == idCliente) {
                            jtDni.setText(cliente.getDni() + "");
                            buscarDni();
                            frame.setVisible(false);
                            break;
                        }
                    }
                }
            }
        });
        frame.setVisible(true);
    }

    public void listaVisitas() {
        String[] partesM = jcbListaMascotas.getSelectedItem().toString().split(",");
        int codigoM = Integer.parseInt(partesM[0]);
        JFrame frame = new JFrame("Lista de Visitas");
        frame.setSize(600, 500);

        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int f, int c) {
                return false;
            }
        };

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);

        model.addColumn("ID Visita");
        model.addColumn("ID Mascota");
        model.addColumn("Mascota");
        model.addColumn("Fecha de Visita");
        model.addColumn("Detalle");
        model.addColumn("Peso");
        model.addColumn("Tratamiento");

        JTable table = new JTable(model);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);
        table.getColumnModel().getColumn(0).setPreferredWidth(30);
        table.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        table.getColumnModel().getColumn(1).setPreferredWidth(30);

        for (Visita visita : Menu.visitaData.buscarVisitaPorMascota(codigoM)) {
            model.addRow(new Object[]{visita.getIdVisita(),
                visita.getMascota().getIdMascota(),
                visita.getMascota().getAlias(),
                visita.getFechaVisita(),
                visita.getDetalle(),
                visita.getPeso(),
                visita.getTratamiento().getTipoDeTratamiento()});
        }

        frame.add(new JScrollPane(table));
        table.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                String[] partesM = jcbListaMascotas.getSelectedItem().toString().split(",");
                int codigoM = Integer.parseInt(partesM[0]);
                int filaSeleccionada = table.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    int idvisita = (int) table.getValueAt(filaSeleccionada, 0);

                    for (Visita visita : Menu.visitaData.buscarVisitaPorMascota(codigoM)) {
                        if (visita.getIdVisita() == idvisita) {
                            setIdVisita(idvisita);
                            jdcFecha.setDate(Date.from(visita.getFechaVisita().atStartOfDay(ZoneId.systemDefault()).toInstant()));
                            jtDetalles.setText(visita.getDetalle());
                            jtPeso.setText(visita.getPeso() + "");
                            if (visita.isPago()) {
                                jcbPago.setSelected(true);
                            } else {
                                jcbPago.setSelected(false);
                            }
                            jbEliminar.setEnabled(true);
                            for (int i = 0; i < jcbTratamiento.getItemCount(); i++) {
                                String[] partesT = jcbTratamiento.getItemAt(i).toString().split(",");
                                int codigoT = Integer.parseInt(partesT[0]);
                                if (visita.getTratamiento().getIdTratamiento() == codigoT) {
                                    jcbTratamiento.setSelectedIndex(i);
                                    frame.setVisible(false);
                                    break;
                                }
                            }

                        }
                    }
                }
            }
        }
        );
        frame.setVisible(
                true);
    }

    public void fechaHoy() {
        Calendar calendar = new GregorianCalendar();
        jdcFecha.setDate(calendar.getTime());
    }

    public void cargarComboTratamiento() {
        for (Tratamiento tratamiento : Menu.tratamientoData.listarTratamiento()) {
            jcbTratamiento.addItem(tratamiento.getIdTratamiento() + ", " + tratamiento.getTipoDeTratamiento());
        }
    }

    public void desactivarCampos() {
        jcbListaMascotas.setEnabled(false);
        jbHistorialDeVisitas.setEnabled(false);
        jdcFecha.setEnabled(false);
        jtDetalles.setEnabled(false);
        jtPeso.setEnabled(false);
        jcbTratamiento.setEnabled(false);
        jbNuevaMascota.setEnabled(false);
        jbEliminar.setEnabled(false);
        jcbPago.setEnabled(false);
    }

    public void activarCampos() {
        jcbListaMascotas.setEnabled(true);
        jbHistorialDeVisitas.setEnabled(true);
        jdcFecha.setEnabled(true);
        jdcFecha.getDateEditor().setEnabled(false);
        jtDetalles.setEnabled(true);
        jtPeso.setEnabled(true);
        jcbTratamiento.setEnabled(true);
        jbNuevaMascota.setEnabled(true);
        jcbPago.setEnabled(true);
    }

    public void limpiar() {
        this.idVisita = 0;
        jtDni.setText("");
        jcbListaMascotas.removeAllItems();
        jtDetalles.setText("");
        jtPeso.setText("");
        fechaHoy();
        jcbTratamiento.setSelectedIndex(0);
        jcbPago.setSelected(false);
        desactivarCampos();
    }

    public void wallpaper() {
        ImageIcon wallpaper = new ImageIcon("src/IMG/G.png");
        Icon i = new ImageIcon(wallpaper.getImage().getScaledInstance(
                this.getWidth(),
                this.getHeight(),
                Image.SCALE_DEFAULT));
        JFondoVistas.setIcon(i);
        JFondoVistas.setVerticalAlignment(JLabel.CENTER);
        JFondoVistas.setHorizontalAlignment(JLabel.CENTER);
        JFondoVistas.setVerticalTextPosition(JLabel.CENTER);
        JFondoVistas.setHorizontalTextPosition(JLabel.CENTER);
    }
}
