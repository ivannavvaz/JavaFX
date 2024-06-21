package calculadorafx;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.math.RoundingMode;
import java.util.*;

import javafx.scene.control.Alert;

public class calculadora {

    public static class raizNegativa extends Exception {

        public raizNegativa(String mensaje) {
    
            super(mensaje);
    
        }
    
    }

    // VARIABLES

    private BigDecimal bigDecimal1;
    private BigDecimal bigDecimal2;

    private BigDecimal memoryDecimal = null;

    // CONTRUCTORES

    public calculadora() {
    }

    // GETTERS Y SETTERS

    public BigDecimal getBigDecimal1() {
        return bigDecimal1;
    }

    public void setBigDecimal1(BigDecimal bigDecimal1) {
        this.bigDecimal1 = bigDecimal1;
    }

    public BigDecimal getBigDecimal2() {
        return bigDecimal2;
    }

    public void setBigDecimal2(BigDecimal bigDecimal2) {
        this.bigDecimal2 = bigDecimal2;
    }

    public BigDecimal getMemoryDecimal() {
        return memoryDecimal;
    }

    public void setMemoryDecimal(BigDecimal memoryDecimal) {
        this.memoryDecimal = memoryDecimal;
    }

    // METODOS

    public String memoryStorageDecimal(String operacion) {

        try {

            if (operacion.equals("")) { // Pos si quieres almacenar un numero y no has escrito ninguno

                throw new Exception("Debes escribir almenos un numero para guardarlo en la memoria");

            }

            this.memoryDecimal = new BigDecimal(operacion); // Almacenamos el numero

            return operacion;

        } catch (Exception e) {

            Alert alertNoNumero = new Alert(Alert.AlertType.ERROR);
            alertNoNumero.setTitle("!! ERROR ¡¡");
            alertNoNumero.setContentText(e.getMessage());
            alertNoNumero.showAndWait();

            if (this.memoryDecimal == null) {

                return null;

            } else {

                return this.memoryDecimal.toString();

            }
        }

    }

    public void memoryClear() { // Limpia el numero almacenado

        this.memoryDecimal = null;

    }

    public String memorySuma(String operacion) {

        if (operacion.equals("")) { // Por si la operacion esta vacia

            return operacion;

        } else {

            if (this.memoryDecimal != null) {

                this.memoryDecimal = new BigDecimal(operacion).add(this.memoryDecimal); // Suma al numero en memoria

            }

            return this.memoryDecimal.toString();

        }

    }

    public String memoryResta(String operacion) {

        if (operacion.equals("")) { // Por si la operacion esta vacia

            return operacion; 

        } else {

            if (this.memoryDecimal != null) {

                this.memoryDecimal = this.memoryDecimal.subtract(new BigDecimal(operacion)); // Resta al numero en memoria

            }

            return this.memoryDecimal.toString();

        }

    }

    public String unoEntreX(BigDecimal operacion) {

        if (operacion.compareTo(new BigDecimal(0)) == 0) { // Para cuando quiere calcular de 0

            return "0";

        }

        return new BigDecimal(1).divide(operacion, 9, RoundingMode.HALF_UP).toString();

    }

    public String sqrt(String in2) { // Para calcular la raiz cuadrada

        try {

            BigDecimal in = new BigDecimal(in2);

            if (in.compareTo(new BigDecimal(0)) == 0) { // Para cuando quiere calcular la raiz cuadrada de 0

                return "0";

            }

            if (in.compareTo(new BigDecimal(0)) == -1) { // Para cuando quiere calcular la raiz cuadrada de un numero negativo

                throw new raizNegativa("No puedes calcular la raiz cuadrada de un numero negativo");

            }

            int scale = 9;
            BigDecimal sqrt = new BigDecimal(1);
            sqrt.setScale(scale + 3, RoundingMode.FLOOR);
            BigDecimal store = new BigDecimal(in.toString());
            boolean first = true;
            do {
                if (!first) {
                    store = new BigDecimal(sqrt.toString());
                } else
                    first = false;
                store.setScale(scale + 3, RoundingMode.FLOOR);
                sqrt = in.divide(store, scale + 3, RoundingMode.FLOOR).add(store).divide(
                        BigDecimal.valueOf(2), scale + 3, RoundingMode.FLOOR);
            } while (!store.equals(sqrt));
            return sqrt.setScale(scale, RoundingMode.FLOOR).toString();

        } catch (raizNegativa e) {

            Alert alertRaizNegativa = new Alert(Alert.AlertType.ERROR);
            alertRaizNegativa.setTitle("!! ERROR ¡¡");
            alertRaizNegativa.setContentText("No puedes calcular la raiz de un numero negativo");
            alertRaizNegativa.showAndWait();
            
            return "";

        }

    }

    // METODOS DE OPERACIONES

    public String sumar() {

        return this.bigDecimal1.add(bigDecimal2).toString();

    }

    public String sumar(BigDecimal num1, BigDecimal num2) {

        return num1.add(num2).toString();

    }

    public String restar() {

        return this.bigDecimal1.subtract(bigDecimal2).toString();

    }

    public String multiplicar() {

        return this.bigDecimal1.multiply(bigDecimal2).toString();

    }

    public String dividir() {

        try {

            return this.bigDecimal1.divide(bigDecimal2, 9, RoundingMode.HALF_UP).toString();

        } catch (ArithmeticException e) {

            Alert alertDivididoX0 = new Alert(Alert.AlertType.ERROR);
            alertDivididoX0.setTitle("!! ERROR ¡¡");
            alertDivididoX0.setContentText("No puedes dividir un numero entre 0");
            alertDivididoX0.showAndWait();

            return "";

        }

    }

    public String resto() {

        return this.bigDecimal1.remainder(bigDecimal2).toString();

    }

}
