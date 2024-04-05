public class PhDStudent extends MasterStudent implements  ArticleScoreBehaviour{
    int numberOfArticles;

    public PhDStudent(int id, float mid, float fin, int NumberofConf, int numberOfArticles) {
        super(id, mid, fin, NumberofConf);
        this.numberOfArticles = numberOfArticles;
    }

    @Override
    public float articleScore() {
        return numberOfArticles*8;

    }

    @Override
    public float computeTotalScore() {
        return super.computeTotalScore()+articleScore();
    }
}
