const fetch = require('node-fetch');

async function getAllPlayers() {
  const url = 'http://localhost:8080/graphql';

  const query = `
    query {
      getAllPlayers {
        id
        name
        age
        height
        team
      }
    }
  `;

  const options = {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify({ query }),
  };

    const response = await fetch(url, options);
    const data = await response.json();
    console.log('All players:', data.data.getAllPlayers);
  }


async function getAllTeams() {
  const url = 'http://localhost:8080/graphql';

  const query = `
    query {
      getAllTeams {
        id
        name
        city
        creationDate
      }
    }
  `;

  const options = {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify({ query }),
  };

    const response = await fetch(url, options);
    const data = await response.json();
    console.log('All teams:', data.data.getAllTeams);
  }


async function addPlayer() {
  const url = 'http://localhost:8080/graphql';

  const mutation = `
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
  `;

  const options = {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify({ query: mutation }),
  };

    const response = await fetch(url, options);
    const data = await response.json();
    console.log('Player added:', data.data.addPlayer);
  }


async function addTeam() {
  const url = 'http://localhost:8080/graphql';

  const mutation = `
    mutation {
      addTeam(
        id: "Team1",
        name: "Team A",
        city: "City A",
        creationDate: "2024-03-17"
      ) {
        id
        name
        city
        creationDate
      }
    }
  `;

  const options = {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json',
    },
    body: JSON.stringify({ query: mutation }),
  };

    const response = await fetch(url, options);
    const data = await response.json();
    console.log('Team added:', data.data.addTeam);
  }


getAllPlayers();
getAllTeams();

addPlayer();
addTeam();
