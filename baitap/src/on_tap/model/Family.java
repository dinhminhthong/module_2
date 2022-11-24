package on_tap.model;

public class Family {
    private int id;
    private boolean sex;
    private String name;

    public Family(int id, boolean sex, String name) {
        this.id = id;
        this.sex = sex;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Family{" +
                "id=" + id +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                '}';
    }
}
