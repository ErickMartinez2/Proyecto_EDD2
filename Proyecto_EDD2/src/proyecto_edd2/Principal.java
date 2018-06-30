package proyecto_edd2;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author Erick Martínez, Juan Guevara and Iliana Pinto
 */
public class Principal extends javax.swing.JFrame {

    //Variables
    ArrayList<Campo> campos = new ArrayList();
    LinkedList<Posicion> availList = new LinkedList<>();
    File file, indice;
    boolean tipo_archivo;
    ArbolB arbol = new ArbolB(4);
    ArrayStack posiciones = new ArrayStack();

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(this);
        Crear_Fij.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Crear_Var.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Crear_Fij = new javax.swing.JDialog();
        jp_fija = new javax.swing.JPanel();
        rb_string = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        js_longitud = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rb_char = new javax.swing.JRadioButton();
        rb_int = new javax.swing.JRadioButton();
        rb_double = new javax.swing.JRadioButton();
        rb_float = new javax.swing.JRadioButton();
        rb_long = new javax.swing.JRadioButton();
        jb_agregar_fij = new javax.swing.JButton();
        rb_short = new javax.swing.JRadioButton();
        jb_salir_fij = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Crear_Var = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        rb_string1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        tf_nombre1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rb_char1 = new javax.swing.JRadioButton();
        rb_int1 = new javax.swing.JRadioButton();
        rb_double1 = new javax.swing.JRadioButton();
        rb_float1 = new javax.swing.JRadioButton();
        rb_long1 = new javax.swing.JRadioButton();
        jb_agregar_var = new javax.swing.JButton();
        rb_short1 = new javax.swing.JRadioButton();
        jb_salir_var = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dato = new javax.swing.ButtonGroup();
        dato2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jl_archivoactual = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_Campo = new javax.swing.JTable();
        jb_cargartabla = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_registros = new javax.swing.JTable();
        jb_atras = new javax.swing.JButton();
        jb_siguiente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jm_archivo = new javax.swing.JMenu();
        jmi_crear = new javax.swing.JMenuItem();
        jmi_abrir = new javax.swing.JMenuItem();
        jmi_cerrar = new javax.swing.JMenuItem();
        jm_campo = new javax.swing.JMenu();
        jmi_crear1 = new javax.swing.JMenuItem();
        jmi_modificar1 = new javax.swing.JMenuItem();
        jmi_borrar1 = new javax.swing.JMenuItem();
        jm_registro = new javax.swing.JMenu();
        jmi_introducir2 = new javax.swing.JMenuItem();
        jmi_modificar2 = new javax.swing.JMenuItem();
        jmi_buscar2 = new javax.swing.JMenuItem();
        jmi_eliminar2 = new javax.swing.JMenuItem();
        jmi_cruzar = new javax.swing.JMenuItem();
        jm_estandarizacion = new javax.swing.JMenu();
        jmi_excel = new javax.swing.JMenuItem();
        jmi_xml = new javax.swing.JMenuItem();

        jp_fija.setBackground(new java.awt.Color(0, 153, 153));

        rb_string.setBackground(new java.awt.Color(0, 153, 153));
        dato.add(rb_string);
        rb_string.setForeground(new java.awt.Color(255, 255, 255));
        rb_string.setSelected(true);
        rb_string.setText("String");
        rb_string.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_stringMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del Campo:");

        js_longitud.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Longitud:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de Dato:");

        rb_char.setBackground(new java.awt.Color(0, 153, 153));
        dato.add(rb_char);
        rb_char.setForeground(new java.awt.Color(255, 255, 255));
        rb_char.setText("Char");
        rb_char.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_charMouseClicked(evt);
            }
        });

        rb_int.setBackground(new java.awt.Color(0, 153, 153));
        dato.add(rb_int);
        rb_int.setForeground(new java.awt.Color(255, 255, 255));
        rb_int.setText("Int");
        rb_int.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_intMouseClicked(evt);
            }
        });

        rb_double.setBackground(new java.awt.Color(0, 153, 153));
        dato.add(rb_double);
        rb_double.setForeground(new java.awt.Color(255, 255, 255));
        rb_double.setText("Double");
        rb_double.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_doubleMouseClicked(evt);
            }
        });

        rb_float.setBackground(new java.awt.Color(0, 153, 153));
        dato.add(rb_float);
        rb_float.setForeground(new java.awt.Color(255, 255, 255));
        rb_float.setText("Float");
        rb_float.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_floatMouseClicked(evt);
            }
        });

        rb_long.setBackground(new java.awt.Color(0, 153, 153));
        dato.add(rb_long);
        rb_long.setForeground(new java.awt.Color(255, 255, 255));
        rb_long.setText("Long");
        rb_long.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_longMouseClicked(evt);
            }
        });

        jb_agregar_fij.setBackground(new java.awt.Color(0, 153, 153));
        jb_agregar_fij.setText("Agregar");
        jb_agregar_fij.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregar_fijMouseClicked(evt);
            }
        });

        rb_short.setBackground(new java.awt.Color(0, 153, 153));
        dato.add(rb_short);
        rb_short.setForeground(new java.awt.Color(255, 255, 255));
        rb_short.setText("Short");
        rb_short.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_shortMouseClicked(evt);
            }
        });

        jb_salir_fij.setBackground(new java.awt.Color(0, 153, 153));
        jb_salir_fij.setText("Salir");
        jb_salir_fij.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salir_fijMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Campo de Longitud Fija");

        javax.swing.GroupLayout jp_fijaLayout = new javax.swing.GroupLayout(jp_fija);
        jp_fija.setLayout(jp_fijaLayout);
        jp_fijaLayout.setHorizontalGroup(
            jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_fijaLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(js_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_fijaLayout.createSequentialGroup()
                        .addGroup(jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_char)
                            .addComponent(rb_string))
                        .addGap(18, 18, 18)
                        .addGroup(jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_double)
                            .addComponent(rb_float))
                        .addGap(18, 18, 18)
                        .addGroup(jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_long)
                            .addGroup(jp_fijaLayout.createSequentialGroup()
                                .addComponent(rb_int)
                                .addGap(18, 18, 18)
                                .addComponent(rb_short))))
                    .addGroup(jp_fijaLayout.createSequentialGroup()
                        .addComponent(jb_agregar_fij)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_salir_fij)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_fijaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jp_fijaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jb_agregar_fij, jb_salir_fij});

        jp_fijaLayout.setVerticalGroup(
            jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_fijaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(js_longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_string)
                        .addComponent(rb_double)
                        .addComponent(rb_int)
                        .addComponent(rb_short)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_float)
                        .addComponent(rb_long))
                    .addComponent(rb_char))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jp_fijaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_agregar_fij)
                    .addComponent(jb_salir_fij))
                .addContainerGap())
        );

        javax.swing.GroupLayout Crear_FijLayout = new javax.swing.GroupLayout(Crear_Fij.getContentPane());
        Crear_Fij.getContentPane().setLayout(Crear_FijLayout);
        Crear_FijLayout.setHorizontalGroup(
            Crear_FijLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_fija, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Crear_FijLayout.setVerticalGroup(
            Crear_FijLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_fija, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));

        rb_string1.setBackground(new java.awt.Color(0, 153, 153));
        dato2.add(rb_string1);
        rb_string1.setForeground(new java.awt.Color(255, 255, 255));
        rb_string1.setSelected(true);
        rb_string1.setText("String");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre del Campo:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Dato:");

        rb_char1.setBackground(new java.awt.Color(0, 153, 153));
        dato2.add(rb_char1);
        rb_char1.setForeground(new java.awt.Color(255, 255, 255));
        rb_char1.setText("Char");

        rb_int1.setBackground(new java.awt.Color(0, 153, 153));
        dato2.add(rb_int1);
        rb_int1.setForeground(new java.awt.Color(255, 255, 255));
        rb_int1.setText("Int");

        rb_double1.setBackground(new java.awt.Color(0, 153, 153));
        dato2.add(rb_double1);
        rb_double1.setForeground(new java.awt.Color(255, 255, 255));
        rb_double1.setText("Double");

        rb_float1.setBackground(new java.awt.Color(0, 153, 153));
        dato2.add(rb_float1);
        rb_float1.setForeground(new java.awt.Color(255, 255, 255));
        rb_float1.setText("Float");

        rb_long1.setBackground(new java.awt.Color(0, 153, 153));
        dato2.add(rb_long1);
        rb_long1.setForeground(new java.awt.Color(255, 255, 255));
        rb_long1.setText("Long");

        jb_agregar_var.setBackground(new java.awt.Color(0, 153, 153));
        jb_agregar_var.setText("Agregar");
        jb_agregar_var.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregar_varMouseClicked(evt);
            }
        });

        rb_short1.setBackground(new java.awt.Color(0, 153, 153));
        dato2.add(rb_short1);
        rb_short1.setForeground(new java.awt.Color(255, 255, 255));
        rb_short1.setText("Short");

        jb_salir_var.setBackground(new java.awt.Color(0, 153, 153));
        jb_salir_var.setText("Salir");
        jb_salir_var.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salir_varMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Campo de Longitud Variable");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rb_char1)
                                    .addComponent(rb_string1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(rb_double1))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(rb_float1)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(tf_nombre1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(rb_short1)
                                .addGap(10, 10, 10)
                                .addComponent(rb_int1))
                            .addComponent(rb_long1)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jb_agregar_var)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_salir_var)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jb_agregar_var, jb_salir_var});

        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_string1)
                        .addComponent(rb_double1)
                        .addComponent(rb_short1)
                        .addComponent(rb_int1)))
                .addGap(8, 8, 8)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_char1)
                    .addComponent(rb_float1)
                    .addComponent(rb_long1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_salir_var)
                    .addComponent(jb_agregar_var))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout Crear_VarLayout = new javax.swing.GroupLayout(Crear_Var.getContentPane());
        Crear_Var.getContentPane().setLayout(Crear_VarLayout);
        Crear_VarLayout.setHorizontalGroup(
            Crear_VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Crear_VarLayout.setVerticalGroup(
            Crear_VarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel9.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Proyecto EDD2");

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 2, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Archivo Actual:");

        jl_archivoactual.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jl_archivoactual.setForeground(new java.awt.Color(255, 255, 255));

        jt_Campo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campos", "Nombre", "Tipo", "Longitud", "Llave Principal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt_Campo.setToolTipText("");
        jScrollPane2.setViewportView(jt_Campo);

        jb_cargartabla.setText("Cargar Tabla");
        jb_cargartabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cargartablaMouseClicked(evt);
            }
        });

        jt_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jt_registros.setToolTipText("");
        jScrollPane3.setViewportView(jt_registros);

        jb_atras.setText("Atras");
        jb_atras.setEnabled(false);
        jb_atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_atrasMouseClicked(evt);
            }
        });

        jb_siguiente.setText("Siguiente");
        jb_siguiente.setEnabled(false);
        jb_siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_siguienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jl_archivoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jb_cargartabla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jb_atras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_siguiente))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jb_atras, jb_siguiente});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_archivoactual, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cargartabla)
                    .addComponent(jb_atras)
                    .addComponent(jb_siguiente))
                .addContainerGap())
        );

        jm_archivo.setText("Archivo");

        jmi_crear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmi_crear.setText("Crear");
        jmi_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_crearActionPerformed(evt);
            }
        });
        jm_archivo.add(jmi_crear);

        jmi_abrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmi_abrir.setText("Abrir");
        jmi_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_abrirActionPerformed(evt);
            }
        });
        jm_archivo.add(jmi_abrir);

        jmi_cerrar.setText("Cerrar");
        jmi_cerrar.setEnabled(false);
        jmi_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cerrarActionPerformed(evt);
            }
        });
        jm_archivo.add(jmi_cerrar);

        jMenuBar1.add(jm_archivo);

        jm_campo.setText("Campo");
        jm_campo.setEnabled(false);

        jmi_crear1.setText("Crear");
        jmi_crear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_crear1ActionPerformed(evt);
            }
        });
        jm_campo.add(jmi_crear1);

        jmi_modificar1.setText("Modificar");
        jmi_modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificar1ActionPerformed(evt);
            }
        });
        jm_campo.add(jmi_modificar1);

        jmi_borrar1.setText("Borrar");
        jmi_borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_borrar1ActionPerformed(evt);
            }
        });
        jm_campo.add(jmi_borrar1);

        jMenuBar1.add(jm_campo);

        jm_registro.setText("Registro");
        jm_registro.setEnabled(false);

        jmi_introducir2.setText("Introducir");
        jmi_introducir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_introducir2ActionPerformed(evt);
            }
        });
        jm_registro.add(jmi_introducir2);

        jmi_modificar2.setText("Modificar ");
        jmi_modificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificar2ActionPerformed(evt);
            }
        });
        jm_registro.add(jmi_modificar2);

        jmi_buscar2.setText("Buscar");
        jmi_buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_buscar2ActionPerformed(evt);
            }
        });
        jm_registro.add(jmi_buscar2);

        jmi_eliminar2.setText("Borrar ");
        jmi_eliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_eliminar2ActionPerformed(evt);
            }
        });
        jm_registro.add(jmi_eliminar2);

        jmi_cruzar.setText("Cruzar Archivos");
        jmi_cruzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cruzarActionPerformed(evt);
            }
        });
        jm_registro.add(jmi_cruzar);

        jMenuBar1.add(jm_registro);

        jm_estandarizacion.setText("Estandarización");
        jm_estandarizacion.setEnabled(false);

        jmi_excel.setText("Exportar Excel");
        jmi_excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_excelActionPerformed(evt);
            }
        });
        jm_estandarizacion.add(jmi_excel);

        jmi_xml.setText("Exportar XML con Schema");
        jmi_xml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_xmlActionPerformed(evt);
            }
        });
        jm_estandarizacion.add(jmi_xml);

        jMenuBar1.add(jm_estandarizacion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb_charMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_charMouseClicked
        js_longitud.setValue(1);
        js_longitud.setEnabled(false);
    }//GEN-LAST:event_rb_charMouseClicked

    private void rb_stringMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_stringMouseClicked
        js_longitud.setEnabled(true);
    }//GEN-LAST:event_rb_stringMouseClicked

    private void rb_doubleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_doubleMouseClicked
        js_longitud.setEnabled(true);
    }//GEN-LAST:event_rb_doubleMouseClicked

    private void rb_floatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_floatMouseClicked
        js_longitud.setEnabled(true);
    }//GEN-LAST:event_rb_floatMouseClicked

    private void rb_intMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_intMouseClicked
        js_longitud.setEnabled(true);
    }//GEN-LAST:event_rb_intMouseClicked

    private void rb_longMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_longMouseClicked
        js_longitud.setEnabled(true);
    }//GEN-LAST:event_rb_longMouseClicked

    private void rb_shortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_shortMouseClicked
        js_longitud.setEnabled(true);
    }//GEN-LAST:event_rb_shortMouseClicked

    private void jb_agregar_fijMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregar_fijMouseClicked
        try {
            String nombre = tf_nombre.getText();
            String tipo;
            if (rb_string.isSelected()) {
                tipo = "String";
            } else if (rb_int.isSelected()) {
                tipo = "Int";
            } else if (rb_long.isSelected()) {
                tipo = "Long";
            } else if (rb_char.isSelected()) {
                tipo = "Char";
            } else if (rb_double.isSelected()) {
                tipo = "Double";
            } else if (rb_short.isSelected()) {
                tipo = "Short";
            } else {
                tipo = "Float";
            }
            int longitud = (int) js_longitud.getValue();
            boolean entrar = true;
            for (int i = 0; i < campos.size(); i++) {
                if (campos.get(i).isLlave()) {
                    entrar = false;
                }
            }
            boolean llave = false;
            if (entrar && tipo.equals("Int")) {
                int respuesta = JOptionPane.showConfirmDialog(Crear_Fij, "¿Desea que el campo " + nombre + " sea la llave principal?");
                if (respuesta == 0) {
                    llave = true;
                }
            }
            Campo campo = new Campo(nombre, tipo, longitud, llave);
            campos.add(campo);
            JOptionPane.showMessageDialog(Crear_Fij, "¡Campo " + nombre + " agregado exitosamente!");
            tf_nombre.setText("");
            js_longitud.setValue(1);
            rb_string.setSelected(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Crear_Fij, "¡Error!");
        }
    }//GEN-LAST:event_jb_agregar_fijMouseClicked

    private void jb_salir_fijMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salir_fijMouseClicked
        int contador_enteros = 0;
        for (int i = 0; i < campos.size(); i++) {
            if (campos.get(i).getTipo().equals("Int")) {
                contador_enteros++;
            }
        }
        if (contador_enteros == 0) {
            if (tipo_archivo) {
                campos.add(new Campo("Llave", "Int", 10, true));
                JOptionPane.showMessageDialog(this, "-> OBSERVACIÓN\n"
                        + "Ninguno de sus campos creados cumple con los requisitos para ser una llave primaria.\n"
                        + "Por lo que el programa ha creado un nuevo campo,que será su llave primaria, con las siguientes caracteristicas:\n"
                        + "- Nombre: Llave\n"
                        + "- Tipo: Int\n"
                        + "- Longitud: 10\n");
            } else {
                campos.add(new Campo("Llave", "Int", 0, true));
                JOptionPane.showMessageDialog(this, "-> OBSERVACIÓN\n"
                        + "Ninguno de sus campos creados cumple con los requisitos para ser una llave primaria.\n"
                        + "Por lo que el programa ha creado un nuevo campo, que será su llave primaria, con las siguientes caracteristicas:\n"
                        + "- Nombre: Llave\n"
                        + "- Tipo: Int\n");
            }
            File archivo;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = file;
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                bw.write("0;");
                for (int i = 0; i < campos.size(); i++) {
                    bw.write(campos.get(i).toString());
                }
                bw.write("&;");
                bw.flush();
            } catch (Exception e) {
                // e.printStackTrace();
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            indice = new File("./indice" + file.getName());
            FileWriter fw2 = null;
            BufferedWriter bw2 = null;
            try {
                archivo = indice;
                fw2 = new FileWriter(archivo, false);
                bw2 = new BufferedWriter(fw2);
                bw2.write("");
                bw2.flush();
            } catch (Exception e) {
            }
            try {
                bw2.close();
                fw2.close();
            } catch (IOException ex) {
            }

        } else {
            if (!campos.isEmpty()) {
                boolean llave_principal = false;
                for (int i = 0; i < campos.size(); i++) {
                    if (campos.get(i).isLlave()) {
                        llave_principal = true;
                    }
                }
                if (!llave_principal) {
                    String opciones_verificar = "-> Campos del Archivo \n";
                    for (int i = 0; i < campos.size(); i++) {
                        if (campos.get(i).getTipo().equals("Int")) {
                            opciones_verificar += "- " + campos.get(i).getNombre() + "\n";
                        }
                    }
                    opciones_verificar += "¿Desea que alguno de estos campos sea la llave principal?";
                    int respuesta = JOptionPane.showConfirmDialog(this, opciones_verificar);
                    switch (respuesta) {
                        case 1:
                            String opciones = "-> Campos del Archivo \n";
                            for (int i = 0; i < campos.size(); i++) {
                                opciones += (i + 1) + ". " + campos.get(i).getNombre() + "\n";
                            }
                            opciones += "Seleccione la llave principal: ";
                            boolean seguir;
                            int opcion = 0;
                            do {
                                seguir = true;
                                try {
                                    opcion = Integer.parseInt(JOptionPane.showInputDialog(this, opciones));
                                } catch (Exception e) {
                                    seguir = false;
                                    JOptionPane.showMessageDialog(Crear_Fij, "¡Datos incorrectos!");
                                }
                                if (seguir) {
                                    if (opcion <= 0 || opcion > campos.size()) {
                                        seguir = false;
                                        JOptionPane.showMessageDialog(Crear_Fij, "¡Numero incorrecto!");
                                    } else {
                                        if (!campos.get(opcion - 1).getTipo().equals("Int")) {
                                            seguir = false;
                                            JOptionPane.showMessageDialog(Crear_Fij, "¡La llave principal debe ser Int!");
                                        }
                                    }
                                }
                            } while (!seguir);
                            campos.get(opcion - 1).setLlave(true);
                            break;
                        default:
                            if (tipo_archivo) {
                                campos.add(new Campo("Llave", "Int", 10, true));
                                JOptionPane.showMessageDialog(this, "-> OBSERVACIÓN\n"
                                        + "El programa ha creado un nuevo campo, que será su llave primaria, el cual tendrá las siguientes caracteristicas:\n"
                                        + "- Nombre: Llave\n"
                                        + "- Tipo: Int\n"
                                        + "- Longitud: 10\n");
                            } else {
                                campos.add(new Campo("Llave", "Int", 0, true));
                                JOptionPane.showMessageDialog(this, "-> OBSERVACIÓN\n"
                                        + "El programa ha creado un nuevo campo, que será su llave primaria, el cual tendrá las siguientes caracteristicas:\n"
                                        + "- Nombre: Llave\n"
                                        + "- Tipo: Int\n");
                            }
                            break;
                    }
                }
                File archivo;
                FileWriter fw = null;
                BufferedWriter bw = null;
                try {
                    archivo = file;
                    fw = new FileWriter(archivo, false);
                    bw = new BufferedWriter(fw);
                    bw.write("0;");
                    for (int i = 0; i < campos.size(); i++) {
                        bw.write(campos.get(i).toString());
                    }
                    bw.write("&;");
                    bw.flush();
                } catch (Exception e) {
                    // e.printStackTrace();
                }
                try {
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
                }
                indice = new File("./indice" + file.getName());
                FileWriter fw2 = null;
                BufferedWriter bw2 = null;
                try {
                    archivo = indice;
                    fw2 = new FileWriter(archivo, false);
                    bw2 = new BufferedWriter(fw2);
                    bw2.write("");
                    bw2.flush();
                } catch (Exception e) {
                }
                try {
                    bw2.close();
                    fw2.close();
                } catch (IOException ex) {
                }
                //JOptionPane.showMessageDialog(Crear_Fij, "¡Archivo " + file.getName() + " agregado exitosamente!");
            }
        }
        Crear_Fij.dispose();
    }//GEN-LAST:event_jb_salir_fijMouseClicked

    private void jb_agregar_varMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregar_varMouseClicked
        try {
            String nombre = tf_nombre1.getText();
            String tipo;
            if (rb_string1.isSelected()) {
                tipo = "String";
            } else if (rb_int1.isSelected()) {
                tipo = "Int";
            } else if (rb_long1.isSelected()) {
                tipo = "Long";
            } else if (rb_char1.isSelected()) {
                tipo = "Char";
            } else if (rb_double1.isSelected()) {
                tipo = "Double";
            } else if (rb_short1.isSelected()) {
                tipo = "Short";
            } else {
                tipo = "Float";
            }
            boolean entrar = true;
            for (int i = 0; i < campos.size(); i++) {
                if (campos.get(i).isLlave()) {
                    entrar = false;
                }
            }
            boolean llave = false;
            if (entrar && tipo.equals("Int")) {
                int respuesta = JOptionPane.showConfirmDialog(Crear_Var, "¿Desea que el campo " + nombre + " sea la llave principal?");
                if (respuesta == 0) {
                    llave = true;
                }
            }
            Campo campo = new Campo(nombre, tipo, 0, llave);
            campos.add(campo);
            JOptionPane.showMessageDialog(Crear_Var, "¡Campo " + nombre + " agregado exitosamente!");
            tf_nombre1.setText("");
            rb_string1.setSelected(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(Crear_Var, "¡Error!");
        }
    }//GEN-LAST:event_jb_agregar_varMouseClicked

    private void jb_salir_varMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salir_varMouseClicked
        int contador_enteros = 0;
        for (int i = 0; i < campos.size(); i++) {
            if (campos.get(i).getTipo().equals("Int")) {
                contador_enteros++;
            }
        }
        if (contador_enteros == 0) {
            if (tipo_archivo) {
                campos.add(new Campo("Llave", "Int", 10, true));
                JOptionPane.showMessageDialog(this, "-> OBSERVACIÓN\n"
                        + "Ninguno de sus campos creados cumple con los requisitos para ser una llave primaria.\n"
                        + "Por lo que el programa ha creado un nuevo campo,que será su llave primaria, con las siguientes caracteristicas:\n"
                        + "- Nombre: Llave\n"
                        + "- Tipo: Int\n"
                        + "- Longitud: 10\n");
            } else {
                campos.add(new Campo("Llave", "Int", 0, true));
                JOptionPane.showMessageDialog(this, "-> OBSERVACIÓN\n"
                        + "Ninguno de sus campos creados cumple con los requisitos para ser una llave primaria.\n"
                        + "Por lo que el programa ha creado un nuevo campo, que será su llave primaria, con las siguientes caracteristicas:\n"
                        + "- Nombre: Llave\n"
                        + "- Tipo: Int\n");
            }
            File archivo;
            FileWriter fw = null;
            BufferedWriter bw = null;
            try {
                archivo = file;
                fw = new FileWriter(archivo, false);
                bw = new BufferedWriter(fw);
                bw.write("1;");
                for (int i = 0; i < campos.size(); i++) {
                    bw.write(campos.get(i).toString());
                }
                bw.write("&;");
                bw.flush();
            } catch (Exception e) {
                // e.printStackTrace();
            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
            indice = new File("./indice" + file.getName());
            FileWriter fw2 = null;
            BufferedWriter bw2 = null;
            try {
                archivo = indice;
                fw2 = new FileWriter(archivo, false);
                bw2 = new BufferedWriter(fw2);
                bw2.write("");
                bw2.flush();
            } catch (Exception e) {
            }
            try {
                bw2.close();
                fw2.close();
            } catch (IOException ex) {
            }
        } else {
            if (!campos.isEmpty()) {
                boolean llave_principal = false;
                for (int i = 0; i < campos.size(); i++) {
                    if (campos.get(i).isLlave()) {
                        llave_principal = true;
                    }
                }
                if (!llave_principal) {
                    String opciones_verificar = "-> Campos del Archivo \n";
                    for (int i = 0; i < campos.size(); i++) {
                        if (campos.get(i).getTipo().equals("Int")) {
                            opciones_verificar += "- " + campos.get(i).getNombre() + "\n";
                        }
                    }
                    opciones_verificar += "¿Desea que alguno de estos campos sea la llave principal?";
                    int respuesta = JOptionPane.showConfirmDialog(this, opciones_verificar);
                    switch (respuesta) {
                        case 1:
                            String opciones = "-> Campos del Archivo \n";
                            for (int i = 0; i < campos.size(); i++) {
                                opciones += (i + 1) + ". " + campos.get(i).getNombre() + "\n";
                            }
                            opciones += "Seleccione la llave principal: ";
                            boolean seguir;
                            int opcion = 0;
                            do {
                                seguir = true;
                                try {
                                    opcion = Integer.parseInt(JOptionPane.showInputDialog(this, opciones));
                                } catch (Exception e) {
                                    seguir = false;
                                    JOptionPane.showMessageDialog(Crear_Var, "¡Datos incorrectos!");
                                }
                                if (seguir) {
                                    if (opcion <= 0 || opcion > campos.size()) {
                                        seguir = false;
                                        JOptionPane.showMessageDialog(Crear_Var, "¡Numero incorrecto!");
                                    }
                                }
                            } while (!seguir);
                            campos.get(opcion - 1).setLlave(true);
                            break;
                        default:
                            if (tipo_archivo) {
                                campos.add(new Campo("Llave", "Int", 10, true));
                                JOptionPane.showMessageDialog(this, "-> OBSERVACIÓN\n"
                                        + "El programa ha creado un nuevo campo, que será su llave primaria, el cual tendrá las siguientes caracteristicas:\n"
                                        + "- Nombre: Llave\n"
                                        + "- Tipo: Int\n"
                                        + "- Longitud: 10\n");
                            } else {
                                campos.add(new Campo("Llave", "Int", 0, true));
                                JOptionPane.showMessageDialog(this, "-> OBSERVACIÓN\n"
                                        + "El programa ha creado un nuevo campo, que será su llave primaria, el cual tendrá las siguientes caracteristicas:\n"
                                        + "- Nombre: Llave\n"
                                        + "- Tipo: Int\n");
                            }
                            break;
                    }
                }
                File archivo;
                FileWriter fw = null;
                BufferedWriter bw = null;
                try {
                    archivo = file;
                    fw = new FileWriter(archivo, false);
                    bw = new BufferedWriter(fw);
                    bw.write("1;");
                    for (int i = 0; i < campos.size(); i++) {
                        bw.write(campos.get(i).toString2());
                    }
                    bw.write("&;");
                    bw.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
                }
                indice = new File("./indice" + file.getName());
                FileWriter fw2 = null;
                BufferedWriter bw2 = null;
                try {
                    archivo = indice;
                    fw2 = new FileWriter(archivo, false);
                    bw2 = new BufferedWriter(fw2);
                    bw2.write("");
                    bw2.flush();
                } catch (Exception e) {
                }
                try {
                    bw2.close();
                    fw2.close();
                } catch (IOException ex) {
                }
                //JOptionPane.showMessageDialog(Crear_Var, "¡Archivo " + file.getName() + " agregado exitosamente!");
            }
        }
        Crear_Var.dispose();
    }//GEN-LAST:event_jb_salir_varMouseClicked

    private void jmi_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crearActionPerformed
        try {
            String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del nuevo archivo: ");
            String verificar = "";
            if (nombre.length() > 5) {
                verificar = nombre.substring(0, 6);
            }
            campos = new ArrayList();
            if (nombre != null && (!"".equals(nombre)) && (!verificar.equalsIgnoreCase("indice"))) {
                file = new File("./" + nombre + ".txt");
                if (file.exists()) {
                    JOptionPane.showMessageDialog(this, "El archivo ya existe");
                } else {
                    int num = JOptionPane.showConfirmDialog(this, "¿Desea sus campos de longitud variable?");
                    if (num == 0) {
                        Crear_Var.setModal(true);
                        Crear_Var.pack();
                        Crear_Var.setLocationRelativeTo(this);
                        Crear_Var.setVisible(true);
                    } else if (num == 1) {
                        Crear_Fij.setModal(true);
                        Crear_Fij.pack();
                        Crear_Fij.setLocationRelativeTo(this);
                        Crear_Fij.setVisible(true);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "El nombre ingresado es invalido");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jmi_crearActionPerformed

    private void jmi_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_abrirActionPerformed
        if (jmi_abrir.isEnabled()) {
            try {
                String archivo = JOptionPane.showInputDialog(this, "Ingrese el nombre del archivo: ");
                File archivo1 = new File("./" + archivo + ".txt");
                if (archivo1.exists()) {
                    file = archivo1;
                    Scanner sc;
                    campos = new ArrayList();
                    try {
                        sc = new Scanner(file);
                        sc.useDelimiter(";");
                        Campo campo;
                        tipo_archivo = sc.next().equals("0");
                        if (tipo_archivo) {
                            while (sc.hasNext()) {
                                String nombre = sc.next();
                                if (!nombre.equals("&")) {
                                    campo = new Campo(nombre, sc.next(), sc.nextInt(), sc.nextInt() != 0);
                                    campos.add(campo);
                                } else {
                                    break;
                                }
                            }
                        } else {
                            while (sc.hasNext()) {
                                String nombre = sc.next();
                                if (!nombre.equals("&")) {
                                    campo = new Campo(nombre, sc.next(), 0, sc.nextInt() != 0);
                                    campos.add(campo);
                                } else {
                                    break;
                                }
                            }
                        }
                        sc.close();
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "¡Error!");
                    }
                    availList = new LinkedList();
                    jl_archivoactual.setText(archivo + ".txt");
                    DefaultTableModel modelo = (DefaultTableModel) jt_Campo.getModel();
                    modelo.setRowCount(0);
                    int cont = 0;
                    for (int i = 0; i < campos.size(); i++) {
                        cont++;
                        String bool;
                        if (campos.get(i).isLlave()) {
                            bool = "Verdadero";
                        } else {
                            bool = "Falso";
                        }
                        Object[] row = {"Campo #" + cont, campos.get(i).getNombre(), campos.get(i).getTipo(), campos.get(i).getLongitud(), bool};
                        modelo.addRow(row);
                    }
                    jm_campo.setEnabled(true);
                    jm_registro.setEnabled(true);
                    jm_estandarizacion.setEnabled(true);
                    arbol = new ArbolB(4);
                    indice = new File("./indice" + file.getName());
                    try {
                        sc = new Scanner(indice);
                        sc.useDelimiter(";");
                        while (sc.hasNext()) {
                            String temporal = sc.next();
                            if (temporal.charAt(0) != '*' && temporal.charAt(0) != '#') {
                                Registro registro = new Registro(Integer.parseInt(temporal), sc.nextInt(), sc.nextInt());
                                arbol.insert(registro);
                            } else {
                                sc.next();
                                sc.next();
                            }
                        }
                        System.out.println(arbol);//aqui
                        sc.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(this, "¡Error!");
                    }
                    DefaultTableModel model = (DefaultTableModel) jt_registros.getModel();
                    for (int i = 0; i < campos.size(); i++) {
                        model.addColumn(campos.get(i).getNombre());
                    }
                    if (!arbol.isEmpty()) {
                        posiciones = new ArrayStack();
                        sc = new Scanner(file);
                        sc.useDelimiter("&");
                        int tam = sc.next().length() + 2;
                        posiciones.push(tam);
                        int acumulador = tam;
                        try {
                            RandomAccessFile raf = new RandomAccessFile(file, "rw");
                            raf.seek(tam);
                            for (int i = 0; i < 10; i++) {
                                ArrayList<Byte> nuevo_registro = new ArrayList();
                                int contador = 0;
                                do {
                                    byte Byte = raf.readByte();
                                    if (Byte == 59) {
                                        contador++;
                                    }
                                    nuevo_registro.add(Byte);
                                    acumulador++;
                                } while (contador < campos.size());
                                String nuevo_registro1 = "";
                                for (int j = 0; j < nuevo_registro.size(); j++) {
                                    nuevo_registro1 += (char) nuevo_registro.get(j).byteValue();
                                }
                                int posicion = 0;
                                for (int j = 0; j < campos.size(); j++) {
                                    if (campos.get(j).isLlave()) {
                                        posicion = j;
                                    }
                                }
                                String temp = "";
                                int cont_temp = 0;
                                for (int j = 0; j < nuevo_registro1.length(); j++) {
                                    if (nuevo_registro1.charAt(j) != ';') {
                                        temp += nuevo_registro1.charAt(j);
                                    } else {
                                        if (cont_temp == posicion) {
                                            break;
                                        } else {
                                            cont_temp++;
                                            temp = "";
                                        }
                                    }
                                }
                                Registro registro_temp = new Registro(Integer.parseInt(temp));
                                Registro registro = arbol.getRaiz().searchOff(registro_temp);
                                if (registro != null) {
                                    String temporal = "";
                                    Object[] row = new Object[campos.size()];
                                    int contador2 = 0;
                                    for (int k = 0; k < nuevo_registro1.length(); k++) {
                                        if (nuevo_registro1.charAt(k) != ';') {
                                            temporal += nuevo_registro1.charAt(k);
                                        } else {
                                            row[contador2] = temporal;
                                            contador2++;
                                            temporal = "";
                                        }
                                    }
                                    model.addRow(row);
                                } else {
                                    i--;
                                }
                            }
                            raf.close();
                            jb_atras.setEnabled(false);
                            jb_siguiente.setEnabled(true);
                        } catch (Exception e) {
                            jb_siguiente.setEnabled(false);
                        }
                        posiciones.push(acumulador);
                    }
                    jmi_abrir.setEnabled(false);
                    jmi_cerrar.setEnabled(true);
                    sc = new Scanner(indice);
                    sc.useDelimiter(";");
                    while (sc.hasNext()) {
                        String temporal = sc.next();
                        if (temporal.charAt(0) == '*') {
                            availList.add(new Posicion(sc.nextInt(), sc.nextInt()));
                        } else {
                            sc.next();
                            sc.next();
                        }
                    }
                    sc.close();
                    for (int i = 0; i < availList.size(); i++) {
                        System.out.println(availList.get(i));
                    }
                    JOptionPane.showMessageDialog(this, "¡Archivo " + file.getName() + " cargado exitosamente!");
                } else {
                    JOptionPane.showMessageDialog(this, "¡El archivo solicitado no existe!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "¡Error!");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jmi_abrirActionPerformed

    private void jmi_crear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crear1ActionPerformed
        try {
            Scanner sc = new Scanner(file);
            sc.useDelimiter("&");
            sc.next();
            sc.useDelimiter(";");
            sc.next();
            if (!sc.hasNext()) {
                if (!tipo_archivo) {
                    Crear_Var.setModal(true);
                    Crear_Var.pack();
                    Crear_Var.setLocationRelativeTo(this);
                    Crear_Var.setVisible(true);
                } else {
                    Crear_Fij.setModal(true);
                    Crear_Fij.pack();
                    Crear_Fij.setLocationRelativeTo(this);
                    Crear_Fij.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "¡El archivo ya contiene registros, no es posible agregar campos!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "¡Error!");
        }
    }//GEN-LAST:event_jmi_crear1ActionPerformed

    private void jb_cargartablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cargartablaMouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jt_Campo.getModel();
        modelo.setRowCount(0);
        System.out.println(campos);
        int cont = 0;
        for (int i = 0; i < campos.size(); i++) {
            cont++;
            String bool;
            if (campos.get(i).isLlave()) {
                bool = "Verdadero";
            } else {
                bool = "Falso";
            }
            Object[] row = {"Campo #" + cont, campos.get(i).getNombre(), campos.get(i).getTipo(), campos.get(i).getLongitud(), bool};
            modelo.addRow(row);
        }
    }//GEN-LAST:event_jb_cargartablaMouseClicked

    private void jmi_borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_borrar1ActionPerformed
        try {
            Scanner sc = new Scanner(file);
            sc.useDelimiter("&");
            sc.next();
            sc.useDelimiter(";");
            sc.next();
            if (!sc.hasNext()) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el numero del campo que desea eliminar: "));
                int numero_lista = numero - 1;
                if (numero_lista >= 0 && numero_lista < campos.size()) {
                    if (!campos.get(numero_lista).isLlave()) {
                        String nombre = campos.get(numero_lista).getNombre();
                        campos.remove(numero_lista);
                        File archivo;
                        FileWriter fw = null;
                        BufferedWriter bw = null;
                        try {
                            archivo = file;
                            fw = new FileWriter(archivo, false);
                            bw = new BufferedWriter(fw);
                            if (tipo_archivo) {
                                bw.write("0;");
                                for (int i = 0; i < campos.size(); i++) {
                                    bw.write(campos.get(i).toString());
                                }
                                bw.write("&;-1&;");
                                bw.flush();
                            } else {
                                bw.write("1;");
                                for (int i = 0; i < campos.size(); i++) {
                                    bw.write(campos.get(i).toString2());
                                }
                                bw.write("&;-1&;");
                                bw.flush();
                            }
                            bw.close();
                            fw.close();
                        } catch (Exception e) {
                            //e.printStackTrace();
                        }
                        try {
                            bw.close();
                            fw.close();
                        } catch (IOException ex) {
                        }
                        JOptionPane.showMessageDialog(this, "¡Campo " + nombre + " eliminado exitosamente!");
                    } else {
                        JOptionPane.showMessageDialog(this, "¡No se puede eliminar un campo que es llave principal!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "¡El campo no existe!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "¡El archivo ya contiene registros, no es posible eliminar campos!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "¡Error!");
        }
    }//GEN-LAST:event_jmi_borrar1ActionPerformed

    private void jmi_modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificar1ActionPerformed
        try {
            Scanner sc = new Scanner(file);
            sc.useDelimiter("&");
            sc.next();
            sc.useDelimiter(";");
            sc.next();
            if (!sc.hasNext()) {
                int numero = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el numero del campo que desea modificar: "));
                int numero_lista = numero - 1;
                if (numero_lista >= 0 && numero_lista < campos.size()) {
                    if (!campos.get(numero_lista).isLlave()) {
                        if (tipo_archivo) {//fija
                            boolean salir;
                            String respuesta;
                            do {
                                salir = false;
                                respuesta = JOptionPane.showInputDialog(this, "-> Caracteristicas del Campo " + campos.get(numero_lista).getNombre() + "\n"
                                        + "1. Nombre \n"
                                        + "2. Tipo \n"
                                        + "3. Longitud \n"
                                        + "Ingrese el numero de su opción: ");
                                if (respuesta.equals("1") || respuesta.equals("2") || respuesta.equals("3")) {
                                    salir = true;
                                }
                            } while (!salir);
                            switch (respuesta) {
                                case "1":
                                    String nombre = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre del campo " + campos.get(numero_lista).getNombre());
                                    campos.get(numero_lista).setNombre(nombre);
                                    break;
                                case "2":
                                    boolean salir2;
                                    String respuesta2;
                                    do {
                                        salir2 = false;
                                        respuesta2 = JOptionPane.showInputDialog(this, "-> Tipos del Campo \n"
                                                + "1. String \n"
                                                + "2. Double \n"
                                                + "3. Int \n"
                                                + "4. Short \n"
                                                + "5. Char \n"
                                                + "6. Float \n"
                                                + "7. Long \n"
                                                + "Ingrese el numero de su opción: ");
                                        if (respuesta2.equals("1") || respuesta2.equals("2") || respuesta2.equals("3") || respuesta2.equals("4") || respuesta2.equals("5") || respuesta2.equals("6") || respuesta2.equals("7")) {
                                            salir2 = true;
                                        }
                                    } while (!salir2);
                                    String tipo = "";
                                    switch (respuesta2) {
                                        case "1":
                                            tipo = "String";
                                            break;
                                        case "2":
                                            tipo = "Double";
                                            break;
                                        case "3":
                                            tipo = "Int";
                                            break;
                                        case "4":
                                            tipo = "Short";
                                            break;
                                        case "5":
                                            tipo = "Char";
                                            break;
                                        case "6":
                                            tipo = "Float";
                                            break;
                                        case "7":
                                            tipo = "Long";
                                            break;
                                    }
                                    campos.get(numero_lista).setTipo(tipo);
                                    break;
                                case "3":
                                    int longitud = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la nueva edad del campo " + campos.get(numero_lista).getNombre()));
                                    campos.get(numero_lista).setLongitud(longitud);
                                    break;
                            }
                            File archivo;
                            FileWriter fw = null;
                            BufferedWriter bw = null;
                            try {
                                archivo = file;
                                fw = new FileWriter(archivo, false);
                                bw = new BufferedWriter(fw);
                                if (tipo_archivo) {
                                    bw.write("0;");
                                    for (int i = 0; i < campos.size(); i++) {
                                        bw.write(campos.get(i).toString());
                                    }
                                    bw.write("&;-1&;");
                                    bw.flush();
                                } else {
                                    bw.write("1;");
                                    for (int i = 0; i < campos.size(); i++) {
                                        bw.write(campos.get(i).toString2());
                                    }
                                    bw.write("&;-1&;");
                                    bw.flush();
                                }
                                bw.close();
                                fw.close();
                            } catch (Exception e) {
                                //e.printStackTrace();
                            }
                            try {
                                bw.close();
                                fw.close();
                            } catch (IOException ex) {
                            }
                        } else {
                            boolean salir;
                            String respuesta;
                            do {
                                salir = false;
                                respuesta = JOptionPane.showInputDialog(this, "-> Caracteristicas del Campo " + campos.get(numero_lista).getNombre() + "\n"
                                        + "1. Nombre \n"
                                        + "2. Tipo \n"
                                        + "Ingrese el numero de su opción: ");
                                if (respuesta.equals("1") || respuesta.equals("2")) {
                                    salir = true;
                                }
                            } while (!salir);
                            switch (respuesta) {
                                case "1":
                                    String nombre = JOptionPane.showInputDialog(this, "Ingrese el nuevo nombre del campo " + campos.get(numero_lista).getNombre());
                                    campos.get(numero_lista).setNombre(nombre);
                                    break;
                                case "2":
                                    boolean salir2;
                                    String respuesta2;
                                    do {
                                        salir2 = false;
                                        respuesta2 = JOptionPane.showInputDialog(this, "-> Tipos del Campo\n "
                                                + "1. String \n"
                                                + "2. Double \n"
                                                + "3. Int \n"
                                                + "4. Short \n"
                                                + "5. Char \n"
                                                + "6. Float \n"
                                                + "7. Long \n"
                                                + "Ingrese el numero de su opción: ");
                                        if (respuesta2.equals("1") || respuesta2.equals("2") || respuesta2.equals("3") || respuesta2.equals("4") || respuesta2.equals("5") || respuesta2.equals("6") || respuesta2.equals("7")) {
                                            salir2 = true;
                                        }
                                    } while (!salir2);
                                    String tipo = "";
                                    switch (respuesta2) {
                                        case "1":
                                            tipo = "String";
                                            break;
                                        case "2":
                                            tipo = "Double";
                                            break;
                                        case "3":
                                            tipo = "Int";
                                            break;
                                        case "4":
                                            tipo = "Short";
                                            break;
                                        case "5":
                                            tipo = "Char";
                                            break;
                                        case "6":
                                            tipo = "Float";
                                            break;
                                        case "7":
                                            tipo = "Long";
                                            break;
                                    }
                                    campos.get(numero_lista).setTipo(tipo);
                                    break;
                            }
                            File archivo;
                            FileWriter fw = null;
                            BufferedWriter bw = null;
                            try {
                                archivo = file;
                                fw = new FileWriter(archivo, false);
                                bw = new BufferedWriter(fw);
                                if (tipo_archivo) {
                                    bw.write("0;");
                                    for (int i = 0; i < campos.size(); i++) {
                                        bw.write(campos.get(i).toString());
                                    }
                                    bw.write("&;-1&;");
                                    bw.flush();
                                } else {
                                    bw.write("1;");
                                    for (int i = 0; i < campos.size(); i++) {
                                        bw.write(campos.get(i).toString2());
                                    }
                                    bw.write("&;-1&;");
                                    bw.flush();
                                }
                                bw.close();
                                fw.close();
                            } catch (Exception e) {
                                //e.printStackTrace();
                            }
                            try {
                                bw.close();
                                fw.close();
                            } catch (IOException ex) {
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "¡No se puede modificar un campo que es llave principal!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "¡El campo no existe!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "¡El archivo ya contiene registros, no es posible modificar campos!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "¡Error!");
        }
    }//GEN-LAST:event_jmi_modificar1ActionPerformed

    private void jmi_introducir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_introducir2ActionPerformed
        jm_campo.setEnabled(false);
        int key = 0;
        try {
            if (tipo_archivo) {//longitud fija
                String buffer = "";
                for (int i = 0; i < campos.size(); i++) {
                    boolean salir;
                    do {
                        salir = false;
                        int longitud = campos.get(i).getLongitud();
                        if (campos.get(i).getTipo().equals("String")) {
                            String cadena = JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre() + "\nLongitud: " + longitud);
                            if (cadena.length() > longitud) {
                                salir = true;
                                JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                            } else {
                                String nueva_cadena = cadena;
                                for (int j = cadena.length(); j < longitud; j++) {
                                    nueva_cadena += " ";
                                }
                                buffer += nueva_cadena + ";";
                            }
                        } else if (campos.get(i).getTipo().equals("Char")) {
                            String caracter = JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre() + "\nLongitud: " + longitud);
                            if (caracter.length() > longitud) {
                                salir = true;
                                JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                            } else {
                                buffer += caracter + ";";
                            }
                        } else if (campos.get(i).getTipo().equals("Int")) {
                            boolean is = true;
                            int numero = 0;
                            do {
                                numero = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre() + "\nLongitud: " + longitud));
                                if (campos.get(i).isLlave()) {
                                    key = numero;
                                }
                                Registro registro = new Registro(key);
                                Registro verificar = arbol.getRaiz().searchOff(registro);
                                if (verificar == null) {
                                    is = false;
                                } else {
                                    JOptionPane.showMessageDialog(this, "¡La llave ingresada ya existe!\nIngrese una nueva");
                                }
                            } while (is);
                            String num = numero + "";
                            if (num.length() > longitud) {
                                salir = true;
                                JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                            } else {
                                String nueva_cadena = num;
                                for (int j = num.length(); j < longitud; j++) {
                                    nueva_cadena += " ";
                                }
                                buffer += nueva_cadena + ";";
                            }
                        } else if (campos.get(i).getTipo().equals("Double")) {
                            double numero = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre() + "\nLongitud: " + longitud));
                            String num = numero + "";
                            if (num.length() > longitud) {
                                salir = true;
                                JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                            } else {
                                String nueva_cadena = num;
                                for (int j = num.length(); j < longitud; j++) {
                                    nueva_cadena += " ";
                                }
                                buffer += nueva_cadena + ";";
                            }
                        } else if (campos.get(i).getTipo().equals("Short")) {
                            short peque = Short.parseShort(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre() + "\nLongitud: " + longitud));
                            String num = peque + "";
                            if (num.length() > longitud) {
                                salir = true;
                                JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                            } else {
                                String nueva_cadena = num;
                                for (int j = num.length(); j < longitud; j++) {
                                    nueva_cadena += " ";
                                }
                                buffer += nueva_cadena + ";";
                            }
                        } else if (campos.get(i).getTipo().equals("Long")) {
                            long largo = Long.parseLong(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre() + "\nLongitud: " + longitud));
                            String num = largo + "";
                            if (num.length() > longitud) {
                                salir = true;
                                JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                            } else {
                                String nueva_cadena = num;
                                for (int j = num.length(); j < longitud; j++) {
                                    nueva_cadena += " ";
                                }
                                buffer += nueva_cadena + ";";
                            }
                        } else {//float
                            float flotante = Float.parseFloat(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre() + "\nLongitud: " + longitud));
                            String num = flotante + "";
                            if (num.length() > longitud) {
                                salir = true;
                                JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                            } else {
                                String nueva_cadena = num;
                                for (int j = num.length(); j < longitud; j++) {
                                    nueva_cadena += " ";
                                }
                                buffer += nueva_cadena + ";";
                            }
                        }
                    } while (salir);
                }
                boolean seguir = true;
                for (int i = 0; i < availList.size(); i++) {
                    if (buffer.length() <= availList.get(i).getSize()) {
                        String new_buffer = "";
                        for (int j = 0; j < buffer.length() - 1; j++) {
                            new_buffer += buffer.charAt(j);
                        }
                        for (int j = 0; j < availList.get(i).getSize() - buffer.length(); j++) {
                            new_buffer += " ";
                        }
                        new_buffer += ";";
                        RandomAccessFile raf = new RandomAccessFile(file, "rw");
                        raf.seek(availList.get(i).getOffset());
                        raf.writeBytes(new_buffer);
                        raf.close();
                        FileWriter fw2 = null;
                        BufferedWriter bw2 = null;
                        indice = new File("./indice" + file.getName());
                        try {
                            fw2 = new FileWriter(indice, true);
                            bw2 = new BufferedWriter(fw2);
                            bw2.write(key + ";" + availList.get(i).getOffset() + ";" + new_buffer.length() + ";");
                            bw2.flush();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        try {
                            bw2.close();
                            fw2.close();
                        } catch (IOException ex) {
                        }
                        availList.remove(i);
                        seguir = false;
                        int acumulador = 0;
                        Scanner sc = new Scanner(indice);
                        sc.useDelimiter(";");
                        while (sc.hasNext()) {
                            String temporal = sc.next();
                            if (temporal.equals(key + "")) {
                                break;
                            } else {
                                acumulador += temporal.length() + 1;
                            }
                        }
                        RandomAccessFile raf2 = new RandomAccessFile(indice, "rw");
                        raf2.seek(acumulador);
                        raf2.writeByte(35); //numeral
                        raf2.close();
                        break;
                    }
                }
                if (seguir) {
                    //escribir
                    FileWriter fw = null;
                    BufferedWriter bw = null;
                    try {
                        fw = new FileWriter(file, true);
                        bw = new BufferedWriter(fw);
                        bw.write(buffer);
                        bw.flush();
                        bw.close();
                        fw.close();
                    } catch (Exception e) {
                    }
                    FileWriter fw2 = null;
                    BufferedWriter bw2 = null;
                    indice = new File("./indice" + file.getName());
                    try {
                        fw2 = new FileWriter(indice, true);
                        bw2 = new BufferedWriter(fw2);
                        bw2.write(key + ";" + (file.length() - buffer.length()) + ";" + buffer.length() + ";");
                        bw2.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        bw2.close();
                        fw2.close();
                    } catch (IOException ex) {
                    }
                }
            } else {//longitud variable
                String buffer = "";
                for (int i = 0; i < campos.size(); i++) {
                    if (campos.get(i).getTipo().equals("String")) {
                        String cadena = JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre());
                        buffer += cadena + ";";
                    } else if (campos.get(i).getTipo().equals("Char")) {
                        String caracter = JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre());
                        buffer += caracter + ";";
                    } else if (campos.get(i).getTipo().equals("Int")) {
                        boolean is = true;
                        int numero = 0;
                        do {
                            numero = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre()));
                            if (campos.get(i).isLlave()) {
                                key = numero;
                            }
                            Registro registro = new Registro(key);
                            Registro verificar = arbol.getRaiz().searchOff(registro);
                            if (verificar == null) {
                                is = false;
                            } else {
                                JOptionPane.showMessageDialog(this, "¡La llave ingresada ya existe!\nIngrese una nueva");
                            }
                        } while (is);
                        buffer += numero + ";";
                    } else if (campos.get(i).getTipo().equals("Double")) {
                        double numero = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre()));
                        buffer += numero + ";";
                    } else if (campos.get(i).getTipo().equals("Short")) {
                        short peque = Short.parseShort(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre()));
                        buffer += peque + ";";
                    } else if (campos.get(i).getTipo().equals("Long")) {
                        long largo = Long.parseLong(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre()));
                        buffer += largo + ";";
                    } else {//float
                        float flotante = Float.parseFloat(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(i).getNombre()));
                        buffer += flotante + ";";
                    }
                }
                boolean seguir = true;
                for (int i = 0; i < availList.size(); i++) {
                    if (buffer.length() <= availList.get(i).getSize()) {
                        String new_buffer = "";
                        for (int j = 0; j < buffer.length() - 1; j++) {
                            new_buffer += buffer.charAt(j);
                        }
                        for (int j = 0; j < availList.get(i).getSize() - buffer.length(); j++) {
                            new_buffer += " ";
                        }
                        new_buffer += ";";
                        RandomAccessFile raf = new RandomAccessFile(file, "rw");
                        raf.seek(availList.get(i).getOffset());
                        raf.writeBytes(new_buffer);
                        raf.close();
                        FileWriter fw2 = null;
                        BufferedWriter bw2 = null;
                        indice = new File("./indice" + file.getName());
                        try {
                            fw2 = new FileWriter(indice, true);
                            bw2 = new BufferedWriter(fw2);
                            bw2.write(key + ";" + availList.get(i).getOffset() + ";" + new_buffer.length() + ";");
                            bw2.flush();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        try {
                            bw2.close();
                            fw2.close();
                        } catch (IOException ex) {
                        }
                        availList.remove(i);
                        seguir = false;
                        int acumulador = 0;
                        Scanner sc = new Scanner(indice);
                        sc.useDelimiter(";");
                        while (sc.hasNext()) {
                            String temporal = sc.next();
                            if (temporal.equals(key + "")) {
                                break;
                            } else {
                                acumulador += temporal.length() + 1;
                            }
                        }
                        RandomAccessFile raf2 = new RandomAccessFile(indice, "rw");
                        raf2.seek(acumulador);
                        raf2.writeByte(35); //numeral
                        raf2.close();
                        break;
                    }
                }
                if (seguir) {
                    FileWriter fw = null;
                    BufferedWriter bw = null;
                    try {
                        fw = new FileWriter(file, true);
                        bw = new BufferedWriter(fw);
                        bw.write(buffer);
                        bw.flush();
                        bw.close();
                        fw.close();
                    } catch (Exception e) {
                    }
                    FileWriter fw2 = null;
                    BufferedWriter bw2 = null;
                    indice = new File("./indice" + file.getName());
                    try {
                        fw2 = new FileWriter(indice, true);
                        bw2 = new BufferedWriter(fw2);
                        bw2.write(key + ";" + (file.length() - buffer.length()) + ";" + buffer.length() + ";");
                        bw2.flush();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        bw2.close();
                        fw2.close();
                    } catch (IOException ex) {
                    }
                }
            }
            Scanner sc;
            arbol = new ArbolB(4);
            indice = new File("./indice" + file.getName());
            try {
                sc = new Scanner(indice);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String temporal = sc.next();
                    if (temporal.charAt(0) != '*' && temporal.charAt(0) != '#') {
                        Registro registro = new Registro(Integer.parseInt(temporal), sc.nextInt(), sc.nextInt());
                        arbol.insert(registro);
                    } else {
                        sc.next();
                        sc.next();
                    }
                }
                System.out.println(arbol);//aqui
                sc.close();
            } catch (Exception e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(this, "¡Error!");
            }
            JOptionPane.showMessageDialog(this, "¡Registro Agregado exitosamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "¡Ocurrio un error!");
        }
    }//GEN-LAST:event_jmi_introducir2ActionPerformed

    private void jmi_cruzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cruzarActionPerformed
        String archivo = JOptionPane.showInputDialog(this, "Ingrese el nombre del segundo archivo: ");
        String verificar = "";
        if (archivo.length() > 5) {
            verificar = archivo.substring(0, 6);
        }
        File file1 = new File("./" + archivo + ".txt");
        if (file1.exists() && (!file.getName().equals(file1.getName())) && (!verificar.equalsIgnoreCase("indice"))) {
            try {
                Scanner sc = new Scanner(file1);
                sc.useDelimiter("&");
                String cadena1 = sc.next();
                String acum_registros = "";
                sc.useDelimiter(";");
                sc.next();
                while (sc.hasNext()) {
                    acum_registros += sc.next() + ";";
                }
                sc = new Scanner(file);
                sc.useDelimiter("&");
                String cadena2 = sc.next();
                sc.useDelimiter(";");
                sc.next();
                while (sc.hasNext()) {
                    acum_registros += sc.next() + ";";
                }
                if (cadena2.equals(cadena1)) {
                    JOptionPane.showMessageDialog(this, "¡Los archivos se pueden cruzar!");
                    String nuevo_nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del nuevo archivo: ");
                    File file3 = new File("./" + nuevo_nombre + ".txt");
                    FileWriter fw = new FileWriter("./" + nuevo_nombre + ".txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(cadena1 + "&;");
                    bw.write(acum_registros);
                    bw.flush();
                    bw.close();
                    fw.close();
                } else {
                    JOptionPane.showMessageDialog(this, "¡Los archivos no se pueden cruzar!");
                }
                sc.close();
            } catch (FileNotFoundException ex) {
                //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                //Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "¡Archivo cruzado creado exitosamente!");
        } else {
            if (file.getName().equals(file1.getName())) {
                JOptionPane.showMessageDialog(this, "¡Selecciono el mismo archivo!");
            } else {
                JOptionPane.showMessageDialog(this, "¡El archivo no existe!");
            }
        }
    }//GEN-LAST:event_jmi_cruzarActionPerformed

    private void jmi_buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_buscar2ActionPerformed
        try {
            String nombre = "";
            for (int i = 0; i < campos.size(); i++) {
                if (campos.get(i).isLlave()) {
                    nombre = campos.get(i).getNombre();
                }
            }
            int key = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la llave principal " + nombre + " del registro que desea buscar:"));
            Registro registro = arbol.getRaiz().searchOff(new Registro(key));
            if (registro != null) {
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                raf.seek(registro.offset);
                byte[] nuevo_registro = new byte[registro.size];
                for (int i = 0; i < registro.size; i++) {
                    nuevo_registro[i] = raf.readByte();
                }
                String nuevo_registro1 = "";
                for (int i = 0; i < nuevo_registro.length; i++) {
                    nuevo_registro1 += ((char) nuevo_registro[i]);
                }
                raf.close();
                String temporal = "", mensaje = "-> Registro Cargado\n";
                int contador = 0;
                for (int i = 0; i < nuevo_registro1.length(); i++) {
                    if (nuevo_registro1.charAt(i) != ';') {
                        temporal += nuevo_registro1.charAt(i);
                    } else {
                        mensaje += "- " + campos.get(contador).getNombre() + ": " + temporal + "\n";
                        contador++;
                        temporal = "";
                    }
                }
                JOptionPane.showMessageDialog(this, mensaje);
            } else {
                JOptionPane.showMessageDialog(this, "¡El registro que está buscando no se encontró!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "¡Error!");
        }
    }//GEN-LAST:event_jmi_buscar2ActionPerformed

    private void jmi_modificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificar2ActionPerformed
        try {
            String nombre = "", pregunta = "-> Campos del Registro\n";
            for (int i = 0; i < campos.size(); i++) {
                if (campos.get(i).isLlave()) {
                    nombre = campos.get(i).getNombre();
                }
                pregunta += (i + 1) + ". " + campos.get(i).getNombre() + "\n";
            }
            pregunta += "Ingrese el numero del campo que desea modificar: ";
            int key = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la llave principal " + nombre + " del registro que desea modificar:"));

            Registro buscar = new Registro(key);
            Registro buscado = arbol.getRaiz().searchOff(buscar);
            if (buscado != null) {//revisa si existe
                int respuesta = Integer.parseInt(JOptionPane.showInputDialog(this, pregunta)) - 1;
                if (respuesta >= 0 && respuesta < campos.size()) {//revisa que la respuesta sea valida
                    if (tipo_archivo) {//fijo
                        boolean salir;
                        String buffer = "";
                        do {
                            salir = false;
                            int longitud = campos.get(respuesta).getLongitud();
                            System.out.println(campos.get(respuesta).isLlave());
                            if (!campos.get(respuesta).isLlave()) {//revisa que no se pueda modificar la llave principal
                                if (campos.get(respuesta).getTipo().equals("String")) {
                                    String cadena = JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre() + "\nLongitud: " + longitud);
                                    if (cadena.length() > longitud) {
                                        salir = true;
                                        JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                                    } else {
                                        String nueva_cadena = cadena;
                                        for (int j = cadena.length(); j < longitud; j++) {
                                            nueva_cadena += " ";
                                        }
                                        buffer += nueva_cadena + ";";
                                    }
                                } else if (campos.get(respuesta).getTipo().equals("Char")) {
                                    String caracter = JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre() + "\nLongitud: " + longitud);
                                    if (caracter.length() > longitud) {
                                        salir = true;
                                        JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                                    } else {
                                        buffer += caracter + ";";
                                    }
                                } else if (campos.get(respuesta).getTipo().equals("Int")) {
                                    int numero = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre() + "\nLongitud: " + longitud));
                                    if (campos.get(respuesta).isLlave()) {
                                        key = numero;
                                    }
                                    String num = numero + "";
                                    if (num.length() > longitud) {
                                        salir = true;
                                        JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                                    } else {
                                        String nueva_cadena = num;
                                        for (int j = num.length(); j < longitud; j++) {
                                            nueva_cadena += " ";
                                        }
                                        buffer += nueva_cadena + ";";
                                    }
                                } else if (campos.get(respuesta).getTipo().equals("Double")) {
                                    double numero = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre() + "\nLongitud: " + longitud));
                                    String num = numero + "";
                                    if (num.length() > longitud) {
                                        salir = true;
                                        JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                                    } else {
                                        String nueva_cadena = num;
                                        for (int j = num.length(); j < longitud; j++) {
                                            nueva_cadena += " ";
                                        }
                                        buffer += nueva_cadena + ";";
                                    }
                                } else if (campos.get(respuesta).getTipo().equals("Short")) {
                                    short peque = Short.parseShort(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre() + "\nLongitud: " + longitud));
                                    String num = peque + "";
                                    if (num.length() > longitud) {
                                        salir = true;
                                        JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                                    } else {
                                        String nueva_cadena = num;
                                        for (int j = num.length(); j < longitud; j++) {
                                            nueva_cadena += " ";
                                        }
                                        buffer += nueva_cadena + ";";
                                    }
                                } else if (campos.get(respuesta).getTipo().equals("Long")) {
                                    long largo = Long.parseLong(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre() + "\nLongitud: " + longitud));
                                    String num = largo + "";
                                    if (num.length() > longitud) {
                                        salir = true;
                                        JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                                    } else {
                                        String nueva_cadena = num;
                                        for (int j = num.length(); j < longitud; j++) {
                                            nueva_cadena += " ";
                                        }
                                        buffer += nueva_cadena + ";";
                                    }
                                } else {//float
                                    float flotante = Float.parseFloat(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre() + "\nLongitud: " + longitud));
                                    String num = flotante + "";
                                    if (num.length() > longitud) {
                                        salir = true;
                                        JOptionPane.showMessageDialog(this, "La longitud del campo tiene que ser menor o igual a " + longitud);
                                    } else {
                                        String nueva_cadena = num;
                                        for (int j = num.length(); j < longitud; j++) {
                                            nueva_cadena += " ";
                                        }
                                        buffer += nueva_cadena + ";";
                                    }
                                }
                                //Modificar el registro
                                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                                raf.seek(buscado.offset);
                                byte[] nuevo_registro = new byte[buscado.size];
                                for (int i = 0; i < buscado.size; i++) {
                                    nuevo_registro[i] = raf.readByte();
                                }
                                String nuevo_registro1 = "";
                                for (int i = 0; i < nuevo_registro.length; i++) {
                                    nuevo_registro1 += ((char) nuevo_registro[i]);
                                }
                                raf.close();
                                String modificado = "";
                                String acumulador = "";
                                int contador_campo = 0;
                                for (int i = 0; i < nuevo_registro1.length(); i++) {
                                    if (nuevo_registro1.charAt(i) != ';') {
                                        acumulador += nuevo_registro1.charAt(i);
                                    } else {
                                        if (contador_campo != respuesta) {
                                            if (i != nuevo_registro.length - 1) {
                                                modificado += acumulador + ";";
                                            } else {
                                                modificado += acumulador;
                                            }
                                        } else {
                                            if (i != nuevo_registro.length - 1) {
                                                modificado += buffer + ";";
                                            } else {
                                                modificado += buffer;
                                            }
                                        }
                                        contador_campo++;
                                        acumulador = "";
                                    }
                                }
                                if (modificado.length() <= buscado.getSize()) {
                                    RandomAccessFile rf = new RandomAccessFile(file, "rw");
                                    for (int i = 0; i < buscado.getSize() - modificado.length()-1; i++) {
                                        modificado += " ";
                                    }
                                    modificado += ";";
                                    rf.seek(buscado.getOffset());
                                    rf.writeBytes(modificado);
                                    rf.close();
                                    JOptionPane.showMessageDialog(this, "¡Registro modificado exitosamente!");
                                } else {
                                    JOptionPane.showMessageDialog(this, "¡El nuevo registro no cumple con los requisitos!");
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "¡No se puede modificar la llave principal!");
                                salir = false;
                            }
                        } while (salir);
                    } else {//variable
                        String buffer = "";
                        if (!campos.get(respuesta).isLlave()) {
                            if (campos.get(respuesta).getTipo().equals("String")) {
                                String cadena = JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre());
                                buffer += cadena;
                            } else if (campos.get(respuesta).getTipo().equals("Char")) {
                                String caracter = JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre());
                                buffer += caracter;
                            } else if (campos.get(respuesta).getTipo().equals("Int")) {
                                int numero = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre()));
                                if (campos.get(respuesta).isLlave()) {
                                    key = numero;
                                }
                                buffer += numero;
                            } else if (campos.get(respuesta).getTipo().equals("Double")) {
                                double numero = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre()));
                                buffer += numero;
                            } else if (campos.get(respuesta).getTipo().equals("Short")) {
                                short peque = Short.parseShort(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre()));
                                buffer += peque;
                            } else if (campos.get(respuesta).getTipo().equals("Long")) {
                                long largo = Long.parseLong(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre()));
                                buffer += largo;
                            } else {//float
                                float flotante = Float.parseFloat(JOptionPane.showInputDialog(this, "Ingrese los datos del campo " + campos.get(respuesta).getNombre()));
                                buffer += flotante;
                            }
                            //Modificar el registro
                            RandomAccessFile raf = new RandomAccessFile(file, "rw");
                            raf.seek(buscado.offset);
                            byte[] nuevo_registro = new byte[buscado.size];
                            for (int i = 0; i < buscado.size; i++) {
                                nuevo_registro[i] = raf.readByte();
                            }
                            String nuevo_registro1 = "";
                            for (int i = 0; i < nuevo_registro.length; i++) {
                                nuevo_registro1 += ((char) nuevo_registro[i]);
                            }
                            raf.close();
                            String modificado = "";
                            String acumulador = "";
                            int contador_campo = 0;
                            for (int i = 0; i < nuevo_registro1.length(); i++) {
                                if (nuevo_registro1.charAt(i) != ';') {
                                    acumulador += nuevo_registro1.charAt(i);
                                } else {
                                    if (contador_campo != respuesta) {
                                        if (i != nuevo_registro.length - 1) {
                                            modificado += acumulador + ";";
                                        } else {
                                            modificado += acumulador;
                                        }
                                    } else {
                                        if (i != nuevo_registro.length - 1) {
                                            modificado += buffer + ";";
                                        } else {
                                            modificado += buffer;
                                        }
                                    }
                                    contador_campo++;
                                    acumulador = "";
                                }
                            }
                            if (modificado.length() <= buscado.getSize()) {
                                RandomAccessFile rf = new RandomAccessFile(file, "rw");
                                for (int i = 0; i < buscado.getSize() - modificado.length()-1; i++) {
                                    modificado += " ";
                                }
                                modificado += ";";
                                rf.seek(buscado.getOffset());
                                rf.writeBytes(modificado);
                                rf.close();
                                JOptionPane.showMessageDialog(this, "¡Registro modificado exitosamente!");
                            } else {
                                JOptionPane.showMessageDialog(this, "¡El nuevo registro no cumple con los requisitos!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "¡No se puede modificar la llave principal!");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "¡El numero ingresado es incorrecto!");
                }
            } else {
                JOptionPane.showMessageDialog(this, "¡El registro solicitado no existe!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "¡Error!");
        }
    }//GEN-LAST:event_jmi_modificar2ActionPerformed

    private void jb_siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_siguienteMouseClicked
        if (jb_siguiente.isEnabled()) {
            int nuevo_acumulador = (int) posiciones.top();
            DefaultTableModel model = (DefaultTableModel) jt_registros.getModel();
            model.setRowCount(0);
            try {
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                raf.seek((int) posiciones.top());
                for (int i = 0; i < 10; i++) {
                    ArrayList<Byte> nuevo_registro = new ArrayList();
                    int contador = 0;
                    do {
                        byte Byte = raf.readByte();
                        if (Byte == 59) {
                            contador++;
                        }
                        nuevo_registro.add(Byte);
                        nuevo_acumulador++;
                    } while (contador < campos.size());
                    String nuevo_registro1 = "";
                    for (int j = 0; j < nuevo_registro.size(); j++) {
                        nuevo_registro1 += (char) nuevo_registro.get(j).byteValue();
                    }
                    int posicion = 0;
                    for (int j = 0; j < campos.size(); j++) {
                        if (campos.get(j).isLlave()) {
                            posicion = j;
                        }
                    }
                    String temp = "";
                    int cont_temp = 0;
                    for (int j = 0; j < nuevo_registro1.length(); j++) {
                        if (nuevo_registro1.charAt(j) != ';') {
                            temp += nuevo_registro1.charAt(j);
                        } else {
                            if (cont_temp == posicion) {
                                break;
                            } else {
                                cont_temp++;
                                temp = "";
                            }
                        }
                    }
                    Registro registro_temp = new Registro(Integer.parseInt(temp));
                    Registro registro = arbol.getRaiz().searchOff(registro_temp);
                    if (registro != null) {
                        String temporal = "";
                        Object[] row = new Object[campos.size()];
                        int contador2 = 0;
                        for (int k = 0; k < nuevo_registro1.length(); k++) {
                            if (nuevo_registro1.charAt(k) != ';') {
                                temporal += nuevo_registro1.charAt(k);
                            } else {
                                row[contador2] = temporal;
                                contador2++;
                                temporal = "";
                            }
                        }
                        model.addRow(row);
                    } else {
                        i--;
                    }
                }
                raf.close();
            } catch (Exception e) {
                jb_siguiente.setEnabled(false);
            }
            posiciones.push(nuevo_acumulador);
            jb_atras.setEnabled(true);
        }
    }//GEN-LAST:event_jb_siguienteMouseClicked

    private void jb_atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_atrasMouseClicked
        if (jb_atras.isEnabled()) {
            posiciones.pop();
            posiciones.pop();
            int nuevo_acumulador = (int) posiciones.top();
            DefaultTableModel model = (DefaultTableModel) jt_registros.getModel();
            model.setRowCount(0);
            try {
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                raf.seek((int) posiciones.top());
                for (int i = 0; i < 10; i++) {
                    ArrayList<Byte> nuevo_registro = new ArrayList();
                    int contador = 0;
                    do {
                        byte Byte = raf.readByte();
                        if (Byte == 59) {
                            contador++;
                        }
                        nuevo_registro.add(Byte);
                        nuevo_acumulador++;
                    } while (contador < campos.size());
                    String nuevo_registro1 = "";
                    for (int j = 0; j < nuevo_registro.size(); j++) {
                        nuevo_registro1 += (char) nuevo_registro.get(j).byteValue();
                    }
                    int posicion = 0;
                    for (int j = 0; j < campos.size(); j++) {
                        if (campos.get(j).isLlave()) {
                            posicion = j;
                        }
                    }
                    String temp = "";
                    int cont_temp = 0;
                    for (int j = 0; j < nuevo_registro1.length(); j++) {
                        if (nuevo_registro1.charAt(j) != ';') {
                            temp += nuevo_registro1.charAt(j);
                        } else {
                            if (cont_temp == posicion) {
                                break;
                            } else {
                                cont_temp++;
                                temp = "";
                            }
                        }
                    }
                    Registro registro_temp = new Registro(Integer.parseInt(temp));
                    Registro registro = arbol.getRaiz().searchOff(registro_temp);
                    if (registro != null) {
                        String temporal = "";
                        Object[] row = new Object[campos.size()];
                        int contador2 = 0;
                        for (int k = 0; k < nuevo_registro1.length(); k++) {
                            if (nuevo_registro1.charAt(k) != ';') {
                                temporal += nuevo_registro1.charAt(k);
                            } else {
                                row[contador2] = temporal;
                                contador2++;
                                temporal = "";
                            }
                        }
                        model.addRow(row);
                    } else {
                        i--;
                    }
                }
                raf.close();
            } catch (Exception e) {
                jb_siguiente.setEnabled(false);
            }
            posiciones.push(nuevo_acumulador);
            jb_siguiente.setEnabled(true);
            if (posiciones.size <= 1) {
                jb_atras.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jb_atrasMouseClicked

    private void jmi_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cerrarActionPerformed
        if (jmi_cerrar.isEnabled()) {
            file = null;
            campos = new ArrayList();
            posiciones = new ArrayStack();
            jl_archivoactual.setText("");
            DefaultTableModel model = (DefaultTableModel) jt_Campo.getModel();
            model.setRowCount(0);
            model = (DefaultTableModel) jt_registros.getModel();
            model.setRowCount(0);
            model.setColumnCount(0);
            jmi_abrir.setEnabled(true);
            jmi_cerrar.setEnabled(false);
            JOptionPane.showMessageDialog(this, "¡Archivo cerrado exitosamente!");
        }
    }//GEN-LAST:event_jmi_cerrarActionPerformed

    private void jmi_eliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_eliminar2ActionPerformed
        try {
            String nombre = "";
            for (int i = 0; i < campos.size(); i++) {
                if (campos.get(i).isLlave()) {
                    nombre = campos.get(i).getNombre();
                }
            }
            int key = Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese la llave principal " + nombre + " del registro que desea eliminar:"));
            Registro registro = arbol.getRaiz().searchOff(new Registro(key));
            if (registro != null) {
                indice = new File("./indice" + file.getName());
                int acumulador = 0;
                Scanner sc = new Scanner(indice);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    String temporal = sc.next();
                    if (temporal.equals(key + "")) {
                        break;
                    } else {
                        acumulador += temporal.length() + 1;
                    }
                }
                int cont_raf = 0;
                String temp_raf = "";
                RandomAccessFile raf = new RandomAccessFile(indice, "rw");
                raf.seek(acumulador);
                while (cont_raf != 2) {
                    byte Byte = raf.readByte();
                    if (Byte != 59 && cont_raf == 1) {
                        temp_raf += (char) Byte;
                    } else {
                        if (Byte == 59) {
                            cont_raf++;
                        }
                    }
                }
                raf.seek(acumulador);
                raf.writeByte(42);
                raf.close();
                RandomAccessFile raf2 = new RandomAccessFile(file, "rw");
                raf2.seek(Integer.parseInt(temp_raf));
                int cont_raf2 = 0, acum_raf2 = 0;
                while (cont_raf2 != campos.size()) {
                    if (raf2.readByte() == 59) {
                        cont_raf2++;
                    }
                    acum_raf2++;
                }
                raf2.close();
                Posicion posicion = new Posicion(Integer.parseInt(temp_raf), acum_raf2);
                availList.add(posicion);
                arbol = new ArbolB(4);
                indice = new File("./indice" + file.getName());
                try {
                    sc = new Scanner(indice);
                    sc.useDelimiter(";");
                    while (sc.hasNext()) {
                        String temporal = sc.next();
                        if (temporal.charAt(0) != '*' && temporal.charAt(0) != '#') {
                            Registro registro_temp = new Registro(Integer.parseInt(temporal), sc.nextInt(), sc.nextInt());
                            arbol.insert(registro_temp);
                        } else {
                            sc.next();
                            sc.next();
                        }
                    }
                    System.out.println(arbol);//aqui
                    sc.close();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "¡Error!");
                }
                JOptionPane.showMessageDialog(this, "¡Registro borrado exitosamente!");
            } else {
                JOptionPane.showMessageDialog(this, "¡El registro que desea eliminar no se encontró!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "¡Error!");
        }
    }//GEN-LAST:event_jmi_eliminar2ActionPerformed

    private void jmi_excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_excelActionPerformed
        /*Excel e = new Excel();
        try {
            e.exportarExcel(file, campos.size(), campos);
        } catch (IOException ex) {
           // Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jmi_excelActionPerformed

    private void jmi_xmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_xmlActionPerformed
        try {
            Scanner sc = new Scanner(file);
            sc.useDelimiter(";");
            sc.next();
            //DocumentBuilderFactory
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            //DocumentBuilder
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            //Document
            Document xmlDoc = docBuilder.newDocument();
            //Build XML elements
            //<Campos>
            //  <Campo>
            //      <Nombre> tal </Nombre>
            //      <Tipo> tal </Tipo>
            //      <Longitud> tal </Longitud>
            //  </Campo>
            //</Campos>
            Element rootElement = xmlDoc.createElement("Campos");
            while (sc.hasNext()) {
                String actual = sc.next();
                if (!actual.equals("&")) {
                    Element campo = xmlDoc.createElement("Campo");
                    //nombre
                    Text nombre = xmlDoc.createTextNode(actual);
                    Element Enombre = xmlDoc.createElement("Nombre");
                    //tipo
                    Text tipo = xmlDoc.createTextNode(sc.next());
                    Element Etipo = xmlDoc.createElement("Tipo");
                    //longitud
                    Text longitud = xmlDoc.createTextNode(sc.next());
                    Element Elongitud = xmlDoc.createElement("Longitud");
                    //Append interno
                    Enombre.appendChild(nombre);
                    Etipo.appendChild(tipo);
                    Elongitud.appendChild(longitud);
                    //Append externo
                    campo.appendChild(Enombre);
                    campo.appendChild(Etipo);
                    campo.appendChild(Elongitud);
                    //append a los campos
                    rootElement.appendChild(campo);
                } else {
                    break;
                }
            }
            //REGISTROS
            Element segundo = xmlDoc.createElement("Registros");
            while (sc.hasNext()) {
                Element registro = xmlDoc.createElement("Registro");
                for (int i = 0; i < campos.size(); i++) {
                    Text contenido = xmlDoc.createTextNode(sc.next());//Contenido del campo
                    Element name = xmlDoc.createElement(campos.get(i).getNombre());//nombre del campo
                    name.appendChild(contenido);//se le pone el contenido al campo
                    registro.appendChild(name);//se le agrega el campo al registro
                    segundo.appendChild(registro);//se agrega el registro al final del xml
                }
            }
            //
            rootElement.appendChild(segundo);
            xmlDoc.appendChild(rootElement);

            //Set output
            OutputFormat outF = new OutputFormat(xmlDoc);
            outF.setIndenting(true);
            //Declare the file
            String n = file.getName();
            String n2 = "";
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) != '.') {
                    n2 += n.charAt(i);
                } else {
                    break;
                }
            }
            File xmlFile = new File("./" + "xml" + n2 + ".xml");
            //Declare the fileOutputStream
            FileOutputStream outStream = new FileOutputStream(xmlFile);
            //XMLSERIALIZER
            XMLSerializer serial = new XMLSerializer(outStream, outF);
            //serialize
            serial.serialize(xmlDoc);
            JOptionPane.showMessageDialog(this, "¡Exportado a XML exitosamente!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "NOP");
        }
    }//GEN-LAST:event_jmi_xmlActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Crear_Fij;
    private javax.swing.JDialog Crear_Var;
    private javax.swing.ButtonGroup dato;
    private javax.swing.ButtonGroup dato2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jb_agregar_fij;
    private javax.swing.JButton jb_agregar_var;
    private javax.swing.JButton jb_atras;
    private javax.swing.JButton jb_cargartabla;
    private javax.swing.JButton jb_salir_fij;
    private javax.swing.JButton jb_salir_var;
    private javax.swing.JButton jb_siguiente;
    private javax.swing.JLabel jl_archivoactual;
    private javax.swing.JMenu jm_archivo;
    private javax.swing.JMenu jm_campo;
    private javax.swing.JMenu jm_estandarizacion;
    private javax.swing.JMenu jm_registro;
    private javax.swing.JMenuItem jmi_abrir;
    private javax.swing.JMenuItem jmi_borrar1;
    private javax.swing.JMenuItem jmi_buscar2;
    private javax.swing.JMenuItem jmi_cerrar;
    private javax.swing.JMenuItem jmi_crear;
    private javax.swing.JMenuItem jmi_crear1;
    private javax.swing.JMenuItem jmi_cruzar;
    private javax.swing.JMenuItem jmi_eliminar2;
    private javax.swing.JMenuItem jmi_excel;
    private javax.swing.JMenuItem jmi_introducir2;
    private javax.swing.JMenuItem jmi_modificar1;
    private javax.swing.JMenuItem jmi_modificar2;
    private javax.swing.JMenuItem jmi_xml;
    private javax.swing.JPanel jp_fija;
    private javax.swing.JSpinner js_longitud;
    private javax.swing.JTable jt_Campo;
    private javax.swing.JTable jt_registros;
    private javax.swing.JRadioButton rb_char;
    private javax.swing.JRadioButton rb_char1;
    private javax.swing.JRadioButton rb_double;
    private javax.swing.JRadioButton rb_double1;
    private javax.swing.JRadioButton rb_float;
    private javax.swing.JRadioButton rb_float1;
    private javax.swing.JRadioButton rb_int;
    private javax.swing.JRadioButton rb_int1;
    private javax.swing.JRadioButton rb_long;
    private javax.swing.JRadioButton rb_long1;
    private javax.swing.JRadioButton rb_short;
    private javax.swing.JRadioButton rb_short1;
    private javax.swing.JRadioButton rb_string;
    private javax.swing.JRadioButton rb_string1;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre1;
    // End of variables declaration//GEN-END:variables
}
