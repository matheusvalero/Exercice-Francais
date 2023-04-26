import java.util.Scanner;

public class Exercice {
    public static void main(String[] args) {

        System.out.println("Jeu de Devinettes\n\n"+
        "Choisir la Difficulté:\n(1)=Facile\n(2)=Moyen\n"+
        "(3)=Difficile\n\nThèmes:\n1-Des Fruits\n2-Animaux\n"+
        "3-Langages de Programmation\n\n");

        Scanner lisant = new Scanner(System.in);
        int interdit = lisant.nextInt();
        String motSecret = "";

        if (interdit == 1) 
        {
            motSecret = "Pastèque";
        } 
        else if (interdit == 2) 
        {
            motSecret = "Éléphant";
        }
        else if (interdit == 3)
        {
            motSecret = "Python";
        }
        lisant.close();

        Scanner lisant2 = new Scanner(System.in);
        String interdit2 = lisant2.nextLine();

        lisant2.close();

        System.out.println("TEXT 1\n"+
        "Bonjour,\nJe m'appelle Matheus. Je suis\n"+
        "brésilien e j'habite à Brasília. Je suis\n"+
        "réceptionniste dans un hôtel. Je travaille\n"+
        "beaucoup. Je parle portugais, français, italien\n"+
        "et allemand. J'ai 23 ans et je suis marié.\n"+
        "Au revoir,\nMatheus\n\n");

        System.out.println("Activité\n"+
        "Lisez le texte de présentation de Matheus. Ensuite");
    }
}