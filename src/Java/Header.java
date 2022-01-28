package Java;

public class Header {
 private String title;
Header(String title)
{
	this.title=title;
}
public String gettitle()
{
	return title;
}
class Body{
	private String message;
	Body(String message)
	{
		this.message=message;
	}
	public String getmessage()
	{
		return message;
	}
	public class Attachment
	{
		private String filename;
		Attachment(String filename)
		{
			this.filename=filename;
		}
		public String getfilename()
		{
			return filename;
		}
		public class MailMessage
		{
			Header hd;
			Body bd;
			Attachment atc;
			MailMessage(String h,String string2,String string3)
			{
				this.hd=h;
				this.bd=string2;
				this.atc=string3;
			}
				public String toString()
				{
					return hd.gettitle()+bd.getmessage()+atc.getfilename();
				}
			}
		}
	}
}
