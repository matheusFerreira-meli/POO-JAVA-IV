public class Client {
    private static Integer autoIncrementId = 0;
    private Integer id;
    private String name;
    private String lastname;

    public Client(String name, String lastname) {
        this.id = autoIncrementId;
        this.lastname = lastname;
        this.name = name;
        autoIncrementId++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "{ id: " + id + ", name: " + name + ", lastname: " + lastname + " }";
    }
}
