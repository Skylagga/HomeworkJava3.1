public class BonusMilesService {
    public int calculate(int cost) {

        int miles = 20;
        int bonus = cost / miles;
        System.out.println("Миль зачисленно: " + bonus);

        return bonus;
    }

}
