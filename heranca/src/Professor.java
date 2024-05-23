public class Professor extends Pessoa{
    private String area;

    public Professor(String name, int id, String password, String area) {
        super(name, id, password);
        this.area = area;
    }

    public void makeCall(){
        System.out.println("AAAAAAAAAAAAAAAA");
        System.out.println("BBBBBBBBBBBBBBBB");
        System.out.println("CCCCCCCCCCCCCCCC");
        System.out.println("................");
        System.out.println("EEEEEEEEEEEEEEEE");
        System.out.println("FFFFFFFFFFFFFFFF");
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
