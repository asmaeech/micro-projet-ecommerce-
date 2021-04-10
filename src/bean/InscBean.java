package bean;

public class InscBean {
	 private String Nom;
	 private static String Prenom;
	 private String email;
	 private String Adresse;
	 private String password;
	  
	 public String getNom() {
	 return Nom;
	 }
	 public static void setNom(String Nom) {
	 Nom = Nom;
	 }
	 public String getPreom() {
		 return Prenom;
		 }
		 public static void setPrenom(String prenom) {
		 Prenom = prenom;
		 }
	 public String getAdresse() {
			 return Adresse;
			 }
	 public static void setAdresse(String Adresse) {
			 Adresse = Adresse;
			 }
	 public String getPassword() {
	 return password;
	 }
	 public static void setPassword(String password) {
	 password = password;
	 }
	 public static void setEmail(String email) {
	 email = email;
	 }
	 public String getEmail() {
	 return email;
	 }
	}