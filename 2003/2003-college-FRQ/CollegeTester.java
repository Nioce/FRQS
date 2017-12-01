package apcs_array_test;


/** Basic tester used to test the values while also making the list of colleges*/
public class CollegeTester
{
    /***Makes colleges and puts them into the college group, and then calls functions in the other class files*/
    public static void main(String[] args){
        College c1 = new College("Colgate", "Northeast", 27025);
        College c2 = new College("Duke University", "Southeast", 26000);
        College c3 = new College("Kalamazoo College", "MidWest",19764);
        College c4 = new College("Stanfords University", "West",25917);
        College c5 = new College("Flordia International University", "Southeast",10800);
        College c6 = new College("Dartmouth College", "Northeast",27764);
        College c7 = new College("Spelman College", "Southeast",11455);
        
        College[] all = {c1, c2, c3, c4, c5, c6, c7};
        
        CollegeGroup group = new CollegeGroup(all);
        
        group.updateTuition("Colgate", 26000);
        
        
        College[] matches = group.getCollegeList("Northeast", 10000, 28000);
        for(int n=0; matches.length>n;n++){
            System.out.println(matches[n].toString());
        }
    }
}
