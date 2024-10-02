public class Demo{
    public static void main(Strings[] args){
        YoutubeChannel channel = new YoutubeChannel();
        Subscriber ram = new Subscriber("Ram");
        Subscriber hari = new Subscriber("Hari");
        channel.subscribe(ram);
        channel.subscribe(hari);
        channel.newVideoUploaded("Learn Design Pattern");
        channel.newVideoUploaded("Learn React Video");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("press 1 to upload video");
            System.out.println("press 2 to create new Subscriber");
            System.out.println("press 3 to unsubscribe");
            System.out.println("press 4 to exit");
            int c = Integer.parseInt(br.readLine());
            if(c==1){
                System.out.println("Enter Video Title");
                String title = br.readLine();
                channel.newVideoUploaded(title);
            }
            else if(c==2){
                System.out.println("Enter name of subscriber");
                String subsName = br.readLine();
                Subscriber subscriber = new Subscriber(subsName);
                channel.subscribe(subscriber);
            }
            else if(c==3){
                System.out.println("Enter name of subscriber to unsubscribe");
                String subsName = br.readLine();
                Subscriber subscriber = new Subscriber(subsName);
                channel.unsubscribe(subscriber);

            }
            else if(c==4){
                System.out.println("Thank you for using App");
                break;
            }
            else{
                System.out.println("Wrong input");
            }
        }
    }   
}