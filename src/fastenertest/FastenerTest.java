
public class FastenerTest {

    public static void main(String[] args) {
        Nail myNail = new Nail();
        myNail.setItemNumber(69245);
        myNail.setName("Grip-Rite 5-lb");
        myNail.setPrice(11.98);
        myNail.setQuantity(212);
        System.out.println(myNail.toString());

        Nut myNut = new Nut();
        myNut.setItemNumber(43570);
        myNut.setName("Project Pak 25-Count");
        myNut.setPrice(2.74);
        myNut.setQuantity(2375);
        System.out.println(myNut.toString());

        Bolt myBolt = new Bolt("3/8-in", "5-in");
        System.out.println(myBolt.toString());

        Screw myScrew = new Screw("1-3/4-in");
        System.out.println(myScrew.toString());

        Fastener[] inventory = {myNail, myNut, myBolt, myScrew};

        int totalQuantity = 0;
        double totalValue = 0.0;
        double averagePrice = 0.0;
        double totalPrice = 0.0;

        for (int i = 0; i < inventory.length; i++) {
            totalQuantity += inventory[i].getQuantity();
            totalPrice += inventory[i].getPrice();
            totalValue += (inventory[i].getQuantity()) * (inventory[i].getPrice());
        }
        averagePrice = totalPrice / inventory.length;

        outputResults(totalQuantity, totalValue, averagePrice);
    }

    public static void outputResults(int totalQuantity, double totalValue, double averagePrice) {
        System.out.println("\nInventory Totals");
        System.out.println("Total items: " + totalQuantity);
        System.out.printf("Total Value of items: $%.2f\n", totalValue);
        System.out.printf("Average price per item: $%.2f\n", averagePrice);
    }
}
