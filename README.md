# projet
projet java
•	La classe Scripts : Création de la table et insertion des données
Cette classe Java effectue les étapes suivantes :
- Connexion à la base de données MySQL via JDBC.
- Création d'une table DevData avec trois colonnes : Developpeurs, Jour, et NbScripts.




- Insertion de plusieurs enregistrements dans la table avec les informations des développeurs et leurs scripts réalisés par jour.
Les étapes :
- Étape 1 : Charger le driver JDBC.
- Étape 2 : Établir une connexion avec la base de données DataBase.
- Étape 3 : Exécuter une requête SQL pour créer une table et insérer des données.
- Étape 4 : Libérer les ressources (fermer la connexion et le statement).
•	La classe ExioJDBC : Exécution de requêtes SQL
Cette classe exécute différentes requêtes SQL sur la table DevData :
- Requête 1 : Sélectionner le développeur avec le plus de scripts par jour.
- Requête 2 : Calculer le nombre total de scripts réalisés par chaque développeur.
- Requête 3 : Calculer le total des scripts réalisés en une semaine.
- Requête 4 : Permet à l'utilisateur de saisir un nom de programmeur pour calculer son total de scripts.
- Requête 5 : Permet à l'utilisateur d'entrer une requête SQL librement et affiche les résultats de cette requête.
           Fonctionnalités supplémentaires :
- Utilisation de Scanner pour la saisie utilisateur.
- Utilisation de ResultSetMetaData pour afficher les détails des colonnes lors d'une requête libre.
