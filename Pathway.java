package Anjali;

import java.awt.*;
import java.lang.*;
import java.util.ArrayList;
public class Pathway {
    public static boolean getPaths(int x, int y) {
        ArrayList<Point> current_path = new ArrayList<Point>();
        Point p = new Point(x, y);
        current_path.add(p);
        if (0 == x && 0 == y)
            return true;
        boolean success = false;
        if (x >= 1 && is_free(x - 1, y)) { // Try right
            success = getPaths(x - 1, y); // Free! Go right
            }
         if (!success && y >= 1 && is_free(x, y - 1)) { // Try down
             success = getPaths(x, y - 1); // Free! Go down
             }
        if (!success) {
            current_path.remove(p); // Wrong way!
            }
        return success;
    }

    public static boolean is_free(int i, int y) {
        getPaths(3,4);
        return true;
    }
    public static void main(String[] args) {
        getPaths(2,4);
        is_free(4,6);
    }
}
