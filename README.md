# Monolith-to-Microservices
PFA Project : Migrating a monolithic application to a microservices architecture.

Client can place order to order service.
Producer can manage his products via product service.
Order service may need to check if the needed products are still in the inventory, thus calling the inventory service.
