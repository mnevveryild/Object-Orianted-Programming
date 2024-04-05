public class MasterStudent extends Student implements ConferenceScoreBehaviour{
    int numberOfConf;

    public MasterStudent(int id,float mid,float fin, int numberOfConf){
        super(id,mid,fin);
        this.numberOfConf=numberOfConf;
    }

    @Override
    public float conferenceScore() {
        return (float) (numberOfConf * 5);
    }

    @Override
    float computeTotalScore() {
        return computeBaseScore()
                + conferenceScore();
    }


}
