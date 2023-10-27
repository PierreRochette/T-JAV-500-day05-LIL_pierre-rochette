public abstract class Monster extends Unit {

    protected int damage;
    protected int apcost;

    protected Monster (String name, int hp, int ap) {
        super(name, hp, ap);
        damage = 0;
        apcost= 0;
    }

    public int getDamage() {
        return damage;
    }

    public int getApcost() {return apcost; }

    @Override
    public boolean equip(Weapon weapon) {
        System.out.println("Monsters are proud and fight with their own bodies.");
        return false;
    }

    @Override
    public boolean attack (Fighter target) {
        if (closeTo!= null && closeTo.equals(target) && ap >= apcost) {
            System.out.println(name + " attacks " + target.getName());
            ap -= apcost;
            target.receiveDamage(damage);
            return true;
        } else if (closeTo == null || !closeTo.equals(target)) {
            System.out.println(name + ": I'm too far away from " + target.getName() + ".");
        }
        return false;
    }





}
