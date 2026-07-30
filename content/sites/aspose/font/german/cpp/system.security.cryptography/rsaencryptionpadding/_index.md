---
title: "System::Security::Cryptography::RSAEncryptionPadding Klasse"
linktitle: "RSAEncryptionPadding"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::RSAEncryptionPadding Klasse. Padding-Modus und Parameter für RSA-Verschlüsselungs- oder Entschlüsselungsoperationen in C++."
type: docs
weight: 3600
url: /de/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


Padding-Modus und Parameter für [RSA](../rsa/) Verschlüsselungs- oder Entschlüsselungsoperationen.

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | Erstellt [RSAEncryptionPadding](./) mit OAEP-Modus und angegebenem Hash-Algorithmus. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | Liefert den Padding-Modus. |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | Liefert den mit OAEP verwendeten Hash-Algorithmus. |
| static [get_OaepSHA1](./get_oaepsha1/)() | Liefert den OAEP-Modus mit dem [SHA1](../sha1/)-Hash-Algorithmus. |
| static [get_OaepSHA256](./get_oaepsha256/)() | Liefert den OAEP-Modus mit dem [SHA256](../sha256/)-Hash-Algorithmus. |
| static [get_OaepSHA384](./get_oaepsha384/)() | Liefert den OAEP-Modus mit dem [SHA384](../sha384/)-Hash-Algorithmus. |
| static [get_OaepSHA512](./get_oaepsha512/)() | Liefert den OAEP-Modus mit dem [SHA512](../sha512/)-Hash-Algorithmus. |
| static [get_Pkcs1](./get_pkcs1/)() | RTTI-Informationen. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
## Siehe auch

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
