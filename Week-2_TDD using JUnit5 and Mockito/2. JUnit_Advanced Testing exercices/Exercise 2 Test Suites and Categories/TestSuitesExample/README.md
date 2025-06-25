# JUnit 5 Test Suites and Categories Example

This project demonstrates how to organize and run JUnit 5 tests using test suites and categories (tags).

## Project Structure

```
src/
├── main/java/com/junit/testsuite/
│   ├── Calculator.java          # Simple calculator class
│   └── StringProcessor.java     # String processing utilities
└── test/java/com/junit/testsuite/
    ├── TestCategories.java      # Test category constants
    ├── CalculatorTest.java      # Calculator tests with tags
    ├── StringProcessorTest.java # String processor tests with tags
    ├── AllTests.java           # Suite running all tests
    ├── FastTestSuite.java      # Suite running only fast tests
    └── SmokeTestSuite.java     # Suite running only smoke tests
```

## Test Categories (Tags)

Tests are organized using the following tags:

- **@Tag("fast")** - Fast-running unit tests
- **@Tag("slow")** - Slow-running integration tests  
- **@Tag("smoke")** - Basic functionality tests
- **@Tag("regression")** - Regression testing
- **@Tag("edge-case")** - Edge case testing
- **@Tag("math")** - Mathematical operation tests
- **@Tag("string")** - String processing tests
- **@Tag("performance")** - Performance-related tests

## Test Suites

### 1. AllTests Suite
Runs all test classes using `@SelectClasses`:
```java
@Suite
@SelectClasses({
    CalculatorTest.class,
    StringProcessorTest.class
})
public class AllTests { }
```

### 2. FastTestSuite
Runs only tests tagged with "fast":
```java
@Suite
@SelectPackages("com.junit.testsuite")
@IncludeTags("fast")
public class FastTestSuite { }
```

### 3. SmokeTestSuite
Runs only tests tagged with "smoke":
```java
@Suite
@SelectPackages("com.junit.testsuite")
@IncludeTags("smoke")
public class SmokeTestSuite { }
```

## Running Tests

### 1. Run All Tests
```cmd
mvn test
```

### 2. Run Specific Test Suite
```cmd
mvn test -Dtest=AllTests
mvn test -Dtest=FastTestSuite
mvn test -Dtest=SmokeTestSuite
```

### 3. Run Tests by Tag
```cmd
mvn test -Dgroups=fast
mvn test -Dgroups=smoke
mvn test -Dgroups=math
mvn test -Dgroups="fast,smoke"
```

### 4. Exclude Tests by Tag
```cmd
mvn test -DexcludedGroups=slow
mvn test -DexcludedGroups="slow,performance"
```

### 5. Run Individual Test Classes
```cmd
mvn test -Dtest=CalculatorTest
mvn test -Dtest=StringProcessorTest
```

## Expected Output

### Running AllTests Suite:
- Executes all tests from both CalculatorTest and StringProcessorTest
- Should show approximately 25+ test methods being executed
- Mix of fast and slow tests will run

### Running FastTestSuite:
- Executes only tests tagged with "fast"
- Should run most tests but skip performance tests
- Faster execution time

### Running SmokeTestSuite:
- Executes only tests tagged with "smoke"  
- Should run critical functionality tests
- Minimal test set for basic validation

## Test Results Interpretation

- **GREEN**: All tests passed
- **YELLOW**: Some tests skipped (when using filters)
- **RED**: Some tests failed (fix implementation)

## Key Concepts Demonstrated

1. **Test Organization**: Using `@Tag` annotations to categorize tests
2. **Test Suites**: Using `@Suite` with different selection strategies
3. **Selective Execution**: Running subsets of tests based on criteria
4. **Maven Integration**: Using Maven Surefire plugin for test execution
5. **Test Reporting**: Understanding test execution reports

## Benefits of Test Suites and Categories

- **Faster Feedback**: Run quick smoke tests during development
- **Selective Testing**: Run specific test categories for different scenarios
- **CI/CD Integration**: Different test phases in build pipelines
- **Test Organization**: Better structure for large test suites
- **Performance**: Avoid running slow tests unnecessarily
