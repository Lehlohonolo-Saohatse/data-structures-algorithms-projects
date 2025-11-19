public class TestApplication {
    public static void main(String[] args){
        Landloard[] residents = new Landloard[6];
        residents [0] = new Staff("Thabang", "9602166473828", "Staff", "Manager");
        residents [1] = new Staff("Didi", "9802014873620", "Staff", "Reception");
        residents [2] = new Staff();
        residents [3] = new Students("Joyce", "0408249738923", "Student", 001);
        residents [4] = new Students("Thabo", "0104117533829", "Student", 003);
        residents [5] = new Students();

        System.out.println("Landloard's Overview: ");
        System.out.println();

        System.out.println("*Calling the toString Implicicly so below, at least 1 staff and 1 student: ");
        System.out.println(residents[0]);
        System.out.println(residents[4]);
        System.out.println(residents[2]);
        System.out.println();
        System.out.println("*Calling the toString Explicicly so below, at least 1 staff and 1 student: ");
        System.out.println(residents[1].toString());
        System.out.println(residents[3].toString());
        System.out.println(residents[5].toString());
        System.out.println();

        //testing polymorphism using the common abstract method 'canAccessRoom()':
        int[] rooms = {001, 002, 003, 004};
        System.out.println("*All residents and room access:");

        for (int i = 0; i < residents.length; i++) {
            Landloard resident = residents[i];
            System.out.println(resident);

            for (int j = 0; j < rooms.length; j++) {
                int room = rooms[j];
                System.out.println("Can access Room " + room + ": " + resident.canAccessRooms(room));
            }
            System.out.println();
        }
    }
}
