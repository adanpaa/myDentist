package mydentist;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
    }

    public static final String URL = "jdbc:mysql://localhost:33065/mydentist?serverTimezone=UTC";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    PreparedStatement ps;
    ResultSet rs;
    Connection con = getConnection();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txtAP1 = new javax.swing.JTextField();
        txtAM1 = new javax.swing.JTextField();
        txtEdad1 = new javax.swing.JTextField();
        CbxG1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        txtDomicilio1 = new javax.swing.JTextField();
        txtColonia1 = new javax.swing.JTextField();
        txtLocalidad1 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTM1 = new javax.swing.JTextField();
        txtAler1 = new javax.swing.JTextField();
        txtHemo1 = new javax.swing.JTextField();
        radioB1 = new javax.swing.JRadioButton();
        radioB2 = new javax.swing.JRadioButton();
        radioB3 = new javax.swing.JRadioButton();
        radioB4 = new javax.swing.JRadioButton();
        radioB5 = new javax.swing.JRadioButton();
        radioB6 = new javax.swing.JRadioButton();
        radioB7 = new javax.swing.JRadioButton();
        radioB8 = new javax.swing.JRadioButton();
        radioB9 = new javax.swing.JRadioButton();
        radioB10 = new javax.swing.JRadioButton();
        checkB1 = new javax.swing.JCheckBox();
        checkB2 = new javax.swing.JCheckBox();
        checkB3 = new javax.swing.JCheckBox();
        checkB4 = new javax.swing.JCheckBox();
        checkB5 = new javax.swing.JCheckBox();
        checkB6 = new javax.swing.JCheckBox();
        checkB7 = new javax.swing.JCheckBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtPadecido = new javax.swing.JTextField();
        txtTemporo = new javax.swing.JTextField();
        txtEmbarazo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtPA = new javax.swing.JTextField();
        txtFR = new javax.swing.JTextField();
        txtFC = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        radioB11 = new javax.swing.JRadioButton();
        radioB12 = new javax.swing.JRadioButton();
        radioB13 = new javax.swing.JRadioButton();
        radioB14 = new javax.swing.JRadioButton();
        radioB15 = new javax.swing.JRadioButton();
        radioB16 = new javax.swing.JRadioButton();
        radioB17 = new javax.swing.JRadioButton();
        radioB18 = new javax.swing.JRadioButton();
        txtDiabetes = new javax.swing.JTextField();
        txtHipertension = new javax.swing.JTextField();
        txtProblemasC = new javax.swing.JTextField();
        txtCancer = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaD = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaPT = new javax.swing.JTextArea();
        txtPresupuesto = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btnAgregarPaciente = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        txtAP2 = new javax.swing.JTextField();
        txtAM2 = new javax.swing.JTextField();
        txtEdad2 = new javax.swing.JTextField();
        cboxG2 = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        txtTelefono2 = new javax.swing.JTextField();
        txtDomicilio2 = new javax.swing.JTextField();
        txtColonia2 = new javax.swing.JTextField();
        txtLocalidad2 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        txtBuscarNom = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        txtBuscarAP = new javax.swing.JTextField();
        jLabel112 = new javax.swing.JLabel();
        txtBuscarAM = new javax.swing.JTextField();
        btnBuscarDP = new javax.swing.JButton();
        jTextField79 = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        txtPA2 = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        txtFR2 = new javax.swing.JTextField();
        txtFC2 = new javax.swing.JTextField();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaD2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaPT2 = new javax.swing.JTextArea();
        txtPresupuesto2 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        btnEditarPaciente = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel21 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        txtNombre3 = new javax.swing.JTextField();
        txtAP3 = new javax.swing.JTextField();
        txtAM3 = new javax.swing.JTextField();
        txtEdad3 = new javax.swing.JTextField();
        cboxG3 = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        txtTelefono3 = new javax.swing.JTextField();
        txtDomicilio3 = new javax.swing.JTextField();
        txtColonia3 = new javax.swing.JTextField();
        txtLocalidad3 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        txtTM2 = new javax.swing.JTextField();
        txtAler2 = new javax.swing.JTextField();
        txtHemo2 = new javax.swing.JTextField();
        radioB37 = new javax.swing.JRadioButton();
        radioB38 = new javax.swing.JRadioButton();
        radioB39 = new javax.swing.JRadioButton();
        radioB40 = new javax.swing.JRadioButton();
        radioB41 = new javax.swing.JRadioButton();
        radioB42 = new javax.swing.JRadioButton();
        radioB43 = new javax.swing.JRadioButton();
        radioB44 = new javax.swing.JRadioButton();
        radioB45 = new javax.swing.JRadioButton();
        radioB46 = new javax.swing.JRadioButton();
        checkB8 = new javax.swing.JCheckBox();
        checkB9 = new javax.swing.JCheckBox();
        checkB10 = new javax.swing.JCheckBox();
        checkB11 = new javax.swing.JCheckBox();
        checkB12 = new javax.swing.JCheckBox();
        checkB13 = new javax.swing.JCheckBox();
        checkB14 = new javax.swing.JCheckBox();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        txtPadecido2 = new javax.swing.JTextField();
        txtTemporo2 = new javax.swing.JTextField();
        txtEmbarazo2 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        txtPA3 = new javax.swing.JTextField();
        txtFR3 = new javax.swing.JTextField();
        txtFC3 = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        radioB47 = new javax.swing.JRadioButton();
        radioB48 = new javax.swing.JRadioButton();
        radioB49 = new javax.swing.JRadioButton();
        radioB50 = new javax.swing.JRadioButton();
        radioB51 = new javax.swing.JRadioButton();
        radioB52 = new javax.swing.JRadioButton();
        radioB53 = new javax.swing.JRadioButton();
        radioB54 = new javax.swing.JRadioButton();
        txtDiabetes2 = new javax.swing.JTextField();
        txtHipertension2 = new javax.swing.JTextField();
        txtProblemasC2 = new javax.swing.JTextField();
        txtCancer2 = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaD3 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaPT3 = new javax.swing.JTextArea();
        txtPresupuesto3 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        btnAgregarPaciente3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel26 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        txtNombre4 = new javax.swing.JTextField();
        txtAP4 = new javax.swing.JTextField();
        txtAM4 = new javax.swing.JTextField();
        txtEdad4 = new javax.swing.JTextField();
        cboxG4 = new javax.swing.JComboBox<>();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        txtTelefono4 = new javax.swing.JTextField();
        txtDomicilio4 = new javax.swing.JTextField();
        txtColonia4 = new javax.swing.JTextField();
        txtLocalidad4 = new javax.swing.JTextField();
<<<<<<< Updated upstream
        jButton1 = new javax.swing.JButton();
        jLabel117 = new javax.swing.JLabel();
        txtNombre5 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        txtAP5 = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        txtAM5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
=======
        jLabel109 = new javax.swing.JLabel();
        jTextField75 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
>>>>>>> Stashed changes
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido Paterno");

        jLabel3.setText("Apellido Materno");

        jLabel4.setText("Genero");

        jLabel5.setText("Edad");

        CbxG1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "H" }));

        jLabel6.setText("Telefono");

        jLabel7.setText("Domicilio");

        jLabel8.setText("Colonia");

        jLabel9.setText("Localidad");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAP1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbxG1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAM1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(156, 156, 156)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLocalidad1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txtColonia1)
                    .addComponent(txtDomicilio1)
                    .addComponent(txtTelefono1))
                .addContainerGap(827, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel1))
                                    .addComponent(jLabel6))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtAP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtAM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDomicilio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txtColonia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(CbxG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtLocalidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        jTabbedPane3.addTab("Datos Personales", jPanel11);

        jLabel10.setText("¿Esta Bajo Tratamiento Medico?");

        jLabel11.setText("¿Es Usted Alergico A La Penicilina U Otro Medicamento?");

        jLabel12.setText("¿A Tenido Alguna Hemorragia Excesiva Que Requirio Tratamiento Especial?");

        jLabel13.setText("¿Sufre Frecuentemente Dolor De Dientes?");

        jLabel14.setText("¿Lo Han Anestesiado Anteriormente En La Boca?");

        jLabel15.setText("¿Ha Tenido Complicaciones Con La Anestesia?");

        jLabel16.setText("¿Padece O Ha Padecido De Alguna De Estas Enfermedades?");

        jLabel17.setText("¿Fuma?");

        jLabel18.setText("¿Padece Convulsiones?");

        txtAler1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAler1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioB1);
        radioB1.setText("Si");

        buttonGroup1.add(radioB2);
        radioB2.setText("No");

        buttonGroup2.add(radioB3);
        radioB3.setText("Si");

        buttonGroup2.add(radioB4);
        radioB4.setText("No");

        buttonGroup3.add(radioB5);
        radioB5.setText("Si");

        buttonGroup3.add(radioB6);
        radioB6.setText("No");

        buttonGroup4.add(radioB7);
        radioB7.setText("Si");

        buttonGroup4.add(radioB8);
        radioB8.setText("No");

        buttonGroup5.add(radioB9);
        radioB9.setText("Si");

        buttonGroup5.add(radioB10);
        radioB10.setText("No");

        checkB1.setText("Fiebre Reumatica");

        checkB2.setText("Afeccion Renal");

        checkB3.setText("Asma");

        checkB4.setText("Hipertension Arterial");

        checkB5.setText("VIH/SIDA");

        checkB6.setText("Anemia");

        checkB7.setText("Hepatitis");

        jLabel19.setText("¿Alguna Enfermedad Que Haya Padecido Y No Se Haya Mencion?");

        jLabel20.setText("¿Ha Presentado Algun Problema Con La Articulacion Temporomandibular?");

        jLabel21.setText("Embarazo");

        jLabel22.setText("Signos Vitales");

        jLabel23.setText("Presion Arterial");

        jLabel24.setText("Frecuencia Respiratoria");

        jLabel25.setText("Frecuencia Cardiaca");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAler1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioB9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioB10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(radioB1)
                                .addGap(18, 18, 18)
                                .addComponent(radioB2))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(radioB3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioB4))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioB5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioB6))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioB7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioB8))
                            .addComponent(jLabel16)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(checkB3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkB1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(checkB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkB7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkB6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkB5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(checkB4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTM1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHemo1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFC))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPA, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFR, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel22))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(txtEmbarazo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPadecido, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                    .addComponent(txtTemporo))))))
                .addGap(132, 132, 132))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTM1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(txtPadecido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtAler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtTemporo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHemo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtEmbarazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(radioB1)
                    .addComponent(radioB2))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radioB3)
                                .addComponent(radioB4))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel22)))
                .addGap(2, 2, 2)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radioB5)
                        .addComponent(radioB6))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(radioB7)
                    .addComponent(radioB8)
                    .addComponent(jLabel24)
                    .addComponent(txtFR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioB9)
                    .addComponent(radioB10)
                    .addComponent(jLabel25)
                    .addComponent(txtFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkB1)
                    .addComponent(checkB5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkB2)
                    .addComponent(checkB6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkB3)
                    .addComponent(checkB7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkB4)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Antecedentes Medicos", jPanel12);

        jLabel26.setText("Algun Miembro De Su Familia A Padecido O Padece De:");

        jLabel27.setText("¿Diabetes?");

        jLabel28.setText("¿Hipertension Arterial?");

        jLabel29.setText("¿Problemas Cardiacos?");

        jLabel30.setText("¿Cancer?");

        buttonGroup6.add(radioB11);
        radioB11.setText("Si");

        buttonGroup6.add(radioB12);
        radioB12.setText("No");

        buttonGroup7.add(radioB13);
        radioB13.setText("Si");

        buttonGroup7.add(radioB14);
        radioB14.setText("No");

        buttonGroup8.add(radioB15);
        radioB15.setText("Si");

        buttonGroup8.add(radioB16);
        radioB16.setText("No");

        buttonGroup9.add(radioB17);
        radioB17.setText("Si");

        buttonGroup9.add(radioB18);
        radioB18.setText("No");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioB17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioB18, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(radioB11))
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(radioB13)
                                .addGap(18, 18, 18)
                                .addComponent(radioB14)
                                .addGap(27, 27, 27)
                                .addComponent(txtHipertension))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCancer, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(radioB12)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(radioB15)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioB16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtProblemasC, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(1054, 1054, 1054))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addGap(25, 25, 25)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(radioB11)
                    .addComponent(radioB12)
                    .addComponent(txtDiabetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(radioB13)
                    .addComponent(radioB14)
                    .addComponent(txtHipertension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioB15)
                        .addComponent(radioB16)
                        .addComponent(txtProblemasC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(radioB17)
                    .addComponent(radioB18)
                    .addComponent(txtCancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Antecedentes Familiares", jPanel13);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("Odontograma", jPanel14);

        txtAreaD.setColumns(20);
        txtAreaD.setRows(5);
        jScrollPane1.setViewportView(txtAreaD);

        txtAreaPT.setColumns(20);
        txtAreaPT.setRows(5);
        jScrollPane2.setViewportView(txtAreaPT);

        jLabel31.setText("Diagnostico");

        jLabel32.setText("Plan De Tratamiento");

        jLabel33.setText("Presupuesto");

        btnAgregarPaciente.setText("Agregar Paciente");
        btnAgregarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addComponent(txtPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(28, 28, 28)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(35, 35, 35)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(12, 12, 12)
                .addComponent(btnAgregarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Diagnostico y Tratamiento", jPanel15);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Agregar Paciente", jPanel6);

        jLabel34.setText("Nombre");

        jLabel35.setText("Apellido Paterno");

        jLabel36.setText("Apellido Materno");

        jLabel37.setText("Genero");

        jLabel38.setText("Edad");

        cboxG2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "H" }));

        jLabel39.setText("Telefono");

        jLabel40.setText("Domicilio");

        jLabel41.setText("Colonia");

        jLabel42.setText("Localidad");

        jLabel110.setText("Nombre");

        jLabel111.setText("Apellido Paterno");

        jLabel112.setText("Apellido Materno");

        btnBuscarDP.setText("BUSCAR");
        btnBuscarDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDPActionPerformed(evt);
            }
        });

        jTextField79.setEditable(false);

        jLabel113.setText("Presion Arterial");

        jLabel114.setText("Signos Vitales");

        jLabel115.setText("Frecuencia Cardiaca");

        jLabel116.setText("Frecuencia Respiratoria");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtAP2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtAM2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(cboxG2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(170, 170, 170)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(txtEdad2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtLocalidad2)
                                .addComponent(txtColonia2)
                                .addComponent(txtDomicilio2)
                                .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarNom, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarAP, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarAM, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnBuscarDP))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFC2))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPA2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFR2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))))
<<<<<<< Updated upstream
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addContainerGap(146, Short.MAX_VALUE))
>>>>>>> Stashed changes
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel114)
                .addGap(275, 275, 275))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel110))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscarAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel111))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel112)
                            .addComponent(txtBuscarAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarDP))))
                .addGap(90, 90, 90)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel34))
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel39)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel35))
                                    .addComponent(txtAP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel36))
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtAM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel41))))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDomicilio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(txtColonia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cboxG2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel42)
                                .addComponent(txtLocalidad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel114)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel113)
                            .addComponent(txtPA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel116)
                            .addComponent(txtFR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel115)
                            .addComponent(txtFC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel38))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEdad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
<<<<<<< Updated upstream
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addContainerGap(273, Short.MAX_VALUE))
>>>>>>> Stashed changes
        );

        jTabbedPane4.addTab("Datos Personales", jPanel16);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Odontograma", jPanel19);

        txtAreaD2.setColumns(20);
        txtAreaD2.setRows(5);
        jScrollPane3.setViewportView(txtAreaD2);

        txtAreaPT2.setColumns(20);
        txtAreaPT2.setRows(5);
        jScrollPane4.setViewportView(txtAreaPT2);

        jLabel64.setText("Diagnostico");

        jLabel65.setText("Plan De Tratamiento");

        jLabel66.setText("Presupuesto");

        btnEditarPaciente.setText("Editar Paciente");
        btnEditarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                        .addComponent(jScrollPane3))
                    .addComponent(txtPresupuesto2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addGap(28, 28, 28)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addGap(35, 35, 35)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPresupuesto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addGap(12, 12, 12)
                .addComponent(btnEditarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Diagnostico y Tratamiento", jPanel20);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPane2.addTab("Editar Paciente", jPanel7);

        jLabel67.setText("Nombre");

        jLabel68.setText("Apellido Paterno");

        jLabel69.setText("Apellido Materno");

        jLabel70.setText("Genero");

        jLabel71.setText("Edad");

        cboxG3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "H" }));

        jLabel72.setText("Telefono");

        jLabel73.setText("Domicilio");

        jLabel74.setText("Colonia");

        jLabel75.setText("Localidad");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEdad3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAM3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboxG3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAP3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(156, 156, 156)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLocalidad3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(txtColonia3)
                    .addComponent(txtDomicilio3)
                    .addComponent(txtTelefono3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel67)
                                    .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel72))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel68)
                                    .addComponent(txtAP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel73))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel69)
                                    .addComponent(txtAM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel74)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(txtTelefono3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDomicilio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txtColonia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel70)
                        .addComponent(cboxG3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel75)
                        .addComponent(txtLocalidad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(txtEdad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        jTabbedPane5.addTab("Datos Personales", jPanel21);

        jLabel76.setText("¿Esta Bajo Tratamiento Medico?");

        jLabel77.setText("¿Es Usted Alergico A La Penicilina U Otro Medicamento?");

        jLabel78.setText("¿A Tenido Alguna Hemorragia Excesiva Que Requirio Tratamiento Especial?");

        jLabel79.setText("¿Sufre Frecuentemente Dolor De Dientes?");

        jLabel80.setText("¿Lo Han Anestesiado Anteriormente En La Boca?");

        jLabel81.setText("¿Ha Tenido Complicaciones Con La Anestesia?");

        jLabel82.setText("¿Padece O Ha Padecido De Alguna De Estas Enfermedades?");

        jLabel83.setText("¿Fuma?");

        jLabel84.setText("¿Padece Convulsiones?");

        buttonGroup1.add(radioB37);
        radioB37.setText("Si");

        buttonGroup1.add(radioB38);
        radioB38.setText("No");

        buttonGroup2.add(radioB39);
        radioB39.setText("Si");

        buttonGroup2.add(radioB40);
        radioB40.setText("No");

        buttonGroup3.add(radioB41);
        radioB41.setText("Si");

        buttonGroup3.add(radioB42);
        radioB42.setText("No");

        buttonGroup4.add(radioB43);
        radioB43.setText("Si");

        buttonGroup4.add(radioB44);
        radioB44.setText("No");

        buttonGroup5.add(radioB45);
        radioB45.setText("Si");

        buttonGroup5.add(radioB46);
        radioB46.setText("No");

        checkB8.setText("Fiebre Reumatica");

        checkB9.setText("Afeccion Renal");

        checkB10.setText("Asma");

        checkB11.setText("Hipertension Arterial");

        checkB12.setText("VIH/SIDA");

        checkB13.setText("Anemia");

        checkB14.setText("Hepatitis");

        jLabel85.setText("¿Alguna Enfermedad Que Haya Padecido Y No Se Haya Mencion?");

        jLabel86.setText("¿Ha Presentado Algun Problema Con La Articulacion Temporomandibular?");

        jLabel87.setText("Embarazo");

        jLabel88.setText("Signos Vitales");

        jLabel89.setText("Presion Arterial");

        jLabel90.setText("Frecuencia Respiratoria");

        jLabel91.setText("Frecuencia Cardiaca");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioB45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioB46, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addGap(34, 34, 34)
                        .addComponent(txtTM2, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAler2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addGap(18, 18, 18)
                        .addComponent(radioB37)
                        .addGap(18, 18, 18)
                        .addComponent(radioB38))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addGap(18, 18, 18)
                        .addComponent(radioB39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioB40))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioB41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioB42))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel84)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioB43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioB44))
                    .addComponent(jLabel82)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkB10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkB8, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(checkB9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkB14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkB13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkB12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(checkB11)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHemo2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmbarazo2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPadecido2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTemporo2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(120, 120, 120)
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFR3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPA3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFC3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel88)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85)
                    .addComponent(txtPadecido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(txtAler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86)
                    .addComponent(txtTemporo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHemo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87)
                    .addComponent(txtEmbarazo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(radioB37)
                    .addComponent(radioB38))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(radioB39)
                                .addComponent(radioB40))))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel88)))
                .addGap(2, 2, 2)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(radioB41)
                        .addComponent(radioB42))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel89)
                            .addComponent(txtPA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel84)
                        .addComponent(radioB43)
                        .addComponent(radioB44)
                        .addComponent(jLabel90))
                    .addComponent(txtFR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radioB45)
                    .addComponent(radioB46)
                    .addComponent(jLabel91)
                    .addComponent(txtFC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel82)
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkB8)
                    .addComponent(checkB12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkB9)
                    .addComponent(checkB13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkB10)
                    .addComponent(checkB14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkB11)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Antecedentes Medicos", jPanel22);

        jLabel92.setText("Algun Miembro De Su Familia A Padecido O Padece De:");

        jLabel93.setText("¿Diabetes?");

        jLabel94.setText("¿Hipertension Arterial?");

        jLabel95.setText("¿Problemas Cardiacos?");

        jLabel96.setText("¿Cancer?");

        buttonGroup6.add(radioB47);
        radioB47.setText("Si");

        buttonGroup6.add(radioB48);
        radioB48.setText("No");

        buttonGroup7.add(radioB49);
        radioB49.setText("Si");

        buttonGroup7.add(radioB50);
        radioB50.setText("No");

        buttonGroup8.add(radioB51);
        radioB51.setText("Si");

        buttonGroup8.add(radioB52);
        radioB52.setText("No");

        buttonGroup9.add(radioB53);
        radioB53.setText("Si");

        buttonGroup9.add(radioB54);
        radioB54.setText("No");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioB53, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioB54, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioB49, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(radioB51, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(radioB50)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHipertension2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel23Layout.createSequentialGroup()
                                        .addComponent(radioB52, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtProblemasC2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtCancer2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(1078, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(radioB47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioB48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDiabetes2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92)
                .addGap(25, 25, 25)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(radioB47)
                    .addComponent(radioB48)
                    .addComponent(txtDiabetes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(radioB49)
                    .addComponent(radioB50)
                    .addComponent(txtHipertension2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(radioB51)
                    .addComponent(radioB52)
                    .addComponent(txtProblemasC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(radioB53)
                    .addComponent(radioB54)
                    .addComponent(txtCancer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(433, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Antecedentes Familiares", jPanel23);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("Odontograma", jPanel24);

        txtAreaD3.setColumns(20);
        txtAreaD3.setRows(5);
        jScrollPane5.setViewportView(txtAreaD3);

        txtAreaPT3.setColumns(20);
        txtAreaPT3.setRows(5);
        jScrollPane6.setViewportView(txtAreaPT3);

        jLabel97.setText("Diagnostico");

        jLabel98.setText("Plan De Tratamiento");

        jLabel99.setText("Presupuesto");

        btnAgregarPaciente3.setText("Agregar Paciente");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                        .addComponent(jScrollPane5))
                    .addComponent(txtPresupuesto3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarPaciente3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97))
                .addGap(28, 28, 28)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98))
                .addGap(35, 35, 35)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPresupuesto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99))
                .addGap(12, 12, 12)
                .addComponent(btnAgregarPaciente3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Diagnostico y Tratamiento", jPanel25);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        jTabbedPane2.addTab("Buscar Paciente", jPanel9);

        jLabel100.setText("Nombre");

        jLabel101.setText("Apellido Paterno");

        jLabel102.setText("Apellido Materno");

        jLabel103.setText("Genero");

        jLabel104.setText("Edad");

        txtAP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAP4ActionPerformed(evt);
            }
        });

        txtAM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAM4ActionPerformed(evt);
            }
        });

        cboxG4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "H" }));

        jLabel105.setText("Telefono");

        jLabel106.setText("Domicilio");

        jLabel107.setText("Colonia");

        jLabel108.setText("Localidad");

        jButton1.setText("ELIMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel117.setText("Nombre");

        jLabel118.setText("Apellido Paterno");

        txtAP5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAP5ActionPerformed(evt);
            }
        });

        jLabel119.setText("Apellido Materno");

        txtAM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAM5ActionPerformed(evt);
            }
        });

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(txtEdad4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel26Layout.createSequentialGroup()
                                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel26Layout.createSequentialGroup()
                                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtAP4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel26Layout.createSequentialGroup()
                                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtAM4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel26Layout.createSequentialGroup()
                                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(cboxG4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(170, 170, 170)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLocalidad4)
                                    .addComponent(txtColonia4)
                                    .addComponent(txtDomicilio4)
                                    .addComponent(txtTelefono4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel26Layout.createSequentialGroup()
<<<<<<< Updated upstream
                        .addGap(373, 373, 373)
                        .addComponent(jButton1))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtAP5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtAM5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton3)))
                .addContainerGap(467, Short.MAX_VALUE))
=======
                        .addGap(196, 196, 196)
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(852, Short.MAX_VALUE))
>>>>>>> Stashed changes
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel117)
                            .addComponent(jLabel118)
                            .addComponent(jLabel119))))
                .addGap(44, 44, 44)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel100))
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel105)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel101))
                            .addComponent(txtAP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel106))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel102))
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel107))))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(txtTelefono4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDomicilio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(txtColonia4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboxG4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel108)
                        .addComponent(txtLocalidad4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel104))
                    .addComponent(txtEdad4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane6.addTab("Datos Personales", jPanel26);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane6)
        );

        jTabbedPane2.addTab("Eliminar Paciente", jPanel10);

        jButton1.setText("jButton1");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Listar Pacientes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1473, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(581, 581, 581)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Listar Pacientes", jPanel8);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 654, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Paciente", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1501, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Cita", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1501, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Usuario", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPacienteActionPerformed
        // TODO add your handling code here:
        //BOTON AGREGAR PACIENTE
        Paciente paciente = new Paciente();
        AntecedentesMedicos antemedicos = new AntecedentesMedicos();
        AntecedentesFamiliares antefam = new AntecedentesFamiliares();
        DiagnosticoYTratamiento diag = new DiagnosticoYTratamiento();

        //Datos Personales
        paciente.setNombre(txtNombre1.getText());
        paciente.setAPaterno(txtAP1.getText());
        paciente.setAMaterno(txtAM1.getText());
        paciente.setGenero(String.valueOf(CbxG1.getSelectedItem()));
        paciente.setEdad(Integer.parseInt((txtEdad1.getText())));
        paciente.setTelefono(Integer.parseUnsignedInt(txtTelefono1.getText()));
        paciente.setDomicilio(txtDomicilio1.getText());
        paciente.setColonia(txtColonia1.getText());
        paciente.setLocalidad(txtLocalidad1.getText());

        try {
            ps = con.prepareStatement("INSERT INTO paciente(id, Nombre, APaterno, AMaterno, Genero, Edad, Telefono, Domicilio, Colonia, Localidad) VALUES(null, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getAPaterno());
            ps.setString(3, paciente.getAMaterno());
            ps.setString(4, paciente.getGenero());
            ps.setInt(5, paciente.getEdad());
            ps.setLong(6, paciente.getTelefono());
            ps.setString(7, paciente.getDomicilio());
            ps.setString(8, paciente.getColonia());
            ps.setString(9, paciente.getLocalidad());

            int rs = ps.executeUpdate();
            if (rs > 0) {
                JOptionPane.showMessageDialog(this, "Paciente Registrado");
            } else {
                JOptionPane.showMessageDialog(this, "Paciente No Registrado");
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Antecedentes Medicos
        antemedicos.setBTratamiento(txtTM1.getText());
        antemedicos.setAlergia(txtAler1.getText());
        antemedicos.setHemorragia(txtHemo1.getText());
        antemedicos.setDDental(radioB1.isSelected());
        antemedicos.setABocal(radioB3.isSelected());
        antemedicos.setCAnestesia(radioB5.isSelected());
        antemedicos.setConvulsiones(radioB7.isSelected());
        antemedicos.setFuma(radioB9.isSelected());
        antemedicos.setFReumatica(checkB1.isSelected());
        antemedicos.setARenal(checkB2.isSelected());
        antemedicos.setAsma(checkB3.isSelected());
        antemedicos.setVIH(checkB4.isSelected());
        antemedicos.setAnemia(checkB5.isSelected());
        antemedicos.setHepatitis(checkB6.isSelected());
        antemedicos.setSMencion(txtPadecido.getText());
        antemedicos.setATemporomandibular(txtTemporo.getText());
        antemedicos.setEmbarazo(txtEmbarazo.getText());
        antemedicos.setPArterial(Integer.parseInt(txtPA.getText()));
        antemedicos.setFResp(Integer.parseInt(txtFR.getText()));
        antemedicos.setFCard(Integer.parseInt(txtFC.getText()));

        try {

            ps = con.prepareStatement("SELECT id FROM paciente WHERE Nombre=? AND APaterno=? AND AMaterno=?;");
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getAPaterno());
            ps.setString(3, paciente.getAMaterno());

            int id;

            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
                ps = con.prepareStatement("INSERT INTO antecedentes_medicos( id, id_p, BTratamiento, Alergia, Hemorragia, DDental, ABocal, CAnestesia, Convulsiones, Fuma, FReumatica, ARenal, Asma, HArterial, VIH, Anemia, Hepatitis, SMencion, ATemporomandibular, Embarazo, PArterial, FResp, FCard) VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
                ps.setInt(1, id);
                ps.setString(2, antemedicos.getBTratamiento());
                ps.setString(3, antemedicos.getAlergia());
                ps.setString(4, antemedicos.getHemorragia());
                ps.setBoolean(5, antemedicos.isABocal());
                ps.setBoolean(6, antemedicos.isCAnestesia());
                ps.setBoolean(7, antemedicos.isDDental());
                ps.setBoolean(8, antemedicos.isConvulsiones());
                ps.setBoolean(9, antemedicos.isFuma());
                ps.setBoolean(10, antemedicos.isFReumatica());
                ps.setBoolean(11, antemedicos.isARenal());
                ps.setBoolean(12, antemedicos.isAsma());
                ps.setBoolean(13, antemedicos.isHArterial());
                ps.setBoolean(14, antemedicos.isVIH());
                ps.setBoolean(15, antemedicos.isAnemia());
                ps.setBoolean(16, antemedicos.isHepatitis());
                ps.setString(17, antemedicos.getSMencion());
                ps.setString(18, antemedicos.getATemporomandibular());
                ps.setString(19, antemedicos.getEmbarazo());
                ps.setInt(20, antemedicos.getPArterial());
                ps.setInt(21, antemedicos.getFResp());
                ps.setInt(22, antemedicos.getFCard());

                int rs = ps.executeUpdate();
                if (rs > 0) {

                }
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Antecedentes Familiares
        antefam.setDiabetes(radioB11.isSelected());
        antefam.setDQuien(txtDiabetes.getText());
        antefam.setHipertension(radioB13.isSelected());
        antefam.setHQuien(txtHipertension.getText());
        antefam.setCardiacos(radioB15.isSelected());
        antefam.setCQuien(txtProblemasC.getText());
        antefam.setCancer(radioB17.isSelected());
        antefam.setCaQuien(txtCancer.getText());

        try {

            ps = con.prepareStatement("SELECT id FROM paciente WHERE Nombre=? AND APaterno=? AND AMaterno=?;");
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getAPaterno());
            ps.setString(3, paciente.getAMaterno());

            int id;

            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
                ps = con.prepareStatement("INSERT INTO antecedentes_familiares( id, id_p, Diabetes, DQuien, Hipertension, HQuien, Cardiacos, CQuien, Cancer, CaQuien) VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
                ps.setInt(1, id);
                ps.setBoolean(2, antefam.isDiabetes());
                ps.setString(3, antefam.getDQuien());
                ps.setBoolean(4, antefam.isHipertension());
                ps.setString(5, antefam.getHQuien());
                ps.setBoolean(6, antefam.isCardiacos());
                ps.setString(7, antefam.getCQuien());
                ps.setBoolean(8, antefam.isCancer());
                ps.setString(9, antefam.getCaQuien());

                int rs = ps.executeUpdate();
                if (rs > 0) {

                }
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Odontograma
        //Diagnostico y Tratamiento
        diag.setDiagnostico(txtAreaD.getText());
        diag.setTratamiento(txtAreaPT.getText());
        diag.setPresupuesto(Integer.parseInt(txtPresupuesto.getText()));

        try {

            ps = con.prepareStatement("SELECT id FROM paciente WHERE Nombre=? AND APaterno=? AND AMaterno=?;");
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getAPaterno());
            ps.setString(3, paciente.getAMaterno());

            int id;

            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt("id");
                ps = con.prepareStatement("INSERT INTO diagnostico_tratamiento( id, id_p, Diagnostico, Tratamiento, Presupuesto) VALUES (null, ?, ?, ?, ?);");
                ps.setInt(1, id);
                ps.setString(2, diag.getDiagnostico());
                ps.setString(3, diag.getTratamiento());
                ps.setInt(4, diag.getPresupuesto());

                int rs = ps.executeUpdate();
                if (rs > 0) {

                }
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnAgregarPacienteActionPerformed

    private void txtAler1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAler1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAler1ActionPerformed

    private void btnBuscarDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDPActionPerformed
        // TODO add your handling code here:
        try {
            Paciente paciente = new Paciente();
            paciente.setNombre(txtBuscarNom.getText());
            paciente.setAPaterno(txtBuscarAP.getText());
            paciente.setAMaterno(txtBuscarAM.getText());

            ps = con.prepareStatement("SELECT * FROM paciente WHERE Nombre=? AND APaterno=? AND AMaterno=?");
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getAPaterno());
            ps.setString(3, paciente.getAMaterno());

            rs = ps.executeQuery();

            if (rs.next()) {
                Paciente paciente2 = new Paciente();
                paciente2.setNombre(rs.getString("Nombre"));
                paciente2.setAPaterno(rs.getString("APaterno"));
                paciente2.setAMaterno(rs.getString("AMaterno"));
                paciente2.setGenero(rs.getString("Genero"));
                paciente2.setEdad(rs.getInt("Edad"));
                paciente2.setTelefono(Long.parseLong(rs.getString("Telefono")));
                paciente2.setDomicilio(rs.getString("Domicilio"));
                paciente2.setColonia(rs.getString("Colonia"));
                paciente2.setLocalidad(rs.getString("Localidad"));

                txtNombre2.setText(paciente2.getNombre());
                txtAP2.setText(paciente2.getAPaterno());
                txtAM2.setText(paciente2.getAMaterno());
                cboxG2.setSelectedItem(paciente2.getGenero());
                txtEdad2.setText(String.valueOf(paciente2.getEdad()));
                txtTelefono2.setText(String.valueOf(paciente2.getTelefono()));
                txtDomicilio2.setText(paciente2.getDomicilio());
                txtColonia2.setText(paciente2.getColonia());
                txtLocalidad2.setText(paciente2.getLocalidad());
                jTextField79.setText(rs.getString("id"));

                ps = con.prepareStatement("SELECT PArterial, FResp, FCard FROM antecedentes_medicos WHERE id_p=?");
                ps.setInt(1, Integer.parseInt(jTextField79.getText()));

                rs = ps.executeQuery();

                if (rs.next()) {
                    txtPA2.setText(String.valueOf(rs.getInt("PArterial")));
                    txtFR2.setText(String.valueOf(rs.getInt("FResp")));
                    txtFC2.setText(String.valueOf(rs.getInt("FCard")));

                    ps = con.prepareStatement("SELECT * FROM diagnostico_tratamiento WHERE id_p=?");
                    ps.setInt(1, Integer.parseInt(jTextField79.getText()));

                    rs = ps.executeQuery();

                    if (rs.next()) {
                        txtAreaD2.setText(rs.getString("Diagnostico"));
                        txtAreaPT2.setText(rs.getString("Tratamiento"));
                        txtPresupuesto2.setText(rs.getString("Presupuesto"));

                    } else {
                        JOptionPane.showMessageDialog(this, "Diagnostico y Tratamiento No Encontrados");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Signos Vitales No Encontrados");
                }

            } else {
                JOptionPane.showMessageDialog(this, "El paciente no existe");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarDPActionPerformed

    private void btnEditarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPacienteActionPerformed
        // TODO add your handling code here:
        try {
            Paciente paciente = new Paciente();
            paciente.setNombre(txtNombre2.getText());
            paciente.setAPaterno(txtAP2.getText());
            paciente.setAMaterno(txtAM2.getText());
            paciente.setGenero(String.valueOf(cboxG2.getSelectedItem()));
            paciente.setEdad(Integer.parseInt(txtEdad2.getText()));
            paciente.setTelefono(Long.parseLong(txtTelefono2.getText()));
            paciente.setDomicilio(txtDomicilio2.getText());
            paciente.setColonia(txtColonia2.getText());
            paciente.setLocalidad(txtLocalidad2.getText());
            ps = con.prepareStatement("Update paciente SET Nombre=?, APaterno=?, AMaterno=?, Genero=?, Edad=?,"
                    + " Telefono=?, Domicilio=?, Colonia=?, Localidad=? WHERE id = ?");
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getAPaterno());
            ps.setString(3, paciente.getAMaterno());
            ps.setString(4, paciente.getGenero());
            ps.setInt(5, paciente.getEdad());
            ps.setLong(6, paciente.getTelefono());
            ps.setString(7, paciente.getDomicilio());
            ps.setString(8, paciente.getColonia());
            ps.setString(9, paciente.getLocalidad());
            ps.setInt(10, Integer.parseInt(jTextField79.getText()));

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Paciente modificado");
                //Vaciar campos
                AntecedentesMedicos anteMedicos = new AntecedentesMedicos();
                anteMedicos.setPArterial(Integer.parseInt(txtPA2.getText()));
                anteMedicos.setFResp(Integer.parseInt(txtFR2.getText()));
                anteMedicos.setFCard(Integer.parseInt(txtFC2.getText()));
                ps = con.prepareStatement("Update antecedentes_medicos SET PArterial=?, FResp=?, FCard=? WHERE id_p = ?");
                ps.setInt(1, anteMedicos.getPArterial());
                ps.setInt(2, anteMedicos.getFResp());
                ps.setInt(3, anteMedicos.getFCard());
                ps.setInt(4, Integer.parseInt(jTextField79.getText()));

                res = ps.executeUpdate();
                if (res > 0) {
                    DiagnosticoYTratamiento diagTrat = new DiagnosticoYTratamiento();
                    diagTrat.setDiagnostico(txtAreaD2.getText());
                    diagTrat.setTratamiento(txtAreaPT2.getText());
                    diagTrat.setPresupuesto(Integer.parseInt(txtPresupuesto2.getText()));
                    ps = con.prepareStatement("Update diagnostico_tratamiento SET Diagnostico=?, Tratamiento=?,Presupuesto=? WHERE id_p = ?");
                    ps.setString(1, diagTrat.getDiagnostico());
                    ps.setString(2, diagTrat.getTratamiento());
                    ps.setInt(3, diagTrat.getPresupuesto());
                    ps.setInt(4, Integer.parseInt(jTextField79.getText()));

                    res = ps.executeUpdate();

                    if (res > 0) {
                    } else {
                        JOptionPane.showMessageDialog(null, "Diagnostico y Tratamiento no modificados");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Antecedentes medicos no modificados");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Paciente no modificado");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarPacienteActionPerformed
    // Mostrar datos del paciente
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Creacion del Objeto JTable
        DefaultTableModel modelo = new DefaultTableModel();
        //Sentencia SQL
        String sql = "SELECT *FROM paciente";
       
        try{
            jTable1.setModel(modelo);
            
            //Mandamos llamar la consulta
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            //Almacenamos los datos de la consulta
            ResultSetMetaData rmt = rs.getMetaData();
            //Almacenamos el numero de columnas de la consulta
            int columnas = rmt.getColumnCount()-1;
            
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido Paterno");
            modelo.addColumn("Apellido Materno");
            modelo.addColumn("Genero");
            modelo.addColumn("Edad");
            modelo.addColumn("Telefono");
            modelo.addColumn("Domicilio");
            modelo.addColumn("Colonia");
            modelo.addColumn("Localidad");
            
            while(rs.next()){
                
                Object [] filas = new Object [columnas];
                for(int i = 1; i < columnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                
                //Agregamos las filas a nuestra tabla
                modelo.addRow(filas);
            }
            
        }catch(SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            // BOTON ELIMINAR PACIENTE
            ps = con.prepareStatement("Delete from abono WHERE id_p = ?");
            ps.setInt(1, Integer.parseInt(jTextField79.getText()));
            ps.executeUpdate();
            ps = con.prepareStatement("Delete from antecedentes_familiares WHERE id_p = ?");
            ps.setInt(1, Integer.parseInt(jTextField79.getText()));
            ps.executeUpdate();
            ps = con.prepareStatement("Delete from antecedentes_medicos WHERE id_p = ?");
            ps.setInt(1, Integer.parseInt(jTextField79.getText()));
            ps.executeUpdate();
            ps = con.prepareStatement("Delete from cita WHERE id_p = ?");
            ps.setInt(1, Integer.parseInt(jTextField79.getText()));
            ps.executeUpdate();
            ps = con.prepareStatement("Delete from diagnostico_tratamiento WHERE id_p = ?");
            ps.setInt(1, Integer.parseInt(jTextField79.getText()));
            ps.executeUpdate();
            ps = con.prepareStatement("Delete from odontograma WHERE id_p = ?");
            ps.setInt(1, Integer.parseInt(jTextField79.getText()));
            int res = ps.executeUpdate();

            ps = con.prepareStatement("Delete from paciente WHERE id = ?");
            ps.setInt(1, Integer.parseInt(jTextField79.getText()));
            res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Paciente Eliminado Correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar al paciente");
            }

        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAP4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAP4ActionPerformed

    private void txtAM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAM4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAM4ActionPerformed

    private void txtAP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAP5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAP5ActionPerformed

    private void txtAM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAM5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAM5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //BOTON BUSCAR PARA ELIMINAR
        try {
            Paciente paciente = new Paciente();
            paciente.setNombre(txtNombre5.getText());
            paciente.setAPaterno(txtAP5.getText());
            paciente.setAMaterno(txtAM5.getText());

            ps = con.prepareStatement("SELECT * FROM paciente WHERE Nombre=? AND APaterno=? AND AMaterno=?");
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getAPaterno());
            ps.setString(3, paciente.getAMaterno());

            rs = ps.executeQuery();

            if (rs.next()) {
                Paciente paciente2 = new Paciente();
                paciente2.setNombre(rs.getString("Nombre"));
                paciente2.setAPaterno(rs.getString("APaterno"));
                paciente2.setAMaterno(rs.getString("AMaterno"));
                paciente2.setGenero(rs.getString("Genero"));
                paciente2.setEdad(rs.getInt("Edad"));
                paciente2.setTelefono(Long.parseLong(rs.getString("Telefono")));
                paciente2.setDomicilio(rs.getString("Domicilio"));
                paciente2.setColonia(rs.getString("Colonia"));
                paciente2.setLocalidad(rs.getString("Localidad"));

                txtNombre4.setText(paciente2.getNombre());
                txtAP4.setText(paciente2.getAPaterno());
                txtAM4.setText(paciente2.getAMaterno());
                cboxG4.setSelectedItem(paciente2.getGenero());
                txtEdad4.setText(String.valueOf(paciente2.getEdad()));
                txtTelefono4.setText(String.valueOf(paciente2.getTelefono()));
                txtDomicilio4.setText(paciente2.getDomicilio());
                txtColonia4.setText(paciente2.getColonia());
                txtLocalidad4.setText(paciente2.getLocalidad());
                jTextField79.setText(rs.getString("id"));

            } else {
                JOptionPane.showMessageDialog(this, "El paciente no existe");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxG1;
    private javax.swing.JButton btnAgregarPaciente;
    private javax.swing.JButton btnAgregarPaciente3;
    private javax.swing.JButton btnBuscarDP;
    private javax.swing.JButton btnEditarPaciente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JComboBox<String> cboxG2;
    private javax.swing.JComboBox<String> cboxG3;
    private javax.swing.JComboBox<String> cboxG4;
    private javax.swing.JCheckBox checkB1;
    private javax.swing.JCheckBox checkB10;
    private javax.swing.JCheckBox checkB11;
    private javax.swing.JCheckBox checkB12;
    private javax.swing.JCheckBox checkB13;
    private javax.swing.JCheckBox checkB14;
    private javax.swing.JCheckBox checkB2;
    private javax.swing.JCheckBox checkB3;
    private javax.swing.JCheckBox checkB4;
    private javax.swing.JCheckBox checkB5;
    private javax.swing.JCheckBox checkB6;
    private javax.swing.JCheckBox checkB7;
    private javax.swing.JCheckBox checkB8;
    private javax.swing.JCheckBox checkB9;
    private javax.swing.JButton jButton1;
<<<<<<< Updated upstream
    private javax.swing.JButton jButton3;
=======
    private javax.swing.JButton jButton2;
>>>>>>> Stashed changes
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
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
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
<<<<<<< Updated upstream
=======
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField75;
>>>>>>> Stashed changes
    private javax.swing.JTextField jTextField79;
    private javax.swing.JRadioButton radioB1;
    private javax.swing.JRadioButton radioB10;
    private javax.swing.JRadioButton radioB11;
    private javax.swing.JRadioButton radioB12;
    private javax.swing.JRadioButton radioB13;
    private javax.swing.JRadioButton radioB14;
    private javax.swing.JRadioButton radioB15;
    private javax.swing.JRadioButton radioB16;
    private javax.swing.JRadioButton radioB17;
    private javax.swing.JRadioButton radioB18;
    private javax.swing.JRadioButton radioB2;
    private javax.swing.JRadioButton radioB3;
    private javax.swing.JRadioButton radioB37;
    private javax.swing.JRadioButton radioB38;
    private javax.swing.JRadioButton radioB39;
    private javax.swing.JRadioButton radioB4;
    private javax.swing.JRadioButton radioB40;
    private javax.swing.JRadioButton radioB41;
    private javax.swing.JRadioButton radioB42;
    private javax.swing.JRadioButton radioB43;
    private javax.swing.JRadioButton radioB44;
    private javax.swing.JRadioButton radioB45;
    private javax.swing.JRadioButton radioB46;
    private javax.swing.JRadioButton radioB47;
    private javax.swing.JRadioButton radioB48;
    private javax.swing.JRadioButton radioB49;
    private javax.swing.JRadioButton radioB5;
    private javax.swing.JRadioButton radioB50;
    private javax.swing.JRadioButton radioB51;
    private javax.swing.JRadioButton radioB52;
    private javax.swing.JRadioButton radioB53;
    private javax.swing.JRadioButton radioB54;
    private javax.swing.JRadioButton radioB6;
    private javax.swing.JRadioButton radioB7;
    private javax.swing.JRadioButton radioB8;
    private javax.swing.JRadioButton radioB9;
    private javax.swing.JTextField txtAM1;
    private javax.swing.JTextField txtAM2;
    private javax.swing.JTextField txtAM3;
    private javax.swing.JTextField txtAM4;
    private javax.swing.JTextField txtAM5;
    private javax.swing.JTextField txtAP1;
    private javax.swing.JTextField txtAP2;
    private javax.swing.JTextField txtAP3;
    private javax.swing.JTextField txtAP4;
    private javax.swing.JTextField txtAP5;
    private javax.swing.JTextField txtAler1;
    private javax.swing.JTextField txtAler2;
    private javax.swing.JTextArea txtAreaD;
    private javax.swing.JTextArea txtAreaD2;
    private javax.swing.JTextArea txtAreaD3;
    private javax.swing.JTextArea txtAreaPT;
    private javax.swing.JTextArea txtAreaPT2;
    private javax.swing.JTextArea txtAreaPT3;
    private javax.swing.JTextField txtBuscarAM;
    private javax.swing.JTextField txtBuscarAP;
    private javax.swing.JTextField txtBuscarNom;
    private javax.swing.JTextField txtCancer;
    private javax.swing.JTextField txtCancer2;
    private javax.swing.JTextField txtColonia1;
    private javax.swing.JTextField txtColonia2;
    private javax.swing.JTextField txtColonia3;
    private javax.swing.JTextField txtColonia4;
    private javax.swing.JTextField txtDiabetes;
    private javax.swing.JTextField txtDiabetes2;
    private javax.swing.JTextField txtDomicilio1;
    private javax.swing.JTextField txtDomicilio2;
    private javax.swing.JTextField txtDomicilio3;
    private javax.swing.JTextField txtDomicilio4;
    private javax.swing.JTextField txtEdad1;
    private javax.swing.JTextField txtEdad2;
    private javax.swing.JTextField txtEdad3;
    private javax.swing.JTextField txtEdad4;
    private javax.swing.JTextField txtEmbarazo;
    private javax.swing.JTextField txtEmbarazo2;
    private javax.swing.JTextField txtFC;
    private javax.swing.JTextField txtFC2;
    private javax.swing.JTextField txtFC3;
    private javax.swing.JTextField txtFR;
    private javax.swing.JTextField txtFR2;
    private javax.swing.JTextField txtFR3;
    private javax.swing.JTextField txtHemo1;
    private javax.swing.JTextField txtHemo2;
    private javax.swing.JTextField txtHipertension;
    private javax.swing.JTextField txtHipertension2;
    private javax.swing.JTextField txtLocalidad1;
    private javax.swing.JTextField txtLocalidad2;
    private javax.swing.JTextField txtLocalidad3;
    private javax.swing.JTextField txtLocalidad4;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNombre3;
    private javax.swing.JTextField txtNombre4;
    private javax.swing.JTextField txtNombre5;
    private javax.swing.JTextField txtPA;
    private javax.swing.JTextField txtPA2;
    private javax.swing.JTextField txtPA3;
    private javax.swing.JTextField txtPadecido;
    private javax.swing.JTextField txtPadecido2;
    private javax.swing.JTextField txtPresupuesto;
    private javax.swing.JTextField txtPresupuesto2;
    private javax.swing.JTextField txtPresupuesto3;
    private javax.swing.JTextField txtProblemasC;
    private javax.swing.JTextField txtProblemasC2;
    private javax.swing.JTextField txtTM1;
    private javax.swing.JTextField txtTM2;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    private javax.swing.JTextField txtTelefono3;
    private javax.swing.JTextField txtTelefono4;
    private javax.swing.JTextField txtTemporo;
    private javax.swing.JTextField txtTemporo2;
    // End of variables declaration//GEN-END:variables

    public static Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return con;

    }

}
