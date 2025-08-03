import React, { useState } from "react";
import "./App.css";

const GuestPage = () => <h2 className="subtitle">Guest View: Please log in to book tickets.</h2>;
const UserPage = () => <h2 className="subtitle">Welcome to the website! You can now book tickets.</h2>;

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (
    <div className="container">
      <h1 className="title">Ticket Booking App</h1>

      <div className="button-group">
        {!isLoggedIn ? (
          <button className="btn" onClick={() => setIsLoggedIn(true)}>Login</button>
        ) : (
          <button className="btn" onClick={() => setIsLoggedIn(false)}>Logout</button>
        )}
      </div>

      <div className="content">
        {isLoggedIn ? <UserPage /> : <GuestPage />}
      </div>
    </div>
  );
}
export default App;
