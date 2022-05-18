import java.util.Scanner;
public class Kullanici_Girisi {

    public static void main(String[] args) {
        String userName, password;
        String newPassword ;

        Scanner input= new Scanner(System.in);

        System.out.print("Kullanici adinizi giriniz : ");
        userName= input.nextLine();

        System.out.print("Sifrenizi giriniz : ");
        password= input.nextLine();

        if(userName.equals("ebuko") && password.equals("ek123")){

            System.out.println("Giris Basarili...");
        }

        else if (!(userName.equals("ebuko")) && password.equals("ek123")) {

            System.out.println("Kullanici adinizi yanlis veya eksik girdiniz.");

        }

        else if (userName.equals("ebuko") && !(password.equals("ek123"))) {

            System.out.println("Sifrenizi yanlis girdiniz...");
            System.out.println("Sifrenizi sfirilamak istiyorsaniz 1'e istemiyorsaniz 0'a basiniz : ");
            int bas = input.nextInt();

                if(bas==1){
                        System.out.print("Yeni sifrenizi giriniz : ");
                        Scanner inp = new Scanner(System.in);
                        newPassword = inp.nextLine();

                        if(!(newPassword.equals("ek123")) && !(newPassword.equals(password))){

                            System.out.println("Sifreniz basari ile guncellenmistir.");

                        }
                            else{
                                System.out.println("Sifreniz eski sifreniz ile ve hatali girisiniz ile ayni olmamalidir.");
                                }
                }
                else{

                    System.out.println("Tekrar sifrenizi giriniz...");

                }
        }

        else{
            System.out.println("Tum bilgilerinizi kontrol ediniz.");
        }


    }

}
