class TrafficSignal
{
	public static void main(String[] args)
	{
		char signal = 'R';
		
		switch(signal)
		{
			case 'R' : 
			System.out.println("STOP");
			break;
		
		    case 'Y' :
			System.out.println("READY");
			break;
			
			case 'G' :
			System.out.println("GO");
			
			default :
			System.out.println("Invalid Signal");
		}	
		
		
		
	}
	
	
}