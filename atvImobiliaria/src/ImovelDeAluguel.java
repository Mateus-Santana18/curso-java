public class ImovelDeAluguel extends Imovel{

    private float rentValue;
    private String availability;

    public ImovelDeAluguel(int id, String adress, String area, int numberRoom, float rentValue, String availability) {
        super(id, adress, area, numberRoom);
        this.rentValue = rentValue;
        this.availability = availability;
    }

    public void rentedProperty(String r){
        this.setAvailability(r);
    }

    public float getRentValue() {
        return rentValue;
    }

    public void setRentValue(float rentValue) {
        this.rentValue = rentValue;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
