package Duke.Tasks;

/**
 * Represents a Deadline in the task list.
 */
public class Deadlines extends Task {
    protected String due;
    public Deadlines(String description, String due) {
        super(description,"Deadlines");
        this.due = due;
    }
    public String getDescription() {
        return "[D]" + super.getDescription() + " (" + due +")";
    }

    public String getDueDate(){
        return due;
    }
}