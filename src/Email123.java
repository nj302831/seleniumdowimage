import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Email123 {

	public static void main(String[] args) throws IOException {
		
		final String username = "kumarsujeetsrp@gmail.com";
		final String password = "rbodmncbahmodvjc";

		String fromEmail = "kumarsujeetsrp@gmail.com";
		String toEmail = "nj302831@gmail.com";
		

		String host = "smtp.gmail.com";
		
		Properties properties = new Properties();
		
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");

		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "587");

		Session session = Session.getInstance(properties, new javax.mail.Authenticator()
		{
			protected PasswordAuthentication getPasswordAuthentication()
			{
				return new PasswordAuthentication(username, password);
			}
		});

		MimeMessage msg = new MimeMessage(session);

		try {
			msg.setFrom(new InternetAddress(fromEmail));

			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			msg.setSubject("check attached file");

			Multipart emailContent = new MimeMultipart();

			MimeBodyPart textBodyPart = new MimeBodyPart();
			textBodyPart.setText("check attached file");
			MimeBodyPart pdfAttachment = new MimeBodyPart();

			pdfAttachment.attachFile("C:\\Users\\TS\\Downloads\\GraphNotes.pdf");
			//pdfAttachment.attachFile("E:\\rohini.xlsx");
			
			emailContent.addBodyPart(textBodyPart);

			emailContent.addBodyPart(pdfAttachment);

			msg.setContent(emailContent);

			Transport.send(msg);

			System.out.println("Sent mail successfully !!! ");
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}

































