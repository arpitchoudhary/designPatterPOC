package proxy;

public class HighResImage implements Image {

    public HighResImage(String fileName) {
        loadFile(fileName);
    }

    private void loadFile(String fileName) {
        System.out.println("Loading file");
    }

    @Override
    public void showImage() {

        System.out.println("Rendering Image");

    }
}
