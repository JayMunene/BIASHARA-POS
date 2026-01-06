# 🚀 Quick Start Guide - Biashara-POS

## Step 1: Install Prerequisites

### Install Java (if not already installed)
1. Download Java 17 or higher from: https://adoptium.net/
2. Install and verify: Open Command Prompt and run:
   ```
   java -version
   ```

### Install Maven (if not already installed)
1. Download Maven from: https://maven.apache.org/download.cgi
2. Extract to `C:\Program Files\Maven`
3. Add to PATH:
   - Search "Environment Variables" in Windows
   - Edit "Path" variable
   - Add: `C:\Program Files\Maven\bin`
4. Verify: Open NEW Command Prompt and run:
   ```
   mvn -version
   ```

## Step 2: Start the Backend

Open Command Prompt in the project folder (`C:\Users\peter\Desktop\BiasharaPOS`) and run:

```bash
mvn spring-boot:run
```

**Alternative if Maven is not installed:**
You can use your IDE (IntelliJ IDEA, Eclipse, or VS Code with Java extensions):
1. Open the project in your IDE
2. Right-click on `BiasharaPosApplication.java`
3. Select "Run" or "Run Java"

The server will start on **http://localhost:8080**

## Step 3: Open the Frontend

Once the backend is running, open these files in your browser:

### Option A: Double-click the files
- Navigate to `C:\Users\peter\Desktop\BiasharaPOS\FRONTEND\`
- Double-click `products.html` to manage inventory
- Double-click `pos.html` to use the POS terminal

### Option B: Use URLs
- Products: `file:///C:/Users/peter/Desktop/BiasharaPOS/FRONTEND/products.html`
- POS: `file:///C:/Users/peter/Desktop/BiasharaPOS/FRONTEND/pos.html`

## Step 4: Test the Application

1. **Add Products:**
   - Open `products.html`
   - Click "Add New Product"
   - Add a test product (e.g., "Blue Band 500g", buying: 200, selling: 250, quantity: 50)
   - Click "Save Product"

2. **Use POS Terminal:**
   - Open `pos.html`
   - You should see your added products
   - Click on a product to add it to the cart
   - Click "COMPLETE SALE" to process the transaction
   - Check `products.html` - the stock should be updated!

## Troubleshooting

### Backend Issues

**Problem:** "mvn: command not found"
- **Solution:** Maven is not installed. Follow Step 1 to install Maven, or use your IDE to run the application.

**Problem:** "Port 8080 is already in use"
- **Solution:** Another application is using port 8080. Stop it or change the port in `application.properties`:
  ```properties
  server.port=8081
  ```
  Then update the API_URL in frontend files to `http://localhost:8081/api`

**Problem:** "Java version error"
- **Solution:** You need Java 17+. Update your Java installation.

### Frontend Issues

**Problem:** "Error loading products"
- **Solution:** Make sure the backend is running on http://localhost:8080
- Open browser console (F12) to see the exact error

**Problem:** CORS errors
- **Solution:** The backend has CORS enabled. Make sure you're running the latest version of the backend code.

## Quick Commands Reference

```bash
# Start backend
mvn spring-boot:run

# Build project
mvn clean install

# Run tests (if any)
mvn test

# Check Java version
java -version

# Check Maven version
mvn -version
```

## Using IDE Instead of Maven

### VS Code
1. Install "Extension Pack for Java" from Extensions
2. Open the project folder
3. Press F5 or click "Run" on `BiasharaPosApplication.java`

### IntelliJ IDEA
1. Open project folder
2. Wait for Maven to sync
3. Right-click `BiasharaPosApplication.java` → Run

### Eclipse
1. File → Import → Maven → Existing Maven Projects
2. Select the project folder
3. Right-click `BiasharaPosApplication.java` → Run As → Java Application

## Next Steps

Once everything is working:
1. Add more products to your inventory
2. Test the POS terminal with multiple products
3. Check the H2 database console at http://localhost:8080/h2-console
4. Customize the frontend styles in the HTML files

---
**Need help?** Check the main README.md for more detailed information.
