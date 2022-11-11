package Duke.Tasks;

/**
 * Represents an Event in the task list.
 */
public class Events extends Task{
    protected String due;
    public Events(String description, String due) {
        super(description,"Events");
        this.due = due;
    }
    public String getDescription() {
        return "[E]" + super.getDescription() + " (" + due +")";
    }
    public String getDueDate(){
        return due;
    }
}
