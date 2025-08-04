import React from 'react';

const OfficeList = () => {
  // Step 1: Heading JSX Element
  const heading = <h1>Office Space Rental Listings</h1>;

  // Step 2: Office image using JSX attribute
  const officeImage = (
    <img
      src="https://images.unsplash.com/photo-1600585154340-be6161a56a0c"
      alt="Office Space"
      style={{ width: '400px', borderRadius: '8px' }}
    />
  );

  // Step 3: Create an office object
  const office = {
    name: "Regus Business Center",
    rent: 55000,
    address: "Gachibowli, Hyderabad"
  };

  // Step 4: List of office spaces
  const officeList = [
    { name: "WeWork HQ", rent: 45000, address: "Hitech City, Hyderabad" },
    { name: "91Springboard", rent: 72000, address: "Banjara Hills, Hyderabad" },
    { name: "Awfis", rent: 60000, address: "Kondapur, Hyderabad" },
    { name: "SmartWorks", rent: 82000, address: "Madhapur, Hyderabad" },
  ];

  // Render individual office items with conditional styling
  const renderOfficeItems = officeList.map((item, index) => (
    <div
      key={index}
      style={{
        border: "1px solid #ccc",
        padding: "10px",
        marginBottom: "10px",
        borderRadius: "6px",
        width: "400px"
      }}
    >
      <h3>{item.name}</h3>
      <p>Address: {item.address}</p>
      <p>
        Rent:{" "}
        <span style={{ color: item.rent < 60000 ? "red" : "green" }}>
          ₹{item.rent}
        </span>
      </p>
    </div>
  ));

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      {heading}
      {officeImage}
      <hr />
      <h2>Featured Office</h2>
      <div
        style={{
          border: "1px solid #ddd",
          padding: "10px",
          width: "400px",
          borderRadius: "6px",
          marginBottom: "20px"
        }}
      >
        <h3>{office.name}</h3>
        <p>Address: {office.address}</p>
        <p>
          Rent:{" "}
          <span style={{ color: office.rent < 60000 ? "red" : "green" }}>
            ₹{office.rent}
          </span>
        </p>
      </div>

      <h2>All Office Listings</h2>
      {renderOfficeItems}
    </div>
  );
};

export default OfficeList;
