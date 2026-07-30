---
title: "System::Security::Cryptography::RSACryptoServiceProvider Klasse"
linktitle: "RSACryptoServiceProvider"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider Klasse. RSA‑Algorithmus in CSP‑Form. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3500
url: /de/cpp/system.security.cryptography/rsacryptoserviceprovider/
---
## RSACryptoServiceProvider class


[RSA](../rsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class RSACryptoServiceProvider : public System::Security::Cryptography::RSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Decrypt](./decrypt/)(const ByteArrayPtr\&, bool) | Entschlüsselt Nachricht. Nicht implementiert. |
| [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Entschlüsselt Eingabedaten mit dem angegebenen Auffüllmodus. |
| [Dispose](./dispose/)() override | Gibt die mit dem Objekt verbundenen Daten frei. |
| [Encrypt](./encrypt/)(const ByteArrayPtr\&, bool) | Verschlüsselt Nachricht. Nicht implementiert. |
| [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | Verschlüsselt Eingabedaten mit dem angegebenen Auffüllmodus. |
| [ExportCspBlob](./exportcspblob/)(bool) override | Exportiert ein Blob mit Informationen zum Schlüssel. Nicht implementiert. |
| [ExportParameters](./exportparameters/)(bool) override | Exportiert CSP-Parameter. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | Ruft ein [CspKeyContainerInfo](../cspkeycontainerinfo/) Objekt ab. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | Prüft den mit dem Objekt verbundenen Schlüsselaustausch‑Algorithmus. |
| [get_KeySize](./get_keysize/)() override | Ermittelt die Schlüssellänge, die vom Algorithmus verwendet wird. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | Prüft, ob der Schlüssel im CSP‑Objekt persistiert ist. |
| [get_PublicOnly](./get_publiconly/)() const | Prüft, ob nur ein öffentlicher Schlüssel im CSP‑Objekt vorhanden ist. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Liefert den Signaturalgorithmus, der dem CSP-Objekt zugeordnet ist. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | Prüft, ob der Schlüssel im Maschinen‑Store anstelle des Benutzer‑Stores persistiert. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | Importiert ein Blob mit Informationen zum Schlüssel. Nicht implementiert. |
| [ImportParameters](./importparameters/)(RSAParameters) override | Importiert CSP-Parameter. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)() | RTTI-Informationen. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | Konstruktor. Nicht implementiert. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const RSAParameters\&) | Konstruktor. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t) | Konstruktor. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | Konstruktor. Nicht implementiert. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | Definiert, ob der Schlüssel im CSP‑Objekt persistiert ist. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | Definiert, ob der Schlüssel im Maschinen‑Store anstelle des Benutzer‑Stores persistiert. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) | Berechnet die Signatur des angegebenen Eingabewerts. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) | Berechnet die Signatur des angegebenen Eingabewerts. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) | Berechnet die Signatur des angegebenen Eingabewerts. |
| [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) override | Berechnet die Signatur für den angegebenen Hashwert. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | Berechnet die Signatur des angegebenen Eingabewerts. Nicht implementiert. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&, const ByteArrayPtr\&) | Prüft die Datensignatur. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | Prüft die Datensignatur. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) override | Überprüft, ob die Signatur des angegebenen Hashwerts gültig ist. |
## Siehe auch

* Class [RSA](../rsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
