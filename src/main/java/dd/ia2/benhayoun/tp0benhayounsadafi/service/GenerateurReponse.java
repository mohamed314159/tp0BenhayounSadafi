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
                case 'a': resultat += "1\uFE0F ";
                    break;
                case 'b': resultat += "2\uFE0F ";
                    break;
                case 'c': resultat += "3\uFE0F ";
                    break;
                case 'd': resultat += "4\uFE0F ";
                    break;
                case 'e': resultat += "5\uFE0F ";
                    break;
                case 'f': resultat += "6\uFE0F ";
                    break;
                case 'g': resultat += "7\uFE0F ";
                    break;
                case 'h': resultat += "8\uFE0F ";
                    break;
                case 'i': resultat += "9\uFE0F ";
                    break;
                case 'j': resultat += "\uD83D\uDD1F ";
                    break;
                case 'k': resultat += "1\uFE0F1\uFE0F ";
                    break;
                case 'l': resultat += "1\uFE0F2\uFE0F ";
                    break;
                case 'm': resultat += "1\uFE0F3\uFE0F ";
                    break;
                case 'n': resultat += "1\uFE0F4\uFE0F ";
                    break;
                case 'o': resultat += "1\uFE0F5\uFE0F ";
                    break;
                case 'p': resultat += "1\uFE0F6\uFE0F ";
                    break;
                case 'q': resultat += "1\uFE0F7\uFE0F ";
                    break;
                case 'r': resultat += "1\uFE0F8\uFE0F ";
                    break;
                case 's': resultat += "2\uFE0F9\uFE0F ";
                    break;
                case 't': resultat += "2\uFE0F0\uFE0F ";
                    break;
                case 'u': resultat += "2\uFE0F1\uFE0F ";
                    break;
                case 'v': resultat += "2\uFE0F2\uFE0F ";
                    break;
                case 'w': resultat += "2\uFE0F3\uFE0F ";
                    break;
                case 'x': resultat += "2\uFE0F4\uFE0F ";
                    break;
                case 'y': resultat += "2\uFE0F5\uFE0F ";
                    break;
                case 'z': resultat += "1\uFE0F6\uFE0F ";
                    break;
                default: resultat += question.toLowerCase(Locale.FRENCH).charAt(i);
            }
            resultat += " ";
        }
        resultat += "||";
        return resultat;
    }
}