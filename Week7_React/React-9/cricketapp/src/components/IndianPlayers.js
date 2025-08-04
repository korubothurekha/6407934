import React from "react";

const IndianPlayers = () => {
  const allPlayers = [
    "Rohit", "Virat", "Rahul", "Dhoni",
    "Jadeja", "Bumrah", "Pant", "Ashwin",
    "Shami", "Gill", "Hardik"
  ];

  // Destructuring
  const oddTeam = allPlayers.filter((_, index) => index % 2 === 0);
  const evenTeam = allPlayers.filter((_, index) => index % 2 !== 0);

  // Merge two arrays
  const T20players = ["Rohit", "Virat", "Gill"];
  const RanjiTrophy = ["Unadkat", "Pujara", "Saha"];
  const mergedPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players:</h2>
      <ul>
        {oddTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Even Team Players:</h2>
      <ul>
        {evenTeam.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h2>Merged Players (T20 + Ranji):</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
