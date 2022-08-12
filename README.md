# API Meu Jardim 🌻🌵🌱
API Rest com finalidade de estudos - Spring Boot &amp; Docker

Rotas disponiveis:

`POST`

http://localhost:8080/plantas

Body:

```json

{
    "nome": "Lágrimas-de-bebê",
    "descricao": "Uma planta apreciada pelo valor ornamental de suas folhas, pode se espalhar rapidamente e cobrir a superfíce como um tapete.",
    "imagens": [
        "s3://meu-jardim/lagrimas_de_bebe.jpg",
        "s3://meu-jardim/lagrimas_de_bebe_1.jpg"
    ],
    "cuidados": "Sol parcial ou sombra total, manter o solo sempre úmido mas sem acumulo de água."
}

```

<br><br>

`GET`

http://localhost:8080/plantas

Response:

```json
[
    {
        "id": 1,
        "nome": "Lágrimas-de-bebê",
        "descricao": "Uma planta apreciada pelo valor ornamental de suas folhas, pode se espalhar rapidamente e cobrir a superfíce como um tapete.",
        "imagens": [
            "s3://meu-jardim/lagrimas_de_bebe.jpg",
            "s3://meu-jardim/lagrimas_de_bebe_1.jpg"
        ],
        "cuidados": "Sol parcial ou sombra total, manter o solo sempre úmido mas sem acumulo de água."
    },
    {
        "id": 2,
        "nome": "Colar-de-corações",
        "descricao": "A colar-de-corações é uma trepadeira suculenta elegante e resistente.",
        "imagens": [
            "s3://meu-jardim/colar_de_coracoes.jpg",
            "s3://meu-jardim/colar_de_coracoes_2.jpg",
            "s3://meu-jardim/colar_de_coracoes_3.jpg"
        ],
        "cuidados": "Sol parcial, tolerante a seca, menos rega, regar quando sole estiver seco."
    }
]
```

<br><br>


`GET/{id}`

http://localhost:8080/plantas/1

Response:

```json
{
        "id": 1,
        "nome": "Lágrimas-de-bebê",
        "descricao": "Uma planta apreciada pelo valor ornamental de suas folhas, pode se espalhar rapidamente e cobrir a superfíce como um tapete.",
        "imagens": [
            "s3://meu-jardim/lagrimas_de_bebe.jpg",
            "s3://meu-jardim/lagrimas_de_bebe_1.jpg"
        ],
        "cuidados": "Sol parcial ou sombra total, manter o solo sempre úmido mas sem acumulo de água."
    }
```
