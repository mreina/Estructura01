package code;

public class Estructura {
	
	private String cadena01, cadena02, cadena03, cadena04;
	
     public Estructura() {
		// TODO Auto-generated constructor stub
    	 this.cadena01="Tres, ";
    	 this.cadena02="Tristes, ";
    	 this.cadena03="Tigres, ";
    	 this.cadena04="TresTistres, ";
	}
     
     public void proceso() {
    	 int i=1;
    	 boolean bandera=false;
    	 do {
	    	for(int j=0; j<11 ; j++) {
	    		if(i%3==0 && i%5==0 && i%7==0) {
	    			System.out.print("TresTistresTigres, ");
	    			bandera=true;
	    		}
	    		else {
	    			if(i%3==0 && i%7==0) {
	    				System.out.print("TresTigres, ");
	    				bandera=true;
	    			}
	    			else {
	    				if(i%7==0) {
			    			 System.out.print(cadena03);
			    			 bandera=true;
			    		}
	    			}
		    		if(i%3==0 && i%5==0) {
		    			System.out.print("TresTistres, ");
		    			bandera=true;
		    		}
		    		else {
			    		 if(i%5==0) {
			    			 System.out.print(cadena02);
			    			 bandera=true;
			    		 }
		    		}
	    		}
	    		 if(!bandera) {
	    			 if(i%3==0){
		    			 System.out.print(cadena01);
		    		 }
	    			 else {
	    				 System.out.print(i + ", ");
	    			 }
	    		 }
	    		 bandera=false;
	    		 i++;
	        }
	    	System.out.print("\n");
	     }while(i<111);
	    
     }
}
