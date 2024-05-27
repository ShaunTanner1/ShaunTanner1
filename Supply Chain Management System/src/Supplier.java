public class Supplier {
    private String id;
    private String name;
    private String contactInfo;

    public Supplier(String id, String name, String contactInfo) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    @Override
    public String toString() {
        return "Supplier [id=" + id + ", name=" + name + ", contactInfo=" + contactInfo + "]";
    }
}
