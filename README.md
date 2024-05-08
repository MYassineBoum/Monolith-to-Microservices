# Monolith-to-Microservices
PFA Project : Migrating a monolithic application to a microservices architecture.

Clients can place order to order service.
<br/>
Producers can manage their products via product service.
<br/>
Order service checks if the ordered products are in the inventory, thus calling the inventory service. [Inter Service Communication]
<br/>
<br/>
## System Design
![system_design_pfa](https://github.com/MYassineBoum/Monolith-to-Microservices/assets/115194839/25ba1ec8-3e66-4297-975d-5fca75370f57)
<br/>
<br/>
## 3 Patterns spotted
<ul>
  <li>Microservice Per Database</li>
  <li>API Gateway</li>
  <li>Circuit Breaker</li>
</ul>


