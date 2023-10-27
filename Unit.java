public abstract class Unit implements Fighter {

    protected String name;
    protected int hp;
    protected int ap;
    protected Fighter closeTo;

    protected Unit(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAp() {
        return ap;
    }

    @Override
    public void receiveDamage(int damage) {
        if (hp > 0) {
            hp -= damage;
        }
        if (hp <= 0) {
            hp = 0;
        }
    }

    @Override
    public boolean moveCloseTo(Fighter target) {
        if (closeTo == null && target != this) {
            closeTo = target;
            System.out.println(name + " is moving closer to " + target.getName() + ".");
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void recoverAP() {
        ap += 7;

        if (ap > 50) {
            ap = 50;
        }
    }



}
