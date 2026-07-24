---
title: "System::Security::Cryptography::DSACryptoServiceProvider klasse"
linktitle: "DSACryptoServiceProvider"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider klasse. DSA-algoritme in CSP-vorm. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wrap deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1000
url: /nl/cpp/system.security.cryptography/dsacryptoserviceprovider/
---
## DSACryptoServiceProvider class


[DSA](../dsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DSACryptoServiceProvider : public System::Security::Cryptography::DSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CreateSignature](./createsignature/)(ByteArrayPtr) override | Maak [DSA](../dsa/) handtekening voor de opgegeven gegevens. |
| [Dispose](./dispose/)() override | Vrijgeeft gegevens die aan het object zijn gekoppeld. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)() | Constructor. Gebruikt standaardparameters. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const DSAParameters\&) | Constructor. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | Constructor. Niet geïmplementeerd. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t) | Constructor. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | Constructor. Niet geïmplementeerd. |
| [ExportCspBlob](./exportcspblob/)(bool) override | Exporteert blob met informatie over de sleutel. Niet geïmplementeerd. |
| [ExportParameters](./exportparameters/)(bool) override | Exporteert CSP‑parameters. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | Haalt een [CspKeyContainerInfo](../cspkeycontainerinfo/) object op. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Controleert het sleuteluitwisselingsalgoritme dat aan het object is gekoppeld. |
| [get_KeySize](./get_keysize/)() override | Haalt de sleutelgrootte op. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | Controleert of de sleutel is opgeslagen in het CSP‑object. |
| [get_PublicOnly](./get_publiconly/)() const | Controleert of alleen de openbare sleutel aanwezig is in het CSP‑object. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Haalt het te gebruiken handtekeningalgoritme op. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | Controleert of de sleutel wordt bewaard in de machinale opslag in plaats van de gebruikersopslag. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | Importeert blob met informatie over de sleutel. Niet geïmplementeerd. |
| [ImportParameters](./importparameters/)(DSAParameters) override | Importeert alle parameters uit de datastructuur. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | Definieert of de sleutel wordt opgeslagen in het CSP‑object. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | Definieert of de sleutel wordt bewaard in de machinale opslag in plaats van de gebruikersopslag. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | Berekent de handtekening van de opgegeven invoerwaarde. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&) | Berekent de handtekening van de opgegeven invoerwaarde. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | Berekent de handtekening van de opgegeven invoerwaarde. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | RTTI-informatie. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | RTTI-informatie. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | RTTI-informatie. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | Berekent de handtekening van de opgegeven invoerwaarde. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | Controleert de gegevenshandtekening. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifieert dat de handtekening van de opgegeven gegevens geldig is. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifieert dat de handtekening van de opgegeven gegevens geldig is. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifieert dat de handtekening van de opgegeven binaire stroom geldig is. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | Controleert de gegevenshandtekening. |
| [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) override | Verifieer de [DSA](../dsa/) handtekening voor de opgegeven gegevens. |
## Zie ook

* Class [DSA](../dsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
