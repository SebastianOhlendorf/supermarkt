package waren;

public class NonFoodArtikel extends Ware{

	public NonFoodArtikel(String name, double preis) {
		super(name, preis);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean nachbestellen(int menge) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean herausgeben(int menge) {
		// TODO Auto-generated method stub
		return false;
	}

}
