class Figure_3D{
   public double calculateVolume(){
   return 0;
   }
    public double calculateSurfaceArea(){
	return 0;
	}
}
class Cylinder extends Figure_3D{
    private double radius;
    private double height;
public Cylinder(double radius,double height){
       this.radius=radius;
       this.height=height;	   
}   	
   public double calculateVolume(){
      return Math.PI*radius*radius*height;
    }	     
   public double calculateSurfaceArea(){
      return 2*Math.PI*radius*(radius+height);
   }
   }
class cone extends Figure_3D{
    private double radius;
    private double height;
public cone(double radius,double height){
       this.radius=radius;
       this.height=height;
}
   public double calculateVolume(){
      return(1.0/3)*Math.PI*radius*radius*height;
    }
   public double calculateSurfaceArea(){
      return Math.PI*radius*(radius+Math.sqrt(height*height+radius*radius));
    }}
class Sphere extends Figure_3D{
    private double radius;
public Sphere(double radius){
    this.radius=radius;
}	
   public double calculateSurfaceArea(){
      return(4.0/3)*Math.PI*radius*radius*radius;
    }	  	
   public double calculateSurfaceArea(){
      return 4*Math.PI*radius*radius;
	  }
    }	  	
public class InheritedHierarchy{
  public static void main(String[] args){
    Figure_3D[] Figure=new Figure_3D[3];
	Figure[0]=new Cylinder(2,5);
	Figure[1]=new cone(3,6);
	Figure[2]=new Sphere(4);
for(Figure_3D figure:figures){
  System.out.println("Volume:+figure.claculateVolume()");
  System.out.println("SurfaceArea:+figure.calculateSurfaceArea()");
  System.out.println();
}	 
  }
}