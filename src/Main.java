

public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketCost = 10_000;
        int miles = service.calculate(ticketCost); // должно получиться 500
        System.out.println(miles);
    }
}