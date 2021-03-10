class Voter extends Person{
    String voterID;
    String pollingStation;
    String homeTown;
    String candidate;
    String password;
    String votedList;
    String viewChoice;

    public Voter(String voterID, String pollingStation, String homeTown, String candidate, String password, String votedList, String viewChoice,String name, String dateofBirth, String gender, int age){
        super(name,dateofBirth,gender,age);
        this.voterID = voterID;
        this.pollingStation = pollingStation;
        this.homeTown = homeTown;
        this.candidate = candidate;
        this.password = password;
        this.votedList = votedList;
        this.viewChoice = viewChoice;
    }

    // public String getDistrictName(){
    //     return "1";
    // }

    public String getName(){
        return super.getName();
    }

    public String credentials(){
        return "dummy0";
    }


}
