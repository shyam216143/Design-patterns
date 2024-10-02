public class Main{
    public static void main(Strings[] args)throws InterruptedException{
         NetworkConnection networkConnection = new NetworkConnection();
         networkConnection.setIp("10.2.2.35");
         networkConnection.loadVeryImportantData()
         System.out.println(networkConnection);

        //  we want new object to network connections
        try{
            NetworkConnection networkConnection2 = (NetworkConnection) networkConnection.clone();
            NetworkConnection networkConnection3 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
            System.out.println(networkConnection3);
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

    }   
}