
public class Area implements Shape{
	int length;
	int breadth;
	int side;
	int radius;
	public Area()
	{
		super();
	}

	public Area(int length, int breadth,int side, int radius) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.side=side;
		this.radius = radius;
	}

	
	@Override
	public void rectangleArea()
	{
		System.out.println("Area of Rectangle ="+(length*breadth));
	}

	@Override
	public void squareArea() 
	{
		
		System.out.println("Area of Square ="+(side*side));
	}

	@Override
	public void circleArea()
	{
		
		System.out.println("Area of Circle ="+(3.14*radius*radius));
	}

}
