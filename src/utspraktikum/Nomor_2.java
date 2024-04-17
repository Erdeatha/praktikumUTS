/*
Gunakan loop bersarang yang menampilkan pola (patterns) berikut dalam empat
program terpisah:
*/

package utspraktikum;

public class Nomor_2 {
    
    static void pattern1(){
        for(int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
    
    static void pattern2(){
        for(int i=6;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
    
    static void pattern3(){
        for(int i=1;i<=6;i++){//2
            for(int j=6;j>=1;j--){//
                if(j<=i){
                    System.out.print(j + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
    
    static void pattern4(){
        for(int i=6;i>=1;i--){
            for(int k=6;k>i;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Pattern A ");
        pattern1();
        System.out.println("\nPattern B ");
        pattern2();
        System.out.println("\nPattern C ");
        pattern3();
        System.out.println("\nPattern D ");
        pattern4();
    }
}
