package ss16_io_text_file.bai_tap_2;

import sun.reflect.misc.FieldUtil;

import java.util.ArrayList;
import java.util.List;

public class NationMain {

    public static final String FILE_NAME = "D:\\codegym\\module_2\\baitap\\src\\ss16_io_text_file\\bai_tap_2\\nation.csv"

    public static void main(String[] args) {
        Nation nation1 = new Nation(24,"VN","Viet Nam");
        Nation nation2 = new Nation(14, "CB","Cu ba");
        Nation nation3 = new Nation(7,"NG","Nga");

        List<Nation> nationList = new ArrayList<>();
        nationList.add(nation1);
        nationList.add(nation2);
        nationList.add(nation3);

        String line = null;
        for (Nation nation: nationList  ) {
            line = nation.getId() +","  + nation.getCode()+"," +nation.getName();


            
        }
    }
}
