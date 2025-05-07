
---

## 🔁 Framework Design Pattern

### 🔹 Page Object Model (POM)
Each page (like `AddCustomerPage`) contains:
- Locators
- Actions (methods that perform operations)
- Getters for validation

### 🔹 TestNG
Used for:
- Test configuration
- Test suite management
- Parallel execution (if needed)
- Annotations (`@Test`, `@BeforeClass`, etc.)

### 🔹 Data-Driven Testing
Test data is sourced from:
- Excel/CSV files using Apache POI (if applicable)
- Provided via DataProvider methods in utilities

---

## 🔧 Tools & Technologies

| Tool | Purpose |
|------|---------|
| Java | Programming language |
| Selenium WebDriver | UI Automation |
| TestNG | Test execution framework |
| ExtentReports | Reporting |
| Apache POI | Excel reading (optional) |
| ChromeDriver | Browser automation |
| Maven (optional) | Dependency and build management |

---

## 🔄 Test Execution Flow

1. **Launch browser**
2. **Navigate to Morph ERP**
3. **Login as Admin**
4. **Navigate to Sales → Add Customer**
5. **Perform input actions and form submission**
6. **Capture validation results**
7. **Log test status in Extent Report**
8. **Close browser**

---

## 📊 Reporting

- **ExtentReports** integrated to generate HTML test execution reports
- Screenshots attached on test failure (if implemented)
- Report path: `/test-output/ExtentReport.html`

---

## 📦 Data Sharing & Reuse

- Page classes are reusable across test cases
- Common functions like login/logout are centralized in utility classes
- Test data is externalized (Excel/CSV), promoting easy updates without code changes

---

## ✅ Sample Test Case: Add Customer Form Validation

| Test Step | Expected Result |
|-----------|-----------------|
| Submit form with blank fields | Validation errors shown |
| Submit with invalid email | “Enter valid email” message |
| Enter all valid inputs | Customer added successfully |
| Click Reset button | All fields cleared |
| Upload invalid format file | File format error shown |

---

## 🚀 How to Run

1. Clone the repo or copy project files.
2. Install dependencies (Selenium, TestNG).
3. Ensure `testng.xml` is configured.
4. Run using:
   - **IDE** (Right-click testng.xml → Run)
   - **Command line**: `mvn test` (if Maven used)

---

## 📌 Notes

- ChromeDriver must match your Chrome browser version.
- For smooth execution, use a stable internet connection and ensure no pop-ups block the UI.

---

## 📁 Resources

- [TestNG Docs](https://testng.org/doc/)
- [Selenium Docs](https://www.selenium.dev/documentation/)
- [ExtentReports](http://extentreports.com/)

---

## 🙋 Author

**Tejas Jayendra Aware

