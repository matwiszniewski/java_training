public class ReadOnly {

    private String name = "Bartek";

    //getter
    public String getName() {
        return name + "jest ok";
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

}
