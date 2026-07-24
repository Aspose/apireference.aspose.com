---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension klasse"
linktitle: "X509KeyUsageExtension"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension klasse. Extensie‑object om extra informatie over het gebruik van een sleutel bij te houden. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1600
url: /nl/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


Extensie‑object om extra informatie over het gebruik van een sleutel bij te houden. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Kopieert extensie‑gegevens van een ander object. |
| [get_KeyUsages](./get_keyusages/)() | Haalt sleutelgebruiken op. |
| [X509KeyUsageExtension](./x509keyusageextension/)() | RTTI-informatie. |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Constructor. |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | Constructor. |
## Zie ook

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
