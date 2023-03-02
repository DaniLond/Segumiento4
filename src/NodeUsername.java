public class NodeUsername {
    private String key;
    private ScoreRegistry data;
    private NodeUsername right;
    private NodeUsername left;


    public NodeUsername(ScoreRegistry data) {
        this.data = data;
        this.key= data.getName();
    }

    public String getKey() {
        return key;
    }

    public ScoreRegistry getData() {
        return data;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setData(ScoreRegistry data) {
        this.data = data;
    }

    public void setRight(NodeUsername right) {
        this.right = right;
    }

    public void setLeft(NodeUsername left) {
        this.left = left;
    }

    public NodeUsername getRight() {
        return right;
    }

    public NodeUsername getLeft() {
        return left;
    }
}
