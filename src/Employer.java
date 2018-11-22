public class Employer extends User {
    public Employer(int employerID,String employerName,String employerPass,int employerAge,String city,
                     String employerEmail,boolean isEmployer)
    {
        this.setId(employerID);
        this.setName(employerName);
        this.setPass(employerPass);
        this.setAge(employerAge);
        this.setCity(city);
        this.setEmail(employerEmail);
        this.setEmployer(isEmployer);
    }
   public  Employer(){

    }
    public Employer(String employerName, String employerPass){
        this.setName(employerName);
        this.setPass(employerPass);


    }



    public static void main(String[] args) {


        System.out.println(addemp("a1","a2").getName());
        System.out.println( addemp("a2","a2").getName());

    }
     static   Employer addemp (String name,String p){
         Employer employer=new Employer(name,p);
         employer.isEmployer=true;

         return employer;
    }

}
