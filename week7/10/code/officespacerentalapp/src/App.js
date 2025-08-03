import React from "react";

const offices = [
  {
    name: "Workspace A",
    rent: 50000,
    address: "Mumbai",
    image: "https://images.unsplash.com/photo-1504384308090-c894fdcc538d?auto=format&fit=crop&w=800&q=60",
  },
  {
    name: "Workspace B",
    rent: 75000,
    address: "Delhi",
    image: "https://images.unsplash.com/photo-1517430816045-df4b7de11d1d?auto=format&fit=crop&w=800&q=60",
  },
  {
    name: "Workspace C",
    rent: 45000,
    address: "Hyderabad",
    image: "https://images.unsplash.com/photo-1593642634315-48f5414c3ad9?auto=format&fit=crop&w=800&q=60",
  },
];


const cardStyle = {
  border: "1px solid #ccc",
  borderRadius: "12px",
  boxShadow: "0 4px 12px rgba(0,0,0,0.1)",
  padding: "1rem",
  marginBottom: "1.5rem",
  backgroundColor: "#fff",
  maxWidth: "400px",
};

const imageStyle = {
  width: "100%",
  height: "200px",
  objectFit: "cover",
  borderRadius: "8px",
};

function App() {
  return (
    <div style={{ padding: "2rem", fontFamily: "Arial", background: "#f2f2f2" }}>
      <h1 style={{ textAlign: "center", marginBottom: "2rem" }}>
        Office Space Rental
      </h1>

      <div style={{ display: "flex", gap: "2rem", flexWrap: "wrap", justifyContent: "center" }}>
        {offices.map((office, idx) => (
          <div key={idx} style={cardStyle}>
            <img src={office.image} alt={office.name} style={imageStyle} />
            <h2 style={{ margin: "1rem 0 0.5rem" }}>{office.name}</h2>
            <p
              style={{
                color: office.rent < 60000 ? "red" : "green",
                fontWeight: "bold",
              }}
            >
              Rent: ₹{office.rent}
            </p>
            <p style={{ margin: 0 }}>Address: {office.address}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
