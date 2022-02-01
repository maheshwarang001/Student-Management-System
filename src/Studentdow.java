import java.sql.*;

public class Studentdow {



    public static Boolean deleteid(int userID){
        boolean f = false;

        try{
            Connection con = Connection1.createc();
            String q = "DELETE FROM students WHERE id=?";

            PreparedStatement st = con.prepareStatement(q);
            st.setInt(1,userID);
            st.executeUpdate();
            f=true;



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return f;

    }


    public static Boolean showALl(){
        boolean f = false;

        try{
            Connection con = Connection1.createc();
            String q = "SELECT * FROM students";

            Statement g = con.createStatement();

            ResultSet set = g.executeQuery(q);


            while(set.next()){

                int id = set.getInt(1);
                String name = set.getString(2);
                String phone = set.getString(3);
                String city = set.getString(4);

                System.out.println(id);
                System.out.println(name);
                System.out.println(phone);
                System.out.println(city);
            }



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return f;

    }





    public static Boolean insertStudentDB(Details details){
 boolean f= false;
        //jdbc code
        try {

            Connection con = Connection1.createc();
            String q = "INSERT INTO students(name,phone,city) VALUES(?,?,?)";

            //prepared statement

            PreparedStatement st = con.prepareStatement(q);

            //set the value of parameter
            st.setString(1,details.getName());
            st.setString(2,details.getPhone());
            st.setString(3,details.getCity());


            //execute
            st.executeUpdate();
            f=true;


        }catch (Exception e){
            e.printStackTrace();
        }
return f;
    }
}
