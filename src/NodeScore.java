public class NodeScore {
    private int Key;
    private ScoreRegistry data;
    private NodeScore right;
    private NodeScore left;


    public NodeScore(ScoreRegistry data) {
        this.data = data;
        this.Key= data.getScore();
    }

    public void setKey(int key) {
        Key = key;
    }

    public void setData(ScoreRegistry data) {
        this.data = data;
    }

    public int getKey() {
        return Key;
    }

    public ScoreRegistry getData() {
        return data;
    }

    public void setRight(NodeScore right) {
        this.right = right;
    }

    public void setLeft(NodeScore left) {
        this.left = left;
    }

    public NodeScore getRight() {
        return right;
    }

    public NodeScore getLeft() {
        return left;
    }
}
