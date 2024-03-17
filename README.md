# Documentation de l'API GraphQL

## Présentation
Cette API GraphQL offre un ensemble de fonctionnalités pour gérer des joueurs et des équipes sportives. Elle expose un ensemble de requêtes et de mutations pour interagir avec les données.

## Endpoints
L'API est accessible à l'adresse suivante : http://localhost:8080/graphql


## Fonctionnalités

### Récupération des données
- `getAllPlayers`: Récupère la liste de tous les joueurs.
- `getAllTeams`: Récupère la liste de toutes les équipes.

### Ajout de données
- `addPlayer`: Ajoute un nouveau joueur.
- `addTeam`: Ajoute une nouvelle équipe.

## Utilisation

### Requêtes
Pour récupérer des données, vous pouvez envoyer des requêtes POST à l'endpoint GraphQL spécifié ci-dessus. Voici un exemple de requête pour récupérer tous les joueurs :

```graphql
query {
  getAllPlayers {
    id
    name
    age
    height
    team
  }
}
```

Mutations
Pour ajouter de nouvelles données, vous pouvez envoyer des requêtes POST avec des mutations. Voici un exemple de mutation pour ajouter un joueur :

```
mutation {
  addPlayer(
    id: "123",
    name: "John Doe",
    age: 25,
    height: 180,
    team: "Team1"
  ) {
    id
    name
    age
    height
    team
  }
}
``

