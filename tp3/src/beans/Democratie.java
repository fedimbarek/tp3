package beans;

public class Democratie {
	 private int voix;

	    public Democratie() {
	       setVoix(0);
	    }

	    public int getVoix() {
	        return voix;
	    }

	    public void setVoix(int voix) {
	        this.voix = voix;
	    }

	    public int voter() {
	        voix++;
	        return voix;
	    }
}
