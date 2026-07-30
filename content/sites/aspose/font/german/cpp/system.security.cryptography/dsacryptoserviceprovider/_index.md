---
title: "System::Security::Cryptography::DSACryptoServiceProvider Klasse"
linktitle: "DSACryptoServiceProvider"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider Klasse. DSA-Algorithmus in CSP-Form. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1000
url: /de/cpp/system.security.cryptography/dsacryptoserviceprovider/
---
## DSACryptoServiceProvider class


[DSA](../dsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DSACryptoServiceProvider : public System::Security::Cryptography::DSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CreateSignature](./createsignature/)(ByteArrayPtr) override | Erstellen Sie eine [DSA](../dsa/) Signatur für die angegebenen Daten. |
| [Dispose](./dispose/)() override | Gibt die mit dem Objekt verbundenen Daten frei. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)() | Konstruktor. Verwendet Standardparameter. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const DSAParameters\&) | Konstruktor. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | Konstruktor. Nicht implementiert. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t) | Konstruktor. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | Konstruktor. Nicht implementiert. |
| [ExportCspBlob](./exportcspblob/)(bool) override | Exportiert ein Blob mit Informationen zum Schlüssel. Nicht implementiert. |
| [ExportParameters](./exportparameters/)(bool) override | Exportiert CSP-Parameter. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | Ruft ein [CspKeyContainerInfo](../cspkeycontainerinfo/) Objekt ab. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Prüft den mit dem Objekt verbundenen Schlüsselaustausch‑Algorithmus. |
| [get_KeySize](./get_keysize/)() override | Ermittelt die Schlüssellänge. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | Prüft, ob der Schlüssel im CSP‑Objekt persistiert ist. |
| [get_PublicOnly](./get_publiconly/)() const | Prüft, ob nur ein öffentlicher Schlüssel im CSP‑Objekt vorhanden ist. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Ruft den zu verwendenden Signaturalgorithmus ab. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | Prüft, ob der Schlüssel im Maschinen‑Store anstelle des Benutzer‑Stores persistiert. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | Importiert ein Blob mit Informationen zum Schlüssel. Nicht implementiert. |
| [ImportParameters](./importparameters/)(DSAParameters) override | Importiert alle Parameter aus der Datenstruktur. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | Definiert, ob der Schlüssel im CSP‑Objekt persistiert ist. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | Definiert, ob der Schlüssel im Maschinen‑Store anstelle des Benutzer‑Stores persistiert. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | Berechnet die Signatur des angegebenen Eingabewerts. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&) | Berechnet die Signatur des angegebenen Eingabewerts. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | Berechnet die Signatur des angegebenen Eingabewerts. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | RTTI-Informationen. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | RTTI-Informationen. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | RTTI-Informationen. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | Berechnet die Signatur des angegebenen Eingabewerts. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | Prüft die Datensignatur. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Überprüft, ob die Signatur der angegebenen Daten gültig ist. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Überprüft, ob die Signatur der angegebenen Daten gültig ist. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Überprüft, ob die Signatur des angegebenen Binärstroms gültig ist. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | Prüft die Datensignatur. |
| [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) override | Verifizieren Sie die [DSA](../dsa/) Signatur für die angegebenen Daten. |
## Siehe auch

* Class [DSA](../dsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
