public class Main {

    public static void main(String[] args) {
        Medic Medic = new Medic();
        Magic Magic = new Magic();
        Warrior Warrior = new Warrior();



        HavingSuperAbility[] havingSuperAbilities ={Magic, Medic, Warrior};
        for (int i = 0; i < havingSuperAbilities.length ; i++) {
            havingSuperAbilities[i].applySuperAbility("Suoer");
            System.out.println(havingSuperAbilities[i]);

        }


	// write your code here
    }
}
