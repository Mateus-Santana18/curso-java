public class Imovel {
    private int id;
    private String adress;
    private String area;
    private int numberRoom;

    public Imovel(int id, String adress, String area, int numberRoom) {
        this.id = id;
        this.adress = adress;
        this.area = area;
        this.numberRoom = numberRoom;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }
}

