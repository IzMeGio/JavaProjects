import java.util.Scanner;

class psswdcheck{
    public static void main(String[] args) {
        boolean rep;
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter Username :");
        String userName = myobj.nextLine();
        System.out.println("Enter password :");
        String password1 = myobj.nextLine();
        do{
        System.out.println("Please, Repeat password");
        String password2 = myobj.nextLine();
        if(password1.equals(password2)){
            System.out.println("Loading, please wait...");
            rep = false;
            System.exit(0);
        }else{
            System.out.println("Password missmatch, try again");
            rep = true;
        }
    }while(rep != false);
   }
}