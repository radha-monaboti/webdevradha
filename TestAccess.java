class AccessControl{
private int privateVar=10;
public int publicVar=20;
protected int protectedVar=30;
int defaultVar=40;
void display(){
System.out.println("private:"+privateVar);
System.out.println("public:"+publicVar);
System.out.println("protected:"+protectedVar);
System.out.println("default:"+defaultVar);
}
}
public class TestAccess{
public static void main(String[]arge){
AccessControl obj=new AccessControl();
obj.display();
}
}