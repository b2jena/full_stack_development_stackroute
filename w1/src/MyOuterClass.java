public class MyOuterClass {
    private int x = 7;
    class MyInnerClass{
        public void myget(){
            System.out.println("Inner class x value : " + x);
        }
    }

    public static void main(String[] args){
        MyOuterClass myouter = new MyOuterClass();
        MyOuterClass.MyInnerClass myInner = myouter.new MyInnerClass();
        myInner.myget();
    }
}
