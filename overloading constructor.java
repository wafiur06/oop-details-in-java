package overlopping;

import javax.lang.model.element.Name;

public class Farmar {

        String Name,Work;
        int Phone;

        Farmar() {
            System.out.println("No information");
        }
        Farmar(String n,String w){
            Name = n;
            Work = w;
        }
        Farmar(String n,String w,int p){
            Name = n;
            Work = w;
            Phone = p;
        }
    void dis() {

        System.out.println("Name: " + Name);
        System.out.println("Work: " + Work);
        System.out.println("Phone: " + Phone);
        System.out.println("\n");
    }
    }


// now main class

package overlopping;

public class test {
    public static void main(String[] args) {
        Farmar far = new Farmar();
        far.dis();
        Farmar far1 = new Farmar("Md.Wafiur","Nothing");
        far1.dis();
        Farmar far2 = new Farmar("Mst.Israt","Nothing",12345);
        far2.dis();

    }
}
