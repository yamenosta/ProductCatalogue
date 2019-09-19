# ProductCatalogue
Simple Rest Api for ProductCatalogue:
Créer un compte pour le client par un login et mot de passe,
Authentification pour acceder à l'API ProductCatalogue (JWT)
Classification des produit par catégories,
ajouter des categories,
ajouter des produit à une categorie,
afficher tous les produits d'une catégorie,
initialiser un panier,
ajouter un produit à un panier,
enlever un produit du panier,
lister tous les produits du panier,
vider le panier.

## Installation
Au démarrage de l'application un utilisateur sera créer avec les crédentinal suivant:
nameClient: yamen
password: 123
Pour l'authentification: envoyer une requette de type post à l'url:http://localhost:8080/login
avec un body au format JSON:
{
"nameClient": "yamen",
"password":"123"
}

Récupération du token dans l'entete de la réponse

Pour acceder au differents web service: inclure le token dans l'entete de la requette: Authorization: Bearer //token
http://localhost:8080/Categorie/ajoutCategorie (post)   --> pour creer une nouvelle catégorie
http://localhost:8080/Categorie/modifCategorie (put)  --> pour modfier une nouvelle catégorie
http://localhost:8080/Categorie/supprimCategorie/id (delete)   --> pour creer une supprimer catégorie
http://localhost:8080/Categorie/allCategorie (get)   --> tout les catégories
===
===
===
....etc
