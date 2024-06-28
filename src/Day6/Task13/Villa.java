package Day6.Task13;

public class Villa extends Home {


    public Villa(String buildType) {
        super(buildType);
    }

    public void categoryOfBuild() {
        System.out.println("Yapı Tipi: " + buildType);
    }


}
