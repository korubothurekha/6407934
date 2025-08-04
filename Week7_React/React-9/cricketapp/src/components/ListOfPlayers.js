import React from "react";

const ListOfPlayers = () => {
  const players = [
    { name: "Virat Kohli", score: 85 },
    { name: "Rohit Sharma", score: 95 },
    { name: "KL Rahul", score: 65 },
    { name: "Ravindra Jadeja", score: 55 },
    { name: "Jasprit Bumrah", score: 60 },
    { name: "MS Dhoni", score: 90 },
    { name: "Shubman Gill", score: 80 },
    { name: "Hardik Pandya", score: 40 },
    { name: "Yuzvendra Chahal", score: 35 },
    { name: "R Ashwin", score: 75 },
    { name: "Shikhar Dhawan", score: 88 },
  ];

  const filteredPlayers = players.filter((player) => player.score < 70);

  return (
    <div>
      <h2>All Players with their Scores:</h2>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

      <h3>Players with score below 70:</h3>
      <ul>
        {filteredPlayers.map((player, index) => (
          <li key={index}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListOfPlayers;
