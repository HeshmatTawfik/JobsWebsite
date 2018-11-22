import java.sql.Connection;

public class Applicant extends User {

  public Applicant(int applicantID,String applicantName,String applicantPass,int applicantAge,String city,
                    String applicantEmail,boolean isEmployer)
  {
     this.setId(applicantID);
     this.setName(applicantName);
     this.setPass(applicantPass);
     this.setAge(applicantAge);
     this.setCity(city);
     this.setEmail(applicantEmail);
     this.setEmployer(isEmployer);
    }
public Applicant(String applicantName,String applicantPass){
      this.setName(applicantName);
      this.setPass(applicantPass);
}
   /* public static void main(String[] args) {
         Connection currentCon = ConnectionManger.getConnection();


    }*/
}
