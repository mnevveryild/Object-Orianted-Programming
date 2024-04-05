public class BachelourStudent extends Student implements ProjectScoreBehavior{

    BachelourStudent(int id,float mid,float fin){
        super(id,mid,fin);

    }

    @Override
    public float projectScore() {
        return 20;
    }

    @Override
    float computeTotalScore() {
        return computeBaseScore()
                + projectScore();
    }


}
