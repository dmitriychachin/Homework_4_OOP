import java.util.Random;

public class MetalShield extends Shield{
    protected static Random rnd = new Random();
    private Object name;
    public MetalShield() {
        super("Металический щит", rnd.nextInt(80), 30, rnd.nextInt(51-20)+20);
    }

    @Override
    public int protection() {
        return rnd.nextInt(80);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(this.name)
                .append(String.format("\n\t%s", super.toString()));
        return res.toString();
    }
}
