
public class Knight extends Fighter {

    public Knight(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        double combatScore;
        if (getWp() == 1) {
            combatScore = getBaseHp();
        } else {
            combatScore = getBaseHp() / 10.0;
        }

        if (Utility.isSquare(Battle.GROUND)) {
            combatScore *= 2;
        }
        return combatScore;
    }


    public int getWp() {
        return super.getWp();
    }

}