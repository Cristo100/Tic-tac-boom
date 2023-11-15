
package tictac;
import javax.swing.*;
import java.lang.reflect.Field;

public class ventana extends javax.swing.JFrame {
//Creacion de variables:
        boolean turno = true;

        //Creacion de matrices
        private int[][] matriz1 = new int[3][3];
        private int[][] matriz2 = new int[3][3];
        private int[][] matriz3 = new int[3][3];
        private int[][] matriz4 = new int[3][3];
        private int[][] matriz5 = new int[3][3];
        private int[][] matriz6 = new int[3][3];
        private int[][] matriz7 = new int[3][3];
        private int[][] matriz8 = new int[3][3];
        private int[][] matriz9 = new int[3][3];
        
        //ver en que matrices ya hay un ganador:
        private int[][] matriz_ganadora = new int[3][3];

        
        //  Creacion de gran matriz (conformado por las matrices pequeñas)
        private int[][][][] granmatriz ={      {matriz1, matriz2, matriz3},
                                                            {matriz4, matriz5, matriz6},
                                                            {matriz7, matriz8, matriz9}     };

        
        
//METODOS:
        
//--------------------------
// 1- verificacion de ganador:
//--------------------------

public void verificacion() {
    for (int i = 0; i < granmatriz.length; i++) {  // Verificar en las filas, columnas y diagonales de cada matriz pequeña
        for (int j = 0; j < granmatriz[i].length; j++) {
            // Verificar solo si no hay un ganador en este juego
            if (matriz_ganadora[i][j] == 0 && verifica_ganador(granmatriz[i][j])) {
                matriz_ganadora[i][j] = turno ? 2 : 1; // Establecer el ganador en esta posición
                System.out.println("Jugador " + (turno ? "O" : "X") + " ganó en la matriz: " + (i + 1) + "-" + (j + 1) + "!");
            }
        }
    }
    //ve si alguien gano definitivamente
    if (verifica_ganador(matriz_ganadora)) {
        resultados.setText((turno ? "O" : "X")+" Gano la partida");
        return;
    }
}

// Ganador en una matriz
private boolean verifica_ganador(int[][] matriz) {
    for (int i = 0; i < 3; i++) {
        // Verificar filas y columnas
        if (matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2] && matriz[i][0] != 0) {
            return true; // Hay un ganador en la fila i
        }
        if (matriz[0][i] == matriz[1][i] && matriz[1][i] == matriz[2][i] && matriz[0][i] != 0) {
            return true; // Hay un ganador en la columna i
        }
    }
    // Verificar diagonales
    if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != 0) {
        return true; // Hay un ganador en la diagonal principal
    }
    if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != 0) {
        return true; // Hay un ganador en la diagonal secundaria
    }
    return false; // No hay ganador en esta matriz
}

//--------------------------
// 2- sistema de reinicio:
//--------------------------
    private void reinicio_total() {
        //Ganadores
        for (int i = 0; i < matriz_ganadora.length; i++) {
            for (int j = 0; j < matriz_ganadora[i].length; j++) {
                matriz_ganadora[i][j] = 0;
            }}
        //Todos los botones en blanco
        Field[] fields = getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getType() == JButton.class && field.getName().startsWith("boto")) {   //aqui se pregunta como comienzan los botones que se quiere modificar.
                try {
                    JButton boton = (JButton) field.get(this);
                    boton.setText("");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }}}
        
        //las matrices de resultados de vuelta a 0:
        for (int i = 0; i < granmatriz.length; i++) {
        for (int j = 0; j < granmatriz[i].length; j++) {
            for (int k = 0; k < granmatriz[i][j].length; k++) {
                for (int l = 0; l < granmatriz[i][j][k].length; l++) {
                    granmatriz[i][j][k][l] = 0;
                }}}}
    }

    
    
//--------------------------
// 3- Ejecutar jugadas: (llamada de lo anterior y cambio de matrices)
//--------------------------
        public void coordenada(javax.swing.JButton button, int[][] matriz, int x, int y) {
            String valor;
            if (matriz[x][y] == 0) {
                if (turno) {matriz[x][y] = 1;} else {matriz[x][y] = 2;}
                valor = (turno) ? "X" : "O";
                button.setText(valor);
                turno = !turno;

                //llamada de otros metodos.
                verificacion();

        }}


    public ventana() {
        initComponents();
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

        boto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto1ActionPerformed(evt);
            }
        });

        boto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto2ActionPerformed(evt);
            }
        });

        boto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto3ActionPerformed(evt);
            }
        });

        boto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto4ActionPerformed(evt);
            }
        });

        boto5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto5ActionPerformed(evt);
            }
        });

        boto6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto6ActionPerformed(evt);
            }
        });

        boto7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto7ActionPerformed(evt);
            }
        });

        boto8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto8ActionPerformed(evt);
            }
        });

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

        boto12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto12ActionPerformed(evt);
            }
        });

        boto22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto22ActionPerformed(evt);
            }
        });

        boto32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto32ActionPerformed(evt);
            }
        });

        boto42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto42ActionPerformed(evt);
            }
        });

        boto52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto52ActionPerformed(evt);
            }
        });

        boto62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto62ActionPerformed(evt);
            }
        });

        boto72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto72ActionPerformed(evt);
            }
        });

        boto82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto82ActionPerformed(evt);
            }
        });

        boto92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto92ActionPerformed(evt);
            }
        });

        boto23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto23ActionPerformed(evt);
            }
        });

        boto33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto33ActionPerformed(evt);
            }
        });

        boto43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto43ActionPerformed(evt);
            }
        });

        boto53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto53ActionPerformed(evt);
            }
        });

        boto63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto63ActionPerformed(evt);
            }
        });

        boto73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto73ActionPerformed(evt);
            }
        });

        boto83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto83ActionPerformed(evt);
            }
        });

        boto93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto93ActionPerformed(evt);
            }
        });

        boto13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto13ActionPerformed(evt);
            }
        });

        boto24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto24ActionPerformed(evt);
            }
        });

        boto34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto34ActionPerformed(evt);
            }
        });

        boto44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto44ActionPerformed(evt);
            }
        });

        boto54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto54ActionPerformed(evt);
            }
        });

        boto64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto64ActionPerformed(evt);
            }
        });

        boto74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto74ActionPerformed(evt);
            }
        });

        boto84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto84ActionPerformed(evt);
            }
        });

        boto94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto94ActionPerformed(evt);
            }
        });

        boto14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto14ActionPerformed(evt);
            }
        });

        boto75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto75ActionPerformed(evt);
            }
        });

        boto85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto85ActionPerformed(evt);
            }
        });

        boto95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto95ActionPerformed(evt);
            }
        });

        boto15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto15ActionPerformed(evt);
            }
        });

        boto25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto25ActionPerformed(evt);
            }
        });

        boto35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto35ActionPerformed(evt);
            }
        });

        boto45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto45ActionPerformed(evt);
            }
        });

        boto55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto55ActionPerformed(evt);
            }
        });

        boto65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto65ActionPerformed(evt);
            }
        });

        boto66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto66ActionPerformed(evt);
            }
        });

        boto76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto76ActionPerformed(evt);
            }
        });

        boto86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto86ActionPerformed(evt);
            }
        });

        boto96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto96ActionPerformed(evt);
            }
        });

        boto16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto16ActionPerformed(evt);
            }
        });

        boto26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto26ActionPerformed(evt);
            }
        });

        boto36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto36ActionPerformed(evt);
            }
        });

        boto46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto46ActionPerformed(evt);
            }
        });

        boto56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto56ActionPerformed(evt);
            }
        });

        boto67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto67ActionPerformed(evt);
            }
        });

        boto77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto77ActionPerformed(evt);
            }
        });

        boto87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto87ActionPerformed(evt);
            }
        });

        boto97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto97ActionPerformed(evt);
            }
        });

        boto17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto17ActionPerformed(evt);
            }
        });

        boto27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto27ActionPerformed(evt);
            }
        });

        boto37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto37ActionPerformed(evt);
            }
        });

        boto47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto47ActionPerformed(evt);
            }
        });

        boto57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto57ActionPerformed(evt);
            }
        });

        boto68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto68ActionPerformed(evt);
            }
        });

        boto78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto78ActionPerformed(evt);
            }
        });

        boto88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto88ActionPerformed(evt);
            }
        });

        boto98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto98ActionPerformed(evt);
            }
        });

        boto18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto18ActionPerformed(evt);
            }
        });

        boto28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto28ActionPerformed(evt);
            }
        });

        boto38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto38ActionPerformed(evt);
            }
        });

        boto48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto48ActionPerformed(evt);
            }
        });

        boto58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto58ActionPerformed(evt);
            }
        });

        boto69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto69ActionPerformed(evt);
            }
        });

        boto79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto79ActionPerformed(evt);
            }
        });

        boto89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto89ActionPerformed(evt);
            }
        });

        boto99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto99ActionPerformed(evt);
            }
        });

        boto19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto19ActionPerformed(evt);
            }
        });

        boto29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto29ActionPerformed(evt);
            }
        });

        boto39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto39ActionPerformed(evt);
            }
        });

        boto49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto49ActionPerformed(evt);
            }
        });

        boto59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto59ActionPerformed(evt);
            }
        });

        resultados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultados.setText("-JUGANDO-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
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
                        .addGap(360, 360, 360)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(resultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(reinicioboton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salirboton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(215, Short.MAX_VALUE))
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
                    .addComponent(salirboton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        coordenada(boto1,matriz1,0,0);
    }//GEN-LAST:event_boto1ActionPerformed

    private void boto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto2ActionPerformed
        coordenada(boto2,matriz1,1,0);
    }//GEN-LAST:event_boto2ActionPerformed

    private void boto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto3ActionPerformed
coordenada(boto3,matriz1,2,0);
    }//GEN-LAST:event_boto3ActionPerformed

    private void boto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto4ActionPerformed
coordenada(boto4,matriz1,0,1);
    }//GEN-LAST:event_boto4ActionPerformed

    private void boto5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto5ActionPerformed
coordenada(boto5,matriz1,1,1);
    }//GEN-LAST:event_boto5ActionPerformed

    private void boto6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto6ActionPerformed
coordenada(boto6,matriz1,2,1);
    }//GEN-LAST:event_boto6ActionPerformed

    private void boto7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto7ActionPerformed
coordenada(boto7,matriz1,0,2);
    }//GEN-LAST:event_boto7ActionPerformed

    private void boto8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto8ActionPerformed
coordenada(boto8,matriz1,1,2);
    }//GEN-LAST:event_boto8ActionPerformed

    private void boto9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto9ActionPerformed
coordenada(boto9,matriz1,2,2);
    }//GEN-LAST:event_boto9ActionPerformed

    private void reiniciobotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciobotonActionPerformed

//reinicio de matrices de la gran matriz (El juego completo)
        reinicio_total();
        turno = true;
    }//GEN-LAST:event_reiniciobotonActionPerformed

    private void boto12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto12ActionPerformed
coordenada(boto12,matriz2,0,0);
    }//GEN-LAST:event_boto12ActionPerformed

    private void boto22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto22ActionPerformed
coordenada(boto22,matriz2,1,0);
    }//GEN-LAST:event_boto22ActionPerformed

    private void boto32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto32ActionPerformed
coordenada(boto32,matriz2,2,0);
    }//GEN-LAST:event_boto32ActionPerformed

    private void boto42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto42ActionPerformed
coordenada(boto42,matriz2,0,1);
    }//GEN-LAST:event_boto42ActionPerformed

    private void boto52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto52ActionPerformed
coordenada(boto52,matriz2,1,1);
    }//GEN-LAST:event_boto52ActionPerformed

    private void boto62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto62ActionPerformed
coordenada(boto62,matriz2,2,1);
    }//GEN-LAST:event_boto62ActionPerformed

    private void boto72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto72ActionPerformed
coordenada(boto72,matriz2,0 ,2);
    }//GEN-LAST:event_boto72ActionPerformed

    private void boto82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto82ActionPerformed
coordenada(boto82,matriz2,1,2);
    }//GEN-LAST:event_boto82ActionPerformed

    private void boto92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto92ActionPerformed
coordenada(boto92,matriz2,2,2);
    }//GEN-LAST:event_boto92ActionPerformed

    private void boto23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto23ActionPerformed
coordenada(boto23,matriz3,1,0);
    }//GEN-LAST:event_boto23ActionPerformed

    private void boto33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto33ActionPerformed
coordenada(boto33,matriz3,2,0);
    }//GEN-LAST:event_boto33ActionPerformed

    private void boto43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto43ActionPerformed
coordenada(boto43,matriz3,0,1);
    }//GEN-LAST:event_boto43ActionPerformed

    private void boto53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto53ActionPerformed
coordenada(boto53,matriz3,1,1);
    }//GEN-LAST:event_boto53ActionPerformed

    private void boto63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto63ActionPerformed
coordenada(boto63,matriz3,2,1);
    }//GEN-LAST:event_boto63ActionPerformed

    private void boto73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto73ActionPerformed
coordenada(boto73,matriz3,0,2);
    }//GEN-LAST:event_boto73ActionPerformed

    private void boto83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto83ActionPerformed
coordenada(boto83,matriz3,1,2);
    }//GEN-LAST:event_boto83ActionPerformed

    private void boto93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto93ActionPerformed
coordenada(boto93,matriz3,2,2);
    }//GEN-LAST:event_boto93ActionPerformed

    private void boto13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto13ActionPerformed
coordenada(boto13,matriz3,0,0);
    }//GEN-LAST:event_boto13ActionPerformed

    private void boto24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto24ActionPerformed
coordenada(boto24,matriz4,1,0);
    }//GEN-LAST:event_boto24ActionPerformed

    private void boto34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto34ActionPerformed
coordenada(boto34,matriz4,2,0);
    }//GEN-LAST:event_boto34ActionPerformed

    private void boto44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto44ActionPerformed
coordenada(boto44,matriz4,0,1);
    }//GEN-LAST:event_boto44ActionPerformed

    private void boto54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto54ActionPerformed
coordenada(boto54,matriz4,1,1);
    }//GEN-LAST:event_boto54ActionPerformed

    private void boto64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto64ActionPerformed
coordenada(boto64,matriz4,2,1);
    }//GEN-LAST:event_boto64ActionPerformed

    private void boto74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto74ActionPerformed
coordenada(boto74,matriz4,0,2);
    }//GEN-LAST:event_boto74ActionPerformed

    private void boto84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto84ActionPerformed
coordenada(boto84,matriz4,1,2);
    }//GEN-LAST:event_boto84ActionPerformed

    private void boto94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto94ActionPerformed
coordenada(boto94,matriz4,2,2);
    }//GEN-LAST:event_boto94ActionPerformed

    private void boto14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto14ActionPerformed
coordenada(boto14,matriz4,0,0);
    }//GEN-LAST:event_boto14ActionPerformed

    private void boto75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto75ActionPerformed
coordenada(boto75,matriz5,0,2);
    }//GEN-LAST:event_boto75ActionPerformed

    private void boto85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto85ActionPerformed
coordenada(boto85,matriz5,1,2);
    }//GEN-LAST:event_boto85ActionPerformed

    private void boto95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto95ActionPerformed
coordenada(boto95,matriz5,2,2);
    }//GEN-LAST:event_boto95ActionPerformed

    private void boto15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto15ActionPerformed
coordenada(boto15,matriz5,0,0);
    }//GEN-LAST:event_boto15ActionPerformed

    private void boto25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto25ActionPerformed
coordenada(boto25,matriz5,1,0);
    }//GEN-LAST:event_boto25ActionPerformed

    private void boto35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto35ActionPerformed
coordenada(boto35,matriz5,2,0);
    }//GEN-LAST:event_boto35ActionPerformed

    private void boto45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto45ActionPerformed
coordenada(boto45,matriz5,0,1);
    }//GEN-LAST:event_boto45ActionPerformed

    private void boto55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto55ActionPerformed
coordenada(boto55,matriz5,1,1);
    }//GEN-LAST:event_boto55ActionPerformed

    private void boto65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto65ActionPerformed
coordenada(boto65,matriz5,2,1);
    }//GEN-LAST:event_boto65ActionPerformed

    private void boto66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto66ActionPerformed
coordenada(boto66,matriz6,2,1);
    }//GEN-LAST:event_boto66ActionPerformed

    private void boto76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto76ActionPerformed
coordenada(boto76,matriz6,0,2);
    }//GEN-LAST:event_boto76ActionPerformed

    private void boto86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto86ActionPerformed
coordenada(boto86,matriz6,1,2);
    }//GEN-LAST:event_boto86ActionPerformed

    private void boto96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto96ActionPerformed
coordenada(boto96,matriz6,2,2);
    }//GEN-LAST:event_boto96ActionPerformed

    private void boto16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto16ActionPerformed
coordenada(boto16,matriz6,0,0);
    }//GEN-LAST:event_boto16ActionPerformed

    private void boto26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto26ActionPerformed
coordenada(boto26,matriz6,1,0);
    }//GEN-LAST:event_boto26ActionPerformed

    private void boto36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto36ActionPerformed
coordenada(boto36,matriz6,2,0);
    }//GEN-LAST:event_boto36ActionPerformed

    private void boto46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto46ActionPerformed
coordenada(boto46,matriz6,0,1);
    }//GEN-LAST:event_boto46ActionPerformed

    private void boto56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto56ActionPerformed
coordenada(boto56,matriz6,1,1);
    }//GEN-LAST:event_boto56ActionPerformed

    private void boto67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto67ActionPerformed
coordenada(boto67,matriz7,2,1);
    }//GEN-LAST:event_boto67ActionPerformed

    private void boto77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto77ActionPerformed
coordenada(boto77,matriz7,0,2);
    }//GEN-LAST:event_boto77ActionPerformed

    private void boto87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto87ActionPerformed
coordenada(boto87,matriz7,1,2);
    }//GEN-LAST:event_boto87ActionPerformed

    private void boto97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto97ActionPerformed
coordenada(boto97,matriz7,2,2);
    }//GEN-LAST:event_boto97ActionPerformed

    private void boto17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto17ActionPerformed
coordenada(boto17,matriz7,0,0);
    }//GEN-LAST:event_boto17ActionPerformed

    private void boto27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto27ActionPerformed
coordenada(boto27,matriz7,1,0);
    }//GEN-LAST:event_boto27ActionPerformed

    private void boto37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto37ActionPerformed
coordenada(boto37,matriz7,2,0);
    }//GEN-LAST:event_boto37ActionPerformed

    private void boto47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto47ActionPerformed
coordenada(boto47,matriz7,0,1);
    }//GEN-LAST:event_boto47ActionPerformed

    private void boto57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto57ActionPerformed
coordenada(boto57,matriz7,1,1);
    }//GEN-LAST:event_boto57ActionPerformed

    private void boto68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto68ActionPerformed
coordenada(boto68,matriz8,2,1);
    }//GEN-LAST:event_boto68ActionPerformed

    private void boto78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto78ActionPerformed
coordenada(boto78,matriz8,0,2);
    }//GEN-LAST:event_boto78ActionPerformed

    private void boto88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto88ActionPerformed
coordenada(boto88,matriz8,1,2);
    }//GEN-LAST:event_boto88ActionPerformed

    private void boto98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto98ActionPerformed
coordenada(boto98,matriz8,2,2);
    }//GEN-LAST:event_boto98ActionPerformed

    private void boto18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto18ActionPerformed
coordenada(boto18,matriz8,0,0);
    }//GEN-LAST:event_boto18ActionPerformed

    private void boto28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto28ActionPerformed
coordenada(boto28,matriz8,1,0);
    }//GEN-LAST:event_boto28ActionPerformed

    private void boto38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto38ActionPerformed
coordenada(boto38,matriz8,2,0);
    }//GEN-LAST:event_boto38ActionPerformed

    private void boto48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto48ActionPerformed
coordenada(boto48,matriz8,0,1);
    }//GEN-LAST:event_boto48ActionPerformed

    private void boto58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto58ActionPerformed
coordenada(boto58,matriz8,1,1);
    }//GEN-LAST:event_boto58ActionPerformed

    private void boto69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto69ActionPerformed
coordenada(boto69,matriz9,2,1);
    }//GEN-LAST:event_boto69ActionPerformed

    private void boto79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto79ActionPerformed
coordenada(boto79,matriz9,0,2);
    }//GEN-LAST:event_boto79ActionPerformed

    private void boto89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto89ActionPerformed
coordenada(boto89,matriz9,1,2);
    }//GEN-LAST:event_boto89ActionPerformed

    private void boto99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto99ActionPerformed
coordenada(boto99,matriz9,2,2);
    }//GEN-LAST:event_boto99ActionPerformed

    private void boto19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto19ActionPerformed
coordenada(boto19,matriz9,0,0);
    }//GEN-LAST:event_boto19ActionPerformed

    private void boto29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto29ActionPerformed
coordenada(boto29,matriz9,1,0);
    }//GEN-LAST:event_boto29ActionPerformed

    private void boto39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto39ActionPerformed
coordenada(boto39,matriz9,2,0);
    }//GEN-LAST:event_boto39ActionPerformed

    private void boto49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto49ActionPerformed
coordenada(boto49,matriz9,0,1);
    }//GEN-LAST:event_boto49ActionPerformed

    private void boto59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto59ActionPerformed
coordenada(boto59,matriz9,1,1);
    }//GEN-LAST:event_boto59ActionPerformed
         

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reinicioboton;
    private javax.swing.JLabel resultados;
    private javax.swing.JButton salirboton;
    // End of variables declaration//GEN-END:variables
}
