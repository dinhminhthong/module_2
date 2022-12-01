package ss16_io_text_file.bai_tap_2;

import sun.reflect.misc.FieldUtil;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.List;

public class NationMain {

    public static final String FILE_NAME = "D:\\codegym\\module_2\\baitap\\src\\ss16_io_text_file\\bai_tap_2\\nation.csv";

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
            FileUtils.writeFile(FILE_NAME, line);

        }
        List<String> list = FileUtils.readFile(FILE_NAME);
        System.out.println(list);

      String[] lineSplit = list.get(0).split(",");
      String[] lineSplit1 = list.get(1).split(",");
      String[] lineSplit2 = list.get(2).split(",");
       Nation nation = new Nation();
       nation1  = new Nation(Integer.parseInt(lineSplit[0]),lineSplit[1],lineSplit[2]);
       nation2 = new Nation(Integer.parseInt(lineSplit1[2]),lineSplit1[3],lineSplit1[4]);
       nation3 = new Nation(Integer.parseInt(lineSplit2[4]),lineSplit2[5],lineSplit2[6]);
//        System.out.println(nation.getCode()+","+ nation.getName()+","+nation.getId()+",");
        Nation.nation(nation1.getId(), nation1.getName(), nation1.getCode());
        Nation.nation(nation2.getId(), nation2.getName(), nation2.getCode());
        Nation.nation(nation3.getId(), nation3.getName(), nation3.getCode());



    }
}



