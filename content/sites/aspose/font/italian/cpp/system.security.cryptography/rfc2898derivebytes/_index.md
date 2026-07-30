---
title: "System::Security::Cryptography::Rfc2898DeriveBytes class"
linktitle: "Rfc2898DeriveBytes"
second_title: "Aspose.Font per C++"
description: "Classe System::Security::Cryptography::Rfc2898DeriveBytes. Implementa la derivazione di chiavi basata su password, PBKDF2. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject() . Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 2900
url: /it/cpp/system.security.cryptography/rfc2898derivebytes/
---
## Rfc2898DeriveBytes class


Implementa la derivazione di chiavi basata su password, PBKDF2. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Rfc2898DeriveBytes : public System::Security::Cryptography::DeriveBytes
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [GetBytes](./getbytes/)(int32_t) override | Riempie gli elementi dell'array esistente con byte di chiave pseudo-casuali. |
| [Reset](./reset/)() override |  |
| [Rfc2898DeriveBytes](./rfc2898derivebytes/)(ArrayPtr\<uint8_t\>, ArrayPtr\<uint8_t\>, int32_t) | Informazioni RTTI. |
## Vedi anche

* Class [DeriveBytes](../derivebytes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
