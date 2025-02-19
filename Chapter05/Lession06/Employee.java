package Chapter05.Lession06;

public class Employee {
    int id; //
    public Employee(){
        this(200); //必ずコンストラクタ内の先頭処理として定義
        System.out.println("Emplyeee");
        
    }
    public Employee(int id){
        System.out.println("Emplyee(int id)");
        this.id = id; 
    }

    public static void main(String[] args){
        Employee employee = new Employee(); 
        System.out.println(employee.id);
    }
}
