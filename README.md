# classwork
classwork
# How to run the test
mvn verify -Denv=qa -Dbrowser=ch -Dcucumber.filter.tags="@smoke"
mvn verify -Denv=qa -Dbrowser=ff -Dcucumber.filter.tags="@smoke"
mvn verify -Denv=qa -Dbrowser=safari -Dcucumber.filter.tags="@smoke"