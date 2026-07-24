---
title: "System::Security::Cryptography::RSA klasse"
linktitle: "RSA"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RSA klasse. Basisklasse voor implementaties van het RSA‑algoritme. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3400
url: /nl/cpp/system.security.cryptography/rsa/
---
## RSA class


Basisklasse voor implementaties van het [RSA](./) algoritme. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten veroorzaakt. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class RSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Create](./create/)() | Creëert standaard [RSA](./) aglorithm implementatie. |
| static [Create](./create/)(const String\&) | Creëert standaard [RSA](./) algoritme‑implementatie. |
| static [Create](./create/)(int32_t) | Creëert standaard [RSA](./) algoritme‑implementatie met gespecificeerde sleutelgrootte. |
| static [Create](./create/)(const RSAParameters\&) | Creëert standaard [RSA](./) algoritme‑implementatie met gespecificeerde parameters. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Maakt een standaardimplementatie van het [RSA](./)-algoritme met gespecificeerde XML-gecodeerde parameters. |
| virtual [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Ontsleutelt invoergegevens met de gespecificeerde opvulmodus. |
| virtual [DecryptValue](./decryptvalue/)(ByteArrayPtr) | Ontsleutelt waarde met de privésleutel. |
| virtual [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Versleutelt invoergegevens met de gespecificeerde opvulmodus. |
| virtual [EncryptValue](./encryptvalue/)(ByteArrayPtr) | Versleutelt waarde met de privésleutel. |
| virtual [ExportParameters](./exportparameters/)(bool) | Exporteert alle parameters. |
| [FromXmlString](./fromxmlstring/)(String) override | Initialiseert object met XML-gecodeerde parameters. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI-informatie. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Haalt ondertekeningsalgoritme op dat aan het CSP-object is gekoppeld. |
| virtual [ImportParameters](./importparameters/)(RSAParameters) | Importeert alle parameters uit de datastructuur. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Berekent de hashwaarde van de gespecificeerde gegevensarray met het gespecificeerde hash-algoritme en opvulling, en ondertekent het resultaat. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Berekent de hashwaarde van de gespecificeerde gegevensarray met het gespecificeerde hash-algoritme en opvulling, en ondertekent het resultaat. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Berekent de hashwaarde van de gespecificeerde binaire stroom met het gespecificeerde hash-algoritme en opvulling, en ondertekent het resultaat. |
| virtual [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) | Berekent de handtekening voor de gespecificeerde hashwaarde. |
| [ToXmlString](./toxmlstring/)(bool) override | Exporteert alle parameters in XML-indeling. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Verifieert dat de handtekening van de opgegeven gegevens geldig is. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Verifieert dat de handtekening van de opgegeven gegevens geldig is. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Verifieert dat de handtekening van de opgegeven binaire stroom geldig is. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) | Verifieert dat de handtekening van de gespecificeerde hash geldig is. |
## Zie ook

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
