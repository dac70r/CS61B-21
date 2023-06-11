public class Dog {
    public int weightInPounds;

    /** Contructor for Dog class */
    public Dog(int x){
        weightInPounds = x;
    }

    public void makeNoise(){
        if (weightInPounds <10){
            System.out.println("Yip!");
        }
        else if (weightInPounds <30){
            System.out.println("bark!");
        } else {
            System.out.println("woof!");
        }
    }
}