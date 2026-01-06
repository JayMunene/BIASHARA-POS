# Biashara-POS 🏗️

A Point of Sale (POS) system built with Spring Boot backend and HTML/JavaScript frontend.

## Project Structure

```
BiasharaPOS/
├── src/
│   └── main/
│       ├── java/com/biashara/pos/
│       │   ├── BiasharaPosApplication.java (Main application)
│       │   ├── controller/
│       │   │   └── ProductController.java (REST API)
│       │   ├── model/
│       │   │   └── Product.java (Entity)
│       │   └── repository/
│       │       └── ProductRepository.java (Data access)
│       └── resources/
│           └── application.properties (Configuration)
├── FRONTEND/
│   ├── login.html
│   ├── dashboard.html
│   ├── products.html (Inventory Management)
│   └── pos.html (POS Terminal)
└── pom.xml (Maven dependencies)
```

## Prerequisites

- **Java 17 or higher**
- **Maven** (for building the project)
- **Modern web browser** (Chrome, Firefox, Edge, etc.)

## Setup Instructions

### 1. Start the Backend Server

Open a terminal in the project root directory and run:

```bash
mvn spring-boot:run
```

Or if you prefer to build and run separately:

```bash
mvn clean package
java -jar target/pos-1.0.0.jar
```

The backend server will start on **http://localhost:8080**

### 2. Access the Frontend

Open your web browser and navigate to:

- **Products/Inventory**: `file:///C:/Users/peter/Desktop/BiasharaPOS/FRONTEND/products.html`
- **POS Terminal**: `file:///C:/Users/peter/Desktop/BiasharaPOS/FRONTEND/pos.html`
- **Dashboard**: `file:///C:/Users/peter/Desktop/BiasharaPOS/FRONTEND/dashboard.html`

## Features

### ✅ Inventory Management (`products.html`)
- View all products in a table
- Add new products with buying/selling prices
- Delete products
- Stock quantity tracking with color-coded badges (red for low stock)
- Real-time updates from backend API

### ✅ POS Terminal (`pos.html`)
- Browse products in a grid view
- Search products by name
- Add products to cart with quantity controls
- Complete sales (automatically updates stock)
- Clear cart functionality
- Real-time stock validation

### ✅ Backend REST API

**Endpoints:**
- `GET /api/products` - Get all products
- `GET /api/products/{id}` - Get product by ID
- `POST /api/products` - Create new product
- `PUT /api/products/{id}` - Update product
- `DELETE /api/products/{id}` - Delete product

## Database

The application uses **H2 in-memory database** for easy setup. Data will be reset when the server restarts.

**Access H2 Console:**
- URL: http://localhost:8080/h2-console
- JDBC URL: `jdbc:h2:mem:biasharadb`
- Username: `sa`
- Password: (leave empty)

## API Testing

You can test the API using curl:

```bash
# Get all products
curl http://localhost:8080/api/products

# Add a product
curl -X POST http://localhost:8080/api/products \
  -H "Content-Type: application/json" \
  -d '{"name":"Blue Band 500g","buyingPrice":200.0,"sellingPrice":250.0,"quantity":50}'
```

## Troubleshooting

### Backend won't start
- Ensure Java 17+ is installed: `java -version`
- Check if port 8080 is already in use
- Run `mvn clean install` to rebuild dependencies

### Frontend shows "Error loading products"
- Verify backend is running on http://localhost:8080
- Check browser console (F12) for error messages
- Ensure CORS is enabled (already configured in ProductController)

### CORS Issues
If you encounter CORS errors, the `@CrossOrigin(origins = "*")` annotation in ProductController should handle this. Make sure your backend is running.

## Tech Stack

**Backend:**
- Spring Boot 3.2.0
- Spring Data JPA
- H2 Database
- Maven

**Frontend:**
- HTML5
- Bootstrap 5.3.0
- Vanilla JavaScript (ES6+)
- Font Awesome Icons

## Future Enhancements

- User authentication & authorization
- Sales reports and analytics
- MySQL/PostgreSQL for persistent storage
- Receipt printing
- Multi-user support
- Product categories
- Barcode scanning

## License

Free to use for educational purposes.

---
**Developed with ❤️ for Biashara businesses in Kenya**
