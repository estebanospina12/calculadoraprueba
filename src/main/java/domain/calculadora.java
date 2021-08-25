package domain;

public class calculadora {

    private int valor1;
    private int valor2;
    private double resultado;

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public double division(){
        return this.resultado = (double) this.valor1 / (double) this.valor2;
    }

    public int suma(){
        return valor1 + valor2;
    }

    public int resta(){
        return valor1 - valor2;
    }

    public int multiplicacion(){
        return valor1 * valor2;
    }
}
