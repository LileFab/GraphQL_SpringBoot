const { request, gql } = require('graphql-request')

const query = `
    {
        getAllPlayers {
            id
            name
            age
            height
              team
        }
    }
`

request('http://localhost:8080/graphql', query)
    .then(
        (data) => {
            data.getAllPlayers.forEach(element => {
                console.log(`Found player #${element.id} with name ${element.name}`);
            });
        }
    )