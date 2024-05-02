public class Chuteira {
    private String marca;
    private int tamanho;
    private float valor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Chuteira(String marca, int tamanho, float valor) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.valor = valor;
    }
}
