---
title: "System::Security::Cryptography::RNGCryptoServiceProvider klasse"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RNGCryptoServiceProvider klasse. Willekeurige getallengenerator die de CSP-notie volgt. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3300
url: /nl/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


Willekeurige getallengenerator die de CSP-notie volgt. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | Vult bestaande array‑elementen met willekeurige bytes. |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | Vult bestaande array‑view‑elementen met willekeurige bytes. |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | Vult bestaande array‑elementen met willekeurige niet‑nul bytes. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | Vult bestaande array‑view‑elementen met willekeurige niet‑nul bytes. |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | Constructor. |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | Destructor. |
## Zie ook

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
