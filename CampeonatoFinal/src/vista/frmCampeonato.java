package vista;

import controlador.Controlador;
import modelo.Campeonato;
import modelo.Equipo;
import modelo.Partido;

public class frmCampeonato extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(frmCampeonato.class.getName());

    Campeonato camp;
    Controlador controlador = new Controlador();
    javax.swing.table.DefaultTableModel modeloPosiciones;
    javax.swing.table.DefaultTableModel modeloGoles;
    String path = "tabla.txt";

    public frmCampeonato() {
        initComponents();

        // Fondo general
        getContentPane().setBackground(new java.awt.Color(15, 45, 15));

        // Header azul marino
        pnlHeader.setBackground(new java.awt.Color(0, 40, 80));

        // Icono header
        java.net.URL imgURL = getClass().getResource("/vista/imagenes/futbol.png");
        if (imgURL != null) {
            java.awt.Image img = new javax.swing.ImageIcon(imgURL)
                    .getImage().getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
            jLabel1.setIcon(new javax.swing.ImageIcon(img));
            jLabel1.setIconTextGap(12);
        }

        // Estilo tabla posiciones
        tblPosiciones.setRowHeight(28);
        tblPosiciones.setFont(new java.awt.Font("Segoe UI", 0, 12));
        tblPosiciones.getTableHeader().setBackground(new java.awt.Color(0, 30, 60));
        tblPosiciones.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 12));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(34, 85, 34));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1),
                "TABLA DE POSICIONES", 0, 0,
                new java.awt.Font("Segoe UI", 1, 11), new java.awt.Color(255, 255, 255)));

        // Estilo tabla goles
        jTable2.setRowHeight(26);
        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 12));
        jTable2.getTableHeader().setBackground(new java.awt.Color(0, 30, 60));
        jTable2.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 12));
        jScrollPane2.getViewport().setBackground(new java.awt.Color(34, 85, 34));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(
                javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 1),
                "TABLA DE GOLES", 0, 0,
                new java.awt.Font("Segoe UI", 1, 11), new java.awt.Color(255, 255, 255)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPosiciones = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Campeonato de Fútbol");

        pnlHeader.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CAMPEONATO DE FÚTBOL");
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("SISTEMA DE GESTION DE RESULTADOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 10, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 23, Short.MAX_VALUE));

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
                pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHeaderLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(pnlHeaderLayout.createSequentialGroup().addGap(6).addComponent(jLabel2)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
                pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlHeaderLayout.createSequentialGroup()
                                .addGap(15)
                                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addContainerGap(37, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABLA DE POSICIONES",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 2, 12), new java.awt.Color(0, 0, 255)));
        tblPosiciones.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{},
                new String[]{"POS", "EQUIPO", "MP", "G", "E", "P", "F:A", "GD", "PTS"}));
        jScrollPane1.setViewportView(tblPosiciones);

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABLA DE GOLES",
                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                new java.awt.Font("Segoe UI", 2, 12), new java.awt.Color(0, 0, 204)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{}));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setBackground(new java.awt.Color(0, 70, 160));
        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 12));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CARGAR EQUIPOS");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setBackground(new java.awt.Color(0, 70, 160));
        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 12));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REGISTRAR RESULTADO");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setBackground(new java.awt.Color(0, 70, 160));
        jButton3.setFont(new java.awt.Font("Segoe UI", 2, 12));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("AGREGAR EQUIPO");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setBackground(new java.awt.Color(0, 70, 160));
        jButton4.setFont(new java.awt.Font("Segoe UI", 2, 12));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("ELIMINAR EQUIPO");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jScrollPane2))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(100)
                                .addComponent(jButton1)
                                .addGap(50)
                                .addComponent(jButton2)
                                .addGap(50)
                                .addComponent(jButton3)
                                .addGap(50)
                                .addComponent(jButton4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4))
                                .addGap(10))
        );

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        cargarCampeonato();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        registrarResultado();
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        agregarEquipo();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        eliminarEquipo();
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new frmCampeonato().setVisible(true));
    }

    void cargarCampeonato() {
        String nom = javax.swing.JOptionPane.showInputDialog("Nombre del Campeonato:");
        if (nom == null || nom.trim().isEmpty()) {
            return;
        }
        camp = controlador.leer(nom, path);
        configurarTablas();
        actualizarTablaPosiciones();
        actualizarTablaGoles();
        javax.swing.JOptionPane.showMessageDialog(null, "Campeonato cargado: " + camp.getNombre());
    }

    void agregarEquipo() {
        if (camp == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Primero cargue el campeonato");
            return;
        }
        String nom = javax.swing.JOptionPane.showInputDialog("Nombre del equipo:");
        if (nom == null || nom.trim().isEmpty()) {
            return;
        }
        if (camp.buscarEquipo(nom) != null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Equipo ya existe");
            return;
        }
        camp.agregarEquipo(nom);
        controlador.guardar(camp, path);
        actualizarTablaPosiciones();
        actualizarTablaGoles();
    }

    void eliminarEquipo() {
        if (camp == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Primero cargue el campeonato");
            return;
        }
        String nom = javax.swing.JOptionPane.showInputDialog("Nombre del equipo a eliminar:");
        if (nom == null) {
            return;
        }
        if (camp.eliminarEquipo(nom)) {
            controlador.guardar(camp, path);
            actualizarTablaPosiciones();
            actualizarTablaGoles();
            javax.swing.JOptionPane.showMessageDialog(null, "Equipo eliminado");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Equipo no encontrado");
        }
    }

    void registrarResultado() {
        if (camp == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Primero cargue el campeonato");
            return;
        }
        if (camp.getListaEquipos().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "No hay equipos");
            return;
        }
        StringBuilder sb = new StringBuilder("Equipos:\n");
        for (Equipo e : camp.getListaEquipos()) {
            sb.append("- ").append(e.getNombre()).append("\n");
        }
        javax.swing.JOptionPane.showMessageDialog(null, sb.toString());
        String nomL = javax.swing.JOptionPane.showInputDialog("Equipo LOCAL:");
        if (nomL == null) {
            return;
        }
        String nomV = javax.swing.JOptionPane.showInputDialog("Equipo VISITANTE:");
        if (nomV == null) {
            return;
        }
        Equipo local = camp.buscarEquipo(nomL);
        Equipo visitante = camp.buscarEquipo(nomV);
        if (local == null || visitante == null || local.equals(visitante)) {
            javax.swing.JOptionPane.showMessageDialog(null, "Equipos no válidos");
            return;
        }
        try {
            int gL = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Goles LOCAL:"));
            int gV = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Goles VISITANTE:"));
            camp.agregarPartido(local, visitante, gL, gV);
            controlador.guardar(camp, path);
            actualizarTablaPosiciones();
            actualizarTablaGoles();
            javax.swing.JOptionPane.showMessageDialog(null, local.getNombre() + " " + gL + " - " + gV + " " + visitante.getNombre());
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Ingrese números válidos");
        }
    }

    void configurarTablas() {
    modeloPosiciones = new javax.swing.table.DefaultTableModel() {
        @Override public boolean isCellEditable(int r, int c) { return false; }
    };
    for (String col : new String[]{"","POS","EQUIPO","MP","G","E","P","F:A","GD","PTS"})
        modeloPosiciones.addColumn(col);
    tblPosiciones.setModel(modeloPosiciones);
    int[] anchos = {30,40,150,40,40,40,40,55,45,45};
    for (int i = 0; i < anchos.length; i++)
        tblPosiciones.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);

    tblPosiciones.setRowHeight(28);
    tblPosiciones.getTableHeader().setBackground(new java.awt.Color(20,50,20));
    tblPosiciones.getTableHeader().setForeground(new java.awt.Color(10,30,10));
    tblPosiciones.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 12));
    jScrollPane1.getViewport().setBackground(new java.awt.Color(34,85,34));

    // Renderer columna icono
    tblPosiciones.getColumnModel().getColumn(0).setCellRenderer(
        new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(
                    javax.swing.JTable t, Object v, boolean sel, boolean foc, int row, int col) {
                super.getTableCellRendererComponent(t,v,sel,foc,row,col);
                setIcon(v instanceof javax.swing.ImageIcon ? (javax.swing.ImageIcon)v : null);
                setText("");
                setHorizontalAlignment(CENTER);
                if (!sel) {
                    setBackground(row%2==0 ? new java.awt.Color(34,85,34) : new java.awt.Color(45,110,45));
                } else {
                    setBackground(new java.awt.Color(255,220,50));
                }
                return this;
            }
        });

    // Renderer resto columnas
    tblPosiciones.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(
                javax.swing.JTable t, Object v, boolean sel, boolean foc, int row, int col) {
            super.getTableCellRendererComponent(t,v,sel,foc,row,col);
            if (!sel) {
                setBackground(row%2==0 ? new java.awt.Color(34,85,34) : new java.awt.Color(45,110,45));
                setForeground(java.awt.Color.WHITE);
            } else {
                setBackground(new java.awt.Color(255,220,50));
                setForeground(new java.awt.Color(20,50,20));
            }
            setHorizontalAlignment(col==2 ? LEFT : CENTER);
            setBorder(javax.swing.BorderFactory.createEmptyBorder(0,6,0,6));
            return this;
        }
    });

    // Tabla goles
    modeloGoles = new javax.swing.table.DefaultTableModel() {
        @Override public boolean isCellEditable(int r, int c) { return false; }
    };
    jTable2.setModel(modeloGoles);
    jTable2.setRowHeight(26);
    jTable2.getTableHeader().setBackground(new java.awt.Color(20,50,20));
    jTable2.getTableHeader().setForeground(new java.awt.Color(10,30,10));
    jTable2.getTableHeader().setFont(new java.awt.Font("Segoe UI", 1, 12));
    jScrollPane2.getViewport().setBackground(new java.awt.Color(34,85,34));
    jTable2.setDefaultRenderer(Object.class, new javax.swing.table.DefaultTableCellRenderer() {
        @Override
        public java.awt.Component getTableCellRendererComponent(
                javax.swing.JTable t, Object v, boolean sel, boolean foc, int row, int col) {
            super.getTableCellRendererComponent(t,v,sel,foc,row,col);
            if (!sel) {
                setBackground(row%2==0 ? new java.awt.Color(34,85,34) : new java.awt.Color(45,110,45));
                setForeground(java.awt.Color.WHITE);
            } else {
                setBackground(new java.awt.Color(255,220,50));
                setForeground(new java.awt.Color(20,50,20));
            }
            setHorizontalAlignment(col==0 ? LEFT : CENTER);
            setBorder(javax.swing.BorderFactory.createEmptyBorder(0,6,0,6));
            return this;
        }
    });
}

    void actualizarTablaPosiciones() {
        modeloPosiciones.setRowCount(0);
        java.util.ArrayList<Equipo> lista = new java.util.ArrayList<>(camp.getListaEquipos());
        lista.sort((a, b) -> {
            int dp = b.getPuntos() - a.getPuntos();
            if (dp != 0) {
                return dp;
            }
            int dg = (b.getGolesFavor() - b.getGolesContra()) - (a.getGolesFavor() - a.getGolesContra());
            if (dg != 0) {
                return dg;
            }
            return b.getGolesFavor() - a.getGolesFavor();
        });
        int pos = 1;
        for (Equipo e : lista) {
            int gd = e.getGolesFavor() - e.getGolesContra();
            modeloPosiciones.addRow(new Object[]{
                obtenerIcono(e.getNombre()),
                pos++, e.getNombre(), e.getJugados(), e.getGanados(),
                e.getEmpatados(), e.getPerdidos(),
                e.getGolesFavor() + ":" + e.getGolesContra(),
                (gd > 0 ? "+" : "") + gd, e.getPuntos()
            });
        }
    }

    javax.swing.ImageIcon obtenerIcono(String nombre) {
        java.util.Map<String, String> m = new java.util.HashMap<>();
        m.put("Bayern", "Bayern_Munchen_icon-icons.com_75868.png");
        m.put("Paris", "Paris-Saint-Germain-icon-256_37658.png");
        m.put("Arsenal", "arsenal_17995.png");
        m.put("Athletic", "athletic_bilbao_footballteam_18021.png");
        m.put("Atletico", "atletico_madrid_footballteam_18020.png");
        m.put("Barcelona", "fc_barcelona_footballteam_18015.png");
        m.put("Liverpool", "liverpool_fc_17975.png");
        m.put("United", "manchester_united_17973.png");
        m.put("RealMadrid", "real_madrid_footballteam_18009.png");
        m.put("Sevilla", "sevilla_footballteam_18003.png");
        String archivo = m.get(nombre);
        if (archivo == null) {
            return null;
        }
        java.net.URL url = getClass().getResource("/vista/imagenes/" + archivo);
        if (url == null) {
            return null;
        }
        java.awt.Image img = new javax.swing.ImageIcon(url)
                .getImage().getScaledInstance(25, 25, java.awt.Image.SCALE_SMOOTH);
        return new javax.swing.ImageIcon(img);
    }

    void actualizarTablaGoles() {
        modeloGoles = new javax.swing.table.DefaultTableModel() {
            @Override
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };
        if (camp.getListaEquipos().isEmpty()) {
            jTable2.setModel(modeloGoles);
            return;
        }
        modeloGoles.addColumn("EQUIPO \\ RIVAL");
        for (Equipo e : camp.getListaEquipos()) modeloGoles.addColumn(e.getNombre());
        for (Equipo fila : camp.getListaEquipos()) {
            Object[] row = new Object[camp.getListaEquipos().size()+1];
            row[0] = fila.getNombre();
            int col=1;
            for (Equipo columna : camp.getListaEquipos()) {
                if (fila.equals(columna)) { row[col]="X"; }
                else {
                    int g=-1;
                    for (Partido p : camp.getListaPartidos()) {
                       if (p.getEquipoLocal().equals(fila) && p.getEquipoVisitante().equals(columna)) { g=p.getGolesLocal(); break; }
else if (p.getEquipoVisitante().equals(fila) && p.getEquipoLocal().equals(columna)) { g=p.getGolesVisitante(); break; }
                    }
                    row[col] = g==-1 ? "-" : g;
                }
                col++;
            }
            modeloGoles.addRow(row);
        }
        jTable2.setModel(modeloGoles);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JTable tblPosiciones;
    // End of variables declaration
}