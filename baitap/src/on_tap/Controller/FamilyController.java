package on_tap.Controller;

import on_tap.model.Family;
import on_tap.service.IfamilyGen;

import java.util.List;

public class FamilyController implements IfamilyGen {
    IfamilyGen Myfamilygen = new FamilyController();

    @Override
    public void add(Family family) {

    }

    @Override
    public List<Family> getAll() {
        return null;
    }

    @Override
    public boolean editFamily(Family updateFamily) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
