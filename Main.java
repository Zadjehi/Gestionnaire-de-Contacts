public class Main {
    public static void main(String[] args) {
        // Je crée mon gestionnaire de contacts
        ContactsManager monGestionnaire = new ContactsManager();
        
        // Je crée le premier contact
        Contact contact1 = new Contact();
        contact1.nom = "Kouakou Jean Philippe";
        contact1.numeroTelephone = "07.12.34.56.78";
        monGestionnaire.addContact(contact1);
        
        // Je crée le deuxième contact  
        Contact contact2 = new Contact();
        contact2.nom = "Zadjehi Moahe";
        contact2.numeroTelephone = "05.23.45.67.89";
        monGestionnaire.addContact(contact2);
        
        // Je crée le troisième contact
        Contact contact3 = new Contact();
        contact3.nom = "Zadjehi Moahe Emmanuel";
        contact3.numeroTelephone = "01.01.44.54.01";
        monGestionnaire.addContact(contact3);
        
        // Je crée le quatrième contact
        Contact contact4 = new Contact();
        contact4.nom = "Kone Mamadou";
        contact4.numeroTelephone = "07.45.67.89.01";
        monGestionnaire.addContact(contact4);
        
        // Je crée le cinquième contact
        Contact contact5 = new Contact();
        contact5.nom = "Adjoua Beatrice";
        contact5.numeroTelephone = "05.56.78.90.12";
        monGestionnaire.addContact(contact5);
        
        // Je cherche un contact et j'affiche son numéro
        Contact contactTrouve = monGestionnaire.searchContact("Zadjehi Moahe Emmanuel");
        
        // Je vérifie si j'ai trouvé le contact
        if (contactTrouve != null) {
            System.out.println("J'ai trouvé le contact : " + contactTrouve.nom);
            System.out.println("Son numéro est : " + contactTrouve.numeroTelephone);
        } else {
            System.out.println("Je n'ai pas trouvé ce contact");
        }
    }
}