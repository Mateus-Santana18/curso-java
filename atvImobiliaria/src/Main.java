import java.util.ArrayList;

public class Main {
    public static boolean testExactClass(Object o, Class<?> classe){
        return o.getClass() == classe;
    };
    public static void main(String[] args) {
        ArrayList<Imovel> properties = new ArrayList<Imovel>();

        ImovelDeAluguel imA = new ImovelDeAluguel(150,"Rodovia do Senai, Saco Grande, apto 1", "12 x 10 M²",
                                                  4, 150.000f, "Disponível!!");
        properties.add(imA);

        ImovelDeVenda imV = new ImovelDeVenda(280,"Rodovia da minha casa, barra da lagoa, casa 2", "50 x 40",
                                              2, 980.000f);
        properties.add(imV);

        for (Imovel property : properties){
            System.out.println("============================");
            System.out.println("Adress: " + property.getAdress());
            System.out.println("Área: " + property.getArea());
            System.out.println("Rooms: " + property.getNumberRoom());

//            testExactClass(property, ImovelDeAluguel.class
            if (property instanceof ImovelDeAluguel){
                ImovelDeAluguel i = (ImovelDeAluguel) property;
                System.out.println("Rent Value: " + i.getRentValue());
                System.out.println("Availability: " + i.getAvailability());
                System.out.println(property instanceof ImovelDeVenda);

            }else if(testExactClass(property, ImovelDeVenda.class)){
                ImovelDeVenda iv = (ImovelDeVenda) property;
                System.out.println("Sale Price: R$" + iv.getPrice());
                System.out.println(property instanceof ImovelDeAluguel);
            }
        }
    }
}