package maruti;

import com.base.Car;

public class Alto extends Car {
    boolean hasAirBags;
    int numberOfAirbags;

    public Alto(int cc, int wheels, String color, boolean hasAirBags, int numberOfAirbags) {
        super(cc, wheels, color);
        this.hasAirBags = hasAirBags;
        this.numberOfAirbags = numberOfAirbags;
    }
    public boolean isHasAirBags() {
        return hasAirBags;
    }

    public void setHasAirBags(boolean hasAirBags) {
        this.hasAirBags = hasAirBags;
    }

    public int getNumberOfAirbags() {
        return numberOfAirbags;
    }

    public void setNumberOfAirbags(int numberOfAirbags) {
        this.numberOfAirbags = numberOfAirbags;
    }

    @Override
    public String toString() {
        return "Alto{" +
                "hasAirBags=" + hasAirBags +
                ", numberOfAirbags=" + numberOfAirbags +
                '}' + super.toString();
    }
}