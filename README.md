# Monolith-to-Microservices
End Of Year Project (PFA) : Migrating a monolithic application to a microservices architecture.

Clients can place orders to order service.
<br/>
Producers can manage their products via product service.
<br/>
Order service checks if the ordered products are in the inventory, thus calling the stock service. [Inter Service Communication]
<br/>
<br/>
## System Design
![Diagramme sans nom drawio (1)](https://github.com/MYassineBoum/Monolith-to-Microservices/assets/115194839/8a48d418-adb2-4176-9cba-32532a9103d1)
<br/>
<br/>
## 3 Patterns spotted
<ul>
  <li>Microservice Per Database</li>
  <li>API Gateway</li>
  <li>Circuit Breaker</li>
</ul>


