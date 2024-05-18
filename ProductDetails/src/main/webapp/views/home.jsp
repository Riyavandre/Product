<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
          body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f2f5;
            margin: 0;
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            min-height: 100vh;
        }
        .container {
            background-color: #ffffff;
            padding: 30px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            width: 100%;
            box-sizing: border-box;
        }
        h2, h3 {
            color: #333;
            margin-bottom: 15px;
        }
        form {
            display: flex;
            flex-direction: column;
        }
        label {
            font-weight: 600;
            margin-bottom: 5px;
            color: #555;
        }
        input[type="text"], input[type="number"] {
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ddd;
            border-radius: 5px;
            font-size: 14px;
            width: 100%;
            box-sizing: border-box;
        }
        button {
            padding: 12px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }
        button:hover {
            background-color: #0056b3;
        }
        .form-group {
            margin-bottom: 20px;
        }
        .section-title {
            margin-top: 30px;
            font-size: 18px;
            color: #007bff;
        }
        @media (max-width: 600px) {
            .container {
                padding: 20px;
            }
            h2, h3 {
                font-size: 18px;
            }
            label, button {
                font-size: 14px;
            }
            input[type="text"], input[type="number"] {
                font-size: 12px;
            }
        }
    </style>

</head>

<body>
     <div class="container">
        <h2>Insert Details</h2>
        <form action="insert" method="post">
            <div class="section-title">Master Table Details</div>
            <div class="form-group">
                <label for="macAddress">MAC Address</label>
                <input type="text" id="macAddress" name="macAddress" required>
            </div>
            <div class="form-group">
                <label for="macId">MAC ID</label>
                <input type="number" id="macId" name="macId" required>
            </div>
            <div class="form-group">
                <label for="macName">MAC Name</label>
                <input type="text" id="macName" name="macName" required>
            </div>
            <div class="form-group">
                <label for="companyName">Company Name</label>
                <input type="text" id="companyName" name="companyName" required>
            </div>

            <div class="section-title">Product Table Details</div>
            <div class="form-group">
                <label for="prodName">Product Name</label>
                <input type="text" id="prodName" name="prodName" required>
            </div>
            <div class="form-group">
                <label for="prodDescription">Product Description</label>
                <input type="text" id="prodDescription" name="prodDescription" required>
            </div>
            <div class="form-group">
                <label for="prodPrize">Product Prize</label>
                <input type="number" step="0.01" id="prodPrize" name="prodPrize" required>
            </div>
            <div class="form-group">
                <label for="prodLocationId">Product Location ID</label>
                <input type="number" id="prodLocationId" name="prodLocationId" required>
            </div>

            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>