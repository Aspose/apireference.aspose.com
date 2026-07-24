---
title: "System::Security::Cryptography::ICspAsymmetricAlgorithm klasse"
linktitle: "ICspAsymmetricAlgorithm"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::ICspAsymmetricAlgorithm klasse. Basis‑klasse voor asymmetrische algoritmen. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 2100
url: /nl/cpp/system.security.cryptography/icspasymmetricalgorithm/
---
## ICspAsymmetricAlgorithm class


Asymmetrische algoritme basis‑klasse. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ICspAsymmetricAlgorithm : public virtual System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [ExportCspBlob](./exportcspblob/)(bool) | Exporteert blob met sleutelinformatie. |
| virtual [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() | RTTI-informatie. |
| virtual [ImportCspBlob](./importcspblob/)(ByteArrayPtr) | Importeert sleutelinformatie uit datablob. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
