package HW_2;

public interface MyIf {
    int getUserID();
    default int getCat(){
        return 1;
    }
    static int getOwner(){
        return 0;
    }
}
