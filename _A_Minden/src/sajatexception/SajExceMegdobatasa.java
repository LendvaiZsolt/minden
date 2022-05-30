package sajatexception;

public class SajExceMegdobatasa {

	private int egyenleg;

	public int penzki(int penzki) throws ElegtelenFedezetException {

		if (penzki <= egyenleg) {
			return egyenleg = egyenleg - penzki;
		} else {
			double minusz = penzki - egyenleg;
			throw new ElegtelenFedezetException(minusz);
		}
	}

}
