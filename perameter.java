public class all {
    String Name,gender;
   int phone;
   void setinformation(String n,String m,int ph){
       Name = n;
       gender =m;
       phone = ph;

   }
   void displayinformatoin(){
       System.out.println("Name: "+Name);
       System.out.println("gender: "+gender);
       System.out.println("phone: "+phone);
       System.out.println("\n");
   }


}



//and now in obect class

public class some {
    public static void main(String[] args) {

        all ceo = new all();
        ceo.setinformation("Md.Wafiur Rahman","Male",8801521);
        ceo.displayinformatoin();

        all ceo1 = new all();
        ceo1.setinformation("Md.Risfat","Male",88017377);
        ceo1.displayinformatoin();





    }
}

