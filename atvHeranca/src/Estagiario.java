public class Estagiario extends Aluno{
    private float handbag;

    public Estagiario(String name, int id, String password, String course, float handbag) {
        super(name, id, password, course);
        this.handbag = handbag;
    }

    public void makeCoffe(){
        System.out.println("I'm trainee");
    }

    public float getHandbag() {
        return handbag;
    }

    public void setHandbag(float handbag) {
        this.handbag = handbag;
    }
}
