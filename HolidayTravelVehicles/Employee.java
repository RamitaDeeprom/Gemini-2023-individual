public class Employee{
    private int StaffID;
    private String StaffName;

    public Employee(){

    }

    public Employee(int StaffID, String StaffName){
        this.StaffID = StaffID;
        this.StaffName = StaffName;
    }

    public void setStaffName(String staffName){
        this.StaffName = staffName;
    }

    public void setStaffName(String staffName){
        this.StaffName = staffName;
    }

    public int getStaffID(){
        return this.StaffID.toString();
    }

    public String getStaffName(){
        return this.StaffName;
    }
}