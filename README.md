Gestionnaire de Contacts
Description
Ce projet est un gestionnaire de contacts simple développé en Java. Il permet d'ajouter des contacts et de les rechercher par nom.
Fonctionnalités

Ajouter des contacts avec nom et numéro de téléphone
Rechercher un contact par son nom
Stocker jusqu'à 500 contacts

Structure du projet

Contact.java : Classe qui représente un contact
ContactsManager.java : Classe qui gère la collection de contacts
Main.java : Programme principal avec des exemples d'utilisation

Comment utiliser
Prérequis

Java 21 ou plus récent installé
Terminal ou invite de commande

Compilation et exécution
bash# Compiler tous les fichiers Java
javac *.java

# Exécuter le programme
java Main
Résultat attendu
J'ai trouvé le contact : Zadjehi Moahe Emmanuel
Son numéro est : 01.34.56.78.90
Exemple d'utilisation dans le code
java// Créer un gestionnaire
ContactsManager gestionnaire = new ContactsManager();

// Créer un contact
Contact contact = new Contact();
contact.nom = "Kouakou Jean Philippe";
contact.numeroTelephone = "07.12.34.56.78";

// Ajouter le contact
gestionnaire.addContact(contact);

// Rechercher un contact
Contact trouve = gestionnaire.searchContact("Kouakou Jean Philippe");
Contacts d'exemple
Le programme contient 5 contacts de démonstration :

Kouakou Jean Philippe
Zadjehi Moahe
Zadjehi Moahe Emmanuel
Kone Mamadou
Adjoua Beatrice

Auteur
Zadjehi Moahe Emmanuel Hyacinthe Junior - Exercice de programmation Java
Exercice
Ce projet fait partie d'un exercice du Chapitre 06 - Gestionnaire de Contacts RGL3B.
