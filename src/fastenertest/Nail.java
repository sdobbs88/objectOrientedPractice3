
class Nail extends Fastener {

    int gauge;

    public Nail() {
        gauge = 8;
    }

    @Override
    public String toString() {
        String output = "";

        output = getName() + gauge + "-gauge 3.5 inch Bright Steel Smooth Nails, " + getItemNumber()
                + ", " + getPrice() + ", " + getQuantity();
        return output;
    }
}
