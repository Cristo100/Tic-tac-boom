package tictac;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.Scanner;

public class ventana extends javax.swing.JFrame {
    // Declarar las instancias de gatito y gatote como variables de instancia
    private gatito cuadro1, cuadro2, cuadro3, cuadro4, cuadro5, cuadro6, cuadro7, cuadro8, cuadro9;
    private gatote juego;
    
    // Constructor de la ventana
    public ventana() {
        initComponents(); // Aquí deberías tener la inicialización de componentes de tu GUI

        //Creacion de gatitos (los 9 juegos pequeños)
        cuadro1 = new gatito();
        cuadro2 = new gatito();
        cuadro3 = new gatito();
        cuadro4 = new gatito();
        cuadro5 = new gatito();
        cuadro6 = new gatito();
        cuadro7 = new gatito();
        cuadro8 = new gatito();
        cuadro9 = new gatito();
        //Creacion de gatote (El tres en raya compuesto por los 9 gatitos anteriores)
        juego = new gatote();
        //Posicionamiento de gatitos en gatote:
        juego.setGatito(0, 0, cuadro1);
        juego.setGatito(0, 1, cuadro2);
        juego.setGatito(0, 2, cuadro3);
        juego.setGatito(1, 0, cuadro4);
        juego.setGatito(1, 1, cuadro5);
        juego.setGatito(1, 2, cuadro6);
        juego.setGatito(2, 0, cuadro7);
        juego.setGatito(2, 1, cuadro8);
        juego.setGatito(2, 2, cuadro9);
        
    }

//BOTONES DENTRO DE LA PAGINA:
    //REINICIAR:
    private void reinicio_total() {
        //Ganadores
        for (int i = 0; i < juego.matriz_ganadora.length; i++) {
            for (int j = 0; j < juego.matriz_ganadora[i].length; j++) {
                juego.matriz_ganadora[i][j] = 0;
            }}
        //Todos los botones en blanco
        Field[] fields = getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getType() == JButton.class && field.getName().startsWith("boto")) {   //aqui se pregunta como comienzan los botones que se quiere modificar.
                try {
                    JButton boton = (JButton) field.get(this);
                    boton.setBackground(Color.WHITE);
                    resultados.setText("-JUGANDO-"); 
                    juego.juego_ganado = false;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }}}
                //las matrices de resultados de vuelta a 0:
            for (int i = 0; i < juego.gran_matriz.length; i++) {
                for (int j = 0; j < juego.gran_matriz[i].length; j++) {
                    gatito cuadro = juego.gran_matriz[i][j];
                    cuadro.matriz = new int[3][3];
                        }}
            juego.juego_ganado = false;
    }

    
    //Guardar
        public void guardarEstado(String nombreArchivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            // Guardar información en el archivo de texto
            writer.println(juego.turno); // Guardar el turno
            writer.println(juego.color_boton.getRGB()); // Guardar el color como un entero RGB

            // Guardar el estado de cada cuadro en la gran matriz
            for (int i = 0; i < juego.gran_matriz.length; i++) {
                for (int j = 0; j < juego.gran_matriz[i].length; j++) {
                    gatito cuadro = juego.gran_matriz[i][j];
                    int[][] matrizCuadro = cuadro.getMatriz();
                    // Guardar el estado de cada cuadro
                    for (int k = 0; k < matrizCuadro.length; k++) {
                        for (int l = 0; l < matrizCuadro[k].length; l++) {
                            writer.print(matrizCuadro[k][l] + " ");
                        }
                        writer.println(); // Nueva línea para cada fila
                    }
                }
            }
            System.out.println("Estado del gatote guardado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Cargar:
    // Método cargarEstado
    public void cargarEstado(String nombreArchivo) {
    try (Scanner scanner = new Scanner(new File(nombreArchivo))) {
        // Lee la información del archivo y configurar el estado del juego
        juego.turno = scanner.nextBoolean(); // Leeel turno
        int colorRGB = scanner.nextInt(); // Lee el color como un entero RGB

        // Lee el estado de cada gatito en la gran matriz
        for (int i = 0; i < juego.gran_matriz.length; i++) {
            for (int j = 0; j < juego.gran_matriz[i].length; j++) {
                gatito cuadro = juego.gran_matriz[i][j];
                int[][] matrizCuadro = cuadro.getMatriz();
                // Lee el estado de cada cuadro
                for (int k = 0; k < matrizCuadro.length; k++) {
                    for (int l = 0; l < matrizCuadro[k].length; l++) {
                        int next = scanner.nextInt();
                        matrizCuadro[k][l] = next;
                        if (next == 1){
                        }else{if(next == 2){
                        }}}}}}
        // Actualiza la interfaz gráfica 
        juego.verificacion(resultados);
        // Fuerza la actualización de la interfaz gráfica
        repaint();
    } catch (IOException e) {
        e.printStackTrace();

    }
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        boto1 = new javax.swing.JButton();
        boto2 = new javax.swing.JButton();
        boto3 = new javax.swing.JButton();
        boto4 = new javax.swing.JButton();
        boto5 = new javax.swing.JButton();
        boto6 = new javax.swing.JButton();
        boto7 = new javax.swing.JButton();
        boto8 = new javax.swing.JButton();
        boto9 = new javax.swing.JButton();
        reinicioboton = new javax.swing.JButton();
        salirboton = new javax.swing.JButton();
        boto12 = new javax.swing.JButton();
        boto22 = new javax.swing.JButton();
        boto32 = new javax.swing.JButton();
        boto42 = new javax.swing.JButton();
        boto52 = new javax.swing.JButton();
        boto62 = new javax.swing.JButton();
        boto72 = new javax.swing.JButton();
        boto82 = new javax.swing.JButton();
        boto92 = new javax.swing.JButton();
        boto23 = new javax.swing.JButton();
        boto33 = new javax.swing.JButton();
        boto43 = new javax.swing.JButton();
        boto53 = new javax.swing.JButton();
        boto63 = new javax.swing.JButton();
        boto73 = new javax.swing.JButton();
        boto83 = new javax.swing.JButton();
        boto93 = new javax.swing.JButton();
        boto13 = new javax.swing.JButton();
        boto24 = new javax.swing.JButton();
        boto34 = new javax.swing.JButton();
        boto44 = new javax.swing.JButton();
        boto54 = new javax.swing.JButton();
        boto64 = new javax.swing.JButton();
        boto74 = new javax.swing.JButton();
        boto84 = new javax.swing.JButton();
        boto94 = new javax.swing.JButton();
        boto14 = new javax.swing.JButton();
        boto75 = new javax.swing.JButton();
        boto85 = new javax.swing.JButton();
        boto95 = new javax.swing.JButton();
        boto15 = new javax.swing.JButton();
        boto25 = new javax.swing.JButton();
        boto35 = new javax.swing.JButton();
        boto45 = new javax.swing.JButton();
        boto55 = new javax.swing.JButton();
        boto65 = new javax.swing.JButton();
        boto66 = new javax.swing.JButton();
        boto76 = new javax.swing.JButton();
        boto86 = new javax.swing.JButton();
        boto96 = new javax.swing.JButton();
        boto16 = new javax.swing.JButton();
        boto26 = new javax.swing.JButton();
        boto36 = new javax.swing.JButton();
        boto46 = new javax.swing.JButton();
        boto56 = new javax.swing.JButton();
        boto67 = new javax.swing.JButton();
        boto77 = new javax.swing.JButton();
        boto87 = new javax.swing.JButton();
        boto97 = new javax.swing.JButton();
        boto17 = new javax.swing.JButton();
        boto27 = new javax.swing.JButton();
        boto37 = new javax.swing.JButton();
        boto47 = new javax.swing.JButton();
        boto57 = new javax.swing.JButton();
        boto68 = new javax.swing.JButton();
        boto78 = new javax.swing.JButton();
        boto88 = new javax.swing.JButton();
        boto98 = new javax.swing.JButton();
        boto18 = new javax.swing.JButton();
        boto28 = new javax.swing.JButton();
        boto38 = new javax.swing.JButton();
        boto48 = new javax.swing.JButton();
        boto58 = new javax.swing.JButton();
        boto69 = new javax.swing.JButton();
        boto79 = new javax.swing.JButton();
        boto89 = new javax.swing.JButton();
        boto99 = new javax.swing.JButton();
        boto19 = new javax.swing.JButton();
        boto29 = new javax.swing.JButton();
        boto39 = new javax.swing.JButton();
        boto49 = new javax.swing.JButton();
        boto59 = new javax.swing.JButton();
        resultados = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        cargar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(125, 187, 216));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        boto1.setBackground(new java.awt.Color(255, 255, 255));
        boto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto1ActionPerformed(evt);
            }
        });

        boto2.setBackground(new java.awt.Color(255, 255, 255));
        boto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto2ActionPerformed(evt);
            }
        });

        boto3.setBackground(new java.awt.Color(255, 255, 255));
        boto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto3ActionPerformed(evt);
            }
        });

        boto4.setBackground(new java.awt.Color(255, 255, 255));
        boto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto4ActionPerformed(evt);
            }
        });

        boto5.setBackground(new java.awt.Color(255, 255, 255));
        boto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto5ActionPerformed(evt);
            }
        });

        boto6.setBackground(new java.awt.Color(255, 255, 255));
        boto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto6ActionPerformed(evt);
            }
        });

        boto7.setBackground(new java.awt.Color(255, 255, 255));
        boto7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto7ActionPerformed(evt);
            }
        });

        boto8.setBackground(new java.awt.Color(255, 255, 255));
        boto8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto8ActionPerformed(evt);
            }
        });

        boto9.setBackground(new java.awt.Color(255, 255, 255));
        boto9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto9ActionPerformed(evt);
            }
        });

        reinicioboton.setText("Reinicio");
        reinicioboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciobotonActionPerformed(evt);
            }
        });

        salirboton.setText("Salir");
        salirboton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbotonActionPerformed(evt);
            }
        });

        boto12.setBackground(new java.awt.Color(255, 255, 255));
        boto12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto12ActionPerformed(evt);
            }
        });

        boto22.setBackground(new java.awt.Color(255, 255, 255));
        boto22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto22ActionPerformed(evt);
            }
        });

        boto32.setBackground(new java.awt.Color(255, 255, 255));
        boto32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto32ActionPerformed(evt);
            }
        });

        boto42.setBackground(new java.awt.Color(255, 255, 255));
        boto42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto42ActionPerformed(evt);
            }
        });

        boto52.setBackground(new java.awt.Color(255, 255, 255));
        boto52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto52ActionPerformed(evt);
            }
        });

        boto62.setBackground(new java.awt.Color(255, 255, 255));
        boto62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto62ActionPerformed(evt);
            }
        });

        boto72.setBackground(new java.awt.Color(255, 255, 255));
        boto72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto72ActionPerformed(evt);
            }
        });

        boto82.setBackground(new java.awt.Color(255, 255, 255));
        boto82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto82ActionPerformed(evt);
            }
        });

        boto92.setBackground(new java.awt.Color(255, 255, 255));
        boto92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto92ActionPerformed(evt);
            }
        });

        boto23.setBackground(new java.awt.Color(255, 255, 255));
        boto23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto23ActionPerformed(evt);
            }
        });

        boto33.setBackground(new java.awt.Color(255, 255, 255));
        boto33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto33ActionPerformed(evt);
            }
        });

        boto43.setBackground(new java.awt.Color(255, 255, 255));
        boto43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto43ActionPerformed(evt);
            }
        });

        boto53.setBackground(new java.awt.Color(255, 255, 255));
        boto53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto53ActionPerformed(evt);
            }
        });

        boto63.setBackground(new java.awt.Color(255, 255, 255));
        boto63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto63ActionPerformed(evt);
            }
        });

        boto73.setBackground(new java.awt.Color(255, 255, 255));
        boto73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto73ActionPerformed(evt);
            }
        });

        boto83.setBackground(new java.awt.Color(255, 255, 255));
        boto83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto83ActionPerformed(evt);
            }
        });

        boto93.setBackground(new java.awt.Color(255, 255, 255));
        boto93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto93ActionPerformed(evt);
            }
        });

        boto13.setBackground(new java.awt.Color(255, 255, 255));
        boto13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto13ActionPerformed(evt);
            }
        });

        boto24.setBackground(new java.awt.Color(255, 255, 255));
        boto24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto24ActionPerformed(evt);
            }
        });

        boto34.setBackground(new java.awt.Color(255, 255, 255));
        boto34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto34ActionPerformed(evt);
            }
        });

        boto44.setBackground(new java.awt.Color(255, 255, 255));
        boto44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto44ActionPerformed(evt);
            }
        });

        boto54.setBackground(new java.awt.Color(255, 255, 255));
        boto54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto54ActionPerformed(evt);
            }
        });

        boto64.setBackground(new java.awt.Color(255, 255, 255));
        boto64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto64ActionPerformed(evt);
            }
        });

        boto74.setBackground(new java.awt.Color(255, 255, 255));
        boto74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto74ActionPerformed(evt);
            }
        });

        boto84.setBackground(new java.awt.Color(255, 255, 255));
        boto84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto84ActionPerformed(evt);
            }
        });

        boto94.setBackground(new java.awt.Color(255, 255, 255));
        boto94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto94ActionPerformed(evt);
            }
        });

        boto14.setBackground(new java.awt.Color(255, 255, 255));
        boto14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto14ActionPerformed(evt);
            }
        });

        boto75.setBackground(new java.awt.Color(255, 255, 255));
        boto75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto75ActionPerformed(evt);
            }
        });

        boto85.setBackground(new java.awt.Color(255, 255, 255));
        boto85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto85ActionPerformed(evt);
            }
        });

        boto95.setBackground(new java.awt.Color(255, 255, 255));
        boto95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto95ActionPerformed(evt);
            }
        });

        boto15.setBackground(new java.awt.Color(255, 255, 255));
        boto15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto15ActionPerformed(evt);
            }
        });

        boto25.setBackground(new java.awt.Color(255, 255, 255));
        boto25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto25ActionPerformed(evt);
            }
        });

        boto35.setBackground(new java.awt.Color(255, 255, 255));
        boto35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto35ActionPerformed(evt);
            }
        });

        boto45.setBackground(new java.awt.Color(255, 255, 255));
        boto45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto45ActionPerformed(evt);
            }
        });

        boto55.setBackground(new java.awt.Color(255, 255, 255));
        boto55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto55ActionPerformed(evt);
            }
        });

        boto65.setBackground(new java.awt.Color(255, 255, 255));
        boto65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto65ActionPerformed(evt);
            }
        });

        boto66.setBackground(new java.awt.Color(255, 255, 255));
        boto66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto66ActionPerformed(evt);
            }
        });

        boto76.setBackground(new java.awt.Color(255, 255, 255));
        boto76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto76ActionPerformed(evt);
            }
        });

        boto86.setBackground(new java.awt.Color(255, 255, 255));
        boto86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto86ActionPerformed(evt);
            }
        });

        boto96.setBackground(new java.awt.Color(255, 255, 255));
        boto96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto96ActionPerformed(evt);
            }
        });

        boto16.setBackground(new java.awt.Color(255, 255, 255));
        boto16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto16ActionPerformed(evt);
            }
        });

        boto26.setBackground(new java.awt.Color(255, 255, 255));
        boto26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto26ActionPerformed(evt);
            }
        });

        boto36.setBackground(new java.awt.Color(255, 255, 255));
        boto36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto36ActionPerformed(evt);
            }
        });

        boto46.setBackground(new java.awt.Color(255, 255, 255));
        boto46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto46ActionPerformed(evt);
            }
        });

        boto56.setBackground(new java.awt.Color(255, 255, 255));
        boto56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto56ActionPerformed(evt);
            }
        });

        boto67.setBackground(new java.awt.Color(255, 255, 255));
        boto67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto67ActionPerformed(evt);
            }
        });

        boto77.setBackground(new java.awt.Color(255, 255, 255));
        boto77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto77ActionPerformed(evt);
            }
        });

        boto87.setBackground(new java.awt.Color(255, 255, 255));
        boto87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto87ActionPerformed(evt);
            }
        });

        boto97.setBackground(new java.awt.Color(255, 255, 255));
        boto97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto97ActionPerformed(evt);
            }
        });

        boto17.setBackground(new java.awt.Color(255, 255, 255));
        boto17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto17ActionPerformed(evt);
            }
        });

        boto27.setBackground(new java.awt.Color(255, 255, 255));
        boto27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto27ActionPerformed(evt);
            }
        });

        boto37.setBackground(new java.awt.Color(255, 255, 255));
        boto37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto37ActionPerformed(evt);
            }
        });

        boto47.setBackground(new java.awt.Color(255, 255, 255));
        boto47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto47ActionPerformed(evt);
            }
        });

        boto57.setBackground(new java.awt.Color(255, 255, 255));
        boto57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto57ActionPerformed(evt);
            }
        });

        boto68.setBackground(new java.awt.Color(255, 255, 255));
        boto68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto68ActionPerformed(evt);
            }
        });

        boto78.setBackground(new java.awt.Color(255, 255, 255));
        boto78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto78ActionPerformed(evt);
            }
        });

        boto88.setBackground(new java.awt.Color(255, 255, 255));
        boto88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto88ActionPerformed(evt);
            }
        });

        boto98.setBackground(new java.awt.Color(255, 255, 255));
        boto98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto98ActionPerformed(evt);
            }
        });

        boto18.setBackground(new java.awt.Color(255, 255, 255));
        boto18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto18ActionPerformed(evt);
            }
        });

        boto28.setBackground(new java.awt.Color(255, 255, 255));
        boto28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto28ActionPerformed(evt);
            }
        });

        boto38.setBackground(new java.awt.Color(255, 255, 255));
        boto38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto38ActionPerformed(evt);
            }
        });

        boto48.setBackground(new java.awt.Color(255, 255, 255));
        boto48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto48ActionPerformed(evt);
            }
        });

        boto58.setBackground(new java.awt.Color(255, 255, 255));
        boto58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto58ActionPerformed(evt);
            }
        });

        boto69.setBackground(new java.awt.Color(255, 255, 255));
        boto69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto69ActionPerformed(evt);
            }
        });

        boto79.setBackground(new java.awt.Color(255, 255, 255));
        boto79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto79ActionPerformed(evt);
            }
        });

        boto89.setBackground(new java.awt.Color(255, 255, 255));
        boto89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto89ActionPerformed(evt);
            }
        });

        boto99.setBackground(new java.awt.Color(255, 255, 255));
        boto99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto99ActionPerformed(evt);
            }
        });

        boto19.setBackground(new java.awt.Color(255, 255, 255));
        boto19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto19ActionPerformed(evt);
            }
        });

        boto29.setBackground(new java.awt.Color(255, 255, 255));
        boto29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto29ActionPerformed(evt);
            }
        });

        boto39.setBackground(new java.awt.Color(255, 255, 255));
        boto39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto39ActionPerformed(evt);
            }
        });

        boto49.setBackground(new java.awt.Color(255, 255, 255));
        boto49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto49ActionPerformed(evt);
            }
        });

        boto59.setBackground(new java.awt.Color(255, 255, 255));
        boto59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto59ActionPerformed(evt);
            }
        });

        resultados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultados.setText("-JUGANDO-");
        resultados.setToolTipText("");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cargar.setText("Cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(boto7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boto72, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto82, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto92, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(boto4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(boto1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(boto12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boto42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(boto22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(boto52, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto62, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boto74, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boto84, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boto94, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(boto14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boto44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(boto24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boto34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(boto54, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boto64, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boto77, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boto87, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(boto97, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(boto17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boto47, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(boto27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boto37, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(boto57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(boto67, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(boto75, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto85, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto95, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(boto15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(boto45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(boto25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(boto35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(boto55, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(boto65, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(boto78, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto88, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto98, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(boto18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(boto48, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(boto28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(boto38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(boto58, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(boto68, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(boto73, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto83, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto93, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(boto13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boto43, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(boto23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(boto53, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto63, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(boto76, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto86, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto96, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(boto16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boto46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(boto26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto36, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(boto56, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto66, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(boto79, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto89, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(boto99, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(boto19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boto49, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(boto29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(boto59, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(boto69, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargar)
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reinicioboton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salirboton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(209, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boto1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(boto4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boto5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boto6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(boto52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(boto62, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(boto42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boto7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto82, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto92, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto72, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boto13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boto53, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto63, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(boto43, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boto83, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto93, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto73, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(boto14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boto24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boto34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(boto54, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boto64, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(boto44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(boto84, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boto94, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boto74, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(boto15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boto25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boto35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(boto55, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(boto65, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(boto45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(boto85, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boto95, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boto75, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boto16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto36, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boto56, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto66, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(boto46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boto86, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto96, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto76, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boto17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto37, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boto57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto67, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(boto47, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boto87, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto97, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto77, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boto18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boto58, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto68, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(boto48, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boto88, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto98, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto78, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boto19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(boto59, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boto69, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(boto49, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boto89, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto99, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boto79, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultados, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reinicioboton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirboton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar)
                    .addComponent(cargar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirbotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbotonActionPerformed
        //Creacion ventana emergente con JOptionPane
        int opcion = JOptionPane.showConfirmDialog(this, "¿Cerrar el juego?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_salirbotonActionPerformed

    private void boto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto1ActionPerformed
juego.coordenada(boto1,cuadro1.getMatriz(),0,0,0,0,resultados);
    }//GEN-LAST:event_boto1ActionPerformed

    private void boto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto2ActionPerformed
juego.coordenada(boto2,cuadro1.getMatriz(),1,0,0,0,resultados);
    }//GEN-LAST:event_boto2ActionPerformed

    private void boto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto3ActionPerformed
juego.coordenada(boto3,cuadro1.getMatriz(),2,0,0,0,resultados);
    }//GEN-LAST:event_boto3ActionPerformed

    private void boto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto4ActionPerformed
juego.coordenada(boto4,cuadro1.getMatriz(),0,1,0,0,resultados);
    }//GEN-LAST:event_boto4ActionPerformed

    private void boto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto5ActionPerformed
juego.coordenada(boto5,cuadro1.getMatriz(),1,1,0,0,resultados);
    }//GEN-LAST:event_boto5ActionPerformed

    private void boto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto6ActionPerformed
juego.coordenada(boto6,cuadro1.getMatriz(),2,1,0,0,resultados);
    }//GEN-LAST:event_boto6ActionPerformed

    private void boto7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto7ActionPerformed
juego.coordenada(boto7,cuadro1.getMatriz(),0,2,0,0,resultados);
    }//GEN-LAST:event_boto7ActionPerformed

    private void boto8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto8ActionPerformed
juego.coordenada(boto8,cuadro1.getMatriz(),1,2,0,0,resultados);
    }//GEN-LAST:event_boto8ActionPerformed

    private void boto9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto9ActionPerformed
juego.coordenada(boto9,cuadro1.getMatriz(),2,2,0,0,resultados);
    }//GEN-LAST:event_boto9ActionPerformed

    private void reiniciobotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciobotonActionPerformed
        //Creacion ventana emergente con JOptionPane
        int opcion = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres reiniciar?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            reinicio_total();
            juego.turno = true;
        }
    }//GEN-LAST:event_reiniciobotonActionPerformed

    private void boto12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto12ActionPerformed
juego.coordenada(boto12,cuadro2.getMatriz(),0,0,1,0, resultados);
    }//GEN-LAST:event_boto12ActionPerformed

    private void boto22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto22ActionPerformed
juego.coordenada(boto22,cuadro2.getMatriz(),1,0,1,0,resultados);
    }//GEN-LAST:event_boto22ActionPerformed

    private void boto32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto32ActionPerformed
juego.coordenada(boto32,cuadro2.getMatriz(),2,0,1,0,resultados);
    }//GEN-LAST:event_boto32ActionPerformed

    private void boto42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto42ActionPerformed
juego.coordenada(boto42,cuadro2.getMatriz(),0,1,1,0,resultados);
    }//GEN-LAST:event_boto42ActionPerformed

    private void boto52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto52ActionPerformed
juego.coordenada(boto52,cuadro2.getMatriz(),1,1,1,0,resultados);
    }//GEN-LAST:event_boto52ActionPerformed

    private void boto62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto62ActionPerformed
juego.coordenada(boto62,cuadro2.getMatriz(),2,1,1,0,resultados);
    }//GEN-LAST:event_boto62ActionPerformed

    private void boto72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto72ActionPerformed
juego.coordenada(boto72,cuadro2.getMatriz(),0 ,2,1,0,resultados);
    }//GEN-LAST:event_boto72ActionPerformed

    private void boto82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto82ActionPerformed
juego.coordenada(boto82,cuadro2.getMatriz(),1,2,1,0,resultados);
    }//GEN-LAST:event_boto82ActionPerformed

    private void boto92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto92ActionPerformed
juego.coordenada(boto92,cuadro2.getMatriz(),2,2,1,0,resultados);
    }//GEN-LAST:event_boto92ActionPerformed

    private void boto23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto23ActionPerformed
juego.coordenada(boto23,cuadro3.getMatriz(),1,0,2,0,resultados);
    }//GEN-LAST:event_boto23ActionPerformed

    private void boto33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto33ActionPerformed
juego.coordenada(boto33,cuadro3.getMatriz(),2,0,2,0,resultados);
    }//GEN-LAST:event_boto33ActionPerformed

    private void boto43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto43ActionPerformed
juego.coordenada(boto43,cuadro3.getMatriz(),0,1,2,0,resultados);
    }//GEN-LAST:event_boto43ActionPerformed

    private void boto53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto53ActionPerformed
juego.coordenada(boto53,cuadro3.getMatriz(),1,1,2,0,resultados);
    }//GEN-LAST:event_boto53ActionPerformed

    private void boto63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto63ActionPerformed
juego.coordenada(boto63,cuadro3.getMatriz(),2,1,2,0,resultados);
    }//GEN-LAST:event_boto63ActionPerformed

    private void boto73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto73ActionPerformed
juego.coordenada(boto73,cuadro3.getMatriz(),0,2,2,0,resultados);
    }//GEN-LAST:event_boto73ActionPerformed

    private void boto83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto83ActionPerformed
juego.coordenada(boto83,cuadro3.getMatriz(),1,2,2,0,resultados);
    }//GEN-LAST:event_boto83ActionPerformed

    private void boto93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto93ActionPerformed
juego.coordenada(boto93,cuadro3.getMatriz(),2,2,2,0,resultados);
    }//GEN-LAST:event_boto93ActionPerformed

    private void boto13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto13ActionPerformed
juego.coordenada(boto13,cuadro3.getMatriz(),0,0,2,0,resultados);
    }//GEN-LAST:event_boto13ActionPerformed

    private void boto24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto24ActionPerformed
juego.coordenada(boto24,cuadro4.getMatriz(),1,0,0,1,resultados);
    }//GEN-LAST:event_boto24ActionPerformed

    private void boto34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto34ActionPerformed
juego.coordenada(boto34,cuadro4.getMatriz(),2,0,0,1,resultados);
    }//GEN-LAST:event_boto34ActionPerformed

    private void boto44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto44ActionPerformed
juego.coordenada(boto44,cuadro4.getMatriz(),0,1,0,1,resultados);
    }//GEN-LAST:event_boto44ActionPerformed

    private void boto54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto54ActionPerformed
juego.coordenada(boto54,cuadro4.getMatriz(),1,1,0,1,resultados);
    }//GEN-LAST:event_boto54ActionPerformed

    private void boto64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto64ActionPerformed
juego.coordenada(boto64,cuadro4.getMatriz(),2,1,0,1,resultados);
    }//GEN-LAST:event_boto64ActionPerformed

    private void boto74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto74ActionPerformed
juego.coordenada(boto74,cuadro4.getMatriz(),0,2,0,1,resultados);
    }//GEN-LAST:event_boto74ActionPerformed

    private void boto84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto84ActionPerformed
juego.coordenada(boto84,cuadro4.getMatriz(),1,2,0,1,resultados);
    }//GEN-LAST:event_boto84ActionPerformed

    private void boto94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto94ActionPerformed
juego.coordenada(boto94,cuadro4.getMatriz(),2,2,0,1,resultados);
    }//GEN-LAST:event_boto94ActionPerformed

    private void boto14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto14ActionPerformed
juego.coordenada(boto14,cuadro4.getMatriz(),0,0,0,1,resultados);
    }//GEN-LAST:event_boto14ActionPerformed

    private void boto75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto75ActionPerformed
juego.coordenada(boto75,cuadro5.getMatriz(),0,2,1,1,resultados);
    }//GEN-LAST:event_boto75ActionPerformed

    private void boto85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto85ActionPerformed
juego.coordenada(boto85,cuadro5.getMatriz(),1,2,1,1,resultados);
    }//GEN-LAST:event_boto85ActionPerformed

    private void boto95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto95ActionPerformed
juego.coordenada(boto95,cuadro5.getMatriz(),2,2,1,1,resultados);
    }//GEN-LAST:event_boto95ActionPerformed

    private void boto15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto15ActionPerformed
juego.coordenada(boto15,cuadro5.getMatriz(),0,0,1,1,resultados);
    }//GEN-LAST:event_boto15ActionPerformed

    private void boto25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto25ActionPerformed
juego.coordenada(boto25,cuadro5.getMatriz(),1,0,1,1,resultados);
    }//GEN-LAST:event_boto25ActionPerformed

    private void boto35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto35ActionPerformed
juego.coordenada(boto35,cuadro5.getMatriz(),2,0,1,1,resultados);
    }//GEN-LAST:event_boto35ActionPerformed

    private void boto45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto45ActionPerformed
juego.coordenada(boto45,cuadro5.getMatriz(),0,1,1,1,resultados);
    }//GEN-LAST:event_boto45ActionPerformed

    private void boto55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto55ActionPerformed
juego.coordenada(boto55,cuadro5.getMatriz(),1,1,1,1,resultados);
    }//GEN-LAST:event_boto55ActionPerformed

    private void boto65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto65ActionPerformed
juego.coordenada(boto65,cuadro5.getMatriz(),2,1,1,1,resultados);
    }//GEN-LAST:event_boto65ActionPerformed

    private void boto66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto66ActionPerformed
juego.coordenada(boto66,cuadro6.getMatriz(),2,1,2,1,resultados);
    }//GEN-LAST:event_boto66ActionPerformed

    private void boto76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto76ActionPerformed
juego.coordenada(boto76,cuadro6.getMatriz(),0,2,2,1,resultados);
    }//GEN-LAST:event_boto76ActionPerformed

    private void boto86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto86ActionPerformed
juego.coordenada(boto86,cuadro6.getMatriz(),1,2,2,1,resultados);
    }//GEN-LAST:event_boto86ActionPerformed

    private void boto96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto96ActionPerformed
juego.coordenada(boto96,cuadro6.getMatriz(),2,2,2,1,resultados);
    }//GEN-LAST:event_boto96ActionPerformed

    private void boto16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto16ActionPerformed
juego.coordenada(boto16,cuadro6.getMatriz(),0,0,2,1,resultados);
    }//GEN-LAST:event_boto16ActionPerformed

    private void boto26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto26ActionPerformed
juego.coordenada(boto26,cuadro6.getMatriz(),1,0,2,1,resultados);
    }//GEN-LAST:event_boto26ActionPerformed

    private void boto36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto36ActionPerformed
juego.coordenada(boto36,cuadro6.getMatriz(),2,0,2,1,resultados);
    }//GEN-LAST:event_boto36ActionPerformed

    private void boto46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto46ActionPerformed
juego.coordenada(boto46,cuadro6.getMatriz(),0,1,2,1,resultados);
    }//GEN-LAST:event_boto46ActionPerformed

    private void boto56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto56ActionPerformed
juego.coordenada(boto56,cuadro6.getMatriz(),1,1,2,1,resultados);
    }//GEN-LAST:event_boto56ActionPerformed

    private void boto67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto67ActionPerformed
juego.coordenada(boto67,cuadro7.getMatriz(),2,1,0,2,resultados);
    }//GEN-LAST:event_boto67ActionPerformed

    private void boto77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto77ActionPerformed
juego.coordenada(boto77,cuadro7.getMatriz(),0,2,0,2,resultados);
    }//GEN-LAST:event_boto77ActionPerformed

    private void boto87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto87ActionPerformed
juego.coordenada(boto87,cuadro7.getMatriz(),1,2,0,2,resultados);
    }//GEN-LAST:event_boto87ActionPerformed

    private void boto97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto97ActionPerformed
juego.coordenada(boto97,cuadro7.getMatriz(),2,2,0,2,resultados);
    }//GEN-LAST:event_boto97ActionPerformed

    private void boto17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto17ActionPerformed
juego.coordenada(boto17,cuadro7.getMatriz(),0,0,0,2,resultados);
    }//GEN-LAST:event_boto17ActionPerformed

    private void boto27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto27ActionPerformed
juego.coordenada(boto27,cuadro7.getMatriz(),1,0,0,2,resultados);
    }//GEN-LAST:event_boto27ActionPerformed

    private void boto37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto37ActionPerformed
juego.coordenada(boto37,cuadro7.getMatriz(),2,0,0,2,resultados);
    }//GEN-LAST:event_boto37ActionPerformed

    private void boto47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto47ActionPerformed
juego.coordenada(boto47,cuadro7.getMatriz(),0,1,0,2,resultados);
    }//GEN-LAST:event_boto47ActionPerformed

    private void boto57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto57ActionPerformed
juego.coordenada(boto57,cuadro7.getMatriz(),1,1,0,2,resultados);
    }//GEN-LAST:event_boto57ActionPerformed

    private void boto68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto68ActionPerformed
juego.coordenada(boto68,cuadro8.getMatriz(),2,1,1,2,resultados);
    }//GEN-LAST:event_boto68ActionPerformed

    private void boto78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto78ActionPerformed
juego.coordenada(boto78,cuadro8.getMatriz(),0,2,1,2,resultados);
    }//GEN-LAST:event_boto78ActionPerformed

    private void boto88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto88ActionPerformed
juego.coordenada(boto88,cuadro8.getMatriz(),1,2,1,2,resultados);
    }//GEN-LAST:event_boto88ActionPerformed

    private void boto98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto98ActionPerformed
juego.coordenada(boto98,cuadro8.getMatriz(),2,2,1,2,resultados);
    }//GEN-LAST:event_boto98ActionPerformed

    private void boto18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto18ActionPerformed
juego.coordenada(boto18,cuadro8.getMatriz(),0,0,1,2,resultados);
    }//GEN-LAST:event_boto18ActionPerformed

    private void boto28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto28ActionPerformed
juego.coordenada(boto28,cuadro8.getMatriz(),1,0,1,2,resultados);
    }//GEN-LAST:event_boto28ActionPerformed

    private void boto38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto38ActionPerformed
juego.coordenada(boto38,cuadro8.getMatriz(),2,0,1,2,resultados);
    }//GEN-LAST:event_boto38ActionPerformed

    private void boto48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto48ActionPerformed
juego.coordenada(boto48,cuadro8.getMatriz(),0,1,1,2,resultados);
    }//GEN-LAST:event_boto48ActionPerformed

    private void boto58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto58ActionPerformed
juego.coordenada(boto58,cuadro8.getMatriz(),1,1,1,2,resultados);
    }//GEN-LAST:event_boto58ActionPerformed

    private void boto69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto69ActionPerformed
juego.coordenada(boto69,cuadro9.getMatriz(),2,1,2,2,resultados);
    }//GEN-LAST:event_boto69ActionPerformed

    private void boto79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto79ActionPerformed
juego.coordenada(boto79,cuadro9.getMatriz(),0,2,2,2,resultados);
    }//GEN-LAST:event_boto79ActionPerformed

    private void boto89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto89ActionPerformed
juego.coordenada(boto89,cuadro9.getMatriz(),1,2,2,2,resultados);
    }//GEN-LAST:event_boto89ActionPerformed

    private void boto99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto99ActionPerformed
juego.coordenada(boto99,cuadro9.getMatriz(),2,2,2,2,resultados);
    }//GEN-LAST:event_boto99ActionPerformed

    private void boto19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto19ActionPerformed
juego.coordenada(boto19,cuadro9.getMatriz(),0,0,2,2,resultados);
    }//GEN-LAST:event_boto19ActionPerformed

    private void boto29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto29ActionPerformed
juego.coordenada(boto29,cuadro9.getMatriz(),1,0,2,2,resultados);
    }//GEN-LAST:event_boto29ActionPerformed

    private void boto39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto39ActionPerformed
juego.coordenada(boto39,cuadro9.getMatriz(),2,0,2,2,resultados);
    }//GEN-LAST:event_boto39ActionPerformed

    private void boto49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto49ActionPerformed
juego.coordenada(boto49,cuadro9.getMatriz(),0,1,2,2,resultados);
    }//GEN-LAST:event_boto49ActionPerformed

    private void boto59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto59ActionPerformed
juego.coordenada(boto59,cuadro9.getMatriz(),1,1,2,2,resultados);
    }//GEN-LAST:event_boto59ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
    guardarEstado("guardado.txt");
    JOptionPane.showMessageDialog(this, "Partida guardada exitosamente.");
    }//GEN-LAST:event_guardarActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
    cargarEstado("guardado.txt");
    JOptionPane.showMessageDialog(this, "Partida reanudada exitosamente.");
    }//GEN-LAST:event_cargarActionPerformed
         

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boto1;
    private javax.swing.JButton boto12;
    private javax.swing.JButton boto13;
    private javax.swing.JButton boto14;
    private javax.swing.JButton boto15;
    private javax.swing.JButton boto16;
    private javax.swing.JButton boto17;
    private javax.swing.JButton boto18;
    private javax.swing.JButton boto19;
    private javax.swing.JButton boto2;
    private javax.swing.JButton boto22;
    private javax.swing.JButton boto23;
    private javax.swing.JButton boto24;
    private javax.swing.JButton boto25;
    private javax.swing.JButton boto26;
    private javax.swing.JButton boto27;
    private javax.swing.JButton boto28;
    private javax.swing.JButton boto29;
    private javax.swing.JButton boto3;
    private javax.swing.JButton boto32;
    private javax.swing.JButton boto33;
    private javax.swing.JButton boto34;
    private javax.swing.JButton boto35;
    private javax.swing.JButton boto36;
    private javax.swing.JButton boto37;
    private javax.swing.JButton boto38;
    private javax.swing.JButton boto39;
    private javax.swing.JButton boto4;
    private javax.swing.JButton boto42;
    private javax.swing.JButton boto43;
    private javax.swing.JButton boto44;
    private javax.swing.JButton boto45;
    private javax.swing.JButton boto46;
    private javax.swing.JButton boto47;
    private javax.swing.JButton boto48;
    private javax.swing.JButton boto49;
    private javax.swing.JButton boto5;
    private javax.swing.JButton boto52;
    private javax.swing.JButton boto53;
    private javax.swing.JButton boto54;
    private javax.swing.JButton boto55;
    private javax.swing.JButton boto56;
    private javax.swing.JButton boto57;
    private javax.swing.JButton boto58;
    private javax.swing.JButton boto59;
    private javax.swing.JButton boto6;
    private javax.swing.JButton boto62;
    private javax.swing.JButton boto63;
    private javax.swing.JButton boto64;
    private javax.swing.JButton boto65;
    private javax.swing.JButton boto66;
    private javax.swing.JButton boto67;
    private javax.swing.JButton boto68;
    private javax.swing.JButton boto69;
    private javax.swing.JButton boto7;
    private javax.swing.JButton boto72;
    private javax.swing.JButton boto73;
    private javax.swing.JButton boto74;
    private javax.swing.JButton boto75;
    private javax.swing.JButton boto76;
    private javax.swing.JButton boto77;
    private javax.swing.JButton boto78;
    private javax.swing.JButton boto79;
    private javax.swing.JButton boto8;
    private javax.swing.JButton boto82;
    private javax.swing.JButton boto83;
    private javax.swing.JButton boto84;
    private javax.swing.JButton boto85;
    private javax.swing.JButton boto86;
    private javax.swing.JButton boto87;
    private javax.swing.JButton boto88;
    private javax.swing.JButton boto89;
    private javax.swing.JButton boto9;
    private javax.swing.JButton boto92;
    private javax.swing.JButton boto93;
    private javax.swing.JButton boto94;
    private javax.swing.JButton boto95;
    private javax.swing.JButton boto96;
    private javax.swing.JButton boto97;
    private javax.swing.JButton boto98;
    private javax.swing.JButton boto99;
    private javax.swing.JButton cargar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reinicioboton;
    public javax.swing.JLabel resultados;
    private javax.swing.JButton salirboton;
    // End of variables declaration//GEN-END:variables
}
