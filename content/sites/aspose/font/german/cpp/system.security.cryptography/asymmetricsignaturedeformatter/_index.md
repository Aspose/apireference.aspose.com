---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter Klasse"
linktitle: "AsymmetricSignatureDeformatter"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter Klasse. Basisklasse für asymmetrische Signatur‑Entformatierer. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.security.cryptography/asymmetricsignaturedeformatter/
---
## AsymmetricSignatureDeformatter class


Basisklasse für asymmetrische Signatur‑Entformatierer. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class AsymmetricSignatureDeformatter : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | RTTI-Informationen. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | Legt den Schlüssel fest, der mit dem Algorithmus verwendet wird. |
| virtual [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Verifiziert die Signatur der Daten. |
| virtual [VerifySignature](./verifysignature/)(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) | Verifiziert die Signatur der Daten. Nicht implementiert. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
