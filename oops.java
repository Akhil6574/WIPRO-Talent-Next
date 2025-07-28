public interface oops_inteface {
  abstract void dis();
  
}
class parent implements oops_inteface{
    private int a=10;
    public void dis(){
      System.out.println(a);
    }
}
public class oops extends parent implements oops_inteface{
  public static void main(String args[]){
  parent p= new parent();
  p.dis();
}
}
