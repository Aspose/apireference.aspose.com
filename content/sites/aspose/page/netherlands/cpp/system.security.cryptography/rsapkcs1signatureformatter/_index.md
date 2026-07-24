---
title: "System::Security::Cryptography::RSAPKCS1SignatureFormatter klasse"
linktitle: "RSAPKCS1SignatureFormatter"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureFormatter klasse. Ondertekent gegevens met een RSA PKCS #1 v1.5-handtekening. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3800
url: /nl/cpp/system.security.cryptography/rsapkcs1signatureformatter/
---
## RSAPKCS1SignatureFormatter class


Ondertekent gegevens met een [RSA](../rsa/) PKCS # 1 v1.5-handtekening. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class RSAPKCS1SignatureFormatter : public System::Security::Cryptography::AsymmetricSignatureFormatter
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) override | Ondertekent gegevens. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)() | RTTI-informatie. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | Constructor. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | Stelt het te gebruiken hash-algoritme in. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | Stelt sleutelwaarde in. Niet geïmplementeerd. |
| [~RSAPKCS1SignatureFormatter](./~rsapkcs1signatureformatter/)() | Destructor. |
## Zie ook

* Class [AsymmetricSignatureFormatter](../asymmetricsignatureformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
