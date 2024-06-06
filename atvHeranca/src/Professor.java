import javax.swing.*;

public class Professor extends Pessoa{
    private String area;

    public Professor(String name, int id, String password, String area) {
        super(name, id, password);
        this.area = area;
    }

    public void makeCall(){
        JOptionPane.showMessageDialog(null,"Chamadaaaaaaaaaaaaaaaaa");
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
