---
title: "System::Security::Cryptography::HMACSHA512 class"
linktitle: "HMACSHA512"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::HMACSHA512 class. Codice di autenticazione del messaggio basato su hash che utilizza la funzione hash SHA512. Implementato parzialmente. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 1900
url: /it/cpp/system.security.cryptography/hmacsha512/
---
## HMACSHA512 class


Codice di autenticazione del messaggio basato su hash [Authentication](../../system.security.authentication/) che utilizza la funzione hash [SHA512](../sha512/). Implementato parzialmente. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
* Library [Aspose.Font for C++](../../)
