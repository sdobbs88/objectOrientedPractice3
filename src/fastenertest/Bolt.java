
class Bolt extends Fastener {

    String diameter;
    String length;

    Bolt(String diameter, String length) {
        this.diameter = diameter;
        this.length = length;
        setName("The Hillman Group");
        setQuantity(5129);
        setPrice(0.84);
        setItemNumber(63398);
    }

    @Override
    public String toString() {
        String output;

        output = getName() + " " + diameter + "x" + length + " Zine-plated Steel Lag Bolt, "
                + getItemNumber() + ", " + getPrice() + ", " + getQuantity();

        return output;
    }
}
