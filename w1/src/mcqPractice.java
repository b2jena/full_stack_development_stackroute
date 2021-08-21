/**
 *
 *
 *  abstract class company{
 *  int companyID;
 *      //abstract printDetails();  //java: invalid method declaration; return type required
 *  }
**/
public class mcqPractice {
    static String s = "";
    public static void main(String[] args) {
        //------------------------
        Integer a = 127;  //wrapper type
        Integer b = 127;
        if(a != b){
            System.out.println("not equal");
        }else{
            System.out.println("equal");
        }
        //------------------------
        int result = 0;

        Boolean b1 = new Boolean("TRUE");
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("tRuE");
        Boolean b4 = new Boolean("false");

        if (b1 == b2)  /* Line 10 */
            result = 1;
        if (b1.equals(b2) ) /* Line 12 */
            result = result + 10;
        if (b2 == b4)  /* Line 14 */
            result = result + 100;
        if (b2.equals(b4) ) /* Line 16 */
            result = result + 1000;
        if (b2.equals(b3) ) /* Line 18 */
            result = result + 10000;

        System.out.println("result = " + result);  //10010

        /**
         * Explanation:
         *
         * Line 10 fails because b1 and b2 are two different objects.
         * Lines 12 and 18 succeed because the Boolean String constructors are case insensitive.
         * Lines 14 and 16 fail because true is not equal to false.
         */

        boolean x = true;
        boolean y = false;
        if(x && y){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println();
        //--------------------------------------------------------
        String[] seasons = {"Summer", "Spring", "Autumn", "Rainy"};
        seasons[2] = null;
        for(String str : seasons){
            System.out.println(str);
        }
        System.out.println();
        //--------------------------------------------------------

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("the elements of the array : ");
        //for(int i=0; i<=arr.length; i++){  //java.lang.ArrayIndexOutOfBoundsException
        //    System.out.println(arr[i]);
        //}

        //--------------------------------------------------------

        int[] numArr = new int[2];
        numArr = new int[3];
        System.out.println("Compiled Successfully");

        //------------------------
        int[] arr1;
        int[] arr2 = new int[3];
        char[] arr3 = {'a', 'b'};
        arr1 = arr2;
        //arr1 = arr3;  //compilation error
        System.out.println();

        //------------------------
        float ft = 5.3f;
        if(ft == 5.3){
            System.out.println("Both are equal");
        }else{
            System.out.println("Both are not equal");
        }
        System.out.println();
        //------------------------
        for(int i=2; i<7;i++){
            if(i==3)
                continue;
            if(i==5)
                break;
            s = s + i;
        }
        System.out.println(s);

        //------------------------
        byte x1 = 5, y1 = 10;
        //short z = x1 + y1;  //java: incompatible types: possible lossy conversion from int to short
        //System.out.println(z);

        String s = "ABCD";
        s.replace("A","a");
        System.out.println(s);

        //------------------------
        boolean keepGoing = true;
        int count = 0;
        int x2 = 3;
        while(count++ < 3){
            int y2 = (1 + 2*count)%3;
            switch (y2){
                case 0:
                    x2 -= 1;
                    break;
                case 1:
                    x2 += 5;
                    break;
                default:
            }
        }
        System.out.println(x2);
    }
}
