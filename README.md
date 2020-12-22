# **Back end Spring**.

## Lundi, 16h00 :

*J'ai décidé de partir  sur le front end dès lundi matin, je me suis donc attelé plus tard au back end. Autant vous le dire tout de suite : j'avais mal évalué la quantité de travail que cela impliquait. Avec le recul, j'aurais dut inverser.*
*La fatigue n'aide pas mais j'espère sincèrement que le crud sera au moins fonctionnel*

Mon choix se porte sur l'utilisation de H2, par soucis de rapidité de déploiement. En effet, c'est la seule application du crud fonctionnelle que j'ai eu jusqu'a maintenant . Mes tentatives d'utilisation de base mysql extérieure, et même celle de workbench, ses sont toujours soldé par des erreurs. Je ne vais donc pas prendre le risque.D'autant que j'ai pris le "risque" d'utiliser Intellij, un logiciel que j'utilise depuis peu. Je suis joueur,certes, mais prudent.

 - initialisation du projet, récupération des fichier sql.
 - j'analyse le sujet et fais le trie des données à exploiter

concrètement, nous aurons besoins de ces entités :
les villages
les noms de films
les acteurs
le genre
les éventements (ou shows)

Je commence donc par créer l'entité film, dans la classe film, car ça sera le modèle.
La visibilité des attributs est privée, et j'utilise les getter/setter pour accéder à leur valeur.
La classe film est relié à table films de la bdd

Je dois m’arrêter là malheureusement. De plus, je suis pas en mesure de continuer (fatigue accumulée). Reprise demain matin.

## Mardi 8h00

La tâche est énorme. Je verrais bien jusqu'où je pourrai aller. Déjà faire l'application crud pour afficher la liste des films et les villages reste un objectif assez important. Pour ce qui est du reste, tout dépend de là ou j'en serai à midi.

### Affichage de la liste de film en entier :

Création d'un controller test pour afficher les films, ainsi que de son service associé, et de son implémentation.

Creation des fichiers et des dossiers permettant de ranger les services, les interfaces correspondantes.
Autowired de l'interface Film depuis le controller "/film"

## Mardi 12h00

La liste de film est b iejn intégré dans la base de données , le endoint /films est fonctionnel et retourne le json. Perte de temps : nom du fichier sql que j'avais renommé, ce qu'il fait qu'il ne s'insérait pas, problème de majuscule sur le nom des tables => les désactiver dans les paramètre application.properties

*Ca avance. Clairement tout ne sera pas fini. Je me donne 15H15 pour repartir sur le back. On va tenter de créer quelques endpoints importants.*

