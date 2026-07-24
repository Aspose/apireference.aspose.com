---
title: "System::Security::Cryptography::ECDsa klasse"
linktitle: "ECDsa"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::ECDsa class. Basisklasse voor implementaties van het ECDsa-algoritme. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1300
url: /nl/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


Basisklasse voor implementaties van het [ECDsa](./) algoritme. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [Create](./create/)() | Maakt een standaard ECDSA-algoritme-implementatie. |
| static [Create](./create/)(const ECCurve\&) | Maakt een standaard ECDSA-algoritme-implementatie met een nieuw aangemaakte sleutel voor de opgegeven curve. |
| static [Create](./create/)(const ECParameters\&) | Maakt een standaard ECDSA-algoritme-implementatie met behulp van de opgegeven parameters. |
| static [Create](./create/)(const String\&) | Maakt de opgegeven ECDSA-algoritme-implementatie. |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | Exporteert expliciete parameters. |
| virtual [ExportParameters](./exportparameters/)(bool) | Exporteert benoemde of expliciete parameters. |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | Genereert een nieuw openbaar/privé-sleutelpaar voor de opgegeven curve. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI-informatie. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Haalt het te gebruiken handtekeningalgoritme op. |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | Importeert alle parameters uit de datastructuur. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Berekent de hashwaarde van de opgegeven gegevensarray met het opgegeven hash-algoritme en ondertekent het resultaat. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Berekent de hashwaarde van de opgegeven gegevensarray met het opgegeven hash-algoritme en ondertekent het resultaat. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Berekent de hashwaarde van de opgegeven binaire stroom met het opgegeven hash-algoritme en ondertekent het resultaat. |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | Berekent de handtekening van de opgegeven invoerwaarde. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifieert dat de handtekening van de opgegeven gegevens geldig is. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifieert dat de handtekening van de opgegeven gegevens geldig is. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifieert dat de handtekening van de opgegeven binaire stroom geldig is. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | Controleert de gegevenshandtekening. |
## Zie ook

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
