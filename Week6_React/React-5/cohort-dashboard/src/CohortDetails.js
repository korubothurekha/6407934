import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails({ name, startedOn, currentStatus, coach, trainer }) {
  const headingStyle = {
    color: currentStatus === 'ongoing' ? 'green' : 'blue'
  };

  return (
    <div className={styles.box}>
      <h3 style={headingStyle}>{name}</h3>
      <dl>
        <dt>Started On:</dt>
        <dd>{startedOn}</dd>
        <dt>Current Status:</dt>
        <dd>{currentStatus}</dd>
        <dt>Coach:</dt>
        <dd>{coach}</dd>
        <dt>Trainer:</dt>
        <dd>{trainer}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
