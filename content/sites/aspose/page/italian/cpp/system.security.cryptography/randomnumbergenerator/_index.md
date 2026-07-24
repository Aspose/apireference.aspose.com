---
title: "System::Security::Cryptography::RandomNumberGenerator classe"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Page per C++"
description: "System::Security::Cryptography::RandomNumberGenerator classe. Classe astratta da cui ereditare per i generatori di numeri casuali. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 2600
url: /it/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


Classe astratta da cui ereditare per i generatori di numeri casuali. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [Create](./create/)() | Crea un'istanza dell'implementazione predefinita di un generatore di numeri casuali crittografico che può essere usato per generare dati casuali. Non implementato. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | Riempie gli elementi dell'array esistente con byte casuali. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | Riempie la porzione dell'array esistente con byte casuali. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | Riempie gli elementi della vista dell'array esistente con byte casuali. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | Riempie la porzione della vista dell'array esistente con byte casuali. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Riempie gli elementi dell'array di stack esistente con byte casuali. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | Riempie la porzione dell'array di stack esistente con byte casuali. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | Riempie gli elementi dell'array esistente con byte casuali diversi da zero. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | Riempie gli elementi della vista dell'array esistente con byte casuali diversi da zero. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Riempie gli elementi dell'array di stack esistente con byte casuali diversi da zero. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
