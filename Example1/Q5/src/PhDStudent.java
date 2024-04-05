public class PhDStudent extends MasterStudent implements ArticleScoreBehavior{

    int numberOfArticles;

    PhDStudent(int id,float mid,float fin,int conf,int numberOfArticles){
        super(id,mid,fin,conf);
        this.numberOfArticles=numberOfArticles;

    }

    @Override
    public float articleScore() {
        return (numberOfArticles*8);

    }

    float computeTotalScore(){
        return computeTotalScore()
                + articleScore();

    }


}
