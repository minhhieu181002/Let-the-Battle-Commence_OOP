public class Paladin extends Knight {

	public Paladin(int baseHp, int wp) {
		super(baseHp, wp);
	}

	@Override
	public double getCombatScore() {
		int baseHp = getBaseHp();
		double combatScore = baseHp * 3; // Paladin's CombatScore is triple of baseHP on any ground

		if (isFibonacci(baseHp)) {
			int n = getFibonacciIndex(baseHp);
			if (n > 2) {
				combatScore = 1000 + n;
			}
		}

		return combatScore;
	}

	private boolean isFibonacci(int num) {
		int a = 0, b = 1;
		while (b < num) {
			int temp = b;
			b = a + b;
			a = temp;
		}
		return b == num;
	}

	private int getFibonacciIndex(int num) {
		int a = 0, b = 1, index = 1;
		while (b < num) {
			int temp = b;
			b = a + b;
			a = temp;
			index++;
		}
		return (b == num) ? index : -1;
	}
}
