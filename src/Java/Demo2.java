package Java;

public class Demo2 {
private String labname;
private String capasity;
Demo2(String labname,String capasity)
{
	this.capasity=capasity;
	this.labname=labname;
}
public String getcapsity()
{
	return capasity;
}
public String getlabname()
{
	return labname;
}
class Lecturerroom
{
	String roomname;
	String roomcapasity;
	int roomnum;
	Lecturerroom(String roomname,String roomcapasity,int roomnum)
	{
		this.roomcapasity=roomcapasity;
		this.roomname=roomname;
		this.roomnum=roomnum;
	}
	public String getcapasity()
	{
		return capasity;
	}
	public String getroomname()
	{
		return roomname;
	}
	public int getroomnum()
	{
		return roomnum;
}
}
public class N28Building
{
	
}
}