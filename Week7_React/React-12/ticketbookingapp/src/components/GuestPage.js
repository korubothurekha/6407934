import React from 'react';

const GuestPage = () => {
  const flightDetails = [
    { flight: 'AI-203', from: 'Delhi', to: 'Mumbai', time: '10:00 AM' },
    { flight: '6E-502', from: 'Hyderabad', to: 'Bangalore', time: '12:30 PM' },
    { flight: 'UK-707', from: 'Chennai', to: 'Kolkata', time: '3:45 PM' },
  ];

  return (
    <div>
      <h2>✈️ Flight Details (Guest View)</h2>
      <ul>
        {flightDetails.map((f, idx) => (
          <li key={idx}>
            {f.flight} - {f.from} → {f.to} at {f.time}
          </li>
        ))}
      </ul>
      <p><i>Login to book your ticket!</i></p>
    </div>
  );
};

export default GuestPage;
