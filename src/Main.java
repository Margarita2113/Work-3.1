
public class Main {
    public static void main(String[] args) {

        // Объявлям переменную для одну для хранения стоимости билета
        int ticketCost = 1450;

        // Объявлям переменную для хранения количества рублей для одной бонусной мили
        int milesPerRur = 20;

        // Рассчитываем количество бонусных миль
        int miles = (ticketCost / milesPerRur);

        // Выводим результат на экран
        System.out.println("Количество бонусных миль: " + miles);
    }
}
