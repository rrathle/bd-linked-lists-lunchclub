import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Comment this class appropriately.
 */
public class LunchClub {
    LinkedList<String> membersInLine;

    /**
     * Initializes the `LinkedList` called `membersInLine` to make it ready for members
     * to line up for lunch.
     */
    public LunchClub() {
        membersInLine = new LinkedList<>();
    }

    /**
     * Simulates someone entering the back of the line for lunch.
     * @param newMember - member to add.
     */
    public void addMemberToLine(String newMember) {
        membersInLine.addLast(newMember);
//        membersInLine.add(newMember); same thing but more clear

    }

    /**
     * Removes a person from the front of the lunch line to serve them food.
     */
    public void serveMember() {
        membersInLine.removeFirst();

    }

    /**
     * Simulates a group of people entering and adding to the back of the line.
     * @param newMembers - List of members to add.
     */
    public void addGroupToLine(List<String> newMembers) {
        membersInLine.addAll(newMembers);

    }

    /**
     * Returns the List of members representing the current state of the lunch line.
     * @return lunch line members LinkedList.
     */
    public List<String> getMembersInLine() {
        return membersInLine;
    }

}