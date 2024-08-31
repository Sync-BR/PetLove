# Dados JSON para Cadastro de um Novo Usuário

Link para Cadastro:
<a href="http://localhost:8080/api/user/adduser">http://localhost:8080/api/user/adduser</a>

## Exemplo de JSON para Cadastro:

    

        {
            "username": "Nome",
            "password": "Senha",
            "age": 11,
            "pets": []
        }
            
    
## Retorno Após Adicionar um Novo Usuário
Após adicionar um novo usuário, os dados retornados incluirão informações sobre o usuário e seus pets, caso existam. Se o usuário tiver um pet, as informações detalhadas desse pet serão incluídas na resposta.

Link para Retorno:
<a href="http://localhost:8080/api/user/users">http://localhost:8080/api/user/users</a>

### Exemplo de Retorno de um Usuário Sem Pet:
    [
        {
            "username": "Nome",
            "password": "Senha",
            "age": 11,
            "pets": []
        }
    ]
### Exemplo de Retorno de um Usuário com Pet:
    [
        {
            "username": "SYNC",
            "password": "123",
            "age": 1,
            "pets": [
                {
                    "name": "Francisco",
                    "age": 11,
                    "gender": "Male",
                    "life": 100,
                    "creationDate": "31/08/2024",
                    "needs": {
                        "urine": 50,
                        "faecs": 50
                    },
                    "death": false
                }
            ]
        }
    ]

