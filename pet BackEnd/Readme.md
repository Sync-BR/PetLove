
# Exemplo de Autenticação de Usuário na API
Para autenticar um usuário, você deve acessar o seguinte endpoint da API:

    http://localhost:8080/api/user/loginUser{Usuario}Pass{Password}

No link acima, substitua {Usuario} e {Password} pelos dados reais do usuário que deseja autenticar. Por exemplo, se o usuário for SYNC e a senha for 1212, o link final ficaria assim:

Link final da api: 

    http://localhost:8080/api/user/loginUserSYNCPass1212
## Comportamento da API
Se as credenciais estiverem corretas:

        {
            "username": "SYNC",
            "password": "1212",
            "age": 1,
            "pets": []
        }

        
* A API retornará os dados do usuário e o status 200 OK.



* Se as credenciais forem inválidas:
    * A API retornará o status 401 UNAUTHORIZED.


# Exemplo de  Cadastro:
Link para Cadastro:
<a href="http://localhost:8080/api/user/adduser">http://localhost:8080/api/user/adduser</a>


        {
            "username": "Nome",
            "password": "Senha",
            "age": 11
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

# Exemplo de cadastro de pets
    Link para os registros de pets

    http://localhost:8080/api/user/addpet/sync

## Exemplo de json para cadastro
    {
        "name": "Francisco",
        "age": 1,
        "gender": "Male",
        "life": 100,
        "creationDate": "31/08/2024",
        "needs": {
                    "urine": 50,
                    "faecs": 50
                },
        "death": false
    }
## Exemplo de retorno depois do registro do pet
    {
                "username": "sync",
                "password": "2404",
                "email": "eduardofreitasfr@gmail.com",
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
