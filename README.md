# Monolith-to-Microservices
PFA Project : Migrating a monolithic application to a microservices architecture.

Clients can place order to order service.
<br/>
Producers can manage their products via product service.
<br/>
Order service checks if the ordered products are in the inventory, thus calling the inventory service. [Inter Service Communication]
