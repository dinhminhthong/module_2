package bai_tap_no.ss_17.service.imp;

import java.io.IOException;
import java.util.List;

public interface IFileService <O>{
    List<O> readFileBinary(String path) throws ClassNotFoundException;

    void writeFileBinary(String path, List<O> products) throws IOException;
}
