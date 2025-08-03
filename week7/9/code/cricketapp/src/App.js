import ListofPlayers from "./components/ListofPlayers";
import IndianPlayers from "./components/IndianPlayers";

function App() {
  const flag = false; // Toggle this to see different components
  return <div>{flag ? <ListofPlayers /> : <IndianPlayers />}</div>;
}
export default App;