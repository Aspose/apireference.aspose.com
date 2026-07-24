---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter klasse"
linktitle: "AsymmetricSignatureFormatter"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter klasse. Basis‑klasse voor asymmetrische handtekeningformatters. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 400
url: /nl/cpp/system.security.cryptography/asymmetricsignatureformatter/
---
## AsymmetricSignatureFormatter class


Basis‑klasse voor asymmetrische handtekeningformatters. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class AsymmetricSignatureFormatter : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) | RTTI-informatie. |
| virtual [CreateSignature](./createsignature/)(System::SharedPtr\<HashAlgorithm\>) | Maakt de handtekening voor de opgegeven hashwaarde. |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | Stelt het te gebruiken hash-algoritme in. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | Stelt het te gebruiken asymmetrische algoritme in bij het berekenen van de handtekening. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
