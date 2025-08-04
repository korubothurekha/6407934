import React from "react";
import EventHandlers from "./EventHandlers";
import CurrencyConverter from "./CurrencyConverter";

function App() {
  return (
    <div className="App">
      <h1>🚀 Event Handling & Conversion Demo</h1>
      <EventHandlers />
      <CurrencyConverter />
    </div>
  );
}

export default App;
