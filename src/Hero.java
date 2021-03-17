public abstract class Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String HavingSuperAbility;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getHavingSuperAbility() {
        return HavingSuperAbility;
    }

    public void setHavingSuperAbility(String havingSuperAbility) {
        HavingSuperAbility = havingSuperAbility;
    }

    @Override
    public void applySuperAbility(String superAbilityType) {

    }
}
