
class Nut extends Fastener {

    String diameter;

    Nut() {
        diameter = "3/8-in";
    }

    @Override
    public String toString() {
        String output;

        output = getName() + " " + diameter + " Zinc-Plated Standard (SAE) Hex Nuts,  "
                + getItemNumber() + ", " + getPrice() + ", " + getQuantity();

        return output;
    }
}
