public class Staff extends Landloard implements Comparable<Landloard> {
    private String department;  // T(store)

    Staff(){
        super("No Name", "************", "Staff Member");  // 3T(fetch) + 3T(store) + T(call) + T(super())
        this.department = "Unassigned";  // T(fetch) + T(store)
    }
    Staff(String name, String ID, String personnel, String department){
        super(name, ID, personnel);  // 3T(fetch) + 3T(store) + T(call) + T(super())
        setDepartment(department);  // T(fetch) + T(store) + T(call) + T(setDep())
    }

    public void setDepartment(String department){
        this.department = department; // T(fetch) + T(store)
    }

    public String getDepartment(){
        return department;  // T(return) + T(fetch)
    }
    public boolean canAccessRooms(int roomNumber){
        return true;  // T(return) + T(fetch)
    }

    public int compareTo(Landloard other){
        return this.getPersonnel().compareTo(other.getPersonnel()); // T(return) + T(fetch) + 3T(call) + T(store) + 2T(getPersonnel()) + T(compareTo())
    }


    @Override
    public String toString(){
        return super.toString() + " , Department: " + getDepartment(); // T(return) + 3T(fetch) + 2T(+)
    }

    // Total: 11T(store) + 15T(fetch) + 6T(call) + 6T(fx) + 4T(return) + 2T+
}
