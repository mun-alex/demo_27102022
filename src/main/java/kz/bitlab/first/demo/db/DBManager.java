package kz.bitlab.first.demo.db;

import kz.bitlab.first.demo.models.Magazine;

import java.util.ArrayList;
import java.util.List;

public class DBManager {

    static List<Magazine> magazineList = new ArrayList<>();
    static {
        magazineList.add(new Magazine(0L, "IT-Magazine-1", "description"));
        magazineList.add(new Magazine(1L, "IT-Magazine-2", "description"));
        magazineList.add(new Magazine(2L, "IT-Magazine-3", "description"));
        magazineList.add(new Magazine(3L, "IT-Magazine-4", "description"));
    }

    static Long id = 4L;

    public static List<Magazine> getMagazineList() {
        return magazineList;
    }

    public static void addMagazine(Magazine magazine) {
        magazine.setId(id++);
        magazineList.add(magazine);
    }
}
