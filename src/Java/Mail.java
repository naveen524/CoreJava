package Java;

import java.util.ArrayList;
import java.util.List;

import Java.Header.Body.Attachment.MailMessage;

public class Mail{
	public static void main(String[] args) {
		Body bd1 = new Body("body of mail");
		Header hd1= new Header("header of the mail");
		Attachment atc1=new Attachment("attachment mail");
		MailMessage mm1= new MailMessage(hd1, bd1, atc1);
		
		Body bd2 = new Body("body of mail");
		Header hd2= new Header("header of the mail");
		Attachment atc2=new Attachment("attachment mail");
		MailMessage mm2= new MailMessage("hd2", "bd2", "atc2");
		List<MailMessage> mm=new ArrayList<>();
		

	}
}
