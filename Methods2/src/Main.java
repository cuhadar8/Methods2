
public class Main {
	
	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel";
		String yeni = sehirVer();
		System.out.println(yeni);
		int sayi = topla(5,7);
		System.out.println(sayi);
		
		System.out.println(topla(1,3,5,7,9,11,13,15,17,19));
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int... sayilar) {
		int toplam = 0;
		for(int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;	
	}
	
	public static String sehirVer() {
		return "Ankara";
	}

}
