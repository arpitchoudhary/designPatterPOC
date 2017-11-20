package proxy;

public class ProxyImage implements Image {

    private final String fileName;
    Image highResImage;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void showImage() {
        highResImage = new HighResImage(fileName);
        highResImage.showImage();
    }
}
