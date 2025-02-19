package Chapter05.Lession02;

public class Employee {
    private int id; 
    private String name; 
    public void setId(int i) {
        id = i; 
    }
    public void setName(String n) {
        name = n;
    }
    public void disp (){
        System.out.println(id + " : " + name);
    }

    public static void main(String[] args){
        Employee employee = new Employee();
        employee.setId(101); 
        employee.disp();

    }
}
