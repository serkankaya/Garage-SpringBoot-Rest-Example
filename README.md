# Garage Project

### SpringBoot Rest Example

### Senario
* In this problem, you have a garage that can be parked up to 10 slots (you can consider each slot is 1 unit range) at any
given point in time. You should create an automated ticketing system that allows your customers to use your garage
without human intervention. When a car enters your garage, you give a unique ticket issued to the driver. The ticket
issuing process includes us documenting the plate and the colour of the car and allocating an available slots to the car
before actually handing over a ticket to the driver. When a vehicle holds number of slots with its own width, you have to
leave 1 unit slot to next one. The customer should be allocated slot(s) which is nearest to the entry. At the exit the
customer returns the ticket which then marks slot(s) they were using as being available.
Create a spring boot project and then, publish a rest controller. Your controller methods include park, leave and status.

#### Note: 
* Car holds 1 slot
* Jeep holds 2 slots
* Truck holds 4 slot

###Sample Input 1
1. park 34-SO-1988 Black Car
2. park 34-BO-1987 Red Truck
3. park 34-VO-2018 Blue Jeep
4. park 34-HBO-2020 Black Truck
5. leave 3
6. park 34-LO-2000 White Car
status
###Sample Output 1

1. Allocated 1 slot.
2. Allocated 4 slots.
3. Allocated 2 slots.
4. Garage is full.
5. Allocated 1 slot.
6. Status:
   * 34-SO-1998 Black [1]
   * 34-BO-1987 Red   [3,4,5,6]
   * 34-LO-2000 Black [8]

**Postman**</br>

* [Postman Collection](/files/Garage_API.postman_collection.json)

![](/files/postman.png)</br></br>

**Swagger**</br>
* *Swagger Host*
  * http://localhost:8085/swagger-ui/index.html#/ </br>
* *Apidoc*
    * http://localhost:8085/apidoc </br>
  
![](/files/swagger.jpg)</br></br>
