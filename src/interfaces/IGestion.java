package interfaces;

import java.util.List;

import metier.Etudiant;

@FunctionalInterface
public interface IGestion {

	void listerEtudiants();
	
	 default   void creerEtudiant (Etudiant etudiant) {}
	
	default void lireEtudiant(String email){}
	
	default void connexion(String email, String mdp){}
	
	default void supprimerEtudiant(String email){}
	
	default void modifierAdresseEtudiant(String email,String nouvelleAdresse){}
	
	default void associerCoursEtudiant(int idEtudiant,String theme){}
	
	 
	
}
