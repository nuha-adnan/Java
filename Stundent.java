package PraktikumNr4.copy;

public class Stundent extends Person {

	int study_level;
	String specializtion;
	double GPA;

	public Stundent() {

	}

	public Stundent(String n, double a, String d, String nat, int s, String sp, double gpa) {
		super(n, a, d, nat);
		study_level = s;
		specializtion = sp;
		GPA = gpa;
	}
     public void setGPA (double GPA) {
    	  this.GPA =GPA;
    	 
     }
     public void setstudy_level (int study_level) {
   	  this.study_level = study_level;
   	 
    }
     public void setspecializtion (String specializtion) {
   	  this.specializtion = specializtion;
   	 
    }
      public  double getGPA() {
    	  return GPA;
      }
      public  int  getstudy_level() {
    	  return study_level;
      }
      public  String specializtion() {
    	  return specializtion;
      }
}
