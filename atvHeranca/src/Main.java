import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static boolean testExactClass(Object o, Class<?> classe){
        return o.getClass() == classe;
    };
    public static void main(String[] args) {

        ArrayList<Pessoa> people = new ArrayList<Pessoa>();

        Aluno student = new Aluno("Mateus", 1, "123","Desenvolvimento de Sistemas");
        people.add(student);


        Professor teacher = new Professor("Girafales", 10, "456", "TI");
        people.add(teacher);

        Fornecedor supplier = new Fornecedor("Cantina",20, "789", "Comida");
        people.add(supplier);

        Estagiario trainee = new Estagiario("Santana", 30, "111", "Ánalise e Desenvolvimento de Sistemas",600.00f);
        people.add(trainee);

        System.out.println("Nome do Aluno: " + student.getName());
        System.out.println("Nome do Aluno no Array: " + people.getFirst().getName());

        System.out.println("Curso do aluno: " + student.getName());

//        Aluno a = (Aluno) people.get(0);
//        System.out.println("Curso do aluno no array: " + a.getCourse());
//        System.out.println("==================");

        for (Pessoa person : people){
            System.out.println("======================");
            System.out.println("Name: " + person.getName());
            System.out.println("ID: " + person.getId());
            System.out.println("Password: " + person.getPassword());


            if (testExactClass(person, Aluno.class)){
                Aluno a = (Aluno) person;
                System.out.println("Curso: " + a.getCourse());
                System.out.println("======================");
            }else if(testExactClass(person, Professor.class)){
                Professor p = (Professor) person;
                System.out.println("Área: " + p.getArea());
                System.out.println("======================");
            }else if(testExactClass(person, Fornecedor.class)){
                Fornecedor f = (Fornecedor) person;
                System.out.println("Produto: " + f.getProduct());
                System.out.println("======================");
            } else if(testExactClass(person, Estagiario.class)){
                Estagiario e = (Estagiario) person;
                System.out.println("Bolsa: R$" + e.getHandbag());
                System.out.println("Curso: " + e.getCourse());
                System.out.println("======================");
            }


//            System.out.print("person instanceof Pessoa: ");
//            System.out.println(person instanceof Pessoa);
//
//            System.out.print("person instanceof Aluno: ");
//            System.out.println(person instanceof Aluno);
//
//            Aluno a = (Aluno) people.get(0);
//            System.out.print("a instanceof Aluno");
//            System.out.println(a instanceof Aluno);
//            System.out.print("a instanceof Pessoa");
//            System.out.println(a instanceof Pessoa);
//
//            System.out.print("testExactClass(a, Aluno.class)");
//            System.out.println(testExactClass(a, Aluno.class));
//            System.out.print("testExactClass(a, Pessoa.class)");
//            System.out.println(testExactClass(a, Pessoa.class));
        }
    }
}