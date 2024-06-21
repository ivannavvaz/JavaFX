package calculadorafx;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    public calculadora calculadora1 = new calculadora();

    private boolean resultadoMostrado = false; // Para borrar el resultado cuando le des a otro numero
    private boolean anteriorIgual = false; // Para cuando le das varias veces al igual y para cuando quieres modificar
                                           // el resumen
    private int operacionAnterior; // Para cuando le das varias veces al igual

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField memoria;

    @FXML
    private TextField operacion;

    @FXML
    private TextField operacionanterior;

    @FXML
    private Button tecla0;

    @FXML
    private Button tecla00;

    @FXML
    private Button tecla1;

    @FXML
    private Button tecla2;

    @FXML
    private Button tecla3;

    @FXML
    private Button tecla4;

    @FXML
    private Button tecla5;

    @FXML
    private Button tecla6;

    @FXML
    private Button tecla7;

    @FXML
    private Button tecla8;

    @FXML
    private Button tecla9;

    @FXML
    private Button tecla_mc;

    @FXML
    private Button tecla_mmas;

    @FXML
    private Button tecla_mmenos;

    @FXML
    private Button tecla_mr;

    @FXML
    private Button tecla_ms;

    @FXML
    private Button teclac;

    @FXML
    private Button teclace;

    @FXML
    private Button teclacoma;

    @FXML
    private Button tecladividir;

    @FXML
    private Button teclaigual;

    @FXML
    private Button teclamas;

    @FXML
    private Button teclamasmenos;

    @FXML
    private Button teclamenos;

    @FXML
    private Button teclamultiplicar;

    @FXML
    private Button teclaporcentaje;

    @FXML
    private Button teclaraiz;

    @FXML
    private Button teclaretroceder;

    @FXML
    private Button teclaunoentre;

    // BOTONES NUMEROS

    @FXML
    void pulsa0(ActionEvent event) {
        if (anteriorIgual) { // Para cuando el boton dado anterior es igual, hace que borre la operacion anterior
            this.operacionanterior.setText("");
        }
        anteriorIgual = false;
        if (resultadoMostrado) { // Para reemplazar el resultado mostrado por pantalla
            this.operacion.setText("0");
            resultadoMostrado = false;
        } else {
            this.operacion.setText(this.operacion.getText() + "0"); // Si no para añadir al numero escrito
        }
    }

    @FXML
    void pulsa00(ActionEvent event) {
        if (anteriorIgual) {
            this.operacionanterior.setText("");
        }
        anteriorIgual = false;
        if (resultadoMostrado) {
            this.operacion.setText("0" + "0");
            resultadoMostrado = false;
        } else {
            this.operacion.setText(this.operacion.getText() + "0" + "0");
        }
    }

    @FXML
    void pulsa1(ActionEvent event) {
        if (anteriorIgual) {
            this.operacionanterior.setText("");
        }
        anteriorIgual = false;
        if (resultadoMostrado) {
            this.operacion.setText("1");
            resultadoMostrado = false;
        } else {
            this.operacion.setText(this.operacion.getText() + "1");
        }
    }

    @FXML
    void pulsa2(ActionEvent event) {
        if (anteriorIgual) {
            this.operacionanterior.setText("");
        }
        anteriorIgual = false;
        if (resultadoMostrado) {
            this.operacion.setText("2");
            resultadoMostrado = false;
        } else {
            this.operacion.setText(this.operacion.getText() + "2");
        }
    }

    @FXML
    void pulsa3(ActionEvent event) {
        if (anteriorIgual) {
            this.operacionanterior.setText("");
        }
        anteriorIgual = false;
        if (resultadoMostrado) {
            this.operacion.setText("3");
            resultadoMostrado = false;
        } else {
            this.operacion.setText(this.operacion.getText() + "3");
        }
    }

    @FXML
    void pulsa4(ActionEvent event) {
        if (anteriorIgual) {
            this.operacionanterior.setText("");
        }
        anteriorIgual = false;
        if (resultadoMostrado) {
            this.operacion.setText("4");
            resultadoMostrado = false;
        } else {
            this.operacion.setText(this.operacion.getText() + "4");
        }
    }

    @FXML
    void pulsa5(ActionEvent event) {
        if (anteriorIgual) {
            this.operacionanterior.setText("");
        }
        anteriorIgual = false;
        if (resultadoMostrado) {
            this.operacion.setText("5");
            resultadoMostrado = false;
        } else {
            this.operacion.setText(this.operacion.getText() + "5");
        }
    }

    @FXML
    void pulsa6(ActionEvent event) {
        if (anteriorIgual) {
            this.operacionanterior.setText("");
        }
        anteriorIgual = false;
        if (resultadoMostrado) {
            this.operacion.setText("6");
            resultadoMostrado = false;
        } else {
            this.operacion.setText(this.operacion.getText() + "6");
        }
    }

    @FXML
    void pulsa7(ActionEvent event) {
        if (anteriorIgual) {
            this.operacionanterior.setText("");
        }
        anteriorIgual = false;
        if (resultadoMostrado) {
            this.operacion.setText("7");
            resultadoMostrado = false;
        } else {
            this.operacion.setText(this.operacion.getText() + "7");
        }
    }

    @FXML
    void pulsa8(ActionEvent event) {
        if (anteriorIgual) {
            this.operacionanterior.setText("");
        }
        anteriorIgual = false;
        if (resultadoMostrado) {
            this.operacion.setText("8");
            resultadoMostrado = false;
        } else {
            this.operacion.setText(this.operacion.getText() + "8");
        }
    }

    @FXML
    void pulsa9(ActionEvent event) {
        if (anteriorIgual) {
            this.operacionanterior.setText("");
        }
        anteriorIgual = false;
        if (resultadoMostrado) {
            this.operacion.setText("9");
            resultadoMostrado = false;
        } else {
            this.operacion.setText(this.operacion.getText() + "9");
        }
    }

    @FXML
    void pulsacoma(ActionEvent event) {
        if (anteriorIgual) {
            this.operacionanterior.setText("");
        }
        anteriorIgual = false;
        resultadoMostrado = false;
        if (!this.operacion.getText().contains(".")) { // Para que no te permita poner dos comas
            this.operacion.setText(this.operacion.getText() + ".");
        }
    }

    // FIN DE LOS BOTONES DE NUMEROS

    // Metodo para cambiar el numero de memoria

    public void setMemoria(String operacion) {
        this.memoria.setText(operacion);
    }

    // BOTONES DE MEMORY

    @FXML
    void pulsa_mc(ActionEvent event) { // Borra el numero memory
        this.memoria.setText("");
        calculadora1.memoryClear();
    }

    @FXML
    void pulsa_mr(ActionEvent event) {
        if (anteriorIgual) {
            this.operacionanterior.setText("");
        }
        anteriorIgual = false;
        if (!this.memoria.getText().equals("")) {
            if (resultadoMostrado) {
                this.operacion.setText(this.memoria.getText()); // Para cuando se muestra un resultado se reemplaza por
                                                                // el numero en memoria
                resultadoMostrado = false;
            } else {
                if (calculadora1.getMemoryDecimal().compareTo(new BigDecimal(0)) == -1) { // Para cuando el numero de
                                                                                          // memoria es negativo
                    this.operacion.setText(calculadora1.sumar(calculadora1.getMemoryDecimal(), // Suma la el numero de
                                                                                               // la memoria con el
                                                                                               // numero mostrado
                            new BigDecimal(this.operacion.getText())));
                } else {
                    this.operacion.setText(this.operacion.getText() + this.memoria.getText());
                }
            }
        }
    }

    @FXML
    void pulsa_ms(ActionEvent event) { // Asigna numero memory
        setMemoria(calculadora1.memoryStorageDecimal(this.operacion.getText()));
    }

    @FXML
    void pulsa_mmas(ActionEvent event) {
        if (!this.operacion.getText().equals("")) { // Si no hay numero mostrado no lo hace
            if (!this.memoria.getText().equals("")) { // Si no hay numero en memoria
                setMemoria(calculadora1.memorySuma(this.operacion.getText()));
            } else { // Si no hay numero en memoria, pone el numero mostrado como memoria
                calculadora1.setMemoryDecimal(new BigDecimal(this.operacion.getText()));
                this.memoria.setText((this.operacion.getText()));
            }
        }
    }

    @FXML
    void pulsa_mmenos(ActionEvent event) {
        if (!this.operacion.getText().equals("")) { // Si no hay numero mostrado no lo hace
            if (!this.memoria.getText().equals("")) { // Si no hay numero en memoria
                setMemoria(calculadora1.memoryResta(this.operacion.getText()));
            } else { // Si no hay numero en memoria, pone el numero mostrado como memoria
                calculadora1.setMemoryDecimal(new BigDecimal(this.operacion.getText()));
                this.memoria.setText((this.operacion.getText()));
            }
        }
    }

    // FIN DE LOS BOTONES DE MEMOR

    // BOTONES DE BORRADO

    @FXML
    void pulsac(ActionEvent event) { // Elimina todo el calculo
        anteriorIgual = false;
        resultadoMostrado = false;
        this.operacion.setText("");
        this.operacionanterior.setText("");
        calculadora1.setBigDecimal1(new BigDecimal(0));
        calculadora1.setBigDecimal2(new BigDecimal(0));
    }

    @FXML
    void pulsace(ActionEvent event) { // Elimina el numero mostrado
        anteriorIgual = false;
        resultadoMostrado = false;
        this.operacion.setText("");
    }

    @FXML
    void pulsaretroceder(ActionEvent event) {
        if (resultadoMostrado) { // Cuando mustre un resultado se reemplaza a ""
            this.operacionanterior.setText("");
        }
        resultadoMostrado = false;
        anteriorIgual = false;
        if (this.operacion.getLength() != 0) { // Para que borre si hay datos en la operacion
            if (!(this.operacion.getText().charAt(0) == '-' && this.operacion.getText().length() == 2)) { // Para que no
                                                                                                          // permita
                                                                                                          // borrar si
                                                                                                          // solo hay un
                                                                                                          // numero y es
                                                                                                          // negativo
                this.operacion.setText(this.operacion.getText().substring(0, this.operacion.getLength() - 1));
            }
        }
    }

    // FIN DE LOS BOTONES DE BORRADO

    // BOTONES DE OPERACIONES

    // Patxi comento solo el boton "pulsamas" ya que todos los botones de la
    // operaciones son iguales

    @FXML
    void pulsamas(ActionEvent event) {
        if (!this.operacion.getText().equals("")) { // Tiene que haber almenos un numero
            if (anteriorIgual) { // Si el anterior boton dado es el igual
                this.operacionanterior.setText("");
                anteriorIgual = false;
            }
            if (this.operacionanterior.getText().equals("")) { // Si no hay calculo anterior
                calculadora1.setBigDecimal1(new BigDecimal(this.operacion.getText()));
                this.operacionanterior.setText(this.operacion.getText() + " + ");
                resultadoMostrado = true;
            } else { // Si hay calculo anterior
                calculadora1.setBigDecimal2(new BigDecimal(this.operacion.getText()));
                this.operacionanterior.setText(this.operacionanterior.getText() + this.operacion.getText() + " + ");
                String[] separada = this.operacionanterior.getText().split(" "); // Separa la operacion anterior por espacios
                // Hace la operacion del calculo anterior
                if (separada[separada.length-3].equals("+")) {
                    this.operacion.setText(calculadora1.sumar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.sumar()));
                } else if (separada[separada.length-3].equals("-")) {
                    this.operacion.setText(calculadora1.restar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.restar()));
                } else if (separada[separada.length-3].equals("*")) {
                    this.operacion.setText(calculadora1.multiplicar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.multiplicar()));
                } else if (separada[separada.length-3].equals("/")) {
                    // Para tratar la excepcion de denominador 0
                    if (!calculadora1.dividir().equals("")) { // Si el metodo dividir devuelve algo diferente que ""
                        this.operacion.setText(calculadora1.dividir());
                        calculadora1.setBigDecimal1(new BigDecimal(calculadora1.dividir()));
                    } else { // Si el metodo dividir devuelve "" (cuando es demoniador 0)
                        this.operacion.setText("");
                        this.operacionanterior.setText("");
                        calculadora1.setBigDecimal1(new BigDecimal(0));
                        calculadora1.setBigDecimal2(new BigDecimal(0));
                    }
                } else if (separada[separada.length-3].equals("%")) {
                    this.operacion.setText(calculadora1.resto());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.resto()));
                }
                resultadoMostrado = true;

            }
            operacionAnterior = 1;
        }
    }

    @FXML
    void pulsamenos(ActionEvent event) {
        if (!this.operacion.getText().equals("")) {
            if (anteriorIgual) {
                this.operacionanterior.setText("");
                anteriorIgual = false;
            }
            if (this.operacionanterior.getText().equals("")) {
                calculadora1.setBigDecimal1(new BigDecimal(this.operacion.getText()));
                this.operacionanterior.setText(this.operacion.getText() + " - ");
                resultadoMostrado = true;
            } else {
                calculadora1.setBigDecimal2(new BigDecimal(this.operacion.getText()));
                this.operacionanterior.setText(this.operacionanterior.getText() + this.operacion.getText() + " - ");
                String[] separada = this.operacionanterior.getText().split(" ");
                if (separada[separada.length-3].equals("+")) {
                    this.operacion.setText(calculadora1.sumar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.sumar()));
                } else if (separada[separada.length-3].equals("-")) {
                    this.operacion.setText(calculadora1.restar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.restar()));
                } else if (separada[separada.length-3].equals("*")) {
                    this.operacion.setText(calculadora1.multiplicar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.multiplicar()));
                } else if (separada[separada.length-3].equals("/")) {
                    // Para tratar la excepcion de denominador 0
                    if (!calculadora1.dividir().equals("")) { // Si el metodo dividir devuelve algo diferente que ""
                        this.operacion.setText(calculadora1.dividir());
                        calculadora1.setBigDecimal1(new BigDecimal(calculadora1.dividir()));
                    } else { // Si el metodo dividir devuelve "" (cuando es demoniador 0)
                        this.operacion.setText("");
                        this.operacionanterior.setText("");
                        calculadora1.setBigDecimal1(new BigDecimal(0));
                        calculadora1.setBigDecimal2(new BigDecimal(0));
                    }
                } else if (separada[separada.length-3].equals("%")) {
                    this.operacion.setText(calculadora1.resto());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.resto()));
                }
                resultadoMostrado = true;

            }
            operacionAnterior = 2;
        }
    }

    @FXML
    void pulsamultiplicar(ActionEvent event) {
        if (!this.operacion.getText().equals("")) {
            if (anteriorIgual) {
                this.operacionanterior.setText("");
                anteriorIgual = false;
            }
            if (this.operacionanterior.getText().equals("")) {
                calculadora1.setBigDecimal1(new BigDecimal(this.operacion.getText()));
                this.operacionanterior.setText(this.operacion.getText() + " * ");
                resultadoMostrado = true;
            } else {
                calculadora1.setBigDecimal2(new BigDecimal(this.operacion.getText()));
                this.operacionanterior.setText(this.operacionanterior.getText() + this.operacion.getText() + " * ");
                String[] separada = this.operacionanterior.getText().split(" ");
                if (separada[separada.length-3].equals("+")) {
                    this.operacion.setText(calculadora1.sumar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.sumar()));
                } else if (separada[separada.length-3].equals("-")) {
                    this.operacion.setText(calculadora1.restar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.restar()));
                } else if (separada[separada.length-3].equals("*")) {
                    this.operacion.setText(calculadora1.multiplicar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.multiplicar()));
                } else if (separada[separada.length-3].equals("/")) {
                    // Para tratar la excepcion de denominador 0
                    if (!calculadora1.dividir().equals("")) { // Si el metodo dividir devuelve algo diferente que ""
                        this.operacion.setText(calculadora1.dividir());
                        calculadora1.setBigDecimal1(new BigDecimal(calculadora1.dividir()));
                    } else { // Si el metodo dividir devuelve "" (cuando es demoniador 0)
                        this.operacion.setText("");
                        this.operacionanterior.setText("");
                        calculadora1.setBigDecimal1(new BigDecimal(0));
                        calculadora1.setBigDecimal2(new BigDecimal(0));
                    }
                } else if (separada[separada.length-3].equals("%")) {
                    this.operacion.setText(calculadora1.resto());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.resto()));
                }
                resultadoMostrado = true;

            }
            operacionAnterior = 3;
        }
    }

    @FXML
    void pulsadividir(ActionEvent event) {
        if (!this.operacion.getText().equals("")) {
            if (anteriorIgual) {
                this.operacionanterior.setText("");
                anteriorIgual = false;
            }
            if (this.operacionanterior.getText().equals("")) {
                calculadora1.setBigDecimal1(new BigDecimal(this.operacion.getText()));
                this.operacionanterior.setText(this.operacion.getText() + " / ");
                resultadoMostrado = true;
            } else {
                calculadora1.setBigDecimal2(new BigDecimal(this.operacion.getText()));
                this.operacionanterior.setText(this.operacionanterior.getText() + this.operacion.getText() + " / ");
                String[] separada = this.operacionanterior.getText().split(" ");
                if (separada[separada.length-3].equals("+")) {
                    this.operacion.setText(calculadora1.sumar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.sumar()));
                } else if (separada[separada.length-3].equals("-")) {
                    this.operacion.setText(calculadora1.restar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.restar()));
                } else if (separada[separada.length-3].equals("*")) {
                    this.operacion.setText(calculadora1.multiplicar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.multiplicar()));
                } else if (separada[separada.length-3].equals("/")) {
                    // Para tratar la excepcion de denominador 0
                    if (!calculadora1.dividir().equals("")) { // Si el metodo dividir devuelve algo diferente que ""
                        this.operacion.setText(calculadora1.dividir());
                        calculadora1.setBigDecimal1(new BigDecimal(calculadora1.dividir()));
                    } else { // Si el metodo dividir devuelve "" (cuando es demoniador 0)
                        this.operacion.setText("");
                        this.operacionanterior.setText("");
                        calculadora1.setBigDecimal1(new BigDecimal(0));
                        calculadora1.setBigDecimal2(new BigDecimal(0));
                    }
                } else if (separada[separada.length-3].equals("%")) {
                    this.operacion.setText(calculadora1.resto());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.resto()));
                }

                resultadoMostrado = true;
            }
            operacionAnterior = 4;
        }
    }

    @FXML
    void pulsaporcentaje(ActionEvent event) {
        if (!this.operacion.getText().equals("")) {
            if (anteriorIgual) {
                this.operacionanterior.setText("");
                anteriorIgual = false;
            }
            if (this.operacionanterior.getText().equals("")) {
                calculadora1.setBigDecimal1(new BigDecimal(this.operacion.getText()));
                this.operacionanterior.setText(this.operacion.getText() + " % ");
                resultadoMostrado = true;
            } else {
                calculadora1.setBigDecimal2(new BigDecimal(this.operacion.getText()));
                this.operacionanterior.setText(this.operacionanterior.getText() + this.operacion.getText() + " % ");
                String[] separada = this.operacionanterior.getText().split(" ");
                if (separada[separada.length-3].equals("+")) {
                    this.operacion.setText(calculadora1.sumar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.sumar()));
                } else if (separada[separada.length-3].equals("-")) {
                    this.operacion.setText(calculadora1.restar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.restar()));
                } else if (separada[separada.length-3].equals("*")) {
                    this.operacion.setText(calculadora1.multiplicar());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.multiplicar()));
                } else if (separada[separada.length-3].equals("/")) {
                    // Para tratar la excepcion de denominador 0
                    if (!calculadora1.dividir().equals("")) { // Si el metodo dividir devuelve algo diferente que ""
                        this.operacion.setText(calculadora1.dividir());
                        calculadora1.setBigDecimal1(new BigDecimal(calculadora1.dividir()));
                    } else { // Si el metodo dividir devuelve "" (cuando es demoniador 0)
                        this.operacion.setText("");
                        this.operacionanterior.setText("");
                        calculadora1.setBigDecimal1(new BigDecimal(0));
                        calculadora1.setBigDecimal2(new BigDecimal(0));
                    }
                } else if (separada[separada.length-3].equals("%")) {
                    this.operacion.setText(calculadora1.resto());
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.resto()));
                }
                resultadoMostrado = true;

            }
            operacionAnterior = 5;
        }
    }

    private boolean error = false; // Patxi lo explico ahora cuando aparezca

    @FXML
    void pulsaigual(ActionEvent event) {
        if (!this.operacion.getText().equals("")) {
            if (anteriorIgual) { // Cuando el anterior boton dado es igual, para seguir haciendo operacion dando
                                 // veces consecutivas al igual
                if (operacionAnterior == 1) { // Para la suma
                    this.operacion.setText(calculadora1.sumar());
                    this.operacionanterior.setText(calculadora1.getBigDecimal1().toString() + " + "
                            + calculadora1.getBigDecimal2().toString() + " = ");
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.sumar()));
                } else if (operacionAnterior == 2) { // Para la resta
                    this.operacion.setText(calculadora1.restar());
                    this.operacionanterior.setText(calculadora1.getBigDecimal1().toString() + " - "
                            + calculadora1.getBigDecimal2().toString() + " = ");
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.restar()));
                } else if (operacionAnterior == 3) { // Para la multiplicacion
                    this.operacion.setText(calculadora1.multiplicar());
                    this.operacionanterior.setText(calculadora1.getBigDecimal1().toString() + " * "
                            + calculadora1.getBigDecimal2().toString() + " = ");
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.multiplicar()));
                } else if (operacionAnterior == 4) { // Para la division
                    this.operacion.setText(calculadora1.dividir());
                    this.operacionanterior.setText(calculadora1.getBigDecimal1().toString() + " / "
                            + calculadora1.getBigDecimal2().toString() + " = ");
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.dividir()));
                } else if (operacionAnterior == 5) { // Para el resto
                    this.operacion.setText(calculadora1.resto());
                    this.operacionanterior.setText(calculadora1.getBigDecimal1().toString() + " % "
                            + calculadora1.getBigDecimal2().toString() + " = ");
                    calculadora1.setBigDecimal1(new BigDecimal(calculadora1.resto()));
                }
                resultadoMostrado = true;
                anteriorIgual = true;
            } else {
                if (!this.operacionanterior.getText().equals("")) { // Si hay algo en la operacion
                    calculadora1.setBigDecimal2(new BigDecimal(this.operacion.getText()));
                    String numero = this.operacion.getText(); // Para la salida
                    if (this.operacionanterior.getText().charAt(this.operacionanterior.getText().length() - 2) == '+') { // SUMA
                        this.operacion.setText(calculadora1.sumar());
                        calculadora1.setBigDecimal1(new BigDecimal(calculadora1.sumar()));
                    } else if (this.operacionanterior.getText()
                            .charAt(this.operacionanterior.getText().length() - 2) == '-') { // RESTA
                        this.operacion.setText(calculadora1.restar());
                        calculadora1.setBigDecimal1(new BigDecimal(calculadora1.restar()));
                    } else if (this.operacionanterior.getText()
                            .charAt(this.operacionanterior.getText().length() - 2) == '*') { // MULTIPLICACION
                        this.operacion.setText(calculadora1.multiplicar());
                        calculadora1.setBigDecimal1(new BigDecimal(calculadora1.multiplicar()));
                    } else if (this.operacionanterior.getText()
                            .charAt(this.operacionanterior.getText().length() - 2) == '/') { // DIVISION
                        // Para tratar la excepcion de denominador 0 (igual que los metodos de operaciones anteriores)
                        if (!calculadora1.dividir().equals("")) {
                            this.operacion.setText(calculadora1.dividir());
                            calculadora1.setBigDecimal1(new BigDecimal(calculadora1.dividir()));
                        } else {
                            this.operacion.setText("");
                            this.operacionanterior.setText("");
                            calculadora1.setBigDecimal1(new BigDecimal(0));
                            calculadora1.setBigDecimal2(new BigDecimal(0));
                            error = true; // Para la hora de imprimir que no muestre el resultado si a dado error en divisor = 0
                        }
                    } else if (this.operacionanterior.getText()
                            .charAt(this.operacionanterior.getText().length() - 2) == '%') { // RESTO
                        this.operacion.setText(calculadora1.resto());
                        calculadora1.setBigDecimal1(new BigDecimal(calculadora1.resto()));
                    }
                    if (!error) { // Si no a dado error en divisor = 0
                        this.operacionanterior.setText(this.operacionanterior.getText() + numero + " = ");
                        resultadoMostrado = true;
                        anteriorIgual = true;
                    }
                    error = false;
                }
            }
        }
    }

    // FIN DE LOS BOTONES DE OPERACION

    // BOTONES QUE MODIFICAN EL NUMERO MOSTRADO

    @FXML
    void pulsamasmenos(ActionEvent event) { // Cambia el signo de + a -
        if (resultadoMostrado) {
            this.operacionanterior.setText("");
        }
        resultadoMostrado = false;
        anteriorIgual = false;
        if (!this.operacion.getText().equals("")) {
            if (this.operacion.getText().charAt(0) == '-') {
                this.operacion.setText(this.operacion.getText().substring(1, this.operacion.getLength()));
            } else {
                this.operacion.setText("-" + this.operacion.getText());
            }
        }
    }

    @FXML
    void pulsaraiz(ActionEvent event) { // Calcula la raiz
        if (resultadoMostrado) {
            this.operacionanterior.setText("");
        }
        resultadoMostrado = false;
        anteriorIgual = false;
        if (!this.operacion.getText().equals("")) {
            this.operacion.setText((calculadora1.sqrt(this.operacion.getText())));
        }
    }

    @FXML
    void pulsaunoentre(ActionEvent event) { // Hace la division de 1 / x
        if (resultadoMostrado) {
            this.operacionanterior.setText("");
        }
        resultadoMostrado = false;
        anteriorIgual = false;
        if (!this.operacion.getText().equals("")) {
            this.operacion.setText((calculadora1.unoEntreX(new BigDecimal(this.operacion.getText()))));
        }
    }

    // FIN BOTONES QUE MODIFICAN EL NUMERO MOSTRADO

    @FXML
    void initialize() {
        assert memoria != null : "fx:id=\"memoria\" was not injected: check your FXML file 'primary.fxml'.";
        assert operacion != null : "fx:id=\"operacion\" was not injected: check your FXML file 'primary.fxml'.";
        assert operacionanterior != null
                : "fx:id=\"operacionanterior\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla0 != null : "fx:id=\"tecla0\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla00 != null : "fx:id=\"tecla00\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla1 != null : "fx:id=\"tecla1\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla2 != null : "fx:id=\"tecla2\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla3 != null : "fx:id=\"tecla3\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla4 != null : "fx:id=\"tecla4\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla5 != null : "fx:id=\"tecla5\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla6 != null : "fx:id=\"tecla6\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla7 != null : "fx:id=\"tecla7\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla8 != null : "fx:id=\"tecla8\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla9 != null : "fx:id=\"tecla9\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla_mc != null : "fx:id=\"tecla_mc\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla_mmas != null : "fx:id=\"tecla_mmas\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla_mmenos != null : "fx:id=\"tecla_mmenos\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla_mr != null : "fx:id=\"tecla_mr\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecla_ms != null : "fx:id=\"tecla_ms\" was not injected: check your FXML file 'primary.fxml'.";
        assert teclac != null : "fx:id=\"teclac\" was not injected: check your FXML file 'primary.fxml'.";
        assert teclace != null : "fx:id=\"teclace\" was not injected: check your FXML file 'primary.fxml'.";
        assert teclacoma != null : "fx:id=\"teclacoma\" was not injected: check your FXML file 'primary.fxml'.";
        assert tecladividir != null : "fx:id=\"tecladividir\" was not injected: check your FXML file 'primary.fxml'.";
        assert teclaigual != null : "fx:id=\"teclaigual\" was not injected: check your FXML file 'primary.fxml'.";
        assert teclamas != null : "fx:id=\"teclamas\" was not injected: check your FXML file 'primary.fxml'.";
        assert teclamasmenos != null : "fx:id=\"teclamasmenos\" was not injected: check your FXML file 'primary.fxml'.";
        assert teclamenos != null : "fx:id=\"teclamenos\" was not injected: check your FXML file 'primary.fxml'.";
        assert teclamultiplicar != null
                : "fx:id=\"teclamultiplicar\" was not injected: check your FXML file 'primary.fxml'.";
        assert teclaporcentaje != null
                : "fx:id=\"teclaporcentaje\" was not injected: check your FXML file 'primary.fxml'.";
        assert teclaraiz != null : "fx:id=\"teclaraiz\" was not injected: check your FXML file 'primary.fxml'.";
        assert teclaretroceder != null
                : "fx:id=\"teclaretroceder\" was not injected: check your FXML file 'primary.fxml'.";
        assert teclaunoentre != null : "fx:id=\"teclaunoentre\" was not injected: check your FXML file 'primary.fxml'.";
    }

}
