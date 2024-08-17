/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package manejocadenas;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.BadLocationException;
import javax.swing.JOptionPane;

 /*
 * @author felix
 */
public class Pantalla extends javax.swing.JFrame {
    
    JFileChooser seleccionar=new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
        public void Palabras_pares_impares(String cadena, int contador){
        String[] words = cadena.split("\\s+");
        int par=0;
        int impar=0;
        for (int i = 0; i <= contador; i++) {
                words[i] = words[i].replaceAll("[^\\w]", "");
                int par_impar = words[i].length();
                System.out.println(par_impar);
                if (par_impar % 2 == 0){
                    impar += 1;
                    txt_par.setText("" + impar);
                    
                }else{
                    par += 1;
                    txt_impar.setText("" + par);
                }    
        }   
    }
    
    public void Repeticiones_letra_u(String cadena){
        int contadorVocales = 0;
        char letraArray[] = cadena.toCharArray();
        char letra = letraArray[0];
        int contadorLetraRepetida = 0;

        for(int i=0; i<cadena.length(); i++){
            switch(cadena.charAt(i)){
                case 'u': case 'U': case 'ú':
                    contadorVocales++;
                    break;
            }
        }
        txt_u.setText("" + contadorVocales);
    }
    
    public void Repeticiones_letra_o(String cadena){
        int contadorVocales = 0;
        char letraArray[] = cadena.toCharArray();
        char letra = letraArray[0];
        int contadorLetraRepetida = 0;

        for(int i=0; i<cadena.length(); i++){
            switch(cadena.charAt(i)){
                case 'o': case 'O': case 'ó':
                    contadorVocales++;
                    break;
            }
        }
        txt_o.setText("" + contadorVocales);
    }
    
    public void Repeticiones_letra_i(String cadena){
        int contadorVocales = 0;
        char letraArray[] = cadena.toCharArray();
        char letra = letraArray[0];
        int contadorLetraRepetida = 0;

        for(int i=0; i<cadena.length(); i++){
            switch(cadena.charAt(i)){
                case 'i': case 'I': case 'í':
                    contadorVocales++;
                    break;
            }
        }
        txt_i.setText("" + contadorVocales);
    }
    
    public void Repeticiones_letra_e(String cadena){
        int contadorVocales = 0;
        char letraArray[] = cadena.toCharArray();
        char letra = letraArray[0];
        int contadorLetraRepetida = 0;

        for(int i=0; i<cadena.length(); i++){
            switch(cadena.charAt(i)){
                case 'e': case 'E': case 'é':
                    contadorVocales++;
                    break;
            }
        }
        txt_e.setText("" + contadorVocales);
    }
    
     public void Repeticiones_letra_a(String cadena){
        int contadorVocales = 0;
        char letraArray[] = cadena.toCharArray();
        char letra = letraArray[0];
        int contadorLetraRepetida = 0;

        for(int i=0; i<cadena.length(); i++){
            switch(cadena.charAt(i)){
                case 'a': case 'A': case 'á':
                    contadorVocales++;
                    break;
            }
        }
        txt_a.setText("" + contadorVocales);
    }
    
    public void ultimapalabra(){
    String longitud=txt_area.getText();
        int cadena=longitud.lastIndexOf(" ");
        String ult=longitud.substring(cadena);
        txt_ultpalabra.setText(ult);

    }    
     public void Palabra_central(String cadena, int contador){    
        String[] words = cadena.split("\\s+");
        int mitad = contador/2;
        if (contador%2!=0){
            mitad = mitad + 1;
        }
        int contador2 = mitad - 1;
        for (int i = 0; i <= mitad; i++) {
            if(i == contador2){
                words[i] = words[i].replaceAll("[^\\w]", "");
                txt_palabce.setText("" + words[i]);
            }
        }  
    }
    
    public void letrac(){   
    String longitud=txt_area.getText();
     int num = longitud.length();
    for (int i=0;i<=(num-1);i++){
        int j=i/2;
        char cadena=longitud.charAt(j);
        txt_letrac.setText(String.valueOf(cadena));
        }
    }   
    public void ultletra(){
    String longitud=txt_area.getText();
     int num = longitud.length();
    for (int i=0;i<=(num-1);i++){
        char cadena=longitud.charAt(i);
        txt_ultletra.setText(String.valueOf(cadena));
    }
    }       
    public void primerletra(){
    String longitud=txt_area.getText();
        char cadena=longitud.charAt(0);
        txt_1letra.setText(String.valueOf(cadena));
    }    
    public void longitudpalabras(){
    String longitud=txt_area.getText();
    StringTokenizer st= new StringTokenizer(longitud);
        txt_palab.setText(""+st.countTokens());
    
    }    
    
    public void longitud(){
    String longitud=txt_area.getText();
    int cadena=longitud.length();
        txt_long.setText(String.valueOf(cadena));
    
    }    
    public void copiar(String copiar){
        StringSelection ss=new StringSelection(copiar);
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        cb.setContents(ss, null);
    }
    
    public String pegar(){
        String resultado="";
        Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contenido=cb.getContents(null);
        if(contenido.isDataFlavorSupported(DataFlavor.stringFlavor)){
            try {
                resultado=(String) contenido.getTransferData(DataFlavor.stringFlavor);
            } catch (UnsupportedFlavorException | IOException ex) {
               JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        return resultado;
    }
    
    public String AbrirArchivo (File archivo){
        String documento="";
            try{
                entrada=new FileInputStream(archivo);
                int ascci;
                while((ascci=entrada.read())!=-1){
                    char caracter=(char)ascci;
                    documento+=caracter;
                }
            }catch(IOException e){
            }
            return documento;    
        }

    public String GuardarArchivo (File archivo,String documento){
        String mensaje=null;
        try{
            salida=new FileOutputStream(archivo);
            byte[]bytxt=documento.getBytes();
            salida.write(bytxt);
            mensaje="Archivo Guardado";
        }catch(IOException e){
        }
        return mensaje;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        txt_area = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_long = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_a = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_palab = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_e = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_1letra = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_i = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_ultletra = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_o = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_letrac = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_u = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_1palab = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_par = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_palabce = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_impar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_ultpalabra = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_murcielago = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(102, 255, 255));

        jInternalFrame1.setVisible(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        txt_area.setBackground(new java.awt.Color(204, 204, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 0));
        jLabel10.setText("MANEJO DE CADENAS");

        jLabel9.setText("Ingrese un Texto o abra un Archivo");

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setText("Procesar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Longitud De Texto");

        jLabel12.setText("Repeticiones \"A\",\"a\"ó\"á\".");

        jLabel2.setText("Total De Palabras");

        jLabel13.setText("Repeticiones \"E\",\"e\"ó\"é\".");

        jLabel3.setText("Primer Letra Del Texto");

        txt_1letra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_1letraActionPerformed(evt);
            }
        });

        jLabel14.setText("Repeticiones  \"I\", \"i\" ó \"í\".");

        jLabel4.setText("Ultima Letra Del Texto");

        jLabel15.setText("Repeticiones \"O\",\"o\"ó\"ó\".");

        jLabel5.setText("Letra Central Del Texto");

        txt_letrac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_letracActionPerformed(evt);
            }
        });

        jLabel16.setText("Repeticiones \"U\",\"u\"ó\"ú\".");

        txt_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_uActionPerformed(evt);
            }
        });

        jLabel6.setText("Primera Palabra");

        txt_1palab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_1palabActionPerformed(evt);
            }
        });

        jLabel17.setText("Palabras cantidad caracteres par.");

        txt_par.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_parActionPerformed(evt);
            }
        });

        jLabel7.setText("Palabra Central");

        jLabel18.setText("Palabras cantidad caracteres impar.");

        txt_impar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_imparActionPerformed(evt);
            }
        });

        jLabel8.setText("Ultima Palabra");

        txt_ultpalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ultpalabraActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 0));
        jLabel11.setText("TRADUCCION A CLAVE MURCIELAGO");

        txt_murcielago.setBackground(new java.awt.Color(204, 255, 255));
        txt_murcielago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_murcielagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_area, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_ultpalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_palabce, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_1palab, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_letrac, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_ultletra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_1letra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_palab, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(37, 37, 37)
                                            .addComponent(txt_long, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(65, 65, 65))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(47, 47, 47)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel18)
                                                .addComponent(jLabel17))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_o, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_i, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_e, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_par, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_impar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_u, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(147, 147, 147)
                                    .addComponent(jLabel11))
                                .addComponent(txt_murcielago, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jButton1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_area, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_long, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_palab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txt_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_1letra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14)
                            .addComponent(txt_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_ultletra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15)
                                .addComponent(txt_o, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_letrac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)))))
                    .addComponent(txt_par, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_1palab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txt_u, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_palabce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txt_impar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_ultpalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_murcielago, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jMenu1.setBackground(new java.awt.Color(204, 204, 204));
        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Guardar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem3.setText("Guardar como");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Copiar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Cortar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setText("Pegar");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setText("Buscar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem8.setText("Remplazar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jInternalFrame1.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_letracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_letracActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_letracActionPerformed

    private void txt_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_uActionPerformed

    private void txt_ultpalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ultpalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ultpalabraActionPerformed

    private void txt_1letraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_1letraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_1letraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                String cadena_completa;
       cadena_completa = txt_area.getText();
       
        int contador = 1, pos;
        cadena_completa = cadena_completa.trim();                              
        if (cadena_completa.isEmpty()) { 
            contador = 0;
        } else {
                pos = cadena_completa.indexOf(" "); 
                while (pos != -1) {   
                       contador++;    
                       pos = cadena_completa.indexOf(" ", pos + 1);                       
                }                                    
        }
         
        longitud();
        longitudpalabras();
        primerletra();
        ultletra();
        letrac();
        
        StringTokenizer tokens = new StringTokenizer(cadena_completa);
        String primeraPalabra = tokens.nextToken();
        txt_1palab.setText("" +primeraPalabra);
        
        String frase = txt_area.getText();
        Clave_murcielago(frase);
        
        Palabra_central(cadena_completa,contador);
        ultimapalabra();
        Repeticiones_letra_a(cadena_completa);
        Repeticiones_letra_e(cadena_completa);
        Repeticiones_letra_i(cadena_completa);
        Repeticiones_letra_o(cadena_completa);
        Repeticiones_letra_u(cadena_completa);
        Palabras_pares_impares(cadena_completa,contador);
         
    }                                        

      public void Clave_murcielago(String frase){
 //System.out.println(frase);
          Scanner sc = new Scanner(System.in);
        char[] cadena = new char[900];
        
        for(int i=0; i<frase.length(); i++)
        {
            switch (frase.charAt(i)) {
                case 'M':
                case 'm':
                    cadena[i] = '0';
                    //System.out.println("0");
                    break;
                case 'U':
                case 'u':
                    cadena[i] = '1';
                    //System.out.println("1");
                    break;
                case 'R':
                case 'r':
                    cadena[i] = '2';
                    //System.out.println("2");
                    break;
                case 'C':
                case 'c':
                    cadena[i] = '3';
                    //System.out.println("3");
                    break;
                case 'I':
                case 'i':
                    cadena[i] = '4';
                    //System.out.println("4");
                    break;
                case 'E':
                case 'e':
                    cadena[i] = '5';
                    //System.out.println("5");
                    break;
                case 'L':
                case 'l':
                    cadena[i] = '6';
                    //System.out.println("6");
                    break;
                case 'A':
                case 'a':
                    cadena[i] = '7';
                    //System.out.println("7");
                    break;
                case 'G':
                case 'g':
                    cadena[i] = '8';
                    //System.out.println("8");
                    break;
                case 'O':
                case 'o':
                    cadena[i] = '9';
                    //System.out.println("9");
                    break;
                default:
                    cadena[i] = frase.charAt(i);
                    break;
            }
        String resultado = String.valueOf(cadena);
       txt_murcielago.setText(resultado);
      
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_1palabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_1palabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_1palabActionPerformed

    private void txt_parActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_parActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_parActionPerformed

    private void txt_imparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_imparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_imparActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    JFileChooser seleccionar = new JFileChooser();
    seleccionar.setDialogTitle("Guardar como");
    
    int userSelection = seleccionar.showSaveDialog(null);
    
    if(userSelection == JFileChooser.APPROVE_OPTION){
        archivo = seleccionar.getSelectedFile();
        
        if(!archivo.getName().endsWith(".txt")){
            archivo = new File(archivo.getAbsolutePath() + ".txt");
        }
        
        String Documento = txt_area.getText();
        String mensaje = GuardarArchivo(archivo, Documento);
        
        if(mensaje != null){
            JOptionPane.showMessageDialog(null, "Archivo guardado con éxito");
        }else{
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Operación de guardado cancelada");
    }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
                if(seleccionar.showDialog(null, "Abrir")==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith("txt")){
                    String documento=AbrirArchivo(archivo);
                    txt_area.setText(documento);
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo No Compatible");
                }
            }
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:  
    JFileChooser seleccionar = new JFileChooser();
    seleccionar.setDialogTitle("Guardar");
    
    int userSelection = seleccionar.showSaveDialog(null);
    
    if(userSelection == JFileChooser.APPROVE_OPTION){
        archivo = seleccionar.getSelectedFile();
        
        if(!archivo.getName().endsWith(".txt")){
            archivo = new File(archivo.getAbsolutePath() + ".txt");
        }
        
        String Documento = txt_area.getText();
        String mensaje = GuardarArchivo(archivo, Documento);
        
        if(mensaje != null){
            JOptionPane.showMessageDialog(null, "Archivo guardado");
        }else{
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Operación de guardado cancelada");
    }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    String textoSeleccionado = txt_area.getSelectedText();
    
    if (textoSeleccionado != null) {
        StringSelection stringSelection = new StringSelection(textoSeleccionado);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    } else {
        JOptionPane.showMessageDialog(null, "No hay texto seleccionado para copiar");
    }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    try {
        String textoPegado = (String) clipboard.getData(DataFlavor.stringFlavor);
        txt_area.setText(txt_area.getText() + textoPegado);
    } catch (UnsupportedFlavorException | IOException ex) {
        JOptionPane.showMessageDialog(null, "No se pudo pegar el contenido");
    }

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:                                               
    String palabraBuscada = JOptionPane.showInputDialog("Ingrese la palabra a buscar:");
    
    if (palabraBuscada != null && !palabraBuscada.isEmpty()) {
        Highlighter highlighter = txt_area.getHighlighter();
        Highlighter.HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(java.awt.Color.YELLOW);
        highlighter.removeAllHighlights();

        String text = txt_area.getText();
        int index = text.indexOf(palabraBuscada);
        while (index >= 0) {
            try {
                int end = index + palabraBuscada.length();
                highlighter.addHighlight(index, end, painter);
                index = text.indexOf(palabraBuscada, end);
            } catch (BadLocationException e) {
                JOptionPane.showMessageDialog(null, "Error al resaltar la palabra.");
            }
        }
        if (index == -1 && !text.contains(palabraBuscada)) {
            JOptionPane.showMessageDialog(null, "La palabra no se encontró en el texto.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Debe ingresar una palabra para buscar.");
    }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:                                                 
    String palabraBuscada = JOptionPane.showInputDialog("Ingrese la palabra que desea reemplazar:");
    String palabraNueva = JOptionPane.showInputDialog("Ingrese la nueva palabra:");

    if (palabraBuscada != null && palabraNueva != null && !palabraBuscada.isEmpty() && !palabraNueva.isEmpty()) {
        String text = txt_area.getText();
 
        if (text.contains(palabraBuscada)) {
            text = text.replaceAll(palabraBuscada, palabraNueva);
            txt_area.setText(text);
            JOptionPane.showMessageDialog(null, "Reemplazo completado.");
        } else {
            JOptionPane.showMessageDialog(null, "La palabra a reemplazar no se encontró en el texto.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Debe ingresar tanto la palabra a reemplazar como la nueva palabra.");
    }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void txt_murcielagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_murcielagoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_murcielagoActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_1letra;
    private javax.swing.JTextField txt_1palab;
    private javax.swing.JTextField txt_a;
    private javax.swing.JTextField txt_area;
    private javax.swing.JTextField txt_e;
    private javax.swing.JTextField txt_i;
    private javax.swing.JTextField txt_impar;
    private javax.swing.JTextField txt_letrac;
    private javax.swing.JTextField txt_long;
    private javax.swing.JTextField txt_murcielago;
    private javax.swing.JTextField txt_o;
    private javax.swing.JTextField txt_palab;
    private javax.swing.JTextField txt_palabce;
    private javax.swing.JTextField txt_par;
    private javax.swing.JTextField txt_u;
    private javax.swing.JTextField txt_ultletra;
    private javax.swing.JTextField txt_ultpalabra;
    // End of variables declaration//GEN-END:variables
}
