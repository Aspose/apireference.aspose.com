---
title: "System::Security::Cryptography::ECDsaBotan klasse"
linktitle: "ECDsaBotan"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::ECDsaBotan klasse. ECDsa-algoritme in Botan-vorm. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1400
url: /nl/cpp/system.security.cryptography/ecdsabotan/
---
## ECDsaBotan class


[ECDsa](../ecdsa/) algorithm in Botan form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ECDsaBotan : public System::Security::Cryptography::ECDsa
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ECDsaBotan](./ecdsabotan/)() | Constructor. Gebruikt standaardparameters. |
| [ECDsaBotan](./ecdsabotan/)(const ECParameters\&) | Constructor. |
| [ECDsaBotan](./ecdsabotan/)(const ECCurve\&) | Constructor. |
| [ECDsaBotan](./ecdsabotan/)(int32_t) | Constructor. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PublicKey\&) | Constructor. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PrivateKey\&) | Constructor. |
| [ExportExplicitParameters](./exportexplicitparameters/)(bool) override | Exporteert expliciete parameters. |
| [ExportParameters](./exportparameters/)(bool) override | Exporteert benoemde of expliciete parameters. |
| [FromXmlString](./fromxmlstring/)(String) override | Initialiseert object met XML-gecodeerde parameters. Niet geïmplementeerd. |
| [FromXmlString](./fromxmlstring/)(const String\&, ECKeyXmlFormat) | Initialiseert object met XML-gecodeerde parameters. Niet geïmplementeerd. |
| [GenerateKey](./generatekey/)(const ECCurve\&) override | Genereert een nieuw openbaar/privé-sleutelpaar voor de opgegeven curve. |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | Haalt hash‑algoritme op. |
| [HashData](./hashdata/)(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) override | Berekent de hashwaarde van de opgegeven gegevensarray met het opgegeven hash‑algoritme. |
| [HashData](./hashdata/)(StreamPtr, HashAlgorithmName) override | Berekent de hashwaarde van de opgegeven binaire stroom met het opgegeven hash‑algoritme. |
| [ImportParameters](./importparameters/)(const ECParameters\&) override | Importeert alle parameters uit de datastructuur. |
| [set_HashAlgorithm](./set_hashalgorithm/)(const HashAlgorithmName\&) | Stelt hash‑algoritme in. |
| [set_KeySize](./set_keysize/)(int32_t) override | Stelt de sleutelgrootte in. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | Berekent de hashwaarde van de opgegeven gegevensarray en ondertekent het resultaat. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | Berekent de hashwaarde van de opgegeven gegevensarray en ondertekent het resultaat. |
| [SignData](./signdata/)(const StreamPtr\&) | Berekent de hashwaarde van de opgegeven binaire stroom en ondertekent het resultaat. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | RTTI-informatie. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | RTTI-informatie. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | RTTI-informatie. |
| [SignHash](./signhash/)(const ByteArrayPtr\&) override | Berekent de handtekening van de opgegeven invoerwaarde. |
| [ToXmlString](./toxmlstring/)(bool) override | Exporteert alle parameters in XML-indeling. Niet geïmplementeerd. |
| [ToXmlString](./toxmlstring/)(ECKeyXmlFormat) | Exporteert alle parameters in XML-indeling. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | Verifieert dat de handtekening van de opgegeven gegevens geldig is. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) | Verifieert dat de handtekening van de opgegeven gegevens geldig is. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&) | Verifieert dat de handtekening van de opgegeven binaire stroom geldig is. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifieert dat de handtekening van de opgegeven gegevens geldig is. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifieert dat de handtekening van de opgegeven gegevens geldig is. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifieert dat de handtekening van de opgegeven binaire stroom geldig is. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) override | Controleert de gegevenshandtekening. |
## Zie ook

* Class [ECDsa](../ecdsa/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
