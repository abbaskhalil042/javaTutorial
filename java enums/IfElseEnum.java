enum Status {
    // Status is class
    RUNNING, FAILED, PENDING, SUCCESS;// and all these are obj as constants.
}

public class IfElseEnum {
    public static void main(String[] args) {

        Status s = Status.SUCCESS;

        if (s == Status.RUNNING)
            System.out.println("all good");
        else if (s == Status.FAILED)
            System.out.println("try again");
        else if (s == Status.PENDING)
            System.out.println("please wait");
        else
            System.out.println("done");
    }
}
