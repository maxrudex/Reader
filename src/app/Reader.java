package app;

import java.util.Date;

public class Reader {
    private int readerID;
    private String readerName;
    private String faculty;
    private Date dateOfBirth;
    private int phoneNumber;

    public Reader (int readerID, String readerName) {
        this.readerID = readerID;
        this.readerName = readerName;

    }

    public Reader (int readerID, String readerName, String faculty, Date dateOfBirth, int phoneNumber) {
        this.readerID = readerID;
        this.readerName = readerName;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }


    public void takeBook (int takenBookNumber) {
        System.out.println(readerName + " взял(-а) " + takenBookNumber + " книг(-и)");
    }
    public void takeBook (String[] takenBookNames)  {
        System.out.print(readerName + " взял(-а): ");
        for (int i=0; i<takenBookNames.length-1;i++)  {
            System.out.print(takenBookNames[i] + ", ");
        }
        System.out.println(takenBookNames[takenBookNames.length-1]);
    }
    public void takeBook (Book[] takenBooks) {
        System.out.print(readerName + " взял(-а): ");
        for (int i=0; i<takenBooks.length;i++)  {
            System.out.println(takenBooks[i].getBookName() + ", " + takenBooks[i].getAuthor());
        }
    }
    public void returnBook (int returnedBookNumber) {
        System.out.println(readerName + " вернул(-а) " + returnedBookNumber + " книг(-и)");
    }
    public void returnBook (String[] returnedBookNames)  {
        System.out.print(readerName + " вернул(-а): ");
        for (int i=0; i<returnedBookNames.length-1;i++)  {
            System.out.print(returnedBookNames[i] + ", ");
        }
        System.out.println(returnedBookNames[returnedBookNames.length-1]);
    }
    public void returnBook (Book[] returnedBooks) {
        System.out.print(readerName + " вернул(-а): ");
        for (int i=0; i<returnedBooks.length;i++)  {
            System.out.println(returnedBooks[i].getBookName() + ", " + returnedBooks[i].getAuthor());
        }
    }
}
