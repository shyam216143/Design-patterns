public class EmployeeFacotry{
    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("Android")){
            return new AndroidDeveloper;
        }
        else if(empType.trim().equalsIgnoreCase("Web")){
            return new WebDeveloper;
        }
        else:
        return null
    }   
}