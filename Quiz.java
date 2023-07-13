class student {
    private String Name;
    private int ID;
    private int admissionYear;
    private Double GPA;

    public student(int ID, String name, int admissionYear, double GPA) {
        this.ID = ID;
        this.Name = name;
        this.admissionYear = admissionYear;
        this.GPA = GPA;
    }

    student(String Newname){
        this.Name = Newname;
    }
    student(String Newname, int NewID){
        this.ID = NewID;
    }
    student(int NewadmissionYear){
        this.admissionYear = NewadmissionYear;
    }
    student(Double NewGPA){
        this.GPA = NewGPA;
    }
    student(String Newname, int NewID, int admissionYear,Double GPA){
    }
    public void ShowDetails() {
        System.out.println("Name" + this.Name);
        System.out.println("ID" + this.ID);
        System.out.println("admissionYear" + this.admissionYear);
        System.out.println("GPA" + this.GPA);
    }
    public class Quiz {
        public static void main(String[] args) {
            Quiz S1 = new Quiz();
            S1.Name = "tum";
            S1.ID = "01";
            S1.admissionYear = "2565";
            S1.GPA = "3.1";
            S1.ShowDetails();
        }
    }
}