@echo off
echo ============================================
echo JUnit 5 Test Suites and Categories Demo
echo ============================================

echo.
echo 1. Running All Tests...
echo ============================================
mvn test
echo.

echo 2. Running AllTests Suite...
echo ============================================
mvn test -Dtest=AllTests
echo.

echo 3. Running FastTestSuite (only fast tests)...
echo ============================================
mvn test -Dtest=FastTestSuite
echo.

echo 4. Running SmokeTestSuite (only smoke tests)...
echo ============================================
mvn test -Dtest=SmokeTestSuite
echo.

echo 5. Running tests by tag - smoke tests only...
echo ============================================
mvn test -Dgroups=smoke
echo.

echo 6. Running tests by tag - fast tests only...
echo ============================================
mvn test -Dgroups=fast
echo.

echo 7. Running tests by tag - math tests only...
echo ============================================
mvn test -Dgroups=math
echo.

echo 8. Excluding slow tests...
echo ============================================
mvn test -DexcludedGroups=slow
echo.

echo ============================================
echo Test Suite Demo Complete!
echo ============================================
pause
