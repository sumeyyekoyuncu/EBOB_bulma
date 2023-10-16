
import java.util.Scanner;


public class EBOB_bulma {
    public static int EBOB(int a,int b){
        int ebob=1;
        for(int i=1;i<=a && i<=b ;i++){
            if(a%i==0 && b%i==0){
                ebob=i;
            }
        }
        return ebob;
    }
   
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("birinci sayiyi girin");
        int sayi1= scanner.nextInt();
        System.out.println("ikinci sayiyi girin");
        int sayi2= scanner.nextInt();
        System.out.println("girdiginiz sayilarin EBOBu:"+EBOB(sayi1, sayi2));
    }
}
