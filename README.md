# Electricity Bill Management System 

A **Java console application** that simulates electricity billing for consumers.  
It allows entering consumer details, calculating electricity usage, and generating bills with category‑based charges, connection fees, and discounts.

---

##  Features

###  Consumer Details
- Enter consumer name and ID.
- Select consumer category:
  - Residential
  - Commercial
  - Industrial
  - Agricultural
- Choose type of connection:
  - Single Phase
  - Three Phase
- Record previous and present meter readings.
- Automatically calculate units consumed.

###  Bill Generation
- Calculates charges based on units consumed:
  - 0 units → minimum charge.
  - 1–100 units → ₹5 per unit.
  - 101–300 units → ₹7 per unit (beyond 100).
  - 301–500 units → ₹9 per unit (beyond 300).
  - Above 500 units → ₹12 per unit (beyond 500).
- Adds fixed charges:
  - Connection charges (₹100 single phase / ₹300 three phase).
  - Fuel Cost Adjustment (₹120).
  - Electricity Duty (₹88).
  - Meter Rent (₹200).
- Applies category‑based surcharges:
  - Residential → 0%
  - Commercial → 18%
  - Industrial → 22%
  - Agricultural → 5%
- GST at 12% applied on bill amount.
- Optional **early payment discount** (10%).

### Bill Output
- Displays consumer details.
- Shows meter readings and units consumed.
- Prints itemized charges and total payable amount.

---

## Tech Stack

- **Language:** Java  
- **Input/Output:** Console (Scanner class)  
- **Data Structures:** Arrays for storing consumer records  
