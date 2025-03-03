package question2;

import javax.print.Doc;

public class Main {

    public static boolean containsKeyword(Document docObject, String keyword){
        if(docObject.toString().indexOf(keyword,0) >= 0)
            return true;
        return false;
    }
    public static void main(String[] args) {

        Document email1 = new Email("mai", "pai", "hbd", "wish you a hbd");
        Document email2 = new Email("mark", "patrick", "wassup", "how is you");
        Document email3 = new Email("papa", "mama", "grocery", "don't forget to buy eggs");

        Document file1 = new File("this document is useless", "hello world");
        Document file2 = new File("this is boss speaking", "im cooked");
        Document file3 = new File("what is this", "lalalalala");


        System.out.println(email1.toString());
        System.out.println("Email 1 contains 'you': " + containsKeyword(email1, "you") +"\n");
        System.out.println(email2.toString());
        System.out.println("Email 2 contains 'you': " + containsKeyword(email2, "you") + "\n");
        System.out.println(email3.toString());
        System.out.println("Email 3 contains 'hello': " + containsKeyword(email3, "hello") + "\n");
        System.out.println(file1.toString());
        System.out.println("File 1 contains 'useless': " + containsKeyword(file1, "useless") + "\n");
        System.out.println(file2.toString());
        System.out.println("File 2 contains 'boss': " + containsKeyword(file2, "boss") + "\n");
        System.out.println(file3.toString());
        System.out.println("File 3 contains 'no': " + containsKeyword(file3, "no"));

    }
}
