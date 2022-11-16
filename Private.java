package PraktikumNr4.copy;

public class Private {
	
	
	
	
	
	 private String  maker ;
	 private  int  model  ;
	 
	  public Private() {
		   maker = "nuha" ;
		  model = 4;
		  System.out.println("ist falsch namme");
		  
	  }
	 
	 
	 
	 public void setmaker     (String  m) {
		 
		 
		 maker = m;
		 
		 
	 }
	 
	 public void setmodel (int  year) {
		
		 model = year; 
		 
		 
		 
	 }
	 
    public String getmaker() {
    	
    	return maker;
    }
     public int  getmodel() {
    	 
    	 return model ;
     }
}
