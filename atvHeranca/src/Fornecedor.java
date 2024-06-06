import javax.swing.*;

public class Fornecedor extends Pessoa {
    private String product;

    public Fornecedor(String name, int id, String password, String product) {
        super(name, id, password);
        this.product = product;
    }

    public void makeSell(){
        JOptionPane.showMessageDialog(null,"Vendendo");
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
