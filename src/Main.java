public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 10_000;//стоимость билета в руб.(входной параметр: cost (в перев. с англ. - стоимость) типа int)
        int myMiles = service.calculate(cost);
        System.out.println(myMiles);
    }
}