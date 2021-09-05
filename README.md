# cloudgateway
Basic Spring Cloud Gateway App

Netflix Zuul Proxy has been discontinued, so I have used Spring Cloud Gateway instead.

Steps are as below:
1. Run UserdataApplication microservice (configured to run on port 8080)
2. Run CloudgatewayApplication microservice which is configured to run on port 8085
   This will route all the requests having URLs matching to /user/** coming to 8085 to 8080 and return the results

