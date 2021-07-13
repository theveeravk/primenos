
public class primeno {

	public static void main(String[] args) 
	{
		int no =5;
		primeno vk= new primeno();
		System.out.println("given no is ==> "+vk.prime(no) );
	
		
		
	}
	
	public boolean prime(int no)
	{

		if(no==0 || no ==1)
		
			return false;
		if(no==2)
			return true;
		for(int i =2;i<no;i++)
		{
			if(no%2==0)
			{
				return false;
			}
			
		}
		return true;
	}

}
