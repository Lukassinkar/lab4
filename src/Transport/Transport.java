package Transport;

public class Transport implements TransportInterface {
    private String type;
    private boolean engine;
    private int releaseDate;

    public Transport(String type, boolean engine, int releaseDate) {
        this.type = type;
        this.engine = engine;
        this.releaseDate = releaseDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String toString() {
        return type + " " + engine + " " + releaseDate;
    }
}
