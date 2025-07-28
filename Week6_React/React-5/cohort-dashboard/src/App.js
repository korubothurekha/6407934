import React from 'react';
import './App.css';
import CohortDetails from './CohortDetails';

function App() {
  return (
    <div className="App">
      <h2>MyAcademy Cohort Dashboard</h2>
      <CohortDetails
        name="Cloud Native Bootcamp"
        startedOn="Jan - Apr 2025"
        currentStatus="ongoing"
        coach = "Aathma"
        trainer = "Jojo Jose"
      />
      <CohortDetails
        name="Frontend Accelerator"
        startedOn="Aug - Nov 2024"
        currentStatus="completed"
        coach = "John"
        trainer = "Nick"
      />
    </div>
  );
}

export default App;
