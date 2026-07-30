---
title: "System::Security::Cryptography::RandomNumberGenerator classe"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::RandomNumberGenerator classe. Classe astratta da cui ereditare i generatori di numeri casuali. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 2600
url: /it/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


Classe astratta da cui ereditare i generatori di numeri casuali. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Create](./create/)() | Crea un'istanza dell'implementazione predefinita di un generatore di numeri casuali crittografico che può essere usato per generare dati casuali. Not implemented. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | Riempie gli elementi dell'array esistente con byte casuali. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | Riempie la porzione dell'array esistente con byte casuali. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | Riempie gli elementi della vista dell'array esistente con byte casuali. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | Riempie la porzione della vista dell'array esistente con byte casuali. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Riempie gli elementi dell'array stack esistente con byte casuali. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | Riempie la porzione dell'array stack esistente con byte casuali. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | Riempie gli elementi dell'array esistente con byte casuali diversi da zero. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | Riempie gli elementi della vista dell'array esistente con byte casuali diversi da zero. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Riempie gli elementi dell'array stack esistente con byte casuali diversi da zero. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
