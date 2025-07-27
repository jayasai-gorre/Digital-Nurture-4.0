import '../Stylesheets/mystyle.css';

function CalculateScore({ name, school, total, goal }) {
  const average = total / goal;
  return (
    <div className="score-box">
      <h3>Student: {name}</h3>
      <p>School: {school}</p>
      <p>Total Score: {total}</p>
      <p>Goal: {goal}</p>
      <p>Average: {average}</p>
    </div>
  );
}
export default CalculateScore;
