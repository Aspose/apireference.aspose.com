---
title: "System::Security::Cryptography::X509Certificates::X509Extension klasse"
linktitle: "X509Extension"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::X509Certificates::X509Extension klasse. Extensie‑object om extra informatie die verband houdt met een X.509‑certificaat bij te houden. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1200
url: /nl/cpp/system.security.cryptography.x509certificates/x509extension/
---
## X509Extension class


Extensie‑object om extra informatie die verband houdt met een X.509‑certificaat bij te houden. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class X509Extension : public System::Security::Cryptography::AsnEncodedData
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Kopieert extensie‑gegevens van een ander object. |
| [get_Critical](./get_critical/)() const | Controleert of de extensie kritisch is. |
| [set_Critical](./set_critical/)(bool) | Definieert of de extensie kritisch is. |
| [X509Extension](./x509extension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | RTTI-informatie. |
| [X509Extension](./x509extension/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&, bool) | Constructor. |
| [X509Extension](./x509extension/)(const String\&, const ByteArrayPtr\&, bool) | Constructor. |
## Zie ook

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
