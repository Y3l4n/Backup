import java.util.Scanner;
public class intro {

    public static void main(String[] args) {

        // int myInt = 8;
        // float myFloat = 9.7f;
        // double myDouble = 2.54d;
        // long myLong = 109280192;
        // String myString = "Hello";
        // boolean myBool = true;

        //Type-casting: double->float->long->int->char->short->byte
        // int ex = 9;
        // double exDouble = (double) ex;
        // System.out.println(exDouble);
        // Scanner scanner = new Scanner(System.in);

        // boolean greenLight = scanner.nextBoolean();

        // if(greenLight){
        //     System.out.println("Drive");
        // }else{
        //     System.out.println("Stop");
        // }
        // scanner.close();

        // Scanner scanner = new Scanner(System.in);
        // int num = scanner.nextInt();
        // if (num % 2 != 0){
        //     System.out.println(num + " la so le");
        // }else{
        //     System.out.println(num + " la so chan");
        // }

        //switch-case (thuc hien dong code neu match dieu kien)

        // int num = 3;
        // switch (num) {
        //     case 0:
        //         System.out.println("tao la 0");
        //         break;
        //     case 1:
        //         System.out.println("tao la 1");
        //     case 2:
        //         System.out.println("tao la 2");
        //     default:
        //         System.out.println("khong co gi");
        //         break;

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                    System.out.println(29);
                }else{
                    System.out.println(28);
                }
                break;
        }
        scanner.close();
        // int i = 1; //bắt đầu đếm vòng for
        // while (i <= 7){ //điều kiện for
        //     System.out.println("Quoc bi dan"); //tm điều kiện, thực hiện code
        //     i++; //tăng 1 lần cho dkien while (tránh infinite loop)
        // }

        
        for (int i = 0; i < 5; i++) {
            System.out.println("quoc gay");
            
        }
    }
}
