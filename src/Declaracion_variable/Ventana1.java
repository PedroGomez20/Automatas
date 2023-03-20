package Declaracion_variable;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventana1 extends javax.swing.JFrame {

    DefaultTableModel addDatos;

    Object[] add = new Object[2];
    //hola
    int Indice = 0;

    boolean aceptacion;
    boolean aceptacion1;
    boolean aceptacion2;
    boolean linea1 = true;
    boolean linea2 = true;
    boolean linea3 = true;
    boolean linea4 = true;
    boolean linea5 = true;
    boolean linea6 = true;
    boolean linea7 = true;
    boolean linea8 = true;
    char[] caracteres;
    String valsc;
    String valsca;
    String valscQa;
    String valscQqa;
    String[] newTextBsdws;
    String con;
    String valscQQa;
    String[] newTextBss;

    private void we() {

        try {
            String TextB = jTextArea2.getText();
            String[] newTextB = TextB.split(" ");
            try {
                if (!"open".equals(newTextB[0])) {
                   add[0] = "PALABRA DE ARRANQUE INVALIDA";
                    add[1] = newTextB[0];
                    addDatos.addRow(add);
                    analizar.append("PALABRA RESERVADA DE APERTURA ES INVALIDA" + " --> " + newTextB[0] + "\n");
                    linea1 = false;

                } else {
                    add[0] = "PALABRA DE ARRANQUE VALIDA";
                    add[1] = newTextB[0];
                    addDatos.addRow(add);
                    analizar.append("PALABRA RESERVADA CORRECTAMENTE" + " --> " + newTextB[0] + "\n");
                }///IMPORTANTE HACER MA;ANA 

                if (!"/".equals(newTextB[1])) {
                    analizar.append("ASIGNACION DE APERTURA ES INVALIDA  " + " --> " + newTextB[1] + "\n");
                    linea1 = false;
                } else {
                    analizar.append("ASIGNACION DE APERTURA CORRECTAMENTE" + " --> " + newTextB[1] + "\n");
                }

                if (!"\n".equals(newTextB[2])) {
                    analizar.append("SALTO DE LINEA LE HACE FALTA" + "\n");/////66644575757
                    linea1 = false;
                }

            } catch (Exception e) {
                analizar.append("LE FALTA INGRESAR DATOS EN EL CODIGO linea 1 " + "\n");
                linea1 = false;
            }

//        if (aceptacion1 == false) {
//            linea1 = false;
//
//        } else {
//            linea1 = true;
//        }
            String[] newTextBsss = TextB.split("\n");
            valsc = newTextBsss[1];
            newTextBss = valsc.split(" ");

            try {
                if (!"entero".equals(newTextBss[1])) {

                    analizar.append("PALABRA RESERVADA DE DELCLARACION ES INVALIDA 0 " + " --> " + newTextBss[1] + "\n");

                    linea2 = false;

                } else {
                    analizar.append("PALABRA RESERVADA DE DELCLARACION CORRECTAMENTE" + " --> " + newTextBss[1] + "\n");
                }

                if (!":".equals(newTextBss[3])) {
                    analizar.append("SIMBOLO DE ASIGNACION DE VARIBLE ES INVALIDA  " + " --> " + newTextBss[3] + "\n");
                    linea2 = false;
                } else {
                    analizar.append("SIMBOLO DE ASIGNACION DE VARIBLE  CORRECTAMENTE" + " --> " + newTextBss[3] + "\n");
                }

                if (!validarentero(newTextBss[4])) {
                    analizar.append("NUMERO DE LA ASIGNACION DE LA VARIABLE ES INVALIDA  " + " --> " + newTextBss[4] + "\n");
                    linea2 = false;
                } else {
                    analizar.append("NUMERO DE LA ASIGNACION DE LA VARIABLE  CORRECTAMENTE" + " --> " + newTextBss[4] + "\n");
                }

                if (!"?".equals(newTextBss[5])) {
                    analizar.append("SIGNO DE FINAL DE UNA INSTRUCCION ES INVALIDA  " + " --> " + newTextBss[5] + "\n");
                    linea2 = false;
                } else {
                    analizar.append("SIGNO DE FINAL DE UNA INSTRUCCION  CORRECTAMENTE" + " --> " + newTextBss[5] + "\n");
                }

//                    linea2 = true; ////posible eroor
//        if (aceptacion1 == false) {
//            linea2 = false;
//
//        } else {
//            linea2 = true;
//        }
                caracteres = newTextBss[2].toCharArray();
                String val = newTextBss[1];

//        System.out.println(val.length());
                if (Indice < val.length()) { ///

                    if (caracteres[Indice] == '~') { //Si es el caracter que define el automata para la transicion

                        String a = "Estado q0";
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '`') {

                        String a = "Estado q0";
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '!') {

                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '@') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");

                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '#') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");

                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '$') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");

                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '%') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");

                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '^') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");

                        Indice++;
                        aceptacion = false;

                    } else if (caracteres[Indice] == '&') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '*') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '(') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == ')') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '-') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '+') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '/') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '<') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '.') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '1') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '2') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '3') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '4') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '5') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '6') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '7') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '8') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '9') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == '0') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == ':') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else if (caracteres[Indice] == ' ') {
                        asd.append("Estado q0" + " ----->" + caracteres[Indice] + "\n");
                        Indice++;

                        aceptacion = false;

                    } else {
                        q1();

                    }

                    if (aceptacion == false) {
                        linea3 = false;
                        analizar.append("VARIABLE INVALIDO" + " --> " + newTextBss[2] + "\n");

                    } else {
                        linea3 = true;
                        analizar.append("VARIABLE VALIDO" + " --> " + newTextBss[2] + "\n");
                    }

                }
            } catch (Exception e) {
                asd.append("LE FALTA INGRESAR DATOS EN EL CODIGO LINEA 2 " + "\n");
                linea2 = false;
            }

//             int iTesset = Integer.parseInt(newTextBss[4]);
//              int iTessest = Integer.parseInt(newTextBss[2]);
//             
//          iTessest=iTesset;
//          
//          
//          
//          System.out.println(iTessest);
            con = newTextBss[4];
            String varr
                    = //        con= 
                    valscQa = newTextBsss[2];
            newTextBsdws = valscQa.split(" ");
            int cosntsa = newTextBsdws.length;

//        if (cosntsa > 6) {
            try {

                if (!"si".equals(newTextBsdws[1])) {

                    analizar.append("PALABRA RESERVADA DE CONDICIONAL ES INVALIDA close " + " --> " + newTextBsdws[1] + "\n");
                    linea4 = false;
                } else {
                    analizar.append("PALABRA RESERVADA DE CONDICIONAL CORRECTAMENTE" + " --> " + newTextBsdws[1] + "\n");
                }

                if (!"(".equals(newTextBsdws[2])) {
                    analizar.append("simbolo inicial de LA CONDICIONAL ES INVALIDA  " + " --> " + newTextBsdws[2] + "\n");
                    linea4 = false;
                } else {
                    analizar.append("simbolo inicial de LA CONDICIONAL CORRECTAMENTE" + " --> " + newTextBsdws[2] + "\n");
                }

                if (!newTextBss[2].equals(newTextBsdws[3])) {
                    analizar.append("variable numerica  ES INVALIDA  " + " --> " + newTextBsdws[3] + "\n");
                    linea4 = false;
                } else {
                    analizar.append("variable  CORRECTAMENTE" + " --> " + newTextBsdws[3] + "\n");
                }

                if (!">".equals(newTextBsdws[4])) {
                    analizar.append("SIMBOLO DE COMPARACION numerica  ES INVALIDA  " + " --> " + newTextBsdws[4] + "\n");
                    linea4 = false;
                } else {
                    analizar.append("SIMBOLO DE COMPARACION numerica  CORRECTAMENTE" + " --> " + newTextBsdws[4] + "\n");
                }

                if (!"0".equals(newTextBsdws[5])) {
                    asd.append("COMPARADOR numerica  ES INVALIDA  " + " --> " + newTextBsdws[5] + "\n");
                    linea4 = false;
                } else {
                    analizar.append("COMPARADOR numerica  CORRECTAMENTE" + " --> " + newTextBsdws[5] + "\n");
                }

                if (!")".equals(newTextBsdws[6])) {
                    analizar.append("simbolo FINAL  de LA CONDICIONAL ES INVALIDA  " + " --> " + newTextBsdws[6] + "\n");
                    linea4 = false;
                } else {
                    analizar.append("simbolo FINAL  de LA CONDICIONAL  CORRECTAMENTE" + " --> " + newTextBsdws[6] + "\n");
                }

                if (!"{".equals(newTextBsdws[7])) {
                    analizar.append("SIMBOLO DE INSTRUCCION DE LA CONDICIONAL ES INVALIDA  " + " --> " + newTextBsdws[7] + "\n");
                    linea4 = false;
                } else {
                    analizar.append("sSIMBOLO DE INSTRUCCION DE LA CONDICIONAL  CORRECTAMENTE" + " --> " + newTextBsdws[7] + "\n");
                }

                if (!"\n".equals(newTextB[8])) {
                    linea4 = false;
                }
//    }else if(cosntsa <= 6){
//            asd.append("LE FALTA INGRESAR DATOS EN EL CODIGO  " + "\n");
//        }

            } catch (Exception e) {
                asd.append("LE FALTA INGRESAR DATOS EN EL CODIGO LINEA 3  " + "\n");
                linea4 = false;
            }
//        if (aceptacion1 == false) {
//            linea4 = false;
//           
//        } else {
//            linea4 = true;
//        }

            if (">".equals(newTextBsdws[4])) {
                try {
                    valscQQa = newTextBsss[3];
                    String[] newTextBsQSdws = valscQQa.split(" ");

                    if (!"mensaje".equals(newTextBsQSdws[1])) {

                        analizar.append("PALABRA MENSAJE ES INVALIDA  " + " --> " + newTextBsQSdws[1] + "\n");
                        linea5 = false;
                    } else {
                        analizar.append("PALABRA RESERVADA MENSAJE CORRECTAMENTE" + " --> " + newTextBsQSdws[1] + "\n");
                    }

                    if (!"numero".equals(newTextBsQSdws[2])) {
                        analizar.append("PALABRA RESERVADA ES INVALIDA  " + " --> " + newTextBsQSdws[2] + "\n");
                        linea5 = false;
                    } else {
                        analizar.append("PALABRA RESERVADA  CORRECTAMENTE" + " --> " + newTextBsQSdws[2] + "\n");
                    }

                    if (!"positivo".equals(newTextBsQSdws[3])) {
                        analizar.append("PALABRA RESERVADA  ES INVALIDA  " + " --> " + newTextBsQSdws[3] + "\n");
                        linea5 = false;
                    } else {
                        analizar.append("PALABRA RESERVADA  CORRECTAMENTE" + " --> " + newTextBsQSdws[3] + "\n");
                    }

                    if (!"?".equals(newTextBsQSdws[4])) {
                        asd.append("SIGNO DE FINAL DE UNA INSTRUCCION ES INVALIDA  " + newTextBsQSdws[4] + "\n");
                        linea5 = false;
                    } else {
                        analizar.append("SIGNO DE FINAL DE UNA INSTRUCCION  CORRECTAMENTE" + " --> " + newTextBsQSdws[4] + "\n");
                    }

                } catch (Exception e) {
                    asd.append("LE FALTA INGRESAR DATOS EN EL CODIGO LINEA 4  " + "\n");
                    linea5 = false;
                }

//            if (aceptacion1 == false) {
//                linea5 = false;
//
//            } else {
//                linea5 = true;
//            }
//        }else if("<".equals(newTextBsdws[4])){
//             
//            
//            
//             valscQQa = newTextBsss[3];
//        String[] newTextBsQSdws = valscQQa.split(" ");
//      
//         
//         if (!"mensaje".equals(newTextBsQSdws[1])) {
//            
//            asd.append("PALABRA MENSAJE ES INVALIDA  " + "\n");
//            aceptacion1=false;
//        } else if (!"numero".equals(newTextBsQSdws[2])) {
//            asd.append("simbolo inicial de LA CONDICIONAL ES INVALIDA  " + "\n");
//aceptacion1=false;
//        }else if (!"negativo".equals(newTextBsQSdws[3])) {
//            asd.append("variable numerica  ES INVALIDA  " + "\n");
//aceptacion1=false;
//        }else if (!"?".equals(newTextBsQSdws[4])) {
//            asd.append("SIGNO DE FINAL DE UNA INSTRUCCION ES INVALIDA  " + "\n");
//aceptacion1=false;
//        }
//            
//            
            }

//        if (aceptacion1 == true) {
//            int iTeset = Integer.parseInt(newTextBsdws[5]);
//
//            int iTest = Integer.parseInt(con);
//
//            if (iTest > iTeset) {
////              asd.append("la variable escrita es mayor al numero de escrito " + "\n");
//
//                JOptionPane.showMessageDialog(null, "la variable escrita ES NUMERO POSITIVO ");
//            } else {
//                JOptionPane.showMessageDialog(null, "la variable escrita ES NUMERO NEGATIVO "); ///555555484184
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "NOSE PUEDO REALIZAR LA OPERACION POR FAVOR DE REVISAR CONSOLA ");
//        }
            valscQQa = newTextBsss[4];
            String[] newTextBsQSdws = valscQQa.split(" ");
            try {
                if (!"}".equals(newTextBsQSdws[1])) {

                    analizar.append("SIMBOLO DE FINALIZACION DE LA CONDICIONAL ES INVALIDA  " + " --> " + newTextBsQSdws[1] + "\n");
                    linea6 = false;
                } else {
                    analizar.append("SIMBOLO DE FINALIZACION DE LA CONDICIONAL" + " --> " + newTextBsQSdws[1] + "\n");
                }

            } catch (Exception e) {
                analizar.append("LE FALTA INGRESAR DATOS EN EL CODIGO LINEA 5  " + "\n");
                linea6 = false;
            }
//            if (aceptacion1 == false) {
//            linea6 = false;
//
//        } else {
//            linea6 = true;
//        }

//SI QUEIRO AGREGAR OTRA PALABRA RESRVADA DEBERE HACER LO MISMO
            //PARA AGREGAR CONDICION SE DEBERA HACER LO MISMO DELA LINEA 310 A 329 MODIFICANDO EN SERIE LOS ARRAY NOTA SI PONGO CONDICIONAL DEBERE DE MODIFICAR EL FINAL CLOSE
//        String[] newTextBssas = TextB.split("\n");  //310
            valsca = newTextBsss[5];
            String[] newTextBsds = valsca.split(" ");

            int cosntsas = newTextBsds.length;

            if (cosntsas <= 3) {
                try {
                    if (!"close".equals(newTextBsds[1])) {

                        analizar.append("PALABRA RESERVADA DE FINALIZACION DE PROGRAMA ES INVALIDA close " + " --> " + newTextBsds[1] + "\n");
                        linea7 = false;
                    } else {
                        analizar.append("PALABRA RESERVADA DE FINALIZACION DE PROGRAMA CORRECTAMENTE" + " --> " + newTextBsds[1] + "\n");
                    }

                    if (!"||".equals(newTextBsds[2])) {
                        analizar.append("SIMBOLO DE terminacion del programa ES INVALIDA  " + " --> " + newTextBsds[2] + "\n");
                        linea7 = false;
                    } else {
                        analizar.append("SIMBOLO DE terminacion del programa CORRECTAMENTE" + " --> " + newTextBsds[2] + "\n");
                    }

//                            if ("0".equals(newTextB[3])) {
//                        linea7 = false;
//                    }
//else if ("0".equals(newTextB[4])) {
//                    linea7 = false;
//                } //329
                } catch (Exception e) {
                    analizar.append("LE FALTA INGRESAR DATOS EN EL CODIGO LINEA 6  " + "\n");
                    linea7 = false;
                }
            } else {
                linea7 = false;
                asd.append("INGRESO DATOS DE MAS EL FINALIZAR" + "\n");
                try {
                    if (!"close".equals(newTextBsds[1])) {

                        analizar.append("PALABRA RESERVADA DE FINALIZACION DE PROGRAMA ES INVALIDA close " + " --> " + newTextBsds[1] + "\n");
                        linea7 = false;
                    } else {
                        analizar.append("PALABRA RESERVADA DE FINALIZACION DE PROGRAMA CORRECTAMENTE" + " --> " + newTextBsds[1] + "\n");
                    }

                    if (!"||".equals(newTextBsds[2])) {
                        analizar.append("SIMBOLO DE terminacion del programa ES INVALIDA  " + " --> " + newTextBsds[2] + "\n");
                        linea7 = false;
                    } else {
                        analizar.append("SIMBOLO DE terminacion del programa CORRECTAMENTE" + " --> " + newTextBsds[2] + "\n");
                    }

//                            if ("0".equals(newTextB[3])) {
//                        linea7 = false;
//                    }
//else if ("0".equals(newTextB[4])) {
//                    linea7 = false;
//                } //329
                } catch (Exception e) {
                    asd.append("LE FALTA INGRESAR DATOS EN EL CODIGO LINEA 6  " + "\n");
                    linea7 = false;
                }

            }

//        if (aceptacion1 == false) {
//            linea7 = false;
//
//        } else {
//            linea7 = true;
//        }
        } catch (Exception e) {
            asd.append("LE FALTA INGRESAR DATOS EN EL CODIGO " + "\n");
            linea8 = false;
        }

        if (linea1 == false || linea2 == false || linea4 == false || linea5 == false || linea6 == false || linea7 == false || linea8 == false) {
//            asd.append("variable ACEPTADA" + "\n");
            JOptionPane.showMessageDialog(null, "NOSE PUEDO REALIZAR LA OPERACION POR FAVOR DE REVISAR CONSOLA ");
        } else if (linea1 == true && linea2 == true && linea4 == true && linea5 == true && linea6 == true && linea7 == true && linea8 == true) {

            int iTeset = Integer.parseInt(newTextBsdws[5]);

            int iTest = Integer.parseInt(con);

            if (iTest > iTeset) {
//              asd.append("la variable escrita es mayor al numero de escrito " + "\n");

                JOptionPane.showMessageDialog(null, "la variable escrita ES NUMERO POSITIVO ");
//            } else {
//                JOptionPane.showMessageDialog(null, "la variable escrita ES NUMERO NEGATIVO "); ///555555484184
//            }

            }
        }

    }

    private void q0() {

        if (aceptacion = false) {
            we();
        }

    }

    public void q1() {
        aceptacion = true;

        if (Indice < caracteres.length) {

            if (caracteres[Indice] == 'a') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");

                Indice++;
                q1();
            } else if (caracteres[Indice] == 'b') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'c') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'd') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'f') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'g') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'h') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'i') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'j') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'k') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'l') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'm') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'n') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'o') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'p') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'q') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'r') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 's') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 't') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'u') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'v') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");

                Indice++;
                q1();
            } else if (caracteres[Indice] == 'w') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'x') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'y') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'z') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '1') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '2') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '3') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '4') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '5') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '6') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '7') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '8') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '9') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '0') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'e') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();

            } else if (caracteres[Indice] == 'A') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");

                Indice++;
                q1();
            } else if (caracteres[Indice] == 'B') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'C') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'D') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'F') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'G') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'H') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'I') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'J') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'K') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'L') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'M') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'N') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'O') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'p') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'Q') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'R') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'S') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'T') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'U') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'V') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'W') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'X') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'Y') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'Z') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '1') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '2') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '3') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '4') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '5') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '6') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '7') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '8') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '9') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '0') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == 'E') {
                asd.append("Estado q1 de Aceptacion" + " ----->" + caracteres[Indice] + "\n");
                Indice++;
                q1();
            } else if (caracteres[Indice] == '>') {
                asd.append("Estado q0 espacio" + "\n");
                Indice++;
                aceptacion = true;
                q1();
            } else if (caracteres[Indice] == '=') {
                asd.append("Estado q0 espacio" + "\n");
                Indice++;
                aceptacion = false;
                q1();

            } else {

                we();

            }

        }
        ////4455544646
        if (aceptacion == false) {
            linea6 = false;

        } else {
            linea6 = true;
        }
    }

    public boolean validarentero(String numero) {
        numero = newTextBss[4];

        return numero.matches("[0-9]*");
    }

    public Ventana1() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnLex = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        asd = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        BtnText = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        analizar = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IDE_TEC");
        setUndecorated(true);

        BtnLex.setForeground(new java.awt.Color(255, 0, 0));
        BtnLex.setText("SALIR");
        BtnLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLexActionPerformed(evt);
            }
        });

        asd.setColumns(20);
        asd.setRows(5);
        jScrollPane2.setViewportView(asd);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane1.setViewportView(jTextArea2);

        BtnText.setText("RUN PROYECT");
        BtnText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTextActionPerformed(evt);
            }
        });

        jButton1.setText("BORRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("ENTRADA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnText, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(BtnText)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("IDE_TEC");

        jLabel1.setText("CONSOLA: ");

        analizar.setColumns(20);
        analizar.setRows(5);
        jScrollPane3.setViewportView(analizar);

        jLabel3.setText("ANALIZADOR");

        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ESTADO", "SIMBOLO"
            }
        ));
        Mostrar.setMaximumSize(new java.awt.Dimension(200, 64));
        jScrollPane4.setViewportView(Mostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248)
                        .addComponent(BtnLex, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(464, 464, 464))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(BtnLex, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTextActionPerformed
 addDatos = (DefaultTableModel) Mostrar.getModel();
//        linea_1();
        we();

        if (linea3 == true) {
            asd.append("variable ACEPTADA" + "\n");
        } else {
            asd.append("variable NO ACEPTADA" + "\n");
        }

        if (linea3 == false || linea1 == false || linea2 == false || linea4 == false || linea5 == false || linea6 == false || linea7 == false || linea8 == false) {
//            asd.append("variable ACEPTADA" + "\n");
            asd.append("LA INSTRUCCION ES INVALIDAD" + "\n");
        } else if (linea1 == true && linea2 == true && linea4 == true && linea5 == true && linea6 == true && linea7 == true && linea8 == true) {

            asd.append("LA INSTRUCCION ES VALIDA" + "\n");

        }


    }//GEN-LAST:event_BtnTextActionPerformed

    private void BtnLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLexActionPerformed
//        MostrarLexemas();
        System.exit(0);
    }//GEN-LAST:event_BtnLexActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//       inciop();
        asd.setText("");
        analizar.setText("");
        linea1 = true;
        linea2 = true;
        linea3 = true;
        linea4 = true;
        linea5 = true;
        linea6 = true;
        linea7 = true;
        linea8 = true;
        Indice = 0;
//       repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLex;
    private javax.swing.JButton BtnText;
    private javax.swing.JTable Mostrar;
    private javax.swing.JTextArea analizar;
    private javax.swing.JTextArea asd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
