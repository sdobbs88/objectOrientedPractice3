
class Screw extends Fastener {

    String length;

    Screw(String length) {
        this.length = length;
        setName("Blue Hawk 50-Count #8- 32 x");
        setQuantity(1298);
        setPrice(5.58);
        setItemNumber(239030);
    }

    @Override
    public String toString() {
        String output;

        output = getName() + " " + length + " Truss-Head Zinc-Plated Standard (SAE) Machine Screws, "
                + getItemNumber() + ", " + getPrice() + ", " + getQuantity();

        return output;
    }

}
