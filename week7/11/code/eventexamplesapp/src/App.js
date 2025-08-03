import React, { useState } from "react";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);
  const [rupees, setRupees] = useState("");
  const [euros, setEuros] = useState("");

  const increment = () => {
    setCount((prev) => prev + 1);
    sayHello();
  };

  const sayHello = () => {
    alert("Hello! This is a static message.");
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleSynthetic = (e) => {
    console.log("Synthetic Event:", e);
    alert("I was clicked");
  };

  const convertToEuro = () => {
    if (!rupees || rupees < 0) return setEuros("0.00");
    setEuros((rupees / 90).toFixed(2));
  };

  return (
    <div className="container">
      <h1 className="title">React Events Lab</h1>


      <section className="card">
        <h2>Counter: {count}</h2>
        <div className="button-group">
          <button className="btn" onClick={increment}>Increment</button>
          <button className="btn" onClick={() => setCount(count - 1)}>Decrement</button>
        </div>
      </section>


      <section className="card">
        <button className="btn" onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>
      </section>


      <section className="card">
        <button className="btn" onClick={handleSynthetic}>Synthetic OnClick</button>
      </section>


      <section className="card">
        <h3>Currency Converter</h3>
        <input
          type="number"
          placeholder="Enter ₹ Rupees"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
          className="input"
        />
        <button className="btn" onClick={convertToEuro}>Convert to Euro</button>
        <p className="result">Euros: €{euros}</p>
      </section>
    </div>
  );
}

export default App;
