# training
Formation SQLI Hybris

## Pour voir l'exemple
* Récupérer l'extension de github et remplacer dans custom
* Lancer la commande ant depuis le dossier hybris/bin/platform 
* Lancer la commande hybrisserver.bat depuis le dossier hybris/bin/platform
* Re-importer l'impex training/resources/training.impex depuis la http://localhost:9001/console/impex/import
* accéder à http://localhost:9001/training
* Completer le TrainingController, le TrainingListing.jsp, ajouter des actions pour les Courses...
* Expérimenter le tout...
* Lire la suite des trails sur le wiki notamment la section *CronJob*


## Modifications apportées depuis la fin de la formation
* Correction d'une erreur de syntaxe dans web.xml (_balise servlet_)
* Modification de l'impex training.impex pour importer les données sur la version *Online* de *trainingProductCatalog*
* Ajout d'un filtre dans training-web-spring pour activer le catalog *trainingProductCatalog* sur la version *Online*
* Ajout d'une url dans TrainingController pour le détails d'une formation
* Ajout de TrainingDetails.jsp pour le détails d'une formation
* Modifications des jsps pour afficher les données pertinentes