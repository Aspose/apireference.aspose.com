---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter Klasse"
linktitle: "AsymmetricSignatureFormatter"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter Klasse. Basisklasse für asymmetrische Signaturformatierer. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.security.cryptography/asymmetricsignatureformatter/
---
## AsymmetricSignatureFormatter class


Basisklasse für asymmetrische Signaturformatierer. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class AsymmetricSignatureFormatter : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) | RTTI-Informationen. |
| virtual [CreateSignature](./createsignature/)(System::SharedPtr\<HashAlgorithm\>) | Erstellt die Signatur für den angegebenen Hash-Wert. |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | Legt den zu verwendenden Hash-Algorithmus fest. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | Legt den beim Berechnen der Signatur zu verwendenden asymmetrischen Algorithmus fest. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
