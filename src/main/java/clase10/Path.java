package clase10;

public enum Path {

    INPUT_FOLDER("D:\\Java\\alumnos.txt"), OUTPUT_FOLDER("D:\\Java\\");

    private String path;

    Path(String path) {
        this.path = path;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
