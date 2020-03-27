package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import dao.GestionDao;
import interfaces.IGestion;
import metier.Etudiant;


public class Gestion  {

	
	public Etudiant creerEtudiant (Etudiant etudiant) {
		
		return GestionDao.creerEtudiant(etudiant);
	}
	
	public void lireEtudiant(String email) {
		GestionDao.lireEtudiant(email);
	}
	
	public void supprimerEtudiant(String email) {
		GestionDao.supprimerEtudiant(email);
	}
	
	public void modifierAdresseEtudiant(String email,String nouvelleAdresse) {
		GestionDao.modifierAdresseEtudiant(email, nouvelleAdresse);
	}
	
	public void associerCoursEtudiant(int idEtudiant,String theme) {
		GestionDao.associerCoursEtudiant(idEtudiant, theme);
	}
	
	public  void listerEtudiants(IGestion gestion) {
		//.listerEtudiants();
		 gestion.listerEtudiants();
	}


	public String connexion(String email, String mdp) {
		return GestionDao.connexion(email, mdp);
	}

}
