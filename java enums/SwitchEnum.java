enum Status {
    // Status is class
    RUNNING, FAILED, PENDING, SUCCESS;// and all these are obj as constants.
}

public class SwitchEnum {
    public static void main(String[] args) {

        Status s = Status.SUCCESS;

        switch (s) {
            case RUNNING:
                System.out.println("ALL GOOD");
                break;
            case FAILED:
                System.out.println("try again");
                break;
            case PENDING:
                System.out.println("please wait");
                break;
            default:
                System.out.println("Done");
        }

    }

}
