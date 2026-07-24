---
title: "Classe System::Security::Cryptography::HMACSHA512"
linktitle: "HMACSHA512"
second_title: "Aspose.Page per C++"
description: "Classe System::Security::Cryptography::HMACSHA512. Codice di autenticazione di messaggi basato su hash che utilizza la funzione hash SHA512. Implementato parzialmente. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1900
url: /it/cpp/system.security.cryptography/hmacsha512/
---
## HMACSHA512 class


Codice di autenticazione di messaggi basato su hash [Authentication](../../system.security.authentication/) che utilizza la funzione hash [SHA512](../sha512/). Implementato parzialmente. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class HMACSHA512 : public System::Security::Cryptography::HashAlgorithm
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | Calcola [HMAC](../hmac/). |
| [HMACSHA512](./hmacsha512/)() | Costruttore. |
| [HMACSHA512](./hmacsha512/)(const System::ArrayPtr\<uint8_t\>\&) | Costruttore. |
## Vedi anche

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
