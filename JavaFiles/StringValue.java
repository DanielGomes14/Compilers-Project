package JavaFiles;

public class StringValue extends Value {

    private static StringType type = new StringType();
    private String val;

    public StringValue(String val) {
        setStringValue(val);
    }

    @Override
    public Type type() {
        return type;
    }

    public String stringValue() {
        return val;
    }

    public void setStringValue(String val) {
        this.val = val;
    }

    public String toString() {
        return val;
    }

}