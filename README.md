# Monolith-to-Microservices
End Of Year Project (PFA) : Migrating a monolithic application to a microservices architecture.

Clients can place orders to order service.
<br/>
Producers can manage their products via product service.
<br/>
Order service checks if the ordered products are in the inventory, thus calling the inventory service. [Inter Service Communication]
<br/>
<br/>
## System Design
![sys_design_MonoToMic](https://github.com/MYassineBoum/Monolith-to-Microservices/assets/115194839/ede6812c-fb0e-4f63-ba4f-8cc790d895a9)
<br/>
<br/>
## 3 Patterns spotted
<ul>
  <li>Microservice Per Database</li>
  <li>API Gateway</li>
  <li>Circuit Breaker</li>
</ul>


