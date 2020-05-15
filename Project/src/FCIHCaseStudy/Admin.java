package FCIHCaseStudy;

/**
 *
 * @author dina
 */
public class Admin extends Staff {
private static Admin admin=new Admin();
    private Admin(){}

   //Get the only object available
   public static Admin getobject(){
      return admin;
   }
    public Admin(String user, String pass, int id, String fname, String lname, int age, double salary, Department dept) {
        super(user, pass, id, fname, lname, age, salary, dept);
    }

    @Override
    public String toString() {
        return "I'm Manager : " + fname + " " + lname + "\n" + "ID : " + id + " Age : " + age + " Salary : " + salary + "\n" + "Dept. : " + myDept.getDeptName() + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

    @Override
    public boolean login(String userName, String Pass) {

        if (userName.equals("Admin@yahoo.com") && Pass.equals("12345678")) {
            return true;
        }
        return false;

    }

}
