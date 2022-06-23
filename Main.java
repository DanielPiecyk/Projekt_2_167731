import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int dlugosc,dodawanie;
    String zdanie;
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj frazę :");
    zdanie = sc.nextLine();
    do{
    System.out.println("Podaj liczbę od 1 do 8 :");
    dodawanie = sc.nextInt();
    if (dodawanie<=8&&dodawanie>=1){break;}
    System.out.println("Podano złą wartość");
      }while(true);
    dlugosc = zdanie.length();
    System.out.println("zakodawana fraza :");
    char[] pomocnicza = zdanie.toCharArray();
   for(int i = 0;i<dlugosc;i++)
     {
       char znak = pomocnicza[i];
       int liczba = znak;
       if (liczba != 32){liczba = liczba + dodawanie;}
       if (liczba >= 117){liczba = liczba -17 + dodawanie;}
       znak = (char)liczba ;
       pomocnicza[i] = znak;
        System.out.print(pomocnicza[i]);
     }
    
  }
}