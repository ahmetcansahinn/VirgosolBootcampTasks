package Day6.Task20;

public class Home {

    private String buildType;

    public Home(String buildType) {
        this.buildType = buildType;
        System.out.println("Ev constructor'ı çalıştı.");

    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }
}
