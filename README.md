# one-to-one-mapping-springboot-restapi
#this is simple one to one mapping with one small exception handling file includded just check once

Json Request:
```bhavani
URL:- http://localhost:4444/save
httpmethod: POST
```

```bhavani
{
    "id": 112,
    "name": "bhavani",
    "age": 13,
    "address": {
        "aid": 10,
        "villageName": "chirala",
        "pincode": 521
    }
}
```
Json Response:
```
{
    "id": 112,
    "name": "bhavani",
    "age": 13,
    "address": {
        "aid": 10,
        "villageName": "chirala",
        "pincode": 521
    }
}
```
