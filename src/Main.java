import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int gun,ay;
       Scanner in = new Scanner(System.in);

        System.out.print("Doğum Ayınızı Giriniz : ");
        ay = in.nextInt();
        System.out.print("Doğum Gününüzü Giriniz : ");
        gun = in.nextInt();

        if (ay==1)
        {
            if (gun >=1 && gun <=31)
            {
                if (gun <22)
                {
                    System.out.println("Oğlak Burcusunuz!");
                }else
                {
                    System.out.println("Kova Burcusunuz!");
                }
            }else
            {
                System.out.println("Hatalı Giriş!!");
            }
        }else if (ay==2)
        {
            if (gun >=1 && gun <=29)
            {
                if (gun <20)
                {
                    System.out.println("Kova Burcusunuz!");
                }else
                {
                    System.out.println("Balık Burcusunuz!");
                }
            }else
            {
                System.out.println("Hatalı Giriş!!");
            }
        }else if (ay==3)
        {
            if (gun >=1 && gun <=31)
            {
                if (gun <21)
                {
                    System.out.println("Balık Burcusunuz!");
                }else
                {
                    System.out.println("Koç Burcusunuz!");
                }
            }else
            {
                System.out.println("Hatalı Giriş!!");
            }
        }else if (ay==4)
        {
            if (gun >=1 && gun <=31)
            {
                if (gun <21)
                {
                    System.out.println("Koç Burcusunuz!");
                }else
                {
                    System.out.println("Boğa Burcusunuz!");
                }
            }else
            {
                System.out.println("Hatalı Giriş!!");
            }
        }else if (ay==5)
        {
            if (gun >=1 && gun <=31)
            {
                if (gun <22)
                {
                    System.out.println("Boğa Burcusunuz!");
                }else
                {
                    System.out.println("İkizler Burcusunuz!");
                }
            }else
            {
                System.out.println("Hatalı Giriş!!");
            }
        }else if (ay==6)
        {
            if (gun >=1 && gun <=31)
            {
                if (gun <23)
                {
                    System.out.println("İkizler Burcusunuz!");
                }else
                {
                    System.out.println("Yengeç Burcusunuz!");
                }
            }else
            {
                System.out.println("Hatalı Giriş!!");
            }
        }else if (ay==7)
        {
            if (gun >=1 && gun <=31)
            {
                if (gun <23)
                {
                    System.out.println("Yengeç Burcusunuz!");
                }else
                {
                    System.out.println("Aslan Burcusunuz!");
                }
            }else
            {
                System.out.println("Hatalı Giriş!!");
            }
        }else if (ay==8)
        {
            if (gun >=1 && gun <=31)
            {
                if (gun <23)
                {
                    System.out.println("Aslan Burcusunuz!");
                }else
                {
                    System.out.println("Başak Burcusunuz!");
                }
            }else
            {
                System.out.println("Hatalı Giriş!!");
            }
        }else if (ay==9)
        {
            if (gun >=1 && gun <=31)
            {
                if (gun <23)
                {
                    System.out.println("Başak Burcusunuz!");
                }else
                {
                    System.out.println("Terazi Burcusunuz!");
                }
            }else
            {
                System.out.println("Hatalı Giriş!!");
            }
        }else if (ay==10)
        {
            if (gun >=1 && gun <=31)
            {
                if (gun <23)
                {
                    System.out.println("Terazi Burcusunuz!");
                }else
                {
                    System.out.println("Akrep Burcusunuz!");
                }
            }else
            {
                System.out.println("Hatalı Giriş!!");
            }
        }else if (ay==11)
        {
            if (gun >=1 && gun <=31)
            {
                if (gun <22)
                {
                    System.out.println("Akrep Burcusunuz!");
                }else
                {
                    System.out.println("Yay Burcusunuz!");
                }
            }else
            {
                System.out.println("Hatalı Giriş!!");
            }
        }else if (ay==12)
        {
            if (gun >=1 && gun <=31)
            {
                if (gun <22)
                {
                    System.out.println("Yay Burcusunuz!");
                }else
                {
                    System.out.println("Oğlak Burcusunuz!");
                }
            }else
            {
                System.out.println("Hatalı Giriş!!");
            }
        }else
        {
            System.out.println("Hatalı Giriş!!");
        }
    }
}





