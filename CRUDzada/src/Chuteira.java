public class Chuteira {
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

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

    public Chuteira(String modelo,String marca, int tamanho, float valor) {
        this.modelo = modelo;
        this.marca = marca;
        this.tamanho = tamanho;
        this.valor = valor;
    }
}
