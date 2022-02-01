import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Student Management App");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true){
        System.out.println("press 1 to add student");
        System.out.println("press 2 to delete student");
        System.out.println("press 3 to display student");
        System.out.println("press 4 to exit");

        int c = Integer.parseInt(br.readLine());

        if(c==1){
            System.out.println("Enter User Name:");
            String name = br.readLine();

            System.out.println("Enter user phone");
            String phone = br.readLine();

            System.out.println("Enter user city");
            String city = br.readLine();

            //create obj

            Details details = new Details(name,phone,city);
            boolean answer = Studentdow.insertStudentDB(details);
            if(answer==true){
                System.out.println("successful..");
            }else {
                System.out.println("Wrong error..");
            }
            System.out.println(details);


        }
        else if(c==2){
            System.out.println("enter students ID");

            int userID = Integer.parseInt(br.readLine());

            Boolean b = Studentdow.deleteid(userID);
            if(b){
                System.out.println("delete");
            }else {
                System.out.println("error");
            }
        }
        else if(c==3){
           Studentdow.showALl();
        }
        else if(c==4){
            break;
        }

    }
    }
}
