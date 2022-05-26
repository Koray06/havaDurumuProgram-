import java.util.Scanner;

public class havaDurumuProgramı {

	public static void main(String[] args) {
		/*Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
		Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
		Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
		Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/

	int sicaklik;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen Hava Sıcaklığını giriniz : ");
		sicaklik= scan.nextInt();
		
		boolean kayak = sicaklik<=5;
		boolean sinema = sicaklik>5 && sicaklik<=15 ;
	
String durum = (sicaklik <5) ? "kayak yapabilirsiniz " : ((sicaklik >=5 && sicaklik <15) ? "sinemaya gidebilirisiniz":((sicaklik >=15 && sicaklik <25) ? "pikniğe gidebilirsiniz" : "yüzmeye gidebilirsiniz"));
        System.out.println(durum);

	}

}
