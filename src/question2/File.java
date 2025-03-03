package question2;

public class File extends Document{
    protected String pathName;

    //CONSTRUCTORS
    //default
    public File(){
        super();
        this.pathName = "";
    }

    //parameterized
    public File(String pathName, String text){
        super(text);
        this.pathName = pathName;
    }

    //GETTERS AND SETTERS
    public String getPathName(){
        return pathName;
    }
    public void setPathName(String pathName){
        this.pathName = pathName;
    }

    public String toString(){
        return "Path: " + this.pathName + "\nContent: " + super.toString();
    }
}
