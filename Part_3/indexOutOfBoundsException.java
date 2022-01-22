import java.util.ArrayList;

public class indexOutOfBoundsException {
    public static void main(String args[]){
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.get(-1);
    }
}
