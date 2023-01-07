enum Seasons{
    WINTER("I love winter"),
    SUMMER("I hate summer"),
    MONSOON("Monsoon is okay");
    String msg;

    Seasons(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}




public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (Seasons seasons : Seasons.values()) {
            Thread.sleep(10);
            System.out.println(seasons.name() + " " + seasons.msg);
        }
    }
}