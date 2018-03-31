package Employee_Database;

public class Employee {

    private String name;
    private CompanyDoc currentDoc;

    public String getName() {
        return this.name;
    }

    public CompanyDoc getCurrentDoc() {
        return this.currentDoc;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setCurrentDoc(CompanyDoc newCurrentDoc) {
        this.currentDoc = newCurrentDoc;
        newCurrentDoc.setAuthor(this);
    }

    public void swapDocs(Employee otherEmployee) {
        CompanyDoc temp = new CompanyDoc();
        temp = this.getCurrentDoc();
        this.setCurrentDoc(otherEmployee.getCurrentDoc());
        otherEmployee.setCurrentDoc(temp);
    }
}
