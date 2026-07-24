---
title: "System::Security::Cryptography::RandomNumberGenerator klasse"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RandomNumberGenerator klasse. Abstracte klasse voor willekeurige getalgeneratoren om van te erven. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2600
url: /nl/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


Abstracte klasse voor willekeurige getalgeneratoren om van te erven. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik die pointer om deze als argument aan functies door te geven.

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Create](./create/)() | Maakt een instantie aan van de standaardimplementatie van een cryptografische willekeurige getalgenerator die kan worden gebruikt om willekeurige gegevens te genereren. Niet geïmplementeerd. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | Vult bestaande array‑elementen met willekeurige bytes. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | Vult bestaande array‑slice met willekeurige bytes. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | Vult bestaande array‑view‑elementen met willekeurige bytes. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | Vult bestaande array‑view‑slice met willekeurige bytes. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Vult bestaande stack‑array‑elementen met willekeurige bytes. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | Vult bestaande stack‑array‑slice met willekeurige bytes. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | Vult bestaande array‑elementen met willekeurige niet‑nul bytes. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | Vult bestaande array‑view‑elementen met willekeurige niet‑nul bytes. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Vult bestaande stack‑array‑elementen met willekeurige niet‑nul bytes. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
