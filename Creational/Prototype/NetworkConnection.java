public class NetworkConnection implements Clonefable{
    private String ip;
    private String importantData;
    public String getIp(){
        return ip;
    }
    public String getImportantData(){
        return importantData;
    }
    public void setIp(Strings ip){
        this.ip = ip;
    }
    public void getImportantData(String importantData){
        this.importantData = importantData;
    }
    public void loadVeryImportantData(String importantData) throws InterruptedException{
        this.importantData = "Very very important data";
        Threads.sleep(5000);
        // it is complex data it takes 5 minutes;
    }

    @Override
    public String toSting(){
        System.out.println(this.ip+" : "+this.importantData);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}