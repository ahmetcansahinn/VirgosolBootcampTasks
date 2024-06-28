package Day6.Task16;

public class Home {
    private String buildType;

    public Home(String buildType) {
        this.buildType = buildType;
        System.out.println("Ev Constructor'ı çalıştı.");

    }

    public String getBuildType() {
        return buildType;
    }
}
