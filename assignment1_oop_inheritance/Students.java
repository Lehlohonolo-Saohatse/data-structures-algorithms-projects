public class Students extends Landloard {
    private int assignedRoom;

    Students(){
        this("No Name", "************", "Unassigned", 0);
    }
    Students(String name, String ID, String personnel, int assignedRoom){
        super(name, ID, personnel);
        setAssignedRoom(assignedRoom);
    }

    public int getAssignedRoom(){
        return assignedRoom;
    }

    public void setAssignedRoom(int assignedRoom){
        this.assignedRoom = assignedRoom;
    }

    public boolean canAccessRooms(int roomNumber){
        return roomNumber == assignedRoom;
    }

    @Override
    public String toString(){
        return super.toString() + ", Assigned Room: " + (assignedRoom == 0 ? "Not Assigned" : getAssignedRoom());
    }

}
