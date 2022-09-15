
public class Rectangle {
	
	int length;
	int width;
	
	Rectangle()
	{
		
		length=4;
		width=2;
		
	}
	Rectangle(int l,int w)
	{
	  this.length=l;
	  this.width=w;
	}
	void area()
	{
		System.out.println("Length and Width = "+(length*width));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Rectangle r=new Rectangle();
        r.area();
        Rectangle r1=new Rectangle(40,20);
        r1.area();
        
	}

}
