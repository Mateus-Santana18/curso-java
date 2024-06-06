public class Aluno extends Pessoa {

    private String course;

    public Aluno(String name, int id, String password, String course) {
        super(name, id, password);
        this.course = course;
    }

    public void fazerMatricula(String c){
        this.setCourse(c);
    };

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
