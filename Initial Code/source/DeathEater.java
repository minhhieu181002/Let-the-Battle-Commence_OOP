public class DeathEater extends Monster implements Combatable {
	private Complex mana;
	public DeathEater(Complex mana) {
		super(mana);
		this.mana = mana;
	}

	public Complex getMana() {
		return mana;
	}

	@Override
	public double getCombatScore() {
		return Math.sqrt(mana.getRe() * mana.getRe() + mana.getIm() * mana.getIm());
	}
}