public class Register {
   private String name;
   private String pass;
   private int age;
   private String city;
   private String email;
   private String role; // we will have 2 choices in this role as an employer or applicant and it will be chosen by the user;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPass() {
      return pass;
   }

   public void setPass(String pass) {
      this.pass = pass;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getRole() {
      return role;
   }

   public void setRole(String role) {
      this.role = role;
   }


public Register(String name,String pass,int age ,String city,String email,String role){
   this.setName(name);
   this.setPass(pass);
   this.setAge(age);
   this.setCity(city);
  this.setEmail(email);
  this.setRole(role);
   }
   static   Register register (String name,String pass,int age,String city,String email,String role){
   Register user=new Register(name, pass, age, city, email, role);
   if (user.role.equals("applicant")){

   }
   if (user.role.equals("employer")){

   }
return user;}
   }
