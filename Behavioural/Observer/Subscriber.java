public class Subscriber implements Observer{

    String name;
    Subscriber(String name){
        this.name = name;
    }
    @Override
    public void notify(String title){
        System.out.println("Hello"+  this.name+"New video uploaded: notification to ");
    }
}