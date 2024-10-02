import java.io.Serializable;
public class Example implements Serializable{
    public static void main(Strings[] args) throws Exception, CloneNotSupportedException{
        Samosa samosa1 = new Samosa.getSamosa();
        System.out.println(samosa1.hashCode())
        Samosa samosa2 = new Samosa.getSamosa();
        System.out.println(samosa2.hashCode())
        /*
        1. Reflection API to break singleton pattern
        Solution: 1=> if object is exists throw exception from inside constructor
                  2=> use enum
        2. Deserialization
        Solution: =>  implementing readResolve method
        3. cloning 
        */ 

        /*1. Through reflection API*/ 
        // Constructor<Samosa> constructor = new Samosa.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Samosa s2 =constructor.newInstance();
        // System.out.println(s2.hashCode())

        /*2. enum*/ 
        // Samosa s1 = Samosa.INSTANCE;
        // System.out.println(s1.hashCode())
        // s1.test()
        // Constructor<Samosa> constructor = new Samosa.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Samosa s2 =constructor.newInstance();
        // System.out.println(s2.hashCode())  /* throws error*/

        /* 3 Deserializaion*/
        Samosa samosa =  new Samosa.getSamosa();
        System.out.println(samosa.hashCode())
        
        // ObjectOutputSteam oos= new  ObjectOutputSteam(new FileOutputSteam("abc.ob"));
        // oos.writeObject(samosa);
        // System.out.println("serialization is done...")

        // ObjectInputSteam ois= new  ObjectInputSteam(new FileInputSteam("abc.ob"));
        // Samosa s2 =(Samosa)ois.readObject(samosa);
        // System.out.println(s2.hashCode());

        Samosa s2 =  (Samosa)samosa.clone();
        System.out.println(s2.hashCode());



    }
}