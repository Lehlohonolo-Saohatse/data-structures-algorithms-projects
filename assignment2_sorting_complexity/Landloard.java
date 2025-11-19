abstract public class Landloard {
    private String name; // T(store)
    private String ID;  // T(store)
    private String personnel; // T(store)

    Landloard(){
        this("No Name", "************", "Unassigned"); // 3T(fetch) + 3T(store) + T(call) + T(this())
    }
    Landloard(String name, String ID, String personnel){
        setName(name);  // T(fetch) + T(store) + T(call) + T(setName())
        setID(ID);  // T(fetch) + T(store) + T(call) + T(setID())
        setPersonnel(personnel);  // T(fetch) + T(store) + T(call) + T(setPersonnel())
    }

    public void setName(String name){
        this.name = name;  // T(fetch) + T(store)
    }
    public void setID(String ID){
        this.ID = ID;  // T(fetch) + T(store)
    }
    public void setPersonnel(String personnel){
        this.personnel = personnel;   // T(fetch) + T(store)
    }

    public String getName(){
        return name;  // T(return) + T(fetch)
    }
    public String getID(){
        return ID;  // T(return) + T(fetch)
    }
    public String getPersonnel(){
        return personnel; // T(return) + T(fetch)
    }
    public abstract boolean canAccessRooms(int roomNumber);

    @Override
    public String toString(){
        return "Name: " + getName() + " ,ID: " + getID() + " ,Personnel: " + getPersonnel();
    } // T(return) + 6T(fetch) + 5T(+) + 3T(call) + T(getName()) + T(getID()) + T(getPersonnel()) + 5T+

    // Total: 12 T(store) + 18 T(fetch) + 7 T(call) + 4 T(return) + 7 T(fx) + 5T+
}
