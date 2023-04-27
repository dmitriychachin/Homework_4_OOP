import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefTeam = new Team<>();
        archers.addPers(new Archer("Робин", 100, ShieldAdd(), new Bow(20)))
                .addPers(new Archer("Гуд", 100, ShieldAdd(), new Bow(15)));
        thiefTeam.addPers(new Thief("Джек", 150, ShieldAdd(), new Knife()))
                .addPers(new Thief("Потрошитель", 150, ShieldAdd(), new Knife()));
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);
        System.out.println();

        Archer robin = new Archer("Робин", 50, ShieldAdd(), new Bow(20));
        Archer gud = new Archer("Гуд", 50, ShieldAdd(), new Bow(50));
        Battle fight = new Battle(robin,gud);
        fight.run();
    }

    public static Object ShieldAdd() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите щит для персонажа");
        String shield = iScanner.nextLine();
        iScanner.close();

        switch (shield) {
            case "Стеклянный":
                return new GlassShield();
            case "Самодельный":
                return new MakeshiftShield();
            case "Металический":
                return new MetalShield();
            case "Деревянный":
                return new WoodShield();
            case "Ничего":
                return null;
            default:
                return new MakeshiftShield();
        }
        
    }
}