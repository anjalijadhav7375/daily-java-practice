public class Adress {
    private String flatNumber;
    private String societyName;
    private int pinCode;

    public Adress(){

    }
    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getSocietyName() {
        return societyName;
    }

    public void setSocietyName(String societyName) {
        this.societyName = societyName;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
   public static Adress getInstance(){
        return new Adress();
   }

    @Override
    public String toString() {
        return "Adress{" +
                "flatNumber='" + flatNumber + '\'' +
                ", societyName='" + societyName + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}