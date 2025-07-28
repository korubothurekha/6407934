import React from 'react';
import '../Stylesheets/mystyle.css';

function CalculateScore() {
  const name = "Rekha";
  const school = "Anurag University";
  const total = 450;
  const goal = 500;
  const average = (total / goal) * 100;

  return (
    <div className="score-box">
      <h2>Score Calculator</h2>
      <p>Name: {name}</p>
      <p>School: {school}</p>
      <p>Total Score: {total}</p>
      <p>Goal Score: {goal}</p>
      <p>Average Score: {average.toFixed(2)}%</p>
    </div>
  );
}

export default CalculateScore;
