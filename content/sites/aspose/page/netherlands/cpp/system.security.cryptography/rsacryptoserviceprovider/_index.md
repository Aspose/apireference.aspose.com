---
title: "System::Security::Cryptography::RSACryptoServiceProvider klasse"
linktitle: "RSACryptoServiceProvider"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider klasse. RSA-algoritme in CSP-vorm. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 3500
url: /nl/cpp/system.security.cryptography/rsacryptoserviceprovider/
---
## RSACryptoServiceProvider class


[RSA](../rsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class RSACryptoServiceProvider : public System::Security::Cryptography::RSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Decrypt](./decrypt/)(const ByteArrayPtr\&, bool) | Ontsleutelt bericht. Niet geïmplementeerd. |
| [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Ontsleutelt invoergegevens met de gespecificeerde opvulmodus. |
| [Dispose](./dispose/)() override | Vrijgeeft gegevens die aan het object zijn gekoppeld. |
| [Encrypt](./encrypt/)(const ByteArrayPtr\&, bool) | Versleutelt bericht. Niet geïmplementeerd. |
| [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Versleutelt invoergegevens met de gespecificeerde opvulmodus. |
| [ExportCspBlob](./exportcspblob/)(bool) override | Exporteert blob met informatie over de sleutel. Niet geïmplementeerd. |
| [ExportParameters](./exportparameters/)(bool) override | Exporteert CSP‑parameters. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | Haalt een [CspKeyContainerInfo](../cspkeycontainerinfo/) object op. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Controleert het sleuteluitwisselingsalgoritme dat aan het object is gekoppeld. |
| [get_KeySize](./get_keysize/)() override | Haalt de sleutelgrootte op die door het algoritme wordt gebruikt. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | Controleert of de sleutel is opgeslagen in het CSP‑object. |
| [get_PublicOnly](./get_publiconly/)() const | Controleert of alleen de openbare sleutel aanwezig is in het CSP‑object. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Haalt ondertekeningsalgoritme op dat aan het CSP-object is gekoppeld. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | Controleert of de sleutel wordt bewaard in de machinale opslag in plaats van de gebruikersopslag. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | Importeert blob met informatie over de sleutel. Niet geïmplementeerd. |
| [ImportParameters](./importparameters/)(RSAParameters) override | Importeert CSP-parameters. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)() | RTTI-informatie. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | Constructor. Niet geïmplementeerd. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const RSAParameters\&) | Constructor. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t) | Constructor. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | Constructor. Niet geïmplementeerd. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | Definieert of de sleutel wordt opgeslagen in het CSP‑object. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | Definieert of de sleutel wordt bewaard in de machinale opslag in plaats van de gebruikersopslag. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) | Berekent de handtekening van de opgegeven invoerwaarde. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) | Berekent de handtekening van de opgegeven invoerwaarde. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) | Berekent de handtekening van de opgegeven invoerwaarde. |
| [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) override | Berekent de handtekening voor de gespecificeerde hashwaarde. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | Berekent de handtekening van de opgegeven invoerwaarde. Niet geïmplementeerd. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&, const ByteArrayPtr\&) | Controleert de gegevenshandtekening. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | Controleert de gegevenshandtekening. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) override | Verifieert dat de handtekening van de gespecificeerde hash geldig is. |
## Zie ook

* Class [RSA](../rsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
