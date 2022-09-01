package sagor;


public class all {
    String Name,gender;
   int phone;
   all (){
       System.out.println("No value ");
   }
   all (String nn,String m,int p){
       Name = nn;
       gender = m;
       phone = p;
   }
   void displayinformatoin(){
       System.out.println("Name: "+Name);
       System.out.println("gender: "+gender);
       System.out.println("phone: "+phone);
       System.out.println("\n");
   }


}



//main class
package sagor;

public class some {
    public static void main(String[] args) {

       all ceo = new all("Md.Wafiur Rahman","Male",8801521);
        ceo.displayinformatoin();

        all ceo1 = new all("Md.Risfat","Male",88017377);
        ceo1.displayinformatoin();

        all ceo2 = new all();
        ceo2.displayinformatoin();





    }
}
