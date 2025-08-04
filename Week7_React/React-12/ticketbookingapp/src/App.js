import React, { useState } from 'react';
import GuestPage from './components/GuestPage';
import UserPage from './components/UserPage';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  }

  const handleLogout = () => {
    setIsLoggedIn(false);
  }

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>🎟️ Ticket Booking App</h1>
      {
        isLoggedIn ? (
          <>
            <button onClick={handleLogout}>Logout 🔓</button>
            <UserPage />
          </>
        ) : (
          <>
            <button onClick={handleLogin}>Login 🔐</button>
            <GuestPage />
          </>
        )
      }
    </div>
  );
}

export default App;
