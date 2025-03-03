package question2;

public class Email extends Document{
    protected String sender;
    protected String recipient;
    protected String emailTitle;

    //CONSTRUCTORS
    //default
    public Email(){
        super();
        this.sender = "";
        this.recipient = "";
        this.emailTitle = "";
    }

    //parameterized
    public Email(String sender, String recipient, String emailTitle, String text){
        super(text);
        this.sender = sender;
        this.recipient = recipient;
        this.emailTitle = emailTitle;
    }

    //GETTERS AND SETTERS
    public String getSender(){
        return sender;
    }
    public void setSender(String sender){
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getEmailTitle() {
        return emailTitle;
    }
    public void setEmailTitle(String emailTitle) {
        this.emailTitle = emailTitle;
    }

    //METHOD
    public String toString(){
        return "sender: " + this.sender + "\nrecipient: " + this.recipient + "\nemailTitle: " + this.emailTitle +
                "\nContent: " + super.toString();
    }

}
