import React, { useState } from "react";

const EventHandlers = () => {
  const [count, setCount] = useState(0);

  // a. Increment value
  const increment = () => {
    setCount(prev => prev + 1);
  };

  // b. Say Hello
  const sayHello = () => {
    alert("Hello! Have a nice day 😊");
  };

  const handleIncrease = () => {
    increment();
    sayHello();
  };

  // Decrement handler
  const handleDecrease = () => {
    setCount(prev => prev - 1);
  };

  // Say Welcome button
  const greet = (message) => {
    alert(message);
  };

  // Synthetic event handler
  const handleClickEvent = () => {
    alert("I was clicked!");
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2>🔢 Counter Example</h2>
      <p>Count: {count}</p>
      <button onClick={handleIncrease}>Increment</button>
      <button onClick={handleDecrease}>Decrement</button>

      <hr />

      <h2>👋 Greeting Example</h2>
      <button onClick={() => greet("Welcome!")}>Say Welcome</button>

      <hr />

      <h2>🖱️ Synthetic Event</h2>
      <button onClick={handleClickEvent}>OnPress</button>
    </div>
  );
};

export default EventHandlers;
