public class Data {
    int d1;
    int d2;

    public Data(int d1,int d2){
       this.d1 = d1;
       this.d2 = d2;
    }
    public Data(Data d){
        this.d1 = d.d1;
        this.d2 = d.d2;
    }
    public void displayData(){
        System.out.println("\nData "+this.d1);
        System.out.println("Data "+this.d2);

    }
}
