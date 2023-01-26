package mock;

public class Test2 
{
	public static void main(String[] args) {
		
		int sec=0;
		int car1=5;
		int car2=4;
		int distCar1=1;
		int distCar2=0;
		while(distCar2<distCar1)
		{
			
			sec++;
			car1=5;
			car2=4;
			distCar1=distCar1+car1; //6+5+5+5+5+5+5+5+5
			distCar2=distCar2+car2; //4+4+4+4+4+4+4+4+4
			if(distCar2>distCar1)
			{
				System.out.println(sec);
				
			}
	
		}
	}

}
