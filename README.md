# Spring Boot product-e-commerce

## Endpoints

### Sign-Up
....

POST /api/authentication/sign-up HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 72

{
    "name" :"user",
    "username" :"user",
    "password":"123"
}

....

### Sign-In
....

POST /api/authentication/sign-in HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 57

{
    "username" :"admin",
    "password" :"lolSett"
}

....

### change-Role
....

PUT /api/user/change/ADMIN HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9VU0VSIiwidXNlcklkIjoyLCJleHAiOjE2NDgwNDA3MDV9.dRre7ciG5Itg2JB9NTIZ2N58FRWjfTYfi_keSy4sNfBpKcOixQ6Gf9k4uTprdP6uLJGXAZChkD6BacdnXyp3ew

....

### Save Product
....

POST /api/product HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjQ4MDQxNzgwfQ.kycqpxMSWKTLiAhfZ0hkuTb6s78PtNO978ADEJxZR0g4bbWOoE4ya1wA3Mbqm-YqtaTkJIfTGZhtd_kg04pCPA
Content-Type: application/json
Content-Length: 86

{"name":"Product-2",
"description":"desc-2",
"price":"5.1",
"ProductType":"LAPTOP"
}

....

### Get All Products
....

GET /api/product HTTP/1.1
Host: localhost:8080

....

### Delete Product
....

DELETE /api/product/2 HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjQ4MDQxNzgwfQ.kycqpxMSWKTLiAhfZ0hkuTb6s78PtNO978ADEJxZR0g4bbWOoE4ya1wA3Mbqm-YqtaTkJIfTGZhtd_kg04pCPA

....

### Save Purchase
....

POST /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjQ4MDQxNzgwfQ.kycqpxMSWKTLiAhfZ0hkuTb6s78PtNO978ADEJxZR0g4bbWOoE4ya1wA3Mbqm-YqtaTkJIfTGZhtd_kg04pCPA
Content-Type: application/json
Content-Length: 78

{
    "userId":2,
    "ProductId":1,
    "price":8.9,
    "color":"blue"
}

....

### get Purchases of User
....

GET /api/purchase HTTP/1.1
Host: localhost:8080
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsInJvbGVzIjoiUk9MRV9BRE1JTiIsInVzZXJJZCI6MiwiZXhwIjoxNjQ4MDQxNzgwfQ.kycqpxMSWKTLiAhfZ0hkuTb6s78PtNO978ADEJxZR0g4bbWOoE4ya1wA3Mbqm-YqtaTkJIfTGZhtd_kg04pCPA

....

