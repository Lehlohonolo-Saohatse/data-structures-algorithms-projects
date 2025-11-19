import java.util.Arrays;

public class TestApplication {
    public static void main(String[] args){
        //Assignment 1
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
        } // O(n^2)

        //Assignment 2:
        //Array To Store the random generated Instances of the subclasses
        Landloard [] randomGeneratedInstances = new Landloard[5];

        for(int i = 0; i < randomGeneratedInstances.length; i++ ){
            //Random generating number between 0 and 1, since i have two subclasses
            int randomNumber = (int) (Math.random() * 2);

            if(randomNumber == 0){
                randomGeneratedInstances[i] = new Staff("RandomGenerated", "1", "Staff", "TestingTheApplication");
            } else if(randomNumber == 1)
                randomGeneratedInstances[i] = new Students("RandomGenerated", "2", "Student", 0);
            //System.out.println(randomNumber); //testing random generated numbers
        } // O(n)

        System.out.println("Random Generated Feedback: ");

        //output before sorting
        for(Landloard inst: randomGeneratedInstances) {
            System.out.println(inst);
        } // O(n)

        //Sorting the array
        Arrays.sort(randomGeneratedInstances);
        System.out.println();

        System.out.println("After Sorting: ");
        //Output after sorting
        for(Landloard inst: randomGeneratedInstances) {
            System.out.println(inst);
        }  //O(n)
        System.out.println();

        System.out.println("Time Complexity Analysis of all classes: ");
        System.out.println("***Classes***|>" + "****Tau Notation****|>" + "*****Simplified Notation*****|>" + "******Asymptotic Analysis******|");
        System.out.println("1. Landloard  |" + " 12T(store) + 18T(fetch) + 7T(call) + 4T(return) + 7T(fx) + 5T+ |" + " 48 |" + " O(1) |");
        System.out.println("2. Staff  | 11T(store) + 15T(fetch) + 6T(call) + 6T(fx) + 4T(return) + 2T+ | 44  | O(1)");
        System.out.println("3. Students  | 9T(store) + 4T(return) + 2T(+) + T< + 8T(call) + 16T(fetch) + 8T(fx) | 58 | O(1)");
        System.out.println("4. TestApplication  | O(n^2)");

    }
}
