package ss16_io_text_file.bai_tap_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Nation {
    private  int id;
    private String code;
    private String name;

    public Nation(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nation(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }
}

