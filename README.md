# Produtos-API
API de produtos desenvolvida com Spring Boot e Spring Data JPA e H2 como banco de dados.

## Endpoints
1. Criar produto - POST "/produtos" e Produto no Body
2. Obter por ID - GET "/produtos/{id}" caso não exista retorna null
3. Deletar por ID - DELETE "/produtos/{id}"
4. Atualizar - PUT "/produtos/{id}" e Produto no Body
5. Buscar por nome - GET "/produtos" e o parâmetro nome na URL
