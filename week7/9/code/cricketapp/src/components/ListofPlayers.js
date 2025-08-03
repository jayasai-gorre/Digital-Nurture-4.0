import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Virat", score: 85 },
    { name: "Rohit", score: 45 },
    { name: "Dhoni", score: 90 },
    { name: "Sachin", score: 100 },
    { name: "Dravid", score: 60 },
    { name: "Yuvraj", score: 55 },
    { name: "Sehwag", score: 75 },
    { name: "Jadeja", score: 30 },
    { name: "Bumrah", score: 10 },
    { name: "Shami", score: 50 },
    { name: "Kuldeep", score: 40 },
  ];

  const filtered = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>List of Players</h2>
      {players.map((p, i) => (
        <p key={i}>{p.name} - {p.score}</p>
      ))}
      <h3>Players scoring below 70:</h3>
      {filtered.map((p, i) => (
        <p key={i}>{p.name}</p>
      ))}
    </div>
  );
};
export default ListofPlayers;