package object;

public class Firma {

	public static void main(String[] args) {
		Pracownik pracownik1 = new Pracownik();
		Pracownik pracownik2 = new Pracownik();

		pracownik1.imie = "Roman";
		pracownik1.nazwisko = " Dyduch";
		pracownik1.wiek = 22;

		pracownik2.imie = " Przemek";
		pracownik2.nazwisko = "Nowak";
		pracownik2.wiek = 27;

		System.out.println("Pracownicy firmy to ;  ");
		System.out.println(pracownik1.imie + pracownik1.nazwisko   +   pracownik1.wiek);
		System.out.println(pracownik2.imie + pracownik2.nazwisko   +   pracownik2.wiek);
	}

}
