---
title: "System::Security::Cryptography::ECDsaBotan Klasse"
linktitle: "ECDsaBotan"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::ECDsaBotan Klasse. ECDsa-Algorithmus in Botan-Form. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1400
url: /de/cpp/system.security.cryptography/ecdsabotan/
---
## ECDsaBotan class


[ECDsa](../ecdsa/) algorithm in Botan form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ECDsaBotan : public System::Security::Cryptography::ECDsa
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ECDsaBotan](./ecdsabotan/)() | Konstruktor. Verwendet Standardparameter. |
| [ECDsaBotan](./ecdsabotan/)(const ECParameters\&) | Konstruktor. |
| [ECDsaBotan](./ecdsabotan/)(const ECCurve\&) | Konstruktor. |
| [ECDsaBotan](./ecdsabotan/)(int32_t) | Konstruktor. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PublicKey\&) | Konstruktor. |
| [ECDsaBotan](./ecdsabotan/)(const Botan::ECDSA_PrivateKey\&) | Konstruktor. |
| [ExportExplicitParameters](./exportexplicitparameters/)(bool) override | Exportiert explizite Parameter. |
| [ExportParameters](./exportparameters/)(bool) override | Exportiert benannte oder explizite Parameter. |
| [FromXmlString](./fromxmlstring/)(String) override | Initialisiert das Objekt mit XML-codierten Parametern. Nicht implementiert. |
| [FromXmlString](./fromxmlstring/)(const String\&, ECKeyXmlFormat) | Initialisiert das Objekt mit XML-codierten Parametern. Nicht implementiert. |
| [GenerateKey](./generatekey/)(const ECCurve\&) override | Erzeugt ein neues öffentliches/privates Schlüsselpaar für die angegebene Kurve. |
| [get_HashAlgorithm](./get_hashalgorithm/)() const | Liefert den Hash-Algorithmus. |
| [HashData](./hashdata/)(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) override | Berechnet den Hash-Wert des angegebenen Datenarrays unter Verwendung des angegebenen Hash-Algorithmus. |
| [HashData](./hashdata/)(StreamPtr, HashAlgorithmName) override | Berechnet den Hash-Wert des angegebenen Binärstroms unter Verwendung des angegebenen Hash-Algorithmus. |
| [ImportParameters](./importparameters/)(const ECParameters\&) override | Importiert alle Parameter aus der Datenstruktur. |
| [set_HashAlgorithm](./set_hashalgorithm/)(const HashAlgorithmName\&) | Setzt den Hash-Algorithmus. |
| [set_KeySize](./set_keysize/)(int32_t) override | Setzt die Schlüssellänge. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | Berechnet den Hash-Wert des angegebenen Datenarrays und signiert das Ergebnis. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | Berechnet den Hash-Wert des angegebenen Datenarrays und signiert das Ergebnis. |
| [SignData](./signdata/)(const StreamPtr\&) | Berechnet den Hash-Wert des angegebenen Binärstroms und signiert das Ergebnis. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | RTTI-Informationen. |
| virtual [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | RTTI-Informationen. |
| virtual [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | RTTI-Informationen. |
| [SignHash](./signhash/)(const ByteArrayPtr\&) override | Berechnet die Signatur des angegebenen Eingabewerts. |
| [ToXmlString](./toxmlstring/)(bool) override | Exportiert alle Parameter im XML-Format. Nicht implementiert. |
| [ToXmlString](./toxmlstring/)(ECKeyXmlFormat) | Exportiert alle Parameter im XML-Format. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | Überprüft, ob die Signatur der angegebenen Daten gültig ist. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&) | Überprüft, ob die Signatur der angegebenen Daten gültig ist. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&) | Überprüft, ob die Signatur des angegebenen Binärstroms gültig ist. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Überprüft, ob die Signatur der angegebenen Daten gültig ist. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | Überprüft, ob die Signatur der angegebenen Daten gültig ist. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | Überprüft, ob die Signatur des angegebenen Binärstroms gültig ist. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr) override | Prüft die Datensignatur. |
## Siehe auch

* Class [ECDsa](../ecdsa/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
