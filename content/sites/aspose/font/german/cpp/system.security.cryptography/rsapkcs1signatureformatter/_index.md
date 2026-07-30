---
title: "System::Security::Cryptography::RSAPKCS1SignatureFormatter Klasse"
linktitle: "RSAPKCS1SignatureFormatter"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureFormatter Klasse. Signiert Daten mit einer RSA PKCS # 1 v1.5 Signatur. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3800
url: /de/cpp/system.security.cryptography/rsapkcs1signatureformatter/
---
## RSAPKCS1SignatureFormatter class


Signiert Daten mit einer [RSA](../rsa/) PKCS # 1 v1.5 Signatur. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class RSAPKCS1SignatureFormatter : public System::Security::Cryptography::AsymmetricSignatureFormatter
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) override | Signiert Daten. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)() | RTTI-Informationen. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | Konstruktor. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | Legt den zu verwendenden Hash-Algorithmus fest. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | Setzt den Schlüsselwert. Nicht implementiert. |
| [~RSAPKCS1SignatureFormatter](./~rsapkcs1signatureformatter/)() | Destruktor. |
## Siehe auch

* Class [AsymmetricSignatureFormatter](../asymmetricsignatureformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
