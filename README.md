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

La liste de film est b iejn intégré dans la base de données , le endoint /films est fonctionnel et retourne le json. Perte de temps : nom du fichier sql que j'avais renommé, ce qu'il fait qu'il ne s'insérait pas, problème de majuscule sur le nom des tables => les désactiver dans les paramètre application.properties, oubli de l'annotation @Repository dans ce dernier... 

*Ca avance. Clairement tout ne sera pas fini. Je me donne 15H15 pour repartir sur le front. On va tenter de créer quelques endpoints importants.*

### Création des shows & des Villages 

Je vais m'atteler à l'initialisation des shows & des villages. D'après le diagramme de classe, la relation entre les village et les village est une relation one to many.

Je crée donc d'abord les modèles, en incluant le many to one et le join column , qui demande donc aux show de référencer les villages. Un show contient un seul village, c'est un attribut unitaire typé Village.  on utilise "village_id" comme nom pour le join column. Rien à préciser pour dans le modèle du village, la relation est unique dans ce sens.

*je me retrouve confronter à une erreur... l'annotation manytoone ne veut s'ajouter... Recherce de l'erreur..*
*erreur contrée : j'avais mal déclaré  Village... enchainement d'erreur d'inattention!*

### Créations des services et des repositories associés

Service show  => retourne la liste des show
inserer un show
updater un show

Service Village => retourne la lsite des vilalges

*échec d'une initialisation correcte, messages d'erreurs*

## Mardi 14h00

On s'arrête là pour le back. Je pars sur un affichage simple du tableau des films avec VueJs. Très déçu de ce que j'ai pu fournir en back, beaucoup de messages d'erreurs du a des fautes d'inexpérience du à un manque d'entrainement. Je me suis rendu compte que j'ai encore beaucoup de travail pour être efficace.

Je regarde si l'api se lance et génère le json des films correctements.
=> tout va bien, je ne touche plus au back. Je passe sur VueJs.





