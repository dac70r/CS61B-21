public class DogLauncher{
    public static void main(String[] args){
        Dog d = new Dog(50);

        //d.weightInPounds = 50;

        Dog dog = new Dog(29);
        System.out.println("Dog d brarks: ");
        d.makeNoise();
        System.out.println("\n Dog dog brarks: ");
        dog.makeNoise();
    }
}