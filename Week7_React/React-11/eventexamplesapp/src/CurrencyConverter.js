import React, { useState } from "react";

const CurrencyConverter = () => {
  const [rupees, setRupees] = useState("");
  const [euros, setEuros] = useState("");

  const handleSubmit = () => {
    const rate = 0.011; // Example conversion rate
    const result = parseFloat(rupees) * rate;
    setEuros(result.toFixed(2));
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2>💱 Currency Converter</h2>
      <label>
        Enter Rupees:{" "}
        <input
          type="number"
          value={rupees}
          onChange={(e) => setRupees(e.target.value)}
        />
      </label>
      <button onClick={handleSubmit}>Convert</button>

      {euros && (
        <p>
          💶 Equivalent in Euros: <strong>€{euros}</strong>
        </p>
      )}
    </div>
  );
};

export default CurrencyConverter;

