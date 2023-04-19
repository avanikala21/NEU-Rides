/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.neu.info5100.components;
    import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;
/**
 *
 * @author sidb
 */
public class EmailVerifier {
    
    public EmailVerifier() {
    }

    
    

  public void SendEmail(String emailID, String nameVal) throws MailjetException, MailjetSocketTimeoutException {
    MailjetClient client;
    MailjetRequest request;
    MailjetResponse response;
    client = new MailjetClient("96021c3d69117bcfff979bc972588d00","453cf8adf5055a402c66fce8709a68ed", new ClientOptions("v3.1"));
    request = new MailjetRequest(Emailv31.resource)
    .property(Emailv31.MESSAGES, new JSONArray()
    .put(new JSONObject()
    .put(Emailv31.Message.FROM, new JSONObject()
    .put("Email", "mail@bsid.io")
    .put("Name", "NEU Rides"))
    .put(Emailv31.Message.TO, new JSONArray()
    .put(new JSONObject()
    .put("Email", emailID)
    .put("Name", nameVal)))
    .put(Emailv31.Message.SUBJECT, "Greetings from NEURides.")
    .put(Emailv31.Message.TEXTPART, "NEU Rides Verification Email")
    .put(Emailv31.Message.HTMLPART, "<h3>Dear "+ nameVal + ", Please Verify your email by clicking this link <a href='https://neurides.vercel.app/?email="+emailID+"'>Verify Email</a>!</h3><br />May the force be with you!")
    .put(Emailv31.Message.CUSTOMID, "NEURides")));
    response = client.post(request);
    System.out.println(response.getStatus());
    System.out.println(response.getData());
  }
}
