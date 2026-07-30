---
title: "System::Security::Cryptography::DSA Klasse"
linktitle: "DSA"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::DSA Klasse. Basisklasse für Implementierungen des DSA‑Algorithmus. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.security.cryptography/dsa/
---
## DSA class


Basisklasse für Implementierungen des [DSA](./)-Algorithmus. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn an Funktionen als Argument zu übergeben.

```cpp
class DSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [Create](./create/)() | Erstellt die Standardimplementierung des [DSA](./)-Algorithmus. |
| static [Create](./create/)(const String\&) | Erstellt die Standardimplementierung des [DSA](./)-Algorithmus. |
| static [Create](./create/)(int32_t) | Erstellt die Standardimplementierung des [DSA](./)-Algorithmus mit angegebener Schlüssellänge. |
| static [Create](./create/)(const DSAParameters\&) | Erstellt die Standardimplementierung des [DSA](./)-Algorithmus mit angegebenen Parametern. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | Erstellt die Standardimplementierung des [DSA](./)-Algorithmus mit angegebenen XML-codierten Parametern. |
| virtual [CreateSignature](./createsignature/)(ByteArrayPtr) | RTTI-Informationen. |
| virtual [ExportParameters](./exportparameters/)(bool) | Exportiert alle Parameter. |
| [FromXmlString](./fromxmlstring/)(String) override | Initialisiert das Objekt mit XML-codierten Parametern. |
| virtual [ImportParameters](./importparameters/)(DSAParameters) | Importiert alle Parameter aus der Datenstruktur. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | Berechnet den Hashwert des angegebenen Datenarrays mit dem angegebenen Hash-Algorithmus und signiert das Ergebnis. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | Berechnet den Hashwert des angegebenen Datenarrays mit dem angegebenen Hash-Algorithmus und signiert das Ergebnis. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | Berechnet den Hashwert des angegebenen Binärstroms mit dem angegebenen Hash-Algorithmus und signiert das Ergebnis. |
| [ToXmlString](./toxmlstring/)(bool) override | Exportiert alle Parameter im XML-Format. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Überprüft, ob die Signatur der angegebenen Daten gültig ist. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Überprüft, ob die Signatur der angegebenen Daten gültig ist. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Überprüft, ob die Signatur des angegebenen Binärstroms gültig ist. |
| virtual [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) | Verifiziere die [DSA](./)-Signatur für die angegebenen Daten. |
## Siehe auch

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
