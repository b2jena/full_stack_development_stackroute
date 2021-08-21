package com.stackroute.oops;

/*
 This class is used to create voter object and execute methods on voter objects.
 This class is also used to create enum voterType object and return
 voterType classification based on age criteria of Voter.
 */
public class VoterService {

    /*
       This method returns Voter based on its parameters
    */
    public static Voter createVoter(String name, int age) {
        return new Voter(name, age);
        //return null;
    }

    /*
       This method returns enum `VoterType` classification based on the age criteria of Voter
     */
    public static VoterType getVoterDescription(Voter voter) {
        if(voter.getName()==null || voter.getAge()<=0){  //to avoid null pointer exception
            return VoterType.INVALID_VOTER;
        }
        else if(voter.getAgeCriteria().equals("ADULT")){
            return VoterType.VOTER_CAN_CAST_VOTE;
        }
        else if(voter.getAgeCriteria().equals("UNDERAGE")){
            return VoterType.VOTER_CANNOT_CAST_VOTE;
        }
        else{
            return VoterType.INVALID_VOTER;
        }
        //return null;
    }

}

