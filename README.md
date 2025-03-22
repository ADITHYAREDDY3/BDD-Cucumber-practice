# BDD-Cucumber-Practice

## Project Overview
This project is a Selenium automation framework using **Cucumber (BDD), Page Object Model (POM), and TestNG** for testing the Reddif and the facebookPage. The framework automates various functionalities, including login, course search, element interactions, operations.

## Features
- **BDD with Cucumber**: Implements feature files with step definitions.
- **Page Object Model (POM)**: Organizes UI elements and actions for better maintainability.
- **TestNG Integration**: Executes test cases and generates reports.
- **Extent Reports**: Provides detailed test execution reports.
- **Cross-browser Testing**: Supports Chrome and Firefox.
- **Maven Integration**: Manages dependencies and builds the project.
- **CI/CD with Jenkins**: Enables continuous testing.
- **Automation of Key Functionalities**:
  - Radio buttons, checkboxes, dropdowns.
  - Login and user registration.
  - Course filtering and searching.
  - Shopping cart operations.
  - Handling alerts and pop-ups.
  
## Project Structure
```
BDD-Cucumber-Practice/
│-- src/test/java/
│   │-- stepDefinitions/   # Cucumber step definitions
│   │-- pageObjects/       # Page classes for POM
│   │-- runners/           # TestNG runner classes
│   │-- utilities/         # Helper classes (WebDriver, Config, Extent Reports)
│-- src/test/resources/
│   │-- features/          # Cucumber feature files
│   │-- config.properties  # Test configuration file
│-- pom.xml                # Maven dependencies
│-- test-output/           # Extent Report output
```

## Prerequisites
- **Java 8+**
- **Maven**
- **TestNG**
- **Cucumber-JVM**
- **Selenium WebDriver**
- **Extent Reports**

## Setup and Execution
1. **Clone the Repository**
   ```sh
   git clone https://github.com/ADITHYAREDDY3/BDD-Cucumber-practice.git
   cd BDD-Cucumber-practice
   ```
2. **Install Dependencies**
   ```sh
   mvn clean install
   ```
3. **Run Tests**
   - Using Maven:
     ```sh
     mvn test
     ```
   - Using TestNG XML:
     ```sh
     mvn test -DsuiteXmlFile=testng.xml
     ```

## Reporting
- **Extent Reports** are generated in the `test-output/` folder after test execution.

## CI/CD Integration
- This project is configured for **Jenkins** to automate test execution.
- Configure a Jenkins job to pull the latest code and run tests using `mvn test`.

## Contributing
- Fork the repository.
- Create a new branch for your feature.
- Commit your changes and push to the branch.
- Create a pull request.

## License
This project is open-source and free to use.

