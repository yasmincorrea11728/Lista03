package Ex05;

public class Tabuada {
    private int valor;

    public Tabuada() {
    }

    public Tabuada(int valor) {
        this.valor = valor;
    }

    public void tabuada() {
        for (int i = 1; i <= 10; i++) {
            int resultado = this.valor * i;

            System.out.println(this.valor + " x " + i + " = " + resultado);
        }
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}