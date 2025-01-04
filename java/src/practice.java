
public class practice {
	public static void main(String[] args) {
		m1(5);

	}
	static void m1(int x)
	{ 
		int m =0;
		if(m<x)
		{
		m = m+x;
		m1(m);
		}
		else
		{
			return;
		}
		
	}

}
