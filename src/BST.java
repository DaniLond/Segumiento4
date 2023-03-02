public class BST {

    private NodeScore rootScore;
    private NodeUsername rootUser;

    public void addScoreRegister(String username, int score){
        ScoreRegistry scoreRegistry= new ScoreRegistry(username , score);
        NodeScore nodeScore= new NodeScore(scoreRegistry);
        NodeUsername nodeUsername= new NodeUsername(scoreRegistry);
        addScore(nodeScore);
        addName(nodeUsername);
    }
    public void addName(NodeUsername nodeUsername){
        if (rootUser == null) {
            rootUser = nodeUsername;
        } else {
            addName(rootUser , nodeUsername);
        }
    }

    private void addName(NodeUsername current, NodeUsername nodeUsername){
        // Ejemplo A comparado con S da negativo
        if(nodeUsername.getKey().compareTo(current.getKey()) < 0){
            // meter a la izquierda
            if (current.getLeft() == null){
                current.setLeft(nodeUsername);
            }else{
                addName(current.getLeft(), nodeUsername);
            }
        }else if (nodeUsername.getKey().compareTo(current.getKey()) > 0){
            // meter a la derecha
            if (current.getRight() == null){
                current.setRight(nodeUsername);
            }else {
                addName(current.getRight() , nodeUsername);
            }
        }else {
            //No hacer nada (si son iguales)
            return;
        }
    }

    public void addScore(NodeScore nodeScore){
        if(rootScore == null){
            rootScore= nodeScore;
        }else {
            addScore(rootScore , nodeScore);
        }
    }

    private void addScore(NodeScore current, NodeScore nodeScore){
        if(nodeScore.getKey() > current.getKey()){
            // meter a la izquierda
            if (current.getLeft() == null){
                current.setLeft(nodeScore);
            }else{
                addScore(current.getLeft(), nodeScore);
            }
        }else if (nodeScore.getKey() < current.getKey()){
            // meter a la derecha
            if (current.getRight() == null){
                current.setRight(nodeScore);
            }else {
                addScore(current.getRight() , nodeScore);
            }
        }else {
            //No hacer nada (si son iguales)
            return;
        }
    }

    private ScoreRegistry search(NodeScore current, int score){
        if(current == null){
            System.out.println("Not found");
            return null;
        }
        if(current.getKey() == score){
            return current.getData();
        }
        if(score > current.getKey()){
            return search(current.getLeft() , score);
        }else {
            return search(current.getRight(), score);
        }
    }

    public ScoreRegistry search(int goal){
        return search(rootScore , goal);
    }

    public void alphabeticalOrder(){
        alphabeticalOrder(rootUser);
    }

    private void alphabeticalOrder(NodeUsername current){
        if (current== null){
            return;
        }
        alphabeticalOrder(current.getLeft());
        System.out.println(current.getData().getScore() + " "+ current.getKey());
        // Se va al subarbol de la derecha
        alphabeticalOrder(current.getRight());
    }

    public void top5(){
        top5(rootScore);
    }

    private void top5(NodeScore current){
        if (current== null){
            return;
        }
        top5(current.getLeft());
        System.out.println(current.getKey() + " "+ current.getData().getName());
        // Se va al subarbol de la derecha
        top5(current.getRight());
    }
}
