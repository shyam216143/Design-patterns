public class Samosa{
    private static Samosa samosa;
    private Samosa(){
        if(samosa!=null){
            throw new RuntimeException("You are trying to break singleton pattern ");
        }
    }
    // lazy way of creating singleton object
    public static Samosa getSamosa(){
        if(samosa==null){
            synchronized (Samosa.class){
                if(samosa==null){
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }

    public Object readResolve(){
        return samosa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
/*
1. constructor private
2. object create with the help of method
3. create field to store object is private
.*/ 

// public enum Samosa{
//     INSTANCE;
//     public void test(){
//         System.out.println("test code");
//     }
// }