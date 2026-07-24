---
title: "System::Security::Cryptography::ECDsa Klasse"
linktitle: "ECDsa"
second_title: "Aspose.Page für C++"
description: "System::Security::Cryptography::ECDsa Klasse. Basisklasse für Implementierungen des ECDsa-Algorithmus. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1300
url: /de/cpp/system.security.cryptography/ecdsa/
---
## ECDsa class


Basisklasse für Implementierungen des [ECDsa](./)-Algorithmus. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ECDsa : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Create](./create/)() | Erstellt die Standardimplementierung des ECDSA-Algorithmus. |
| static [Create](./create/)(const ECCurve\&) | Erstellt die Standardimplementierung des ECDSA-Algorithmus mit einem neu erstellten Schlüssel für die angegebene Kurve. |
| static [Create](./create/)(const ECParameters\&) | Erstellt die Standardimplementierung des ECDSA-Algorithmus unter Verwendung der angegebenen Parameter. |
| static [Create](./create/)(const String\&) | Erstellt die angegebene Implementierung des ECDSA-Algorithmus. |
| virtual [ExportExplicitParameters](./exportexplicitparameters/)(bool) | Exportiert explizite Parameter. |
| virtual [ExportParameters](./exportparameters/)(bool) | Exportiert benannte oder explizite Parameter. |
| virtual [GenerateKey](./generatekey/)(const ECCurve\&) | Erzeugt ein neues öffentliches/privates Schlüsselpaar für die angegebene Kurve. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | RTTI-Informationen. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | Ermittelt den zu verwendenden Signaturalgorithmus. |
| virtual [ImportParameters](./importparameters/)(const ECParameters\&) | Importiert alle Parameter aus der Datenstruktur. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Berechnet den Hashwert des angegebenen Datenarrays mit dem angegebenen Hash-Algorithmus und signiert das Ergebnis. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Berechnet den Hashwert des angegebenen Datenarrays mit dem angegebenen Hash-Algorithmus und signiert das Ergebnis. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Berechnet den Hashwert des angegebenen Binärstroms mit dem angegebenen Hash-Algorithmus und signiert das Ergebnis. |
| virtual [SignHash](./signhash/)(const ByteArrayPtr\&) | Berechnet die Signatur des angegebenen Eingabewerts. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifiziert, dass die Signatur der angegebenen Daten gültig ist. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifiziert, dass die Signatur der angegebenen Daten gültig ist. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Verifiziert, dass die Signatur des angegebenen Binärstroms gültig ist. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) | Überprüft die Datensignatur. |
## Siehe auch

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
