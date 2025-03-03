package question2;

public class Document {
    protected String text;

    //CONSTRUCTORS
    //default
    public Document(){
        this.text = "";
    }

    //parameterized
    public Document(String text){
        this.text = text;
    }

    //GETTERS AND SETTERS
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }

    //method
    public String toString(){
        return text;
    }
}
