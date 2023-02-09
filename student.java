class student
{
	byte rollno;
	String name;
	byte age;
	
	public void getData(byte r,String n,byte a)
	{
		rollno=r;
		name=n;
		age=a;
	}
	public void showData()
	{
		System.out.println("Rollno :"+rollno);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
	}
}
	class person	
	{
		public static void main(String args[])
		{
			person p=new person();
			person.getData((byte)101,args[1],(byte)22);
			
			byte rollno=Byte.parseByte(args[0]);
			byte age=Byte.parseByte(args[2]);
			
			person.getData(rollno,args[1],age);
			
			person.showData();
		}
	}
	