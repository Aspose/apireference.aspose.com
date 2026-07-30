---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter Klasse"
linktitle: "RSAPKCS1SignatureDeformatter"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter Klasse. Klasse zur Überprüfung von RSA PKCS #1 v1.5‑Signaturen. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3700
url: /de/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/
---
## RSAPKCS1SignatureDeformatter class


Klasse zur Überprüfung von [RSA](../rsa/) PKCS #1 v1.5‑Signatur. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class RSAPKCS1SignatureDeformatter : public System::Security::Cryptography::AsymmetricSignatureDeformatter
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)() | RTTI-Informationen. |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | Konstruktor. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | Legt den zu verwendenden Hash-Algorithmus fest. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | Setzt den Schlüsselwert. Nicht implementiert. |
| [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Verifiziert die Signatur des Daten-Hashes. |
## Siehe auch

* Class [AsymmetricSignatureDeformatter](../asymmetricsignaturedeformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
