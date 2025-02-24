public class Warrior extends Fighter {

    public Warrior(int baseHp, int wp) {
        super(baseHp, wp); // Call the constructor of the Fighter class to initialize baseHp and wp
    }

    @Override
    public double getCombatScore() {
        double combatScore;
        if (getWp() == 1) {
            combatScore = getBaseHp(); // If wp is 1, CombatScore is baseHp
        } else {
            combatScore = getBaseHp() / 10.0; // Otherwise, CombatScore is baseHp / 10
        }

        if (Utility.isPrime(Battle.GROUND)) { // Check if the battleground number is prime
            combatScore *= 2; // Double the CombatScore if it is a prime number
        }
        return combatScore;
    }



}