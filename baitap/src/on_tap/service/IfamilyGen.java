package on_tap.service;

import on_tap.model.Family;

import java.util.List;

public interface IfamilyGen {
    void add(Family family);
    List<Family> getAll();
    boolean editFamily(Family updateFamily);
    boolean delete(int id);
}
