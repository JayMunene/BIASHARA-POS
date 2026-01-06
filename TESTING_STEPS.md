# 🧪 Testing Your Biashara-POS Application

## Current Status
✅ Backend is starting (Maven is downloading dependencies and compiling)
✅ Frontend is ready and waiting for backend connection

## Wait for Backend to Start

Watch your terminal for this message:
```
Started BiasharaPosApplication in X.XXX seconds
```

You should also see:
```
Tomcat started on port(s): 8080 (http)
```

This means the server is ready! ⚡

## Step-by-Step Testing

### Test 1: Add Products (Inventory Management)

1. **Open products.html:**
   - Double-click: `C:\Users\peter\Desktop\BiasharaPOS\FRONTEND\products.html`
   - Or paste in browser: `file:///C:/Users/peter/Desktop/BiasharaPOS/FRONTEND/products.html`

2. **You should see:** Empty product list (no products yet)

3. **Add a product:**
   - Click "Add New Product" button
   - Fill in:
     - Product Name: `Blue Band 500g`
     - Buying Price: `200`
     - Selling Price: `250`
     - Quantity: `50`
   - Click "Save Product"

4. **Expected result:** Product appears in the table with ID #1

5. **Add more products:**
   - `Omo 1kg` - Buying: 280, Selling: 350, Qty: 30
   - `Milk 500ml` - Buying: 50, Selling: 70, Qty: 100
   - `Bread` - Buying: 40, Selling: 55, Qty: 20

### Test 2: Delete Products

1. Click the red trash icon next to any product
2. Confirm deletion
3. Product should disappear from the list

### Test 3: POS Terminal (Make Sales)

1. **Open pos.html:**
   - Double-click: `C:\Users\peter\Desktop\BiasharaPOS\FRONTEND\pos.html`
   - Or paste: `file:///C:/Users/peter/Desktop/BiasharaPOS/FRONTEND/pos.html`

2. **You should see:** Grid of products you added earlier

3. **Add items to cart:**
   - Click on "Blue Band 500g" - it appears in the cart
   - Click on "Omo 1kg" twice - quantity increases to 2
   - Click on "Milk 500ml" - added to cart

4. **Verify cart:**
   - Cart shows all items with quantities
   - Total amount is calculated correctly
   - Use +/- buttons to adjust quantities

5. **Complete a sale:**
   - Click "COMPLETE SALE" button
   - Confirm the transaction
   - You should see: "Sale completed successfully!"

6. **Verify stock update:**
   - Go back to `products.html`
   - Refresh if needed
   - Stock quantities should be reduced:
     - Blue Band: 50 → 49
     - Omo: 30 → 28
     - Milk: 100 → 99

### Test 4: Search Functionality (POS)

1. In `pos.html`, type in the search box
2. Products should filter as you type
3. Try: "Blue" - only Blue Band shows
4. Clear search - all products appear again

### Test 5: Low Stock Warning

1. In `products.html`, add a product with quantity < 5
2. The quantity badge should be RED (warning)
3. Products with qty ≥ 5 show GREEN badge

## API Endpoints You Can Test

Open a new Command Prompt and test the API directly:

```bash
# Get all products
curl http://localhost:8080/api/products

# Add a product via API
curl -X POST http://localhost:8080/api/products -H "Content-Type: application/json" -d "{\"name\":\"Sugar 1kg\",\"buyingPrice\":120.0,\"sellingPrice\":150.0,\"quantity\":60}"

# Get specific product (replace 1 with actual ID)
curl http://localhost:8080/api/products/1
```

## Database Console (Advanced)

Visit: http://localhost:8080/h2-console

Login with:
- JDBC URL: `jdbc:h2:mem:biasharadb`
- Username: `sa`
- Password: (leave blank)

Run SQL:
```sql
SELECT * FROM products;
```

## Troubleshooting

### "Error loading products" still shows
- Wait 30 more seconds for server to fully start
- Check terminal for "Started BiasharaPosApplication" message
- Refresh the browser page (F5)

### Products don't save
- Check browser console (F12) for errors
- Verify backend terminal shows no errors
- Make sure you're filling all required fields

### Server won't start
- Check if port 8080 is in use by another app
- Look for error messages in the terminal
- Try: `mvn clean install` then `mvn spring-boot:run`

## Success Criteria ✅

Your app is working perfectly if:
- ✅ You can add, view, and delete products
- ✅ POS terminal shows all products
- ✅ You can add products to cart and adjust quantities
- ✅ Completing sales updates inventory automatically
- ✅ Search filters products in real-time
- ✅ Low stock items show red badges

## Next Steps

Once testing is successful:
1. Add more products for your actual shop
2. Customize the frontend (colors, logo, etc.)
3. Consider adding more features from README.md
4. For production, switch from H2 to MySQL (see README)

---
**Happy Testing! 🎉**
