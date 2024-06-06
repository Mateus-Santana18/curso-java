import java.util.ArrayList;

public class Main {
    public static boolean testExactClass(Object o, Class<?> classe){
        return o.getClass() == classe;
    };
    public static void main(String[] args) {
        ArrayList<Imovel> property = new ArrayList<Imovel>();

        ImovelDeAluguel imA = new ImovelDeAluguel(150,"Rodovia do Senai, Saco Grande, apto 1", "12 x 10 M²",
                                                  4, 150.000f, "Disponível!!");
        property.add(imA);

        ImovelDeVenda imV = new ImovelDeVenda(280,"Rodovia da minha casa, barra da lagoa, casa 2", "50 x 40",
                                              2, 980.000f);
        property.add(imV);

        for (Imovel imobbile : property){
            System.out.println("============================");
            System.out.println("Adress: " + imobbile.getAdress());
            System.out.println("Área: " + imobbile.getArea());
            System.out.println("Rooms: " + imobbile.getNumberRoom());

            if (testExactClass(imobbile, ImovelDeAluguel.class)){
                ImovelDeAluguel i = (ImovelDeAluguel) imobbile;
                System.out.println("Rent Value: " + i.getRentValue());
                System.out.println("Availability: " + i.getAvailability());

            }else if(testExactClass(imobbile, ImovelDeVenda.class)){
                ImovelDeVenda iv = (ImovelDeVenda) imobbile;
                System.out.println("Sale Price: R$" + iv.getPrice());
            }
        }
    }
}