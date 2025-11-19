abstract public class Landloard {
    private String name;
    private String ID;
    private String personnel; // Staff Member or a Student

    Landloard(){
        this("No Name", "************", "Unassigned");
    }
    Landloard(String name, String ID, String personnel){
        setName(name);
        setID(ID);
        setPersonnel(personnel);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setID(String ID){
        this.ID = ID;
    }
    public void setPersonnel(String personnel){
        this.personnel = personnel;
    }

    public String getName(){
        return name;
    }
    public String getID(){
        return ID;
    }
    public String getPersonnel(){
        return personnel;
    }
    public abstract boolean canAccessRooms(int roomNumber);

    @Override
    public String toString(){
        return "Name: " + getName() + " ,ID: " + getID() + " ,Personnel: " + getPersonnel();
    }

}
