public class Test {
    private String testStr = "";

    // Getter
    public String getTestStr() {
        if (hasPermission()) {
            return testStr;
        }
        return "Sorry, no permission!";
    }
    // Setter
    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    private boolean hasPermission() {
        return true;
    }
}
