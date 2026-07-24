---
title: "System::Security::Cryptography::AsymmetricAlgorithm klasse"
linktitle: "AsymmetricAlgorithm"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::AsymmetricAlgorithm klasse. Abstracte basisklasse voor asymmetrische encryptie-algoritmen. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 200
url: /nl/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


Abstracte basisklasse voor asymmetrische encryptie-algoritmen. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Clear](./clear/)() | Geeft alle bronnen vrij. |
| static [Create](./create/)() | Maakt een standaardalgoritme aan. Niet geïmplementeerd. |
| static [Create](./create/)(const String\&) | Maakt een algoritme op basis van naam aan. Niet geïmplementeerd. |
| [Dispose](./dispose/)() override | Vrijgeeft bronnen die eigendom zijn van het huidige object. |
| virtual [FromXmlString](./fromxmlstring/)(String) | Leest algoritmeparameters uit een XML‑string. |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | Haalt het te gebruiken sleuteluitwisselingsalgoritme op. |
| virtual [get_KeySize](./get_keysize/)() | RTTI-informatie. |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | Haalt een array met toegestane sleutelgroottes op. |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | Haalt het te gebruiken handtekeningalgoritme op. |
| virtual [set_KeySize](./set_keysize/)(int32_t) | Stelt de sleutelgrootte in. |
| virtual [ToXmlString](./toxmlstring/)(bool) | Schrijft algoritmeparameters naar een XML‑string. |
## Zie ook

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
