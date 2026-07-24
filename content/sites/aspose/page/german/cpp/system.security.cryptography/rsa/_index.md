---
title: "System::Security::Cryptography::RSA Klasse"
linktitle: "RSA"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::RSA Klasse. Basisklasse für Implementierungen des RSA-Algorithmus. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3400
url: /de/cpp/system.security.cryptography/rsa/
---
## RSA class


Basisklasse für Implementierungen des [RSA](./)-Algorithmus. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class RSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Create](./create/)() | Erstellt die Standardimplementierung des [RSA](./)-Algorithmus. |
| static [Create](./create/)(const String\&) | Erstellt die Standardimplementierung des [RSA](./)-Algorithmus. |
| static [Create](./create/)(int32_t) | Erstellt die Standardimplementierung des [RSA](./)-Algorithmus mit angegebener Schlüssellänge. |
| static [Create](./create/)(const RSAParameters\&) | Erstellt die Standardimplementierung des [RSA](./)-Algorithmus mit angegebenen Parametern. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Erstellt die Standard-Implementierung des [RSA](./)-Algorithmus mit angegebenen XML-codierten Parametern. |
| virtual [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Entschlüsselt Eingabedaten mit dem angegebenen Padding-Modus. |
| virtual [DecryptValue](./decryptvalue/)(ByteArrayPtr) | Entschlüsselt den Wert mit dem privaten Schlüssel. |
| virtual [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | Verschlüsselt Eingabedaten mit dem angegebenen Padding-Modus. |
| virtual [EncryptValue](./encryptvalue/)(ByteArrayPtr) | Verschlüsselt den Wert mit dem privaten Schlüssel. |
| virtual [ExportParameters](./exportparameters/)(bool) | Exportiert alle Parameter. |
| [FromXmlString](./fromxmlstring/)(String) override | Initialisiert das Objekt mit XML-codierten Parametern. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI-Informationen. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Ermittelt den Signaturalgorithmus, der dem CSP-Objekt zugeordnet ist. |
| virtual [ImportParameters](./importparameters/)(RSAParameters) | Importiert alle Parameter aus der Datenstruktur. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Berechnet den Hashwert des angegebenen Datenarrays mit dem angegebenen Hash-Algorithmus und Padding und signiert das Ergebnis. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Berechnet den Hashwert des angegebenen Datenarrays mit dem angegebenen Hash-Algorithmus und Padding und signiert das Ergebnis. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Berechnet den Hashwert des angegebenen Binärstroms mit dem angegebenen Hash-Algorithmus und Padding und signiert das Ergebnis. |
| virtual [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) | Berechnet die Signatur für den angegebenen Hashwert. |
| [ToXmlString](./toxmlstring/)(bool) override | Exportiert alle Parameter im XML-Format. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Verifiziert, dass die Signatur der angegebenen Daten gültig ist. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Verifiziert, dass die Signatur der angegebenen Daten gültig ist. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | Verifiziert, dass die Signatur des angegebenen Binärstroms gültig ist. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) | Überprüft, ob die Signatur des angegebenen Hashwerts gültig ist. |
## Siehe auch

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
