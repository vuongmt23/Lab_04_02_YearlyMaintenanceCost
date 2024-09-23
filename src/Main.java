public class Main {
    public static void main(String[] args) {
        double springCost = 150.0;
        double summerCost = 200.0;
        double fallCost = 180.0;
        double winterCost = 220.0;

        double totalYearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Total yearly maintenance cost: $" + totalYearlyCost);
    }
}
