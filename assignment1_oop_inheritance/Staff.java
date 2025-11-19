public class Staff extends Landloard {
    private String department;

    Staff(){
        super("No Name", "************", "Staff Member");
        this.department = "Unassigned";
    }
    Staff(String name, String ID, String personnel, String department){
        super(name, ID, personnel);
        setDepartment(department);
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }
    public boolean canAccessRooms(int roomNumber){
        return true;
    }

    @Override
    public String toString(){
        return super.toString() + " , Department: " + getDepartment();
    }
}
