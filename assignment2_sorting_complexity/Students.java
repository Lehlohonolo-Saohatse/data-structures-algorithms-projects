public class Students extends Landloard implements Comparable<Landloard> {
    private int assignedRoom;  // T(store)

    Students(){
        this("No Name", "************", "Unassigned", 0);  // 3T(fetch) + 3T(store) + T(call) + T(this())
    }
    Students(String name, String ID, String personnel, int assignedRoom){
        super(name, ID, personnel);  // 3T(fetch) + 3T(store) + T(call) + T(super())
        setAssignedRoom(assignedRoom);  // T(fetch) + T(store) + T(call()) + T(setAssignedRoom())
    }

    public int getAssignedRoom(){
        return assignedRoom;  // T(return) + T(fetch)
    }

    public void setAssignedRoom(int assignedRoom){
        this.assignedRoom = assignedRoom;  // T(fetch) + T(store)
    }

    public boolean canAccessRooms(int roomNumber){
        return roomNumber == assignedRoom;  // T(return) + 2T(fetch) + T(<)
    }


    public int compareTo(Landloard other){
        return this.getPersonnel().compareTo(other.getPersonnel()); // T(return) + T(fetch) + 3T(call) + T(store) + 2T(getPersonnel()) + T(compareTo())
    }

    @Override
    public String toString(){
        return super.toString() + ", Assigned Room: " + (assignedRoom == 0 ? "Not Assigned" : getAssignedRoom());
    }  // T(return) + 2T(call) + 2T(+) + T< + 4T(fetch) + T(getAssignedRoom) + T(toString)

    // Total: 9T(store) + 4T(return) + 2T(+) + T< + 8T(call) + 16T(fetch) + 8T(fx)

}
