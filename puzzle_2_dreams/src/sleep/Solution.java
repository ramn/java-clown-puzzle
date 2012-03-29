import sleep.Sleeper;
import dream.Dream;
 
public class Solution {
    public static void main(String[] args) {
        if (new Sleeper().enter(new Dream()) != 0) {
            // The goal is to reach this line
            System.out.println("Am I still dreaming?");
        }
    }
}
