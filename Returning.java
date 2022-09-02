package returning;

public class Return {

        int square (int value){
            return value*value;
        }
    }



//obj return part

package returning;

public class TEst {
    public static void main(String[] args) {

        Return v1 = new Return();
        System.out.println("ss: "+v1.square(5));
        Return v2 = new Return();
        System.out.println("ss: "+v2.square(7));
        Return v3 = new Return();
         System.out.println("ss: "+v3.square(3));

    }
}
