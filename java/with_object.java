import java.util.*;
class box
{
	int l;
	int h;
	int b;
	void hustler()
	{
		int volume = l*h*b;
		System.out.println(volume);
	}
	
}

public  class with_object {

	public static void main(String[] args) {
		box boxname = new box();
		int l,b,h;
		boxname.l = 5;
		boxname.h = 5;
		boxname.b = 5;
		boxname.hustler();
		
				
}
}
