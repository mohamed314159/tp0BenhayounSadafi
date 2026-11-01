package dd.ia2.benhayoun.tp0benhayounsadafi.service;

import jakarta.enterprise.context.Dependent;

import java.io.Serializable;
import java.util.Locale;

/**
 * Classe de service pour les modificateurs de question.
 * Un modificateur de question prend en entrée une question et retourne
 * la question modifiée.
 */
@Dependent // Portée CDI pour rendre la classe injectable par CDI dans les autres classes.
// Portée Dependent : l'instance sera supprimée quand la classe qui l'a injectée sera supprimée.
public class GenerateurReponse implements Serializable { // Serializable car CDI peut mettre l'instance en mémoire secondaire.
    private boolean roleSystemeAffiche = false;

    /**
     * Génère une réponse à une question.
     * @param question La question à modifier.
     * @param roleSysteme Le rôle système à utiliser pour la modification de la question.
     * @return La question modifiée : le rôle système en majuscule au début de la question, s'il n'est pas null,
     * suivi d'un saut de ligne,
     * puis la question en minuscule, le tout entouré de "||".
     */
    public String genererReponse(String question, String roleSysteme) {
        String resultat = "||";
        if (!this.roleSystemeAffiche && roleSysteme != null) {
            // Ajouter le rôle système en majuscule au début du résultat, suivi d'un saut de ligne.
            resultat += roleSysteme.toUpperCase(Locale.FRENCH) + "\n";
            this.roleSystemeAffiche = true;
        }
        for(int i=0; i < question.toLowerCase(Locale.FRENCH).length(); i++)
        {
            switch (question.toLowerCase(Locale.FRENCH).charAt(i))
            {
                case 'a': resultat += "1 ";
                    break;
                case 'b': resultat += "2 ";
                    break;
                case 'c': resultat += "3 ";
                    break;
                case 'd': resultat += "4 ";
                    break;
                case 'e': resultat += "5 ";
                    break;
                case 'f': resultat += "6 ";
                    break;
                case 'g': resultat += "7 ";
                    break;
                case 'h': resultat += "8 ";
                    break;
                case 'i': resultat += "9 ";
                    break;
                case 'j': resultat += "\uD83D\uDD1F ";
                    break;
                case 'k': resultat += "11 ";
                    break;
                case 'l': resultat += "12 ";
                    break;
                case 'm': resultat += "13 ";
                    break;
                case 'n': resultat += "14 ";
                    break;
                case 'o': resultat += "15 ";
                    break;
                case 'p': resultat += "16 ";
                    break;
                case 'q': resultat += "17 ";
                    break;
                case 'r': resultat += "18 ";
                    break;
                case 's': resultat += "19 ";
                    break;
                case 't': resultat += "20 ";
                    break;
                case 'u': resultat += "21 ";
                    break;
                case 'v': resultat += "22 ";
                    break;
                case 'w': resultat += "23 ";
                    break;
                case 'x': resultat += "24 ";
                    break;
                case 'y': resultat += "25 ";
                    break;
                case 'z': resultat += "26 ";
                    break;
                default: resultat += question.toLowerCase(Locale.FRENCH).charAt(i);
            }
            resultat += " ";
        }
        resultat += "||";
        return resultat;
    }
}