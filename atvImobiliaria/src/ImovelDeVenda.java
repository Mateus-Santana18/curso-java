import javax.swing.*;

public class ImovelDeVenda extends Imovel {

    private float price;

    public ImovelDeVenda(int id, String adress, String area, int numberRoom, float price) {
        super(id, adress, area, numberRoom);
        this.price = price;
    }


    public void sold(){
        JOptionPane.showMessageDialog(null,"Vendido!!");
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
