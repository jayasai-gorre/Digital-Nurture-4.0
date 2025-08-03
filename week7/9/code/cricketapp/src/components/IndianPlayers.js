import React from "react";

const IndianPlayers = () => {
  const T20 = ["Rohit", "Kohli", "SKY"];
  const Ranji = ["Rahane", "Pujara"];
  const merged = [...T20, ...Ranji];

  const [odd, even] = [
    merged.filter((_, i) => i % 2 !== 0),
    merged.filter((_, i) => i % 2 === 0),
  ];

  return (
    <div>
      <h2>Indian Players</h2>
      <p>Even Team: {even.join(", ")}</p>
      <p>Odd Team: {odd.join(", ")}</p>
    </div>
  );
};
export default IndianPlayers;
