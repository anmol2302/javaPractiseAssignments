import java.text.DecimalFormat;

class Member {
    private String MembersName;
    private int MembersAge;
    private double MembersSalry;

    public Member(String MembersName, int MembersAge, double MembersSalry) {

        this.MembersName = MembersName;
        this.MembersAge = MembersAge;
        this.MembersSalry = MembersSalry;
    }

    public String getMembersName() {
        return MembersName;
    }

    public int getMembersAge() {
        return MembersAge;
    }

    public String getMembersSalry() {
        double value=MembersSalry;
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(value);

    }


}


public class MemberVariable {

public String printValue(String MemberName,int MemberAge,double MemberSalry){
       Member object=new Member(MemberName,MemberAge,MemberSalry);
       return ("Members Name: "+object.getMembersName()+"\nMembers Age: "+object.getMembersAge()+"\nMembers Salry: "+object.getMembersSalry());
}

}
