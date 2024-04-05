public class MasterStudent extends Student implements ConferenceScoreBehaviour {
    int NumberOfConf;
    public MasterStudent(int id, float mid, float fin,int NumberofConf) {
        super(id, mid, fin);
        this.NumberOfConf=NumberofConf;
    }

    @Override
    public float conferenceScore() {
        return NumberOfConf*5;
    }

    @Override
    public float computeTotalScore() {
        return computeBaseScore()+conferenceScore();
    }
}






