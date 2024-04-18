public class Pessoa {

    private int age;
    private String name;

    // Construtor
    public Pessoa(String n, int i){
        this.name = n;
        this.age = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int i){
        this.age = i;
    }
    public void fazerAniversario(){
        this.age++;
    }
    public void dizerOla(){
        System.out.println("Olá");
    }
}
