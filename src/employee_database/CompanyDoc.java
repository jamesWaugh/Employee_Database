package Employee_Database;

public class CompanyDoc {

    private String title;
    private int length;
    private Employee author;

    public String getTitle() {
        return this.title;
    }

    public int getLength() {
        return this.length;
    }

    public Employee getAuthor() {
        return this.author;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }

    public void setAuthor(Employee newAuthor) {
        this.author = newAuthor;
    }

    public CompanyDoc() {
        this.title = "Default Company Document Name";
        this.length = 100;
    }

    public CompanyDoc(String newTitle) {
        this.title = newTitle;
    }

    public String toString() {
        return this.getTitle() + " (" + this.getLength() + ")";
    }

    public boolean longer(CompanyDoc temp) {
        if (this.getLength() > temp.getLength()) {
            return true;
        } else {
            return false;
        }
    }
}
