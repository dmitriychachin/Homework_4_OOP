public class Archer extends Warrior<Throwing, Shield>{

    public Archer(String name, int hp, Object object, Throwing weapon) {
        super(name, hp, object, weapon);
    }

    public int range(){
        return rnd.nextInt(this.weapon.range)+1;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
