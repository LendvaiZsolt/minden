package tombrendezes;

public class Tombrendezes {

	public Tombrendezes() {

	}

	private static void emplistacsok(Tombrendezes[] emp) {
		Tombrendezes temp = new Tombrendezes();
		for (int i = 0; i < emp.length; i++)
			for (int j = 0; j < emp.length; j++) {
				if (emp[i].hatralevo() >= emp[j].hatralevo()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
	}

	private static void emplistanov(Tombrendezes[] emp) {
		Tombrendezes temp = new Tombrendezes();
		for (int i = 0; i < emp.length; i++)
			for (int j = 0; j < emp.length; j++) {
				if (emp[i].hatralevo() <= emp[j].hatralevo()) {
					temp = emp[i];
					emp[i] = emp[j];
					emp[j] = temp;
				}
			}
	}

	private int hatralevo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
