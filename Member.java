import java.util.*;
public class Member {
    private int memberId;
    private String memberName;
    public static int memberCount;
    public void setMemberId (int memberId){
        this.memberId=memberId;
    }
    public int getMemberId(){
        return memberId;
    }
    public void setMemberName(String memberName){
        this.memberName=memberName;
    }
    public String getMemberName(){
        return memberName;
    }

    public Member (){
        memberCount++;
        this.memberId=(int) (Math.random()*250);
    }

    public Member (String memberName , int memberId){
        this.memberName=memberName;
        this.memberId=(int) (Math.random()*250);
        memberCount++;

    }

    public void displayInfo(){
        System.out.println("Member Name : "+memberName);
        System.out.println("Member Id : "+memberId);
        System.out.println("=======================");
    }
}
