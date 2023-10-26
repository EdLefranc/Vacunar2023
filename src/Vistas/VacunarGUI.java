package Vistas;

import AccesoADatos.CitaVacunacionData;
import AccesoADatos.CiudadanoData;
import AccesoADatos.LaboratorioData;
import AccesoADatos.VacunaData;
import Entidades.CitaVacunacion;
import Entidades.Ciudadano;
import Entidades.Laboratorio;
import Entidades.Vacuna;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;

import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;

import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

import javax.swing.JTable;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class VacunarGUI extends javax.swing.JFrame {
            
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public VacunarGUI() {
        initComponents();
        setLocationRelativeTo(null);
        ocultarIFrames();
    }

    public void ocultarIFrames() {
        IF_Paciente.setVisible(false);
        IF_Laboratorio.setVisible(false);
        IF_Vacuna.setVisible(false);
        IF_Admin.setVisible(false);
        IF_Consultas.setVisible(false);
        IF_Ayuda.setVisible(false);
        JDC_FechaHoraColoc.setMinSelectableDate(new Date());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        IF_Paciente = new javax.swing.JInternalFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JT_Ocupacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JT_DNI = new javax.swing.JTextField();
        JT_Nombre = new javax.swing.JTextField();
        JT_Email = new javax.swing.JTextField();
        JT_Patologia = new javax.swing.JTextField();
        JT_Apellido = new javax.swing.JTextField();
        JT_Edad = new javax.swing.JTextField();
        JT_Celular = new javax.swing.JTextField();
        JT_ResponsableLegal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BTN_BuscarPaciente = new javax.swing.JButton();
        BTN_GuardarActualizarPaciente = new javax.swing.JButton();
        BTN_NuevoPaciente = new javax.swing.JButton();
        RB_EstadoPaciente = new javax.swing.JRadioButton();
        LB_EstadoPaciente = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        IF_Laboratorio = new javax.swing.JInternalFrame();
        jLabel15 = new javax.swing.JLabel();
        BTN_GuardarActualizarLab = new javax.swing.JButton();
        BTN_NuevoLab = new javax.swing.JButton();
        BTN_BuscarLab = new javax.swing.JButton();
        JT_CuitLab = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        JT_NombreLab = new javax.swing.JTextField();
        JT_PaisLab = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        JT_DomComLab = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        JT_EmailLab = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        JT_TelefonoLab = new javax.swing.JTextField();
        JL_Lab = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        IF_Vacuna = new javax.swing.JInternalFrame();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        JT_SerieDosis = new javax.swing.JTextField();
        JT_CuitLabVacuna = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        JT_NomVacuna = new javax.swing.JTextField();
        JT_MarcaVacuna = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        BTN_NuevaVacuna = new javax.swing.JButton();
        BTN_GuardarActualizarVacuna = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        JT_Medida = new javax.swing.JTextField();
        BTN_BuscarVacuna = new javax.swing.JButton();
        RB_EstadoVacuna = new javax.swing.JRadioButton();
        LB_EstadoVacuna = new javax.swing.JLabel();
        JDC_VencimientoVacuna = new com.toedter.calendar.JDateChooser();
        JCB_CuitsLabs = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        IF_Admin = new javax.swing.JInternalFrame();
        jLabel31 = new javax.swing.JLabel();
        LB_NumTurno = new javax.swing.JLabel();
        JT_Turno = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        JT_DniPacienteAdmin = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        BTN_BuscarTurno = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        BTN_NuevoTurno = new javax.swing.JButton();
        BTN_ActualizarTurno = new javax.swing.JButton();
        LB_Admin = new javax.swing.JLabel();
        JDC_FechaHoraColoc = new com.toedter.calendar.JDateChooser();
        JC_NroSerieDosisAdmin = new javax.swing.JComboBox<>();
        JT_NroSerieVacunas = new javax.swing.JTextField();
        BTN_BajaAltaTurno = new javax.swing.JButton();
        JCB_CentrosVacu = new javax.swing.JComboBox<>();
        JCB_DosisAdmin = new javax.swing.JComboBox<>();
        BTN_GuardarTurnoNuevo = new javax.swing.JButton();
        JCB_Horarios = new javax.swing.JComboBox<>();
        LB_turno = new javax.swing.JLabel();
        JCB_NumTurno = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        IF_Consultas = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT_Consultas = new javax.swing.JTable();
        JC_Consultas = new javax.swing.JComboBox<>();
        IF_Ayuda = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        MenuFlotante = new javax.swing.JMenuBar();
        JM_Paciente = new javax.swing.JMenu();
        MI_Paciente = new javax.swing.JMenuItem();
        JM_Laboratorio = new javax.swing.JMenu();
        MI_lab = new javax.swing.JMenuItem();
        JM_Vacuna = new javax.swing.JMenu();
        MI_Vac = new javax.swing.JMenuItem();
        JM_Admin = new javax.swing.JMenu();
        MI_Turno = new javax.swing.JMenuItem();
        JM_Consultas = new javax.swing.JMenu();
        MI_Turnos = new javax.swing.JMenuItem();
        JM_Temas = new javax.swing.JMenu();
        MI_Noche = new javax.swing.JMenuItem();
        MI_Dia = new javax.swing.JMenuItem();
        JM_Ayuda = new javax.swing.JMenu();
        MI_Ayuda = new javax.swing.JMenuItem();
        JM_Salir = new javax.swing.JMenu();
        MI_Salir = new javax.swing.JMenuItem();

        jLabel14.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("PACIENTE");

        jLabel40.setText("FECHA HORARIO COLOCACIÓN");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 700));
        setPreferredSize(new java.awt.Dimension(1000, 690));
        getContentPane().setLayout(new java.awt.FlowLayout());

        IF_Paciente.setClosable(true);
        IF_Paciente.setTitle("Paciente");
        IF_Paciente.setFrameIcon(null);
        IF_Paciente.setMinimumSize(new java.awt.Dimension(870, 690));
        IF_Paciente.setName(""); // NOI18N
        IF_Paciente.setPreferredSize(new java.awt.Dimension(870, 690));
        IF_Paciente.setVisible(true);
        IF_Paciente.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PACIENTE");
        IF_Paciente.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 868, 60));

        jLabel4.setText("DNI *");
        IF_Paciente.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 30, 40));

        JT_Ocupacion.setColumns(1);
        JT_Ocupacion.setName("Ocupación"); // NOI18N
        IF_Paciente.getContentPane().add(JT_Ocupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 180, 30));

        jLabel5.setText("NOMBRE *");
        IF_Paciente.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 60, 40));

        jLabel6.setText("EMAIL");
        IF_Paciente.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 40, 40));

        jLabel7.setText("PATOLOGÍA");
        IF_Paciente.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 70, 40));

        jLabel8.setText("OCUPACIÓN");
        IF_Paciente.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 70, 40));

        JT_DNI.setColumns(1);
        JT_DNI.setName("DNI"); // NOI18N
        IF_Paciente.getContentPane().add(JT_DNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 180, 30));

        JT_Nombre.setColumns(1);
        JT_Nombre.setName("Nombre"); // NOI18N
        IF_Paciente.getContentPane().add(JT_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 180, 30));

        JT_Email.setColumns(1);
        IF_Paciente.getContentPane().add(JT_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 180, 30));

        JT_Patologia.setColumns(1);
        JT_Patologia.setName("Patología"); // NOI18N
        IF_Paciente.getContentPane().add(JT_Patologia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 180, 30));

        JT_Apellido.setColumns(1);
        JT_Apellido.setName("Apellido"); // NOI18N
        IF_Paciente.getContentPane().add(JT_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 180, 30));

        JT_Edad.setColumns(1);
        JT_Edad.setName("Edad"); // NOI18N
        IF_Paciente.getContentPane().add(JT_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 180, 30));

        JT_Celular.setColumns(1);
        JT_Celular.setName("Celular"); // NOI18N
        IF_Paciente.getContentPane().add(JT_Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 180, 30));

        JT_ResponsableLegal.setColumns(1);
        JT_ResponsableLegal.setName("Responsable Legal"); // NOI18N
        IF_Paciente.getContentPane().add(JT_ResponsableLegal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 180, 30));

        jLabel10.setText("APELLIDO *");
        IF_Paciente.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 70, 40));

        jLabel11.setText("EDAD *");
        IF_Paciente.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 40, 40));

        jLabel12.setText("CELULAR *");
        IF_Paciente.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 70, 40));

        jLabel13.setText("RESPONSABLE LEGAL");
        IF_Paciente.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 130, 40));

        BTN_BuscarPaciente.setText("BUSCAR PACIENTE");
        BTN_BuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarPacienteActionPerformed(evt);
            }
        });
        IF_Paciente.getContentPane().add(BTN_BuscarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 280, 50));

        BTN_GuardarActualizarPaciente.setText("GUARDAR | ACTUALIZAR");
        BTN_GuardarActualizarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActualizarPacienteActionPerformed(evt);
            }
        });
        IF_Paciente.getContentPane().add(BTN_GuardarActualizarPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 280, 60));

        BTN_NuevoPaciente.setText("NUEVO PACIENTE | BÚSQUEDA");
        BTN_NuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NuevoPacienteActionPerformed(evt);
            }
        });
        IF_Paciente.getContentPane().add(BTN_NuevoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 280, 60));

        RB_EstadoPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RB_EstadoPaciente.setText("Activo");
        IF_Paciente.getContentPane().add(RB_EstadoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 80, -1));

        LB_EstadoPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LB_EstadoPaciente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IF_Paciente.getContentPane().add(LB_EstadoPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 280, 40));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        IF_Paciente.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 820, 420));

        getContentPane().add(IF_Paciente);

        IF_Laboratorio.setClosable(true);
        IF_Laboratorio.setTitle("Laboratorio");
        IF_Laboratorio.setMinimumSize(new java.awt.Dimension(870, 680));
        IF_Laboratorio.setName(""); // NOI18N
        IF_Laboratorio.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Laboratorio.setVisible(true);
        IF_Laboratorio.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("LABORATORIO");
        IF_Laboratorio.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 868, 60));

        BTN_GuardarActualizarLab.setText("GUARDAR | ACTUALIZAR");
        BTN_GuardarActualizarLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActualizarLabActionPerformed(evt);
            }
        });
        IF_Laboratorio.getContentPane().add(BTN_GuardarActualizarLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 280, 60));

        BTN_NuevoLab.setText("NUEVO LABORATORIO");
        BTN_NuevoLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NuevoLabActionPerformed(evt);
            }
        });
        IF_Laboratorio.getContentPane().add(BTN_NuevoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 280, 60));

        BTN_BuscarLab.setText("BUSCAR LABORATORIO");
        BTN_BuscarLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarLabActionPerformed(evt);
            }
        });
        IF_Laboratorio.getContentPane().add(BTN_BuscarLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 340, 110));

        JT_CuitLab.setColumns(1);
        JT_CuitLab.setName("CUIT"); // NOI18N
        IF_Laboratorio.getContentPane().add(JT_CuitLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 180, 30));

        jLabel16.setText("CUIT LABORATORIO");
        IF_Laboratorio.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, 40));

        jLabel17.setText("NOMBRE LABORATORIO");
        IF_Laboratorio.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 40));

        JT_NombreLab.setColumns(1);
        JT_NombreLab.setName("Nombre"); // NOI18N
        IF_Laboratorio.getContentPane().add(JT_NombreLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 180, 30));

        JT_PaisLab.setColumns(1);
        JT_PaisLab.setName("País"); // NOI18N
        IF_Laboratorio.getContentPane().add(JT_PaisLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 180, 30));

        jLabel18.setText("PAIS");
        IF_Laboratorio.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, 40));

        jLabel19.setText("DOMICILIO COMERCIAL");
        IF_Laboratorio.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, 40));

        JT_DomComLab.setColumns(1);
        JT_DomComLab.setName("Domicilio Comercial"); // NOI18N
        IF_Laboratorio.getContentPane().add(JT_DomComLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 180, 30));

        jLabel20.setText("EMAIL");
        IF_Laboratorio.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, 40));

        JT_EmailLab.setColumns(1);
        JT_EmailLab.setName("Email"); // NOI18N
        IF_Laboratorio.getContentPane().add(JT_EmailLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 180, 30));

        jLabel21.setText("TELEFONO");
        IF_Laboratorio.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, 40));

        JT_TelefonoLab.setColumns(1);
        JT_TelefonoLab.setName("Teléfono"); // NOI18N
        IF_Laboratorio.getContentPane().add(JT_TelefonoLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 180, 30));

        JL_Lab.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JL_Lab.setForeground(new java.awt.Color(0, 204, 0));
        JL_Lab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IF_Laboratorio.getContentPane().add(JL_Lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 546, 250, 30));

        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        IF_Laboratorio.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 810, 360));

        getContentPane().add(IF_Laboratorio);

        IF_Vacuna.setClosable(true);
        IF_Vacuna.setTitle("Vacuna");
        IF_Vacuna.setMinimumSize(new java.awt.Dimension(870, 680));
        IF_Vacuna.setName(""); // NOI18N
        IF_Vacuna.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Vacuna.setVisible(true);
        IF_Vacuna.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("VACUNA");
        IF_Vacuna.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 868, 60));

        jLabel24.setText("N° SERIE DOSIS");
        IF_Vacuna.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, 40));

        JT_SerieDosis.setColumns(1);
        JT_SerieDosis.setName("Serie Dosis"); // NOI18N
        IF_Vacuna.getContentPane().add(JT_SerieDosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 180, 30));

        JT_CuitLabVacuna.setColumns(1);
        JT_CuitLabVacuna.setName("Cuit Laboratorio"); // NOI18N
        IF_Vacuna.getContentPane().add(JT_CuitLabVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 180, 30));

        jLabel26.setText("CUIT LABORATORIO");
        IF_Vacuna.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, 40));

        jLabel27.setText("NOMBRE VACUNA");
        IF_Vacuna.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, 40));

        JT_NomVacuna.setColumns(1);
        JT_NomVacuna.setName("Nombre Vacuna"); // NOI18N
        IF_Vacuna.getContentPane().add(JT_NomVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 180, 30));

        JT_MarcaVacuna.setColumns(1);
        JT_MarcaVacuna.setName("Marca"); // NOI18N
        IF_Vacuna.getContentPane().add(JT_MarcaVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 180, 30));

        jLabel28.setText("MARCA");
        IF_Vacuna.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, 40));

        BTN_NuevaVacuna.setText("NUEVA VACUNA | BUSCAR VACUNA");
        BTN_NuevaVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NuevaVacunaActionPerformed(evt);
            }
        });
        IF_Vacuna.getContentPane().add(BTN_NuevaVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 280, 60));

        BTN_GuardarActualizarVacuna.setText("GUARDAR | ACTUALIZAR");
        BTN_GuardarActualizarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarActualizarVacunaActionPerformed(evt);
            }
        });
        IF_Vacuna.getContentPane().add(BTN_GuardarActualizarVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 280, 60));

        jLabel29.setText("LABORATORIOS");
        IF_Vacuna.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 100, 40));

        jLabel30.setText("MEDIDA");
        IF_Vacuna.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, 40));

        JT_Medida.setColumns(1);
        JT_Medida.setName("Medida"); // NOI18N
        IF_Vacuna.getContentPane().add(JT_Medida, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 180, 30));

        BTN_BuscarVacuna.setText("BUSCAR VACUNA");
        BTN_BuscarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarVacunaActionPerformed(evt);
            }
        });
        IF_Vacuna.getContentPane().add(BTN_BuscarVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 350, 50));

        RB_EstadoVacuna.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RB_EstadoVacuna.setText("APLICACIÓN");
        IF_Vacuna.getContentPane().add(RB_EstadoVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 120, -1));

        LB_EstadoVacuna.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LB_EstadoVacuna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IF_Vacuna.getContentPane().add(LB_EstadoVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 290, 40));

        JDC_VencimientoVacuna.setBackground(new java.awt.Color(0, 0, 0));
        JDC_VencimientoVacuna.setDateFormatString("yyyy-MM-dd");
        JDC_VencimientoVacuna.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        IF_Vacuna.getContentPane().add(JDC_VencimientoVacuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 180, 40));

        JCB_CuitsLabs.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JCB_CuitsLabsItemStateChanged(evt);
            }
        });
        IF_Vacuna.getContentPane().add(JCB_CuitsLabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, 180, 40));

        jLabel39.setText("VENCIMIENTO");
        IF_Vacuna.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, 40));

        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        IF_Vacuna.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 810, 370));

        getContentPane().add(IF_Vacuna);

        IF_Admin.setClosable(true);
        IF_Admin.setTitle("Administración");
        IF_Admin.setMinimumSize(new java.awt.Dimension(870, 680));
        IF_Admin.setName(""); // NOI18N
        IF_Admin.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Admin.setVisible(true);
        IF_Admin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("ADMINISTRACIÓN");
        IF_Admin.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 868, 60));

        LB_NumTurno.setText("N° TURNO");
        IF_Admin.getContentPane().add(LB_NumTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, 40));

        JT_Turno.setColumns(1);
        JT_Turno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JT_Turno.setName("N° Turno"); // NOI18N
        IF_Admin.getContentPane().add(JT_Turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 190, 40));

        jLabel33.setText("DNI PACIENTE");
        IF_Admin.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 40));

        JT_DniPacienteAdmin.setColumns(1);
        JT_DniPacienteAdmin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JT_DniPacienteAdmin.setName("Dni Paciente"); // NOI18N
        IF_Admin.getContentPane().add(JT_DniPacienteAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 190, 40));

        jLabel34.setText("CÓDIGO REFUERZO");
        IF_Admin.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, 40));

        jLabel35.setText("CENTRO VACUNACIÓN");
        IF_Admin.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, 40));

        BTN_BuscarTurno.setText("BUSCAR TURNO");
        BTN_BuscarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BuscarTurnoActionPerformed(evt);
            }
        });
        IF_Admin.getContentPane().add(BTN_BuscarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 330, 70));

        jLabel36.setText("FECHA HORARIO COLOCACIÓN");
        IF_Admin.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, 40));

        jLabel37.setText("N° SERIE DOSIS");
        IF_Admin.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, 40));

        BTN_NuevoTurno.setText("NUEVA ACCIÓN");
        BTN_NuevoTurno.setName("NUEVA ACCIÓN"); // NOI18N
        BTN_NuevoTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_NuevoTurnoActionPerformed(evt);
            }
        });
        IF_Admin.getContentPane().add(BTN_NuevoTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 240, 60));

        BTN_ActualizarTurno.setText("ACTUALIZAR");
        BTN_ActualizarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ActualizarTurnoActionPerformed(evt);
            }
        });
        IF_Admin.getContentPane().add(BTN_ActualizarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 250, 60));

        LB_Admin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LB_Admin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        IF_Admin.getContentPane().add(LB_Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 300, 40));

        JDC_FechaHoraColoc.setDateFormatString("yyyy/MM/d");
        JDC_FechaHoraColoc.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        IF_Admin.getContentPane().add(JDC_FechaHoraColoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 180, 40));

        JC_NroSerieDosisAdmin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JC_NroSerieDosisAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VACUNAS" }));
        JC_NroSerieDosisAdmin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JC_NroSerieDosisAdminItemStateChanged(evt);
            }
        });
        IF_Admin.getContentPane().add(JC_NroSerieDosisAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 180, 40));

        JT_NroSerieVacunas.setName("N° Serie Dosis"); // NOI18N
        IF_Admin.getContentPane().add(JT_NroSerieVacunas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 180, 30));

        BTN_BajaAltaTurno.setText("APLICAR DOSIS");
        BTN_BajaAltaTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BajaAltaTurnoActionPerformed(evt);
            }
        });
        IF_Admin.getContentPane().add(BTN_BajaAltaTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 190, 40));

        JCB_CentrosVacu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JCB_CentrosVacu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VACUNATORIO", "Centro Sur", "Centro Norte", "Centro Oeste", "Centro Este" }));
        IF_Admin.getContentPane().add(JCB_CentrosVacu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 190, 40));

        JCB_DosisAdmin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JCB_DosisAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO", "DOSIS 1", "DOSIS 2", "DOSIS 3", "DOSIS 4" }));
        IF_Admin.getContentPane().add(JCB_DosisAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 190, 40));

        BTN_GuardarTurnoNuevo.setText("GUARDAR");
        BTN_GuardarTurnoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_GuardarTurnoNuevoActionPerformed(evt);
            }
        });
        IF_Admin.getContentPane().add(BTN_GuardarTurnoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 240, 60));

        JCB_Horarios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JCB_Horarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HORARIOS", "08:00:00", "08:15:00", "08:30:00", "08:45:00", "09:00:00", "09:15:00", "09:30:00", "09:45:00", "10:00:00", "10:15:00", "10:30:00", "10:45:00", "11:00:00", "11:15:00", "11:30:00" }));
        IF_Admin.getContentPane().add(JCB_Horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 180, 40));

        LB_turno.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        LB_turno.setForeground(new java.awt.Color(0, 204, 0));
        LB_turno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IF_Admin.getContentPane().add(LB_turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, 140, 80));

        JCB_NumTurno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JCB_NumTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N° TURNO" }));
        IF_Admin.getContentPane().add(JCB_NumTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 190, 40));

        jLabel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        IF_Admin.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 810, 410));

        getContentPane().add(IF_Admin);

        IF_Consultas.setClosable(true);
        IF_Consultas.setTitle("Consultas");
        IF_Consultas.setMinimumSize(new java.awt.Dimension(870, 680));
        IF_Consultas.setPreferredSize(new java.awt.Dimension(870, 690));
        IF_Consultas.setVisible(true);
        IF_Consultas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTAS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 100));
        IF_Consultas.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 240, 80));

        JT_Consultas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JT_Consultas.setForeground(new java.awt.Color(0, 255, 0));
        JT_Consultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JT_Consultas);

        IF_Consultas.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 760, 320));

        JC_Consultas.setForeground(new java.awt.Color(0, 255, 0));
        JC_Consultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "PACIENTES", "LABORATORIOS", "VACUNAS", "TURNOS" }));
        JC_Consultas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JC_ConsultasItemStateChanged(evt);
            }
        });
        IF_Consultas.getContentPane().add(JC_Consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 260, 40));

        getContentPane().add(IF_Consultas);

        IF_Ayuda.setClosable(true);
        IF_Ayuda.setTitle("Ayuda");
        IF_Ayuda.setPreferredSize(new java.awt.Dimension(870, 680));
        IF_Ayuda.setVisible(true);
        IF_Ayuda.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(1);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 255, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("                                                               SISTEMA PARA MANEJO INTEGRAL DE VACUNACION\n\n\n                                                                         Módulos que componen el sistema:\n\n                                                                                            INGRESO: \n     Modulo que permite el ingreso de los distintos operadores, dependiendo el nivel jerárquico, se podrá dar de alta,\n                                                    de baja o modificar a los usuarios que operan el sistema.\n\n                                                                                          CIUDADANO: \n    Posee toda la información necesaria para la adjudicación de citas de vacunación, en caso de que el/la Ciudadano/a \n             sea menor de edad o discapacitado, contiene la información del Tutor legal del menor o discapacitado.\n\n                                                                                        LABORATORIO:\n             Datos de los Laboratorios que proveen las distintas vacunas para las distintas campañas de vacunación.\n\n                                                                                              VACUNA: \n                               Información de las distintas vacunas que se aplican en las campañas de vacunación.\n\n                                                                                      CITA VACUNACION: \n     Guarda la información de cada cita de vacunación asignada a un ciudadano, que vacuna se debe aplicar, día y hora.\n\n                                                                                          CONSULTAS: \n                                          Información integral de Ciudadanos, Laboratorios y Vacunas.\n\n                                                                                              TEMAS: \n                                     Funcionalidad que permite operar el sistema en tonos claros u oscuros.\n\n                                   En caso de consultas comunicarse a : edusejumar@elmejorsoft.com\n                                                                                  Tel: (054) – 5555-7777\n\n                                                                                              TEAM39\n");
        jTextArea1.setPreferredSize(new java.awt.Dimension(870, 680));
        jScrollPane2.setViewportView(jTextArea1);

        IF_Ayuda.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 630));

        getContentPane().add(IF_Ayuda);

        MenuFlotante.setAlignmentX(0.0F);
        MenuFlotante.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        MenuFlotante.setPreferredSize(new java.awt.Dimension(750, 35));

        JM_Paciente.setText("Paciente");
        JM_Paciente.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Paciente.setText("Paciente");
        MI_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_PacienteActionPerformed(evt);
            }
        });
        JM_Paciente.add(MI_Paciente);

        MenuFlotante.add(JM_Paciente);

        JM_Laboratorio.setText("Laboratorio");
        JM_Laboratorio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_lab.setText("Laboratorio");
        MI_lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_labActionPerformed(evt);
            }
        });
        JM_Laboratorio.add(MI_lab);

        MenuFlotante.add(JM_Laboratorio);

        JM_Vacuna.setText("Vacuna");
        JM_Vacuna.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Vac.setText("Vacuna");
        MI_Vac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_VacActionPerformed(evt);
            }
        });
        JM_Vacuna.add(MI_Vac);

        MenuFlotante.add(JM_Vacuna);

        JM_Admin.setText("Administración");
        JM_Admin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Turno.setText("Turnos");
        MI_Turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_TurnoActionPerformed(evt);
            }
        });
        JM_Admin.add(MI_Turno);

        MenuFlotante.add(JM_Admin);

        JM_Consultas.setText("Consultas");
        JM_Consultas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Turnos.setText("Consultas");
        MI_Turnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_TurnosActionPerformed(evt);
            }
        });
        JM_Consultas.add(MI_Turnos);

        MenuFlotante.add(JM_Consultas);

        JM_Temas.setText("Temas");
        JM_Temas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Noche.setText("Noche");
        MI_Noche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_NocheActionPerformed(evt);
            }
        });
        JM_Temas.add(MI_Noche);

        MI_Dia.setText("Día");
        MI_Dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_DiaActionPerformed(evt);
            }
        });
        JM_Temas.add(MI_Dia);

        MenuFlotante.add(JM_Temas);

        JM_Ayuda.setText("Ayuda");
        JM_Ayuda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Ayuda.setText("Información");
        MI_Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_AyudaActionPerformed(evt);
            }
        });
        JM_Ayuda.add(MI_Ayuda);

        MenuFlotante.add(JM_Ayuda);

        JM_Salir.setText("Salir");
        JM_Salir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        MI_Salir.setText("Salir del programa");
        MI_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_SalirActionPerformed(evt);
            }
        });
        JM_Salir.add(MI_Salir);

        MenuFlotante.add(JM_Salir);

        setJMenuBar(MenuFlotante);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void MI_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_PacienteActionPerformed
        ocultarIFrames();
        IF_Paciente.setVisible(true);
        BTN_GuardarActualizarPaciente.setEnabled(false);
        BTN_BuscarPaciente.setEnabled(false);
        //activarBotonSegunCantCaract(JT_DNI, BTN_GuardarActualizarPaciente, 7);
        activarBotonSegunCantCaract(JT_DNI, BTN_BuscarPaciente, 7);
               
        List <Component> camposComp = new ArrayList<>();
        camposComp.add(JT_Nombre);
        camposComp.add(JT_Apellido);
        camposComp.add(JT_DNI);
        camposComp.add(JT_Celular);
        camposComp.add(JT_Edad);
        
        Color verde = new Color(0, 204, 0);
        LB_EstadoPaciente.setVisible(true);
        LB_EstadoPaciente.setText("Buscar Paciente por DNI.");
        LB_EstadoPaciente.setForeground(verde);
        
        activarBotonSiTextoIngresado(BTN_GuardarActualizarPaciente, camposComp);
        desbloquearCampos(false);
    }//GEN-LAST:event_MI_PacienteActionPerformed

    private void MI_labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_labActionPerformed
        ocultarIFrames();
        IF_Laboratorio.setVisible(true);
        BTN_GuardarActualizarLab.setEnabled(false);
        BTN_BuscarLab.setEnabled(false);
        activarBotonSegunCantCaract(JT_CuitLab, BTN_BuscarLab, 7);
        List <JTextField> camposString = new ArrayList<>();
        camposString.add(JT_NombreLab);
        camposString.add(JT_PaisLab);
        camposString.add(JT_DomComLab);
        camposString.add(JT_EmailLab);
        camposString.add(JT_TelefonoLab);
        
        List <Component> camposComp = new ArrayList<>();
        camposString.add(JT_NombreLab);
        camposString.add(JT_PaisLab);
        camposString.add(JT_DomComLab);
        camposString.add(JT_EmailLab);
        camposString.add(JT_TelefonoLab);
        
        Color verde = new Color(0, 204, 0);
        JL_Lab.setVisible(true);
        JL_Lab.setText("Buscar laboratorio por N° de Cuit.");
        JL_Lab.setForeground(verde);
        
        activarBotonSiTextoIngresado(BTN_GuardarActualizarLab, camposComp);
        desbloquearCamposEnIF(camposString, false);
    }//GEN-LAST:event_MI_labActionPerformed

    private void MI_VacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_VacActionPerformed
        ocultarIFrames();
        JDC_VencimientoVacuna.getDateEditor().setEnabled(false);
        IF_Vacuna.setVisible(true);
        cargarLabsComboBox(JCB_CuitsLabs);
        BTN_GuardarActualizarVacuna.setEnabled(false);
        BTN_BuscarVacuna.setEnabled(false);
        activarBotonSegunCantCaract(JT_SerieDosis, BTN_BuscarVacuna, 5); //método que activa el botón cuando cumple con la cantidad de caracteres requeridos
        List <Component> campos = new ArrayList<>();
        campos.add(JT_CuitLabVacuna);
        campos.add(JT_NomVacuna);
        campos.add(JT_MarcaVacuna);
        campos.add(JT_Medida);
        JCB_CuitsLabs.setEnabled(false);
        
        Color verde = new Color(0, 204, 0);
        LB_EstadoVacuna.setVisible(true);
        LB_EstadoVacuna.setText("Buscar vacuna por N° Serie Dosis.");
        LB_EstadoVacuna.setForeground(verde);

        activarBotonSiTextoIngresado(BTN_GuardarActualizarVacuna, campos);
        desbloquearCamposVacuna(false);
    }//GEN-LAST:event_MI_VacActionPerformed

    private void MI_TurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_TurnoActionPerformed
        ocultarIFrames();
        IF_Admin.setVisible(true);
        JT_NroSerieVacunas.setVisible(false);
        activarDesactivarComboBoxes(false, JCB_Horarios, JCB_CentrosVacu, JCB_DosisAdmin, JC_NroSerieDosisAdmin, JCB_NumTurno);
        JC_NroSerieDosisAdmin.setEnabled(false);
        Color verde = new Color(0, 204, 0);
        LB_Admin.setVisible(true);
        LB_Admin.setText("Presionar " + BTN_NuevoTurno.getName() + " para comenzar.");
        LB_Admin.setForeground(verde);
        BTN_BajaAltaTurno.setText("APLICACIÓN DOSIS");
        BTN_BajaAltaTurno.setEnabled(false);
        JDC_FechaHoraColoc.getDateEditor().setEnabled(false);        
        
        BTN_ActualizarTurno.setEnabled(false);
        BTN_GuardarTurnoNuevo.setEnabled(false);
        BTN_BuscarTurno.setEnabled(false);
        activarBotonSegunCantCaract(JT_DniPacienteAdmin, BTN_BuscarTurno, 7); //activación del botón Buscar Turno        
        
        desbloquearCamposAdmin(false);
    }//GEN-LAST:event_MI_TurnoActionPerformed

    private void MI_TurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_TurnosActionPerformed
        ocultarIFrames();
        IF_Consultas.setVisible(true);
    }//GEN-LAST:event_MI_TurnosActionPerformed

    private void MI_AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_AyudaActionPerformed
        ocultarIFrames();
        IF_Ayuda.setVisible(true);
    }//GEN-LAST:event_MI_AyudaActionPerformed
    
    public static void activarBotonSegunCantCaract(JTextField textField, JButton button, int longitudMinima) {
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkTextLength();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkTextLength();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkTextLength();
            }

            private void checkTextLength() {
                if (textField.getText().length() >= longitudMinima) {
                    button.setEnabled(true);
                } else {
                    button.setEnabled(false);
                }
            }
        });
    }    
    
    private void BTN_BuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarPacienteActionPerformed
        desbloquearCampos(true);
        CiudadanoData ciuData = new CiudadanoData();
        ArrayList<Ciudadano> ciudadanoBuscado = new ArrayList<>();
        String dniPaciente = JT_DNI.getText();
        boolean dniValido = esNumeroDNI(dniPaciente);
        
        
        if (dniValido) {
            try {
                BTN_BuscarPaciente.setEnabled(false);
                int dniCiudadano = Integer.parseInt(dniPaciente);
                ciudadanoBuscado.add(ciuData.buscarCiudadanoPorDni(dniCiudadano));

                // Verifico si se encontró un paciente antes de mostrar los datos
                String apellido = ciudadanoBuscado.get(0).getApellido();
                String nombre = ciudadanoBuscado.get(0).getNombre();
                String email = ciudadanoBuscado.get(0).getEmail();
                String patologia = ciudadanoBuscado.get(0).getPatologia();
                String ocupacion = ciudadanoBuscado.get(0).getOcupacion();
                String celular = ciudadanoBuscado.get(0).getCelular();
                String responsableLegal = ciudadanoBuscado.get(0).getResponsableLegal();
                int edad = ciudadanoBuscado.get(0).getEdad();
                boolean estado = ciudadanoBuscado.get(0).isEstado();

                String edadString = String.valueOf(edad);

                // Muestra los datos en los campos de información
                JT_Apellido.setText(apellido);
                JT_Nombre.setText(nombre);
                JT_Celular.setText(celular);
                JT_Email.setText(email);
                JT_Patologia.setText(patologia);
                JT_Ocupacion.setText(ocupacion);
                JT_ResponsableLegal.setText(responsableLegal);
                JT_Edad.setText(edadString);

                RB_EstadoPaciente.setSelected(estado); // Establecemos el estado del RadioButton           
                if (RB_EstadoPaciente.isSelected()) {
                    Color verde = new Color(0, 204, 0);
                    LB_EstadoPaciente.setText("Paciente activo");
                    LB_EstadoPaciente.setForeground(verde);
                } else {
                    Color rojo = new Color(210, 32, 32);
                    LB_EstadoPaciente.setText("Paciente inactivo");
                    LB_EstadoPaciente.setForeground(rojo);
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "El paciente no existe en las listas\nIntenta con otro DNI");
                desbloquearCampos(false);
                BTN_BuscarPaciente.setEnabled(true);
                JT_DNI.setText("");
            }

        } else {
            desbloquearCampos(false);
            //JOptionPane.showMessageDialog(null, "Ingresa un DNI válido");
        }
    }//GEN-LAST:event_BTN_BuscarPacienteActionPerformed

    private void MI_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_SalirActionPerformed
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que quieres cerrar la aplicación?",
                "Confirmar Cierre",
                JOptionPane.YES_NO_OPTION
        );

        if (confirm == JOptionPane.YES_OPTION) {
            // Cierra la aplicación
            System.exit(0);
        }
    }//GEN-LAST:event_MI_SalirActionPerformed

    private void BTN_NuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NuevoPacienteActionPerformed
        
        Object[] options = {"Agregar Paciente", "Buscar Paciente"};
        int choice = JOptionPane.showOptionDialog(null,
                "¿Qué quieres hacer?",
                "Elegir una opción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (choice == JOptionPane.YES_OPTION) { //Opción que permite cargar un nuevo paciente
            Color verde = new Color(0, 204, 0);
            LB_EstadoPaciente.setVisible(true);
            LB_EstadoPaciente.setText("Llenar los campos obligatorios (*)");
            LB_EstadoPaciente.setForeground(verde);
            // Código para guardar
            BTN_BuscarPaciente.setVisible(false);
            RB_EstadoPaciente.setVisible(false);
            //JOptionPane.showMessageDialog(null, "Seleccionaste Nuevo Paciente");
            desbloquearCampos(true);
            limpiarCampos(IF_Paciente, LB_EstadoVacuna);
            //LB_EstadoPaciente.setVisible(false);
        } else if (choice == JOptionPane.NO_OPTION) { //Opción que permite iniciar una búsqueda nueva de paciente            
            BTN_BuscarPaciente.setEnabled(true);
            desbloquearCampos(false);
            BTN_BuscarPaciente.setVisible(true);
            
            Color verde = new Color(0, 204, 0);
            LB_EstadoPaciente.setVisible(true);
            LB_EstadoPaciente.setText("Llenar campo DNI.");
            LB_EstadoPaciente.setForeground(verde);

            //JOptionPane.showMessageDialog(null, "Seleccionaste Búsqueda Nueva");
            limpiarCampos(IF_Paciente, LB_EstadoVacuna);
        }
    }//GEN-LAST:event_BTN_NuevoPacienteActionPerformed
    
    private void desbloquearCamposEnIF(List<JTextField> campos, boolean habilitar) {
        campos.forEach((campo) -> {
            campo.setEditable(habilitar);
        });
        RB_EstadoPaciente.setEnabled(habilitar);
    }

    
    private void desbloquearCampos(boolean seteo){
        JT_Ocupacion.setEditable(seteo);
        JT_Nombre.setEditable(seteo);
        JT_Email.setEditable(seteo);
        JT_Patologia.setEditable(seteo);
        JT_Apellido.setEditable(seteo);
        JT_Edad.setEditable(seteo);
        JT_Celular.setEditable(seteo);
        JT_ResponsableLegal.setEditable(seteo);
        RB_EstadoPaciente.setEnabled(seteo);
    }
    
    private void desbloquearCamposLabs(boolean seteo){        
        JT_NombreLab.setEditable(seteo);
        JT_PaisLab.setEditable(seteo);
        JT_DomComLab.setEditable(seteo);
        JT_EmailLab.setEditable(seteo);
        JT_TelefonoLab.setEditable(seteo);        
    }
    
    private void desbloquearCamposVacuna(boolean seteo){
        JT_CuitLabVacuna.setEditable(seteo);
        JT_NomVacuna.setEditable(seteo);
        JT_MarcaVacuna.setEditable(seteo);
        JT_Medida.setEditable(seteo);
        JDC_VencimientoVacuna.setEnabled(seteo);
        RB_EstadoVacuna.setEnabled(seteo);
    }
    
    private void desbloquearCamposAdmin(boolean seteo){        
        JT_DniPacienteAdmin.setEditable(seteo);
        JT_Turno.setEditable(seteo);        
        JT_NroSerieVacunas.setEditable(false);        
    }
    
    private void BTN_GuardarActualizarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActualizarPacienteActionPerformed

        CiudadanoData ciuData = new CiudadanoData();

        String dni = JT_DNI.getText();
        String apellido = JT_Apellido.getText();
        String nombre = JT_Nombre.getText();
        String email = JT_Email.getText();
        String patologia = JT_Patologia.getText();
        String ocupacion = JT_Ocupacion.getText();
        String celular = JT_Celular.getText();
        String responsableLegal = JT_ResponsableLegal.getText();
        String edad = JT_Edad.getText();
        
        boolean esDNIValido = esNumeroDNI(dni);
        boolean numValido = esNumeroValido(edad);
        
        List <JTextField> campos = new ArrayList<>();
        campos.add(JT_Nombre);
        campos.add(JT_Apellido);
                
        boolean camposAlfasValidos = validarCamposAlfabeticos(campos);
        
        List <JTextField> camposNum = new ArrayList<>();
        camposNum.add(JT_DNI);
        camposNum.add(JT_Celular);
        camposNum.add(JT_Edad);
        
        boolean camposNumericos = validarCamposNumericos(camposNum);
        
        if (esDNIValido && numValido && camposAlfasValidos && camposNumericos) {
            try {

                boolean estadoPaciente = RB_EstadoPaciente.isSelected(); //Verifico que el estado del radioButton según el estado del paciente
                // Buscar ciudadano por DNI
                Ciudadano pacienteEncontrado = ciuData.buscarCiudadanoPorDni(Integer.parseInt(dni));
            
                if (pacienteEncontrado != null) {
                int opcion = JOptionPane.showConfirmDialog(null, "El DNI ya existe. ¿Deseas actualizarlo?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    // Actualizar el ciudadano existente
                    pacienteEncontrado.setNombre(nombre);
                    pacienteEncontrado.setApellido(apellido);
                    pacienteEncontrado.setEmail(email);
                    pacienteEncontrado.setCelular(celular);
                    pacienteEncontrado.setPatologia(patologia);
                    pacienteEncontrado.setOcupacion(ocupacion);
                    pacienteEncontrado.setEdad(Integer.parseInt(edad));
                    pacienteEncontrado.setResponsableLegal(responsableLegal);
                    pacienteEncontrado.setEstado(estadoPaciente);
                    
                    ciuData.modificarCiudadano(pacienteEncontrado);
                    limpiarCampos(IF_Paciente, LB_EstadoPaciente);
                    LB_EstadoPaciente.setText("Buscar Paciente por DNI.");
                    desbloquearCampos(false);
                }
            } else {
                
                // El DNI no existe, guardar un nuevo ciudadano
                Ciudadano citizen = new Ciudadano(Integer.parseInt(dni), nombre, apellido, email, celular, patologia, ocupacion, Integer.parseInt(edad), responsableLegal, estadoPaciente);
                ciuData.guardarCiudadano(citizen);
                JOptionPane.showMessageDialog(null, "Se ha guardado un paciente nuevo.");
                limpiarCampos(IF_Paciente, LB_EstadoPaciente);
                desbloquearCampos(false);
                }                

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar estos tipos de datos. Verificar.");
                System.out.println("Error: " + e);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Verifica los campos y que sean correctos.");
        }
    }//GEN-LAST:event_BTN_GuardarActualizarPacienteActionPerformed

    private void BTN_GuardarActualizarLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActualizarLabActionPerformed
        LaboratorioData labData = new LaboratorioData();

        String cuit = JT_CuitLab.getText();        
        String nombreLab = JT_NombreLab.getText();
        String emailLab = JT_EmailLab.getText();
        String paisLab = JT_PaisLab.getText();
        String domComercial = JT_DomComLab.getText();
        String telefonoLab = JT_TelefonoLab.getText();
                
        boolean esCuitValido = esCuitValido(cuit);
                
        List <JTextField> campos = new ArrayList<>();
        campos.add(JT_NombreLab);
        campos.add(JT_PaisLab);
        campos.add(JT_DomComLab);
        campos.add(JT_EmailLab);
        campos.add(JT_TelefonoLab);
                
        boolean camposAlfasValidos = validarCamposAlfabeticos(campos);
        
        List <JTextField> camposNum = new ArrayList<>();
        camposNum.add(JT_CuitLab);
        
                
        boolean camposNumericos = validarCamposNumericos(camposNum);
        
        if (esCuitValido && camposAlfasValidos && camposNumericos) {
            try {
                
                // Buscar laboratorio por CUIT
                Laboratorio labEncontrado = labData.buscarLaboratorioPorCuit(Integer.parseInt(cuit));
            
                if (labEncontrado != null) {
                int opcion = JOptionPane.showConfirmDialog(null, "El Laboratorio ya existe. ¿Deseas actualizarlo?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    // Actualizar el laboratorio existente
                    labEncontrado.setNombreLab(nombreLab);
                    labEncontrado.setPais(paisLab);
                    labEncontrado.setMail(emailLab);
                    labEncontrado.setDomComercial(domComercial);
                    labEncontrado.setTelefono(telefonoLab);
                                        
                    labData.modificarLaboratorio(labEncontrado, Integer.parseInt(cuit));
                    limpiarCampos(IF_Laboratorio, LB_EstadoPaciente);
                    desbloquearCamposLabs(false);
                }
            } else {
                
                // El CUIT no existe, guardar un nuevo laboratorio
                Laboratorio lab = new Laboratorio(Integer.parseInt(cuit), nombreLab, paisLab, domComercial, emailLab, telefonoLab);
                labData.guardarLaboratorio(lab);
                JOptionPane.showMessageDialog(null, "Se ha guardado un laboratorio nuevo.");
                limpiarCampos(IF_Laboratorio, LB_EstadoPaciente);
                desbloquearCamposLabs(false);
                }                

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar estos tipos de datos. Verificar.");
                System.out.println("Error: " + e);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Verifica los campos y que sean correctos.");
        }
    }//GEN-LAST:event_BTN_GuardarActualizarLabActionPerformed

    private void BTN_NuevoLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NuevoLabActionPerformed
        Object[] options = {"Agregar Laboratorio", "Buscar Laboratorio"};
        int choice = JOptionPane.showOptionDialog(null,
                "¿Qué quieres hacer?",
                "Elegir una opción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (choice == JOptionPane.YES_OPTION) { //Opción que permite cargar un nuevo laboratorio
            // Código para guardar
            BTN_BuscarLab.setVisible(false);
            desbloquearCamposLabs(true);
            
            Color verde = new Color(0, 204, 0);
            JL_Lab.setVisible(true);
            JL_Lab.setText("Llenar todos los campos.");
            JL_Lab.setForeground(verde);

            limpiarCampos(IF_Laboratorio, LB_EstadoPaciente);
        } else if (choice == JOptionPane.NO_OPTION) { //Opción que permite iniciar una búsqueda nueva de paciente            
            BTN_BuscarLab.setEnabled(true);
            desbloquearCamposLabs(false);
            BTN_BuscarLab.setVisible(true);
            
            Color verde = new Color(0, 204, 0);
            JL_Lab.setVisible(true);
            JL_Lab.setText("Llenar campo de Cuit Laboratorio.");
            JL_Lab.setForeground(verde);

            limpiarCampos(IF_Laboratorio, LB_EstadoPaciente);
        }
    }//GEN-LAST:event_BTN_NuevoLabActionPerformed

    private void BTN_BuscarLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarLabActionPerformed
        desbloquearCamposLabs(true);
        LaboratorioData labData = new LaboratorioData();
        ArrayList<Laboratorio> labBuscado = new ArrayList<>();
        String cuitLab = JT_CuitLab.getText();
        boolean dniValido = esCuitValido(cuitLab);
        
        
        if (dniValido) {
            try {
                BTN_BuscarLab.setEnabled(false);
                int cuitLaboratorio = Integer.parseInt(cuitLab);
                labBuscado.add(labData.buscarLaboratorioPorCuit(cuitLaboratorio));

                // Verifico si se encontró un laboratorio antes de mostrar los datos
                //int cuit = labBuscado.get(0).getCuitLaboratorio();
                String nombreLab = labBuscado.get(0).getNombreLab();
                String pais = labBuscado.get(0).getPais();
                String domComercial = labBuscado.get(0).getDomComercial();
                String emailLab = labBuscado.get(0).getMail();
                String telefonoLab = labBuscado.get(0).getTelefono();
                
                

                // Muestra los datos en los campos de información
                JT_NombreLab.setText(nombreLab);
                JT_PaisLab.setText(pais);
                JT_DomComLab.setText(domComercial);
                JT_EmailLab.setText(emailLab);
                JT_TelefonoLab.setText(telefonoLab);
                           
//                if (RB_EstadoPaciente.isSelected()) {
//                    Color verde = new Color(0, 204, 0);
//                    LB_EstadoPaciente.setText("Paciente activo");
//                    LB_EstadoPaciente.setForeground(verde);
//                } else {
//                    Color rojo = new Color(210, 32, 32);
//                    LB_EstadoPaciente.setText("Paciente inactivo");
//                    LB_EstadoPaciente.setForeground(rojo);
//                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "El laboratorio no existe en las listas\nIntenta con otro CUIT");
                desbloquearCamposLabs(false);
                BTN_BuscarLab.setEnabled(true);
                JT_CuitLab.setText("");
            }

        } else {
            desbloquearCamposLabs(false);
        }
    }//GEN-LAST:event_BTN_BuscarLabActionPerformed

    private void BTN_NuevaVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NuevaVacunaActionPerformed
        Object[] options = {"Agregar Vacuna", "Buscar Vacuna"};
        int choice = JOptionPane.showOptionDialog(null,
                "¿Qué quieres hacer?",
                "Elegir una opción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (choice == JOptionPane.YES_OPTION) { //Opción que permite cargar un nueva vacuna
            // Código para guardar una vacuna
            BTN_BuscarVacuna.setVisible(false);
            RB_EstadoVacuna.setVisible(false);
            JCB_CuitsLabs.setEnabled(true);
            Color verde = new Color(0, 204, 0);
            LB_EstadoVacuna.setVisible(true);
            LB_EstadoVacuna.setText("Llenar todos los campos.");
            LB_EstadoVacuna.setForeground(verde);
            
            desbloquearCamposVacuna(true);
            limpiarCampos(IF_Vacuna, LB_EstadoPaciente);
        } else if (choice == JOptionPane.NO_OPTION) { //Opción que permite iniciar una búsqueda nueva de vacuna            
            BTN_BuscarVacuna.setEnabled(true);
            desbloquearCamposVacuna(false);
            JCB_CuitsLabs.setEnabled(false);
            Color verde = new Color(0, 204, 0);
            LB_EstadoVacuna.setVisible(true);
            LB_EstadoVacuna.setText("Llenar campo N° Serie Dosis.");
            LB_EstadoVacuna.setForeground(verde);
            
            BTN_BuscarVacuna.setVisible(true);
            limpiarCampos(IF_Vacuna, LB_EstadoPaciente);
        }
    }//GEN-LAST:event_BTN_NuevaVacunaActionPerformed

    private void BTN_GuardarActualizarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarActualizarVacunaActionPerformed
                
        VacunaData vacuData = new VacunaData();

        String numSerieDosis = JT_SerieDosis.getText();
        String cuitLab = JT_CuitLabVacuna.getText();
        String nombreVacuna = JT_NomVacuna.getText();
        String marcaVacuna = JT_MarcaVacuna.getText();
        String medida = JT_Medida.getText();        
        String date = ((JTextField)JDC_VencimientoVacuna.getDateEditor().getUiComponent()).getText(); // capturo la fecha como String
        
        // Convertir Date a LocalDate puuufff!!
        LocalDate fechaVencimiento = LocalDate.parse(date);
        
        boolean esNDosisValido = esNumeroDosisValido(numSerieDosis);
        boolean cuitValido = esCuitValido(cuitLab);
        
        List <JTextField> campos = new ArrayList<>();
        campos.add(JT_NomVacuna);
        campos.add(JT_MarcaVacuna);        
        
        /*AGREGAR LA VALIDEZ DEL CAMPO LocalDate*/
        
        boolean camposAlfasValidos = validarCamposAlfabeticos(campos);
        
        List <JTextField> camposNum = new ArrayList<>();
        camposNum.add(JT_SerieDosis);
        camposNum.add(JT_CuitLabVacuna);
        
        
        boolean camposNumericos = validarCamposNumericos(camposNum);
        
        if (esNDosisValido && cuitValido && camposAlfasValidos && camposNumericos) {
            try {

                boolean estadoVacuna = RB_EstadoVacuna.isSelected(); //Verifico que el estado del radioButton según el estado de la vacuna
                // Buscar vacuna por NroSerieDosis
                Vacuna vacunaEncontrada = vacuData.obtenerVacuna(Integer.parseInt(numSerieDosis));
            
                if (vacunaEncontrada != null) {
                int opcion = JOptionPane.showConfirmDialog(null, "La vacuna ya existe. ¿Deseas actualizarla?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    // Actualizar la vacuna existente
                    //vacunaEncontrada.setCuitLaboratorio(Integer.parseInt(cuitLab)); //creo que este no debe actualizarse al igual que el nroSerieDosis
                    vacunaEncontrada.setNombreVacuna(nombreVacuna);
                    vacunaEncontrada.setMarca(marcaVacuna);
                    vacunaEncontrada.setMedida(Double.parseDouble(medida));
                    vacunaEncontrada.setVencimiento(fechaVencimiento);
                    vacunaEncontrada.setAplicacion(estadoVacuna);
                    
                    vacuData.modificarVacuna(vacunaEncontrada);
                    limpiarCampos(IF_Vacuna, LB_EstadoPaciente);
                    desbloquearCamposVacuna(false);
                }
            } else {
                int nroSerieDosis = Integer.parseInt(JT_SerieDosis.getText());
                double medidaDosis = Double.parseDouble(JT_Medida.getText());
                // El NroSerieDosis no existe, guardar una nueva vacuna
                Vacuna vacuna = new Vacuna(nroSerieDosis, ABORT, nombreVacuna, marcaVacuna, medidaDosis, fechaVencimiento, estadoVacuna);
                vacuData.guardarVacuna(vacuna);
                JOptionPane.showMessageDialog(null, "Se ha guardado una vacuna nueva.");
                limpiarCampos(IF_Vacuna, LB_EstadoPaciente);
                desbloquearCamposVacuna(false);
                }                

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar estos tipos de datos. Verificar.");
                System.out.println("Error: " + e);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Verifica los campos y que sean correctos.");
        }
        
    }//GEN-LAST:event_BTN_GuardarActualizarVacunaActionPerformed

    private void BTN_BuscarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarVacunaActionPerformed
        desbloquearCamposVacuna(true);
        VacunaData vacuData = new VacunaData();
        ArrayList<Vacuna> vacunaBuscada = new ArrayList<>();
        String nroDosis = JT_SerieDosis.getText();
        boolean nroSerieValido = esNumeroDosisValido(nroDosis);
        //String date = ((JTextField)JDC_VencimientoVacuna.getDateEditor().getUiComponent()).getText(); // capturo la fecha como String
        
        if (nroSerieValido) {
            try {
                BTN_BuscarVacuna.setEnabled(false);
                int numeroDosis = Integer.parseInt(nroDosis);
                vacunaBuscada.add(vacuData.obtenerVacuna(numeroDosis));

                // Verifico si se encontró una vacuna antes de mostrar los datos
                int cuitLab = vacunaBuscada.get(0).getCuitLaboratorio();
                String nombreVacuna = vacunaBuscada.get(0).getNombreVacuna();
                String marca = vacunaBuscada.get(0).getMarca();
                double medida = vacunaBuscada.get(0).getMedida();
                LocalDate vencimiento = vacunaBuscada.get(0).getVencimiento();
                
                boolean estado = vacunaBuscada.get(0).isAplicacion();

                String cuitString = String.valueOf(cuitLab);
                String medidaString = String.valueOf(medida);
                //String venciString = String.valueOf(vencimiento);
                
                //línea de código para transformar el dato LocalDate para cargarlo en el JCalendar
                java.util.Date utilDate = java.util.Date.from(vencimiento.atStartOfDay(ZoneId.systemDefault()).toInstant());
                
                // Muestra los datos en los campos de información
                JT_CuitLabVacuna.setText(cuitString);
                JT_NomVacuna.setText(nombreVacuna);
                JT_MarcaVacuna.setText(marca);
                JT_Medida.setText(medidaString);
                JDC_VencimientoVacuna.setDate(utilDate);
                
                RB_EstadoVacuna.setSelected(estado); // Establecemos el estado del RadioButton           
                if (RB_EstadoVacuna.isSelected()) {
                    Color verde = new Color(0, 204, 0);
                    LB_EstadoVacuna.setText("Vacuna activa en Stock");
                    LB_EstadoVacuna.setForeground(verde);
                } else {
                    Color rojo = new Color(210, 32, 32);
                    LB_EstadoVacuna.setText("Vacuna no existe en Stock");
                    LB_EstadoVacuna.setForeground(rojo);
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "La Vacuna no existe en las listas\nIntenta con otro Número de Serie");
                desbloquearCamposVacuna(false);
                BTN_BuscarVacuna.setEnabled(true);
                JT_SerieDosis.setText("");
            }

        } else {
            desbloquearCamposVacuna(false);            
        }
    }//GEN-LAST:event_BTN_BuscarVacunaActionPerformed

    private void BTN_BuscarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BuscarTurnoActionPerformed
        desbloquearCamposAdmin(true);
        activarDesactivarComboBoxes(true, JCB_Horarios, JCB_CentrosVacu, JCB_DosisAdmin, JC_NroSerieDosisAdmin, JCB_NumTurno);

        CitaVacunacionData citaData = new CitaVacunacionData();

        String dniPaciente = JT_DniPacienteAdmin.getText();
        
        boolean dniValido = esNumeroDNI(dniPaciente);

        if (dniValido) {
            try {
                BTN_BuscarTurno.setEnabled(false);
                BTN_GuardarTurnoNuevo.setEnabled(false);
                BTN_ActualizarTurno.setEnabled(true); // Habilito el botón para actualizar el turno
                int dniCiudadano = Integer.parseInt(dniPaciente);
                

                // Buscar el turno por DNI
                CitaVacunacion turnoBuscado = citaData.buscarTurnoPorDniCiudadanoVE(dniCiudadano);

                if (turnoBuscado != null) {
                    LB_Admin.setText("");                    
                    // Mostrar los datos del turno encontrado
                    JT_Turno.setText(Integer.toString(turnoBuscado.getCodCita()));
                    JCB_DosisAdmin.setSelectedItem(turnoBuscado.getCodRefuerzo());
                    JCB_CentrosVacu.setSelectedItem(turnoBuscado.getCentroVacunacion());
                    JCB_NumTurno.setSelectedItem(turnoBuscado.getCodCita());
                    
                    LocalDate fechaHoraColoc = turnoBuscado.getFechaHoraColoca();
                    // Línea de código para transformar el dato LocalDate para cargarlo en el JCalendar
                    java.util.Date utilDate = java.util.Date.from(fechaHoraColoc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                    JDC_FechaHoraColoc.setDate(utilDate);

                    Vacuna vacunaAsociada = turnoBuscado.getNroSerieDosis();
                    
                    int numeroTurno = turnoBuscado.getCodCita();
                    cargarVacunaPorTurno(JC_NroSerieDosisAdmin, numeroTurno);
                    
                    JT_DniPacienteAdmin.setEditable(false);

                    BTN_BajaAltaTurno.setText("Aplicar DOSIS");
                    BTN_BajaAltaTurno.setEnabled(true);

                    // Aquí seleccionamos la hora en el JComboBox JCB_Horarios
                    LocalTime horaColoca = turnoBuscado.getHora();
                    String horaFormateada = horaColoca.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    JCB_Horarios.setSelectedItem(horaFormateada);
                    
                    // Obtenemos el número de serie de dosis seleccionado en el JComboBox
                    int nroSerie = Integer.parseInt(JT_Turno.getText());
                    
                    //Cargar el JComboBox JC_NroSerieDosisAdmin con el número de serie de dosis
                    cargarVacunaPorTurno(JC_NroSerieDosisAdmin, nroSerie);
                    
                    cargarNumerosDeTurnoPorDNI(JCB_NumTurno, dniCiudadano);
                    
                    JT_NroSerieVacunas.setText(vacunaAsociada.getNroSerieDosis() + "");
                    JC_NroSerieDosisAdmin.setEnabled(true);                  
                } else {
                    JOptionPane.showMessageDialog(null, "El turno no existe en las listas.\nIntenta con otro DNI.");
                    JT_DniPacienteAdmin.setText("");
                    BTN_BuscarTurno.setVisible(true);
                    desbloquearCamposAdmin(false);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error al convertir DNI.");
                desbloquearCamposAdmin(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "DNI no válido.");
            desbloquearCamposAdmin(false);
        }

    }//GEN-LAST:event_BTN_BuscarTurnoActionPerformed
    
    public void activarDesactivarComboBoxes(boolean seteo, JComboBox jcb1, JComboBox jcb2, JComboBox jcb3, JComboBox jcb4, JComboBox jcb5){
        jcb1.setEnabled(seteo);
        jcb2.setEnabled(seteo);
        jcb3.setEnabled(seteo);
        jcb4.setEnabled(seteo);
        jcb4.setEnabled(seteo);
    }
    
    public void reiniciarComboBoxes(JComboBox jcb1, JComboBox jcb2, JComboBox jcb3, JComboBox jcb4){
        jcb1.setSelectedIndex(0);
        jcb2.setSelectedIndex(0);
        jcb3.setSelectedIndex(0);
        jcb4.setSelectedIndex(0);
    }
    
    private void BTN_NuevoTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_NuevoTurnoActionPerformed
        
        Object[] options = {"Nuevo Turno", "Buscar Turno"};
        int choice = JOptionPane.showOptionDialog(null,
                "¿Qué quieres hacer?",
                "Elegir una opción",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);

        if (choice == JOptionPane.YES_OPTION) { //Opción que permite cargar un nuevo turno
            cargarVacunasComboBox(JC_NroSerieDosisAdmin);
            Color verde = new Color(0, 204, 0);
            LB_Admin.setVisible(true);
            limpiarCampos(IF_Admin, LB_Admin);
            activarDesactivarComboBoxes(true, JCB_Horarios, JCB_CentrosVacu, JCB_DosisAdmin, JC_NroSerieDosisAdmin, JCB_NumTurno);
            reiniciarComboBoxes(JCB_Horarios, JCB_CentrosVacu, JCB_DosisAdmin, JC_NroSerieDosisAdmin);
            LB_Admin.setText("Llenar todos los campos.");
            LB_Admin.setForeground(verde);
            JT_Turno.setVisible(false);
            LB_NumTurno.setVisible(false);
            
            // Código para guardar
            BTN_BajaAltaTurno.setText("Dar APLICACIÓN");
            BTN_BuscarTurno.setVisible(false);
            
            BTN_GuardarTurnoNuevo.setEnabled(true);
                        
            desbloquearCamposAdmin(true);
                        
        } else if (choice == JOptionPane.NO_OPTION) { //Opción que permite iniciar una búsqueda nueva de turno           
            limpiarCampos(IF_Admin, LB_EstadoPaciente);
            BTN_BuscarTurno.setEnabled(true);
            desbloquearCamposAdmin(true);
            JT_DniPacienteAdmin.setEditable(true);
            JT_Turno.setVisible(true);
            LB_NumTurno.setVisible(true);
            LB_turno.setText("");
            BTN_BajaAltaTurno.setText("APLICACIÓN DOSIS");
            BTN_BajaAltaTurno.setEnabled(false);
            reiniciarComboBoxes(JCB_Horarios, JCB_CentrosVacu, JCB_DosisAdmin, JC_NroSerieDosisAdmin);
            activarDesactivarComboBoxes(false, JCB_Horarios, JCB_CentrosVacu, JCB_DosisAdmin, JC_NroSerieDosisAdmin, JCB_NumTurno);
            BTN_GuardarTurnoNuevo.setEnabled(false);
            JDC_FechaHoraColoc.setDate(null);
            
            JC_NroSerieDosisAdmin.setEnabled(false);
            Color verde = new Color(0, 204, 0);
            LB_Admin.setVisible(true);
            LB_Admin.setText("Llenar el campo DNI.");
            LB_Admin.setForeground(verde);
            //desbloquearCamposAdmin(false);
            BTN_BuscarTurno.setVisible(true);
            
            //JOptionPane.showMessageDialog(null, "Seleccionaste Búsqueda Nueva");
            
        }
    }//GEN-LAST:event_BTN_NuevoTurnoActionPerformed

    private void BTN_ActualizarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ActualizarTurnoActionPerformed
        CitaVacunacionData citaData = new CitaVacunacionData();
        VacunaData vacuData = new VacunaData(); 
        
        String numDniPaciente = JT_DniPacienteAdmin.getText();
        //String numTurno = JT_Turno.getText();
        String codRefuerzo = (String) JCB_DosisAdmin.getSelectedItem();
        String centroVacu = (String) JCB_CentrosVacu.getSelectedItem();
        String nroSerieVacuna = JT_NroSerieVacunas.getText();

        // Convierte la fecha del JCalendar a LocalDate
        LocalDate fechaHoraColocacion = JDC_FechaHoraColoc.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        boolean dniValido = esNumeroDNI(numDniPaciente);
        //boolean turnoValido = esNumeroTurnoValido(numTurno);
        boolean serieValida = esNumeroDosisValido(nroSerieVacuna);

        List <JTextField> camposNum = new ArrayList<>();
        camposNum.add(JT_DniPacienteAdmin);        
        camposNum.add(JT_NroSerieVacunas);

        // Agregar validación de campos numéricos
        boolean camposNumericos = validarCamposNumericos(camposNum) && serieValida;

        if (dniValido && camposNumericos) {
            try {
                int dniCiudadano = Integer.parseInt(numDniPaciente);
                
                int nroSerieVacu = Integer.parseInt(nroSerieVacuna);
                // Buscar el turno por DNI y número de turno
                CitaVacunacion turnoEncontrado = citaData.buscarTurnoPorDniCiudadano(dniCiudadano);
                
                if (turnoEncontrado != null) {
                    int opcion = JOptionPane.showConfirmDialog(null, "¿Confirmar el turno?", "Confirmación", JOptionPane.YES_NO_OPTION);
                    if (opcion == JOptionPane.YES_OPTION) {
                        // Actualizar el turno existente
                        turnoEncontrado.setCodRefuerzo(codRefuerzo);
                        turnoEncontrado.setCentroVacunacion(centroVacu);
                        turnoEncontrado.setFechaHoraColoca(fechaHoraColocacion);

                        // Obtener una instancia de Vacuna desde VacunaData por su número de serie
                        Vacuna vacunaSeleccionada = vacuData.obtenerVacuna(nroSerieVacu);
                        turnoEncontrado.setNroSerieDosis(vacunaSeleccionada); // Asignar la instancia de Vacuna

                        citaData.modificarCitasVacunacion(turnoEncontrado);

                        // Restablecer campos y bloquear la edición
                        limpiarCampos(IF_Admin, LB_Admin);
                        desbloquearCamposAdmin(false);
                    }
                } 
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error al convertir DNI o número de turno.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Verifica los campos y que sean correctos.");
        }

    }//GEN-LAST:event_BTN_ActualizarTurnoActionPerformed
       
    private void JC_ConsultasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JC_ConsultasItemStateChanged
        CiudadanoData ciuData = new CiudadanoData();
        VacunaData vacuData = new VacunaData();
        LaboratorioData labData = new LaboratorioData();
        CitaVacunacionData citaData = new CitaVacunacionData();
        
        List <Ciudadano> listaCiudadanos = ciuData.listarCiudadanos();
        List <Vacuna> listaVacunas = vacuData.listarVacunas();
        List <Laboratorio> listaLaboratorios = labData.listarLaboratorios();
        List <CitaVacunacion> listaTurnos = citaData.listarCitasVacunacion();
        DefaultTableModel modeloTabla = (DefaultTableModel) JT_Consultas.getModel();
        
        modeloTabla.setColumnCount(0);
        
        switch (JC_Consultas.getSelectedIndex()) {
            case 1:
                armarCabeceraPaciente(modeloTabla, JT_Consultas);
                // Limpia la tabla (borra todas las filas existentes)
                modeloTabla.setRowCount(0);
                listaCiudadanos.forEach((paciente) -> {
                    // Agrega una fila con los datos del paciente en el mismo orden que las columnas
                    modeloTabla.addRow(new Object[]{paciente.getDni(), paciente.getApellido(), paciente.getNombre(), paciente.getCelular()});
                    centrarCeldas(JT_Consultas);
                    
                    // Actualiza la tabla para que se muestren los nuevos datos
                    modeloTabla.fireTableDataChanged();
                }); break;
            case 2:
                armarCabeceraLabs(modeloTabla, JT_Consultas);
                // Limpia la tabla (borra todas las filas existentes)
                modeloTabla.setRowCount(0);
                listaLaboratorios.forEach((lab) -> {
                    // Agrega una fila con los datos del laboratorio en el mismo orden que las columnas
                    modeloTabla.addRow(new Object[]{lab.getCuitLaboratorio(), lab.getNombreLab(), lab.getMail(), lab.getTelefono()});
                    centrarCeldas(JT_Consultas);
                    
                    // Actualiza la tabla para que se muestren los nuevos datos
                    modeloTabla.fireTableDataChanged();
                }); break;
            case 3:
                armarCabeceraVacs(modeloTabla, JT_Consultas);
                // Limpia la tabla (borra todas las filas existentes)
                modeloTabla.setRowCount(0);
                listaVacunas.forEach((vacuna) -> {
                    // Agrega una fila con los datos del paciente en el mismo orden que las columnas
                    modeloTabla.addRow(new Object[]{vacuna.getNroSerieDosis(), vacuna.getNombreVacuna(), vacuna.getCuitLaboratorio(), vacuna.getVencimiento()});
                    centrarCeldas(JT_Consultas);
                    
                    // Actualiza la tabla para que se muestren los nuevos datos
                    modeloTabla.fireTableDataChanged();
                }); break;
            case 4:
                armarCabeceraTurnos(modeloTabla, JT_Consultas);
                // Limpia la tabla (borra todas las filas existentes)
                modeloTabla.setRowCount(0);
                listaTurnos.forEach((turno) -> {
                    // Agrega una fila con los datos del paciente en el mismo orden que las columnas
                    modeloTabla.addRow(new Object[]{(turno.getCiudadano().getDni() + " - "  + turno.getCiudadano().getApellido()), turno.getCodCita(),
                        turno.getNroSerieDosis().getNroSerieDosis(), turno.getCentroVacunacion()});
                    centrarCeldas(JT_Consultas);
                    
                    // Actualiza la tabla para que se muestren los nuevos datos
                    modeloTabla.fireTableDataChanged();
                }); break;
            default:
                break;
        }
    }//GEN-LAST:event_JC_ConsultasItemStateChanged
    
    //Método que hago para probar algo específico
    private void JCB_CuitsLabsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JCB_CuitsLabsItemStateChanged
        
        Object selected = JCB_CuitsLabs.getSelectedItem();
    
        if (selected instanceof String) {
            String selectedItem = (String) selected;

            if ("LABORATORIOS INFO".equals(selectedItem)) {
                // No hacer nada si se selecciona "LABORATORIOS INFO"
            } else {
                // Realiza la conversión y actualización del JTextField
                String[] parts = selectedItem.split(" - ");
                if (parts.length == 2) {
                    int cuitLab = Integer.parseInt(parts[0]);
                    JT_CuitLabVacuna.setText(String.valueOf(cuitLab));
                }
            }
        }
    }//GEN-LAST:event_JCB_CuitsLabsItemStateChanged

    private void MI_DiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_DiaActionPerformed
        
        try {
            UIManager.setLookAndFeel(new FlatSolarizedLightIJTheme()); // Cambiar al tema diurno
            SwingUtilities.updateComponentTreeUI(VacunarGUI.this);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_MI_DiaActionPerformed

    private void MI_NocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_NocheActionPerformed
     
        try {
            UIManager.setLookAndFeel(new FlatCarbonIJTheme()); // Cambiar al tema diurno
            SwingUtilities.updateComponentTreeUI(VacunarGUI.this);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_MI_NocheActionPerformed

    private void JC_NroSerieDosisAdminItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JC_NroSerieDosisAdminItemStateChanged
        Object selected = JC_NroSerieDosisAdmin.getSelectedItem();
    
        if (selected instanceof String) {
            String selectedItem = (String) selected;

            if ("VACUNAS INFO".equals(selectedItem)) {
                // No hacer nada si se selecciona "VACUNAS INFO"
            } else {
                // Realiza la conversión y actualización del JTextField
                String[] parts = selectedItem.split(" - ");
                if (parts.length == 2) {
                    int numSerie = Integer.parseInt(parts[0]);
                    JT_NroSerieVacunas.setText(String.valueOf(numSerie));
                }
            }
        }
    }//GEN-LAST:event_JC_NroSerieDosisAdminItemStateChanged

    private void BTN_GuardarTurnoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_GuardarTurnoNuevoActionPerformed
        CitaVacunacionData citaData = new CitaVacunacionData();
        VacunaData vacuData = new VacunaData();

        String numDniPaciente = JT_DniPacienteAdmin.getText();
        String refDosis = (String) JCB_DosisAdmin.getSelectedItem();
        String vacunatorio = (String) JCB_CentrosVacu.getSelectedItem();
        String nroSerieVacuna = JT_NroSerieVacunas.getText();

        if (esNumeroDNI(numDniPaciente) && esNumeroDosisValido(nroSerieVacuna)) {
            try {
                int dniCiudadano = Integer.parseInt(numDniPaciente);
                int nroSerieVacu = Integer.parseInt(nroSerieVacuna);
                
                LocalDate fechaColocacion = JDC_FechaHoraColoc.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                
                // Agrega la hora seleccionada del JComboBox JCB_Horarios
                String horaSeleccionada = (String) JCB_Horarios.getSelectedItem();
                DateTimeFormatter horaFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

                // Parsea la cadena de hora a un objeto LocalTime
                LocalTime hora = LocalTime.parse(horaSeleccionada, horaFormatter);

                
                int opcion = JOptionPane.showConfirmDialog(null, "¿Confirmar el turno?", "Confirmación", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {
                    Ciudadano ciudadanoBuscado = new CiudadanoData().buscarCiudadanoPorDni(dniCiudadano);
                    Vacuna vacunaBuscada = vacuData.obtenerVacuna(nroSerieVacu);
                    
                    
                    
                    
                    CitaVacunacion nuevoTurno = new CitaVacunacion(ciudadanoBuscado, refDosis, vacunatorio, fechaColocacion, hora, vacunaBuscada, false);
                    citaData.guardarCitaVacunacion(nuevoTurno);

                    desbloquearCamposAdmin(false);
                }

                CitaVacunacion turnoCreado = citaData.buscarTurnoPorDniCiudadano(dniCiudadano);
                activarDesactivarComboBoxes(false, JCB_Horarios, JCB_CentrosVacu, JCB_DosisAdmin, JC_NroSerieDosisAdmin, JCB_NumTurno);
                JT_DniPacienteAdmin.setEnabled(false);
                LB_Admin.setText("Su turno es: ");
                LB_turno.setText("" + turnoCreado.getCodCita());

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error al convertir DNI o número de turno.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Verifica los campos y que sean correctos.");
        }
    }//GEN-LAST:event_BTN_GuardarTurnoNuevoActionPerformed

    private void BTN_BajaAltaTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BajaAltaTurnoActionPerformed
        CitaVacunacionData citaVacuData = new CitaVacunacionData();
        int numTurno = Integer.parseInt(JT_Turno.getText());
        
        citaVacuData.eliminarCitasVacunacion(numTurno);
        BTN_BajaAltaTurno.setEnabled(false);
    }//GEN-LAST:event_BTN_BajaAltaTurnoActionPerformed
       
    private void armarCabeceraPaciente(DefaultTableModel tabla, JTable jT_tablin){

        tabla.addColumn("DNI");
        tabla.addColumn("APELLIDO");
        tabla.addColumn("NOMBRE");
        tabla.addColumn("CELULAR");

        jT_tablin.setModel(tabla);
    }
    
    private void armarCabeceraLabs(DefaultTableModel tabla, JTable jT_tablin){

        tabla.addColumn("CUIT");
        tabla.addColumn("NOMBRE");
        tabla.addColumn("MAIL");
        tabla.addColumn("TELEFONO");

        jT_tablin.setModel(tabla);
    }
    
    private void armarCabeceraVacs(DefaultTableModel tabla, JTable jT_tablin){

        tabla.addColumn("NUM SERIE");
        tabla.addColumn("NOMBRE");
        tabla.addColumn("CUIT LAB");
        tabla.addColumn("VENCIMIENTO");

        jT_tablin.setModel(tabla);
    }
    
    private void armarCabeceraTurnos(DefaultTableModel tabla, JTable jT_tablin){

        tabla.addColumn("DNI PACIENTE");
        tabla.addColumn("NUM TURNO");
        tabla.addColumn("NUM SERIE");
        tabla.addColumn("LUGAR");

        jT_tablin.setModel(tabla);
    }
    
    private void centrarCeldas(JTable tabla){
        // Configurar el centrado de las celdas en la tabla
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        
        // Aplicar el centrado a todas las columnas de la tabla
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }        
    }
    
    private void limpiarCampos(JInternalFrame internalFrame, JLabel labelALimpiar) {
        if (internalFrame != null) {
            Component[] components = internalFrame.getContentPane().getComponents();
            for (Component component : components) {
                if (component instanceof JTextField) {
                    JTextField textField = (JTextField) component;
                    textField.setText("");
                } else if (component instanceof JRadioButton) {
                    JRadioButton radioButton = (JRadioButton) component;
                    radioButton.setSelected(false);
                } else if (component == labelALimpiar) {
                    if (labelALimpiar instanceof JLabel) {
                        JLabel label = (JLabel) labelALimpiar;
                        label.setText("");
                    }
                }
            }
        }
    }

    public static boolean esNumeroDNI(String str) {

        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío
            JOptionPane.showMessageDialog(null, "Campo DNI debe llenarse.");
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each para eso
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, "Campo DNI debe contener solo números.");
                return false; // No es un número válido.
            }
        }

        try {
            int dni = Integer.parseInt(str); // Intenta convertir a entero.
            if (dni > 4000000 && dni < 999999999) {
                return true; // Es un número válido y está dentro del rango.
            } else {
                JOptionPane.showMessageDialog(null, "El campo DNI debe cumplir con un formato válido.");
                return false; // No está dentro del rango.
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo DNI debe ser un número válido.");
            return false; // No se pudo convertir a entero.
        }
    }
    
    public static boolean esNumeroTurnoValido(String str) {

        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío
            JOptionPane.showMessageDialog(null, "Campo Turno debe llenarse.");
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each para eso
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, "Campo Turno debe contener solo números.");
                return false; // No es un número válido.
            }
        }

        try {
            int turno = Integer.parseInt(str); // Intenta convertir a entero.
            if (turno > 0 && turno < 999999999) {
                return true; // Es un número válido y está dentro del rango.
            } else {
                JOptionPane.showMessageDialog(null, "El campo Turno debe cumplir con un formato válido.");
                return false; // No está dentro del rango.
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo Turno debe ser un número válido.");
            return false; // No se pudo convertir a entero.
        }
    }
    
    public static boolean esNumeroDosisValido(String str) {

        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío
            JOptionPane.showMessageDialog(null, "Campo Nro Serie Dosis debe llenarse.");
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each para eso
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, "Campo Nro Serie Dosis debe contener solo números.");
                return false; // No es un número válido.
            }
        }

        try {
            int dni = Integer.parseInt(str); // Intenta convertir a entero.
            if (dni > 10000 && dni < 999999999) {
                return true; // Es un número válido y está dentro del rango.
            } else {
                JOptionPane.showMessageDialog(null, "El campo Nro Serie Dosis debe cumplir con un formato válido.");
                return false; // No está dentro del rango.
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo Nro Serie Dosis debe ser un número válido.");
            return false; // No se pudo convertir a entero.
        }
    }
    
    public static boolean esCuitValido(String str) {

        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío
            JOptionPane.showMessageDialog(null, "Campo Cuit debe llenarse.");
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each para eso
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, "Campo Cuit debe contener solo números.");
                return false; // No es un número válido.
            }
        }

        try {
            int dni = Integer.parseInt(str); // Intenta convertir a entero.
            if (dni > 10000000 && dni < 999999999) {
                return true; // Es un número válido y está dentro del rango.
            } else {
                JOptionPane.showMessageDialog(null, "El campo Cuit debe cumplir con un formato válido.");
                return false; // No está dentro del rango.
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo Cuit debe ser un número válido.");
            return false; // No se pudo convertir a entero.
        }
    }
    
    public static boolean esNumeroValido(String str) {

        if (str == null || str.isEmpty()) { // Evalúa que no sea un campo vacío            
            return false;
        }

        for (char c : str.toCharArray()) { // Evalúa que no contenga carácteres, uso un for each para eso
            if (!Character.isDigit(c)) {
                JOptionPane.showMessageDialog(null, "Campo DNI y Edad debe contener solo números.");
                return false; // No es un número válido.
            }
        }

        try {
            int num = Integer.parseInt(str); // Intenta convertir a entero.
            return num > 0 && num < 150;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo Edad debe ser un valor acorde.");
            return false; // No se pudo convertir a entero.
        }
    }
    
    public boolean validarCamposAlfabeticos(List<JTextField> campos) {
        for (JTextField campo : campos) {
            String textoCampo = campo.getText().trim(); // Elimina espacios en blanco al principio y al final.

            if (!textoCampo.matches("^[a-zA-Z@-ZáéíóúÁÉÍÓÚüÜñÑ1234567890'+'-'.\\s]+$")) {
                JOptionPane.showMessageDialog(null, "El campo " + campo.getName() + " debe contener solo letras, el símbolo '@' o espacios.");
                return false;
            }
        }

        return true; // Todos los campos son válidos.
    }
    
    public boolean validarCamposNumericos(List<JTextField> campos) {
        for (JTextField campo : campos) {
            String textoCampo = campo.getText().trim(); // Elimina espacios en blanco al principio y al final.

            if (!textoCampo.matches("^[0-9]+$")) {
                JOptionPane.showMessageDialog(null, "El campo " + campo.getName() + " debe contener solo números.");
                return false;
            }
        }

        return true; // Todos los campos son válidos.
    }
        
    private void cargarLabsComboBox(JComboBox combo) {
        LaboratorioData labData = new LaboratorioData();

        // Obtener la lista de laboratorios
        List<Laboratorio> listaLabs = labData.listarLaboratorios();

        combo.removeAllItems();

        // Agregar un elemento no seleccionable como opción inicial
        combo.addItem("LABORATORIOS INFO");

        // Agregar los elementos al JComboBox
        for (Laboratorio lab : listaLabs) {
            combo.addItem(lab.getCuitLaboratorio() + " - " + lab.getNombreLab());
        }

    }

    
    private void cargarVacunasComboBox(JComboBox combo) {
        VacunaData vacuData = new VacunaData();

        // Obtener la lista de vacunas
        List<Vacuna> listaVacunas = vacuData.listarVacunas();

        combo.removeAllItems();

        // Agregar un elemento no seleccionable como opción inicial
        combo.addItem("VACUNAS INFO");

        // Agregar los elementos reales al JComboBox
        for (Vacuna vac : listaVacunas) {
            combo.addItem(vac.getNroSerieDosis() + " - " + vac.getNombreVacuna());
        }
    }
    
    private void cargarVacunaPorTurno(JComboBox combo, int numeroTurno) {
        VacunaData vacuData = new VacunaData();
        CitaVacunacionData citaVacuData = new CitaVacunacionData();

        // Obtener el turno por número de turno
        CitaVacunacion turnoEncontrado = citaVacuData.buscarTurnoPorNumero(numeroTurno);

        combo.removeAllItems();

        // Agregar un elemento no seleccionable como opción inicial
        combo.addItem("VACUNAS INFO");

        // Obtener la lista de todas las vacunas
        List<Vacuna> listaVacunas = vacuData.listarVacunas();

        // Agregar los elementos reales al JComboBox
        for (Vacuna vac : listaVacunas) {
            combo.addItem(vac.getNroSerieDosis());
        }

        if (turnoEncontrado != null) {
            // Seleccionar la vacuna asociada al turno en el JComboBox
            Vacuna vacunaAsociada = turnoEncontrado.getNroSerieDosis();
            combo.setSelectedItem(vacunaAsociada.getNroSerieDosis());
        } else {
            // Manejo de error si no se encuentra el turno
            JOptionPane.showMessageDialog(null, "El turno no existe en las listas.\nIntenta con otro número de turno.");
        }
    }
    
    private void cargarNumerosDeTurnoPorDNI(JComboBox combo, int dniCiudadano) {
        CitaVacunacionData citaVacuData = new CitaVacunacionData();

        // Obtener la lista de números de turno asociados al DNI
        List<CitaVacunacion> numerosDeTurno = citaVacuData.listarTurnosPorDNI(dniCiudadano);

        combo.removeAllItems();

        // Agregar un elemento no seleccionable como opción inicial
        combo.addItem("OTROS TURNOS");

        // Agregar los números de turno al JComboBox
        for (CitaVacunacion numeroTurno : numerosDeTurno) {
            combo.addItem(numeroTurno.getCodCita());
        }

        // Realiza la validación y habilita o deshabilita el JComboBox
        if (numerosDeTurno.size() == 1) {
            combo.setEnabled(false);
        } else {
            combo.setEnabled(true);
        }
    }

       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        FlatCarbonIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VacunarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_ActualizarTurno;
    private javax.swing.JButton BTN_BajaAltaTurno;
    private javax.swing.JButton BTN_BuscarLab;
    private javax.swing.JButton BTN_BuscarPaciente;
    private javax.swing.JButton BTN_BuscarTurno;
    private javax.swing.JButton BTN_BuscarVacuna;
    private javax.swing.JButton BTN_GuardarActualizarLab;
    private javax.swing.JButton BTN_GuardarActualizarPaciente;
    private javax.swing.JButton BTN_GuardarActualizarVacuna;
    private javax.swing.JButton BTN_GuardarTurnoNuevo;
    private javax.swing.JButton BTN_NuevaVacuna;
    private javax.swing.JButton BTN_NuevoLab;
    private javax.swing.JButton BTN_NuevoPaciente;
    private javax.swing.JButton BTN_NuevoTurno;
    private javax.swing.JInternalFrame IF_Admin;
    private javax.swing.JInternalFrame IF_Ayuda;
    private javax.swing.JInternalFrame IF_Consultas;
    private javax.swing.JInternalFrame IF_Laboratorio;
    private javax.swing.JInternalFrame IF_Paciente;
    private javax.swing.JInternalFrame IF_Vacuna;
    private javax.swing.JComboBox<String> JCB_CentrosVacu;
    private javax.swing.JComboBox<String> JCB_CuitsLabs;
    private javax.swing.JComboBox<String> JCB_DosisAdmin;
    private javax.swing.JComboBox<String> JCB_Horarios;
    private javax.swing.JComboBox<String> JCB_NumTurno;
    private javax.swing.JComboBox<String> JC_Consultas;
    private javax.swing.JComboBox<String> JC_NroSerieDosisAdmin;
    private com.toedter.calendar.JDateChooser JDC_FechaHoraColoc;
    private com.toedter.calendar.JDateChooser JDC_VencimientoVacuna;
    private javax.swing.JLabel JL_Lab;
    private javax.swing.JMenu JM_Admin;
    private javax.swing.JMenu JM_Ayuda;
    private javax.swing.JMenu JM_Consultas;
    private javax.swing.JMenu JM_Laboratorio;
    private javax.swing.JMenu JM_Paciente;
    private javax.swing.JMenu JM_Salir;
    private javax.swing.JMenu JM_Temas;
    private javax.swing.JMenu JM_Vacuna;
    private javax.swing.JTextField JT_Apellido;
    private javax.swing.JTextField JT_Celular;
    private javax.swing.JTable JT_Consultas;
    private javax.swing.JTextField JT_CuitLab;
    private javax.swing.JTextField JT_CuitLabVacuna;
    private javax.swing.JTextField JT_DNI;
    private javax.swing.JTextField JT_DniPacienteAdmin;
    private javax.swing.JTextField JT_DomComLab;
    private javax.swing.JTextField JT_Edad;
    private javax.swing.JTextField JT_Email;
    private javax.swing.JTextField JT_EmailLab;
    private javax.swing.JTextField JT_MarcaVacuna;
    private javax.swing.JTextField JT_Medida;
    private javax.swing.JTextField JT_NomVacuna;
    private javax.swing.JTextField JT_Nombre;
    private javax.swing.JTextField JT_NombreLab;
    private javax.swing.JTextField JT_NroSerieVacunas;
    private javax.swing.JTextField JT_Ocupacion;
    private javax.swing.JTextField JT_PaisLab;
    private javax.swing.JTextField JT_Patologia;
    private javax.swing.JTextField JT_ResponsableLegal;
    private javax.swing.JTextField JT_SerieDosis;
    private javax.swing.JTextField JT_TelefonoLab;
    private javax.swing.JTextField JT_Turno;
    private javax.swing.JLabel LB_Admin;
    private javax.swing.JLabel LB_EstadoPaciente;
    private javax.swing.JLabel LB_EstadoVacuna;
    private javax.swing.JLabel LB_NumTurno;
    private javax.swing.JLabel LB_turno;
    private javax.swing.JMenuItem MI_Ayuda;
    private javax.swing.JMenuItem MI_Dia;
    private javax.swing.JMenuItem MI_Noche;
    private javax.swing.JMenuItem MI_Paciente;
    private javax.swing.JMenuItem MI_Salir;
    private javax.swing.JMenuItem MI_Turno;
    private javax.swing.JMenuItem MI_Turnos;
    private javax.swing.JMenuItem MI_Vac;
    private javax.swing.JMenuItem MI_lab;
    private javax.swing.JMenuBar MenuFlotante;
    private javax.swing.JRadioButton RB_EstadoPaciente;
    private javax.swing.JRadioButton RB_EstadoVacuna;
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
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    public void activarBotonSiTextoIngresado(JButton boton, List<Component> campos) {
        boolean todosCamposLlenos = true;

        for (Component campo : campos) {
            if (campo instanceof JTextField) {
                JTextField textField = (JTextField) campo;
                if (textField.getText().trim().isEmpty()) {
                    todosCamposLlenos = false;
                    break; // No es necesario verificar más campos si uno está vacío
                }
            } else if (campo instanceof JComboBox) {
                JComboBox<?> comboBox = (JComboBox<?>) campo;
                if (comboBox.getSelectedIndex() == -1) {
                    todosCamposLlenos = false;
                    break; // No es necesario verificar más campos si uno no tiene ítem seleccionado
                }
            }
        }

        boton.setEnabled(todosCamposLlenos);
    }
         
}
