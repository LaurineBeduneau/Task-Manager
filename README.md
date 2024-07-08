# Task-Manager

Ce projet implémente un simple gestionnaire de tâches en Scala. Il permet d'ajouter, lister et supprimer des tâches à partir d'une interface en ligne de commande.
Fonctionnalités

    Ajout de Tâches : Permet d'ajouter une nouvelle tâche avec une description.
    Listage des Tâches : Affiche la liste actuelle des tâches avec leur identifiant et leur description.
    Suppression de Tâches : Permet de supprimer une tâche en spécifiant son identifiant.

Structure du Projet

Le projet est structuré de la manière suivante :

    build.sbt : Fichier de configuration SBT définissant les dépendances du projet.
    project/build.properties : Définition de la version de SBT utilisée.
    src/main/scala/ : Contient le code source principal.
        com/example/Main.scala : Point d'entrée de l'application. Gère l'interface utilisateur en ligne de commande.
        com/example/Task.scala : Définition de la classe Task pour représenter une tâche.
        com/example/TaskManager.scala : Logique de gestion des tâches. Ajoute, liste et supprime les tâches.
    src/test/scala/ : Contient les fichiers de test.
        com/example/TaskManagerTest.scala : Tests unitaires pour la classe TaskManager.

Prérequis

Assurez-vous d'avoir installé les éléments suivants avant de lancer le projet :

    Scala
    SBT (Simple Build Tool)

Comment Utiliser

    Compilation du Projet : Ouvrez un terminal, naviguez vers le répertoire racine du projet et exécutez sbt compile pour compiler le projet.

    Exécution de l'Application : Après la compilation, lancez l'application en exécutant sbt run dans votre terminal. Suivez les instructions à l'écran pour ajouter, lister et supprimer des tâches.

    Tests : Pour exécuter les tests unitaires, utilisez la commande sbt test. Assurez-vous que tous les tests passent avec succès avant de contribuer ou de modifier le projet.
