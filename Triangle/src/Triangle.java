
public  class Triangle extends GeometricObject{
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	public Triangle(){	
	}
	public Triangle(double side1,double side2,double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double getSide1(double side1){
		return side1;
	}
	public double getSide2(double side2){
		return side2;
	}
	public double getSide3(double side3){
		return side3;
	}
	public double getArea(){
		double S=(side1+side2+side3)/2;
		double Area=Math.sqrt(S*((S-side1)*(S-side2)*(S-side3)));
		return Area;
	}
	public double getPerimeter(){
		double P = side1+side2+side3;
		return P;
	}
	public String toString(){
		return "The Area Of The Triangle:" +getArea()+"\n" +
				"The Perimeter Of The Triangle:"+getPerimeter();
	}
	
	

}
