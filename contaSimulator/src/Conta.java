public class Conta {
    private int numero;

    public Conta(int numero, String cliente, float saldo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    private String cliente;
    private float saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void sacar(float valor){
        setSaldo(getSaldo() - valor);
    }
    public void depositar(float valor){
        setSaldo(getSaldo() + valor);
    }
}
