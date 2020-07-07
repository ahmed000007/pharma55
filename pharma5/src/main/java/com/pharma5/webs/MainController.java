package com.pharma5.webs;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}
    
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/acceuil")
	public String acceuil() {
		return "acceuil";
	}
	
	@GetMapping("/mes_commandes")
	public String mes_commandes() {
		return "mes_commandes";
	}
	@GetMapping("/suivi_de_commandes")
	public String suivi_de_commandes() {
		return "suivi_de_commandes";
	}
	@GetMapping("/saisie_commande")
	public String saisie_commande() {
		return "saisie_commande";
	}
	@GetMapping("/liste_historique")
	public String liste_historique() {
		return "liste_historique";
	}
	@GetMapping("/liste_reclamation")
	public String liste_reclamation() {
		return "liste_reclamation";
	}
	@GetMapping("/reclamation")
	public String reclamation() {
		return "reclamation";
	}
	@GetMapping("/faire_une_reclamation")
	public String faire_une_reclamation() {
		return "faire_une_reclamation";
	}
	@GetMapping("/aide_contact")
	public String aide_contact() {
		return "aide_contact";
	}
	@GetMapping("/entete_de_commande")
	public String entete_de_commande() {
		return "entete_de_commande";
	}
	@GetMapping("/details_de_commande")
	public String details_de_commande() {
		return "details_de_commande";
	}
	@GetMapping("/detail_de_commande")
	public String detail_de_commande() {
		return "detail_de_commande";
	}
	@GetMapping("/user")
	public String user() {
		return "user";
	}
}