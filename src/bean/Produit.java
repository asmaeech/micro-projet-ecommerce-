package bean;

public class Produit {
	  private long id;
	    private String desination;
	    private double prix;
	    private String  image;

	    public Produit() {
	    }

	    public Produit(long id, String desination, double prix, String image) {
	        this.id = id;
	        this.desination = desination;
	        this.prix = prix;
	        this.image = image;
	    }

	    public Produit(String desination, double prix, String image) {
	        this.desination = desination;
	        this.prix = prix;
	        this.image = image;
	    }

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public String getDesination() {
	        return desination;
	    }

	    public void setDesination(String desination) {
	        this.desination = desination;
	    }

	    public double getPrix() {
	        return prix;
	    }

	    public void setPrix(double prix) {
	        this.prix = prix;
	    }

	    public String getImage() {
	        return image;
	    }

	    public void setImage(String image) {
	        this.image = image;
	    }
	    
	    
	}

