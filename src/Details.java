public class Details {
    private int studentID;
    private String name;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String phone;
    private String city;

    public Details(String name, String phone, String city) {
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

    public Details(int studentID, String name, String phone, String city) {
        this.studentID = studentID;
        this.name = name;
        this.phone = phone;
        this.city = city;
    }

    public Details() {
        super();
    }

    @Override
    public String toString() {
        return "Details{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
