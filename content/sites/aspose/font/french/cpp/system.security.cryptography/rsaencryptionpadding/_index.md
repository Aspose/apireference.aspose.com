---
title: "System::Security::Cryptography::RSAEncryptionPadding class"
linktitle: "RSAEncryptionPadding"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::RSAEncryptionPadding class. Mode de remplissage et paramètres pour les opérations de chiffrement ou de déchiffrement RSA en C++."
type: docs
weight: 3600
url: /fr/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


Mode de remplissage et paramètres pour les opérations de chiffrement ou de déchiffrement [RSA](../rsa/).

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | Crée [RSAEncryptionPadding](./) avec le mode OAEP et l'algorithme de hachage spécifié. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | Obtient le mode de remplissage. |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | Obtient l'algorithme de hachage utilisé avec OAEP. |
| static [get_OaepSHA1](./get_oaepsha1/)() | Obtient le mode OAEP avec l'algorithme de hachage [SHA1](../sha1/). |
| static [get_OaepSHA256](./get_oaepsha256/)() | Obtient le mode OAEP avec l'algorithme de hachage [SHA256](../sha256/). |
| static [get_OaepSHA384](./get_oaepsha384/)() | Obtient le mode OAEP avec l'algorithme de hachage [SHA384](../sha384/). |
| static [get_OaepSHA512](./get_oaepsha512/)() | Obtient le mode OAEP avec l'algorithme de hachage [SHA512](../sha512/). |
| static [get_Pkcs1](./get_pkcs1/)() | Informations RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analogue de la méthode C# [Object.GetHashCode()](../../system/object/gethashcode/) . Permet le hachage d'objets personnalisés. |
| [ToString](./tostring/)() const override | Analogue de la méthode C# [Object.ToString()](../../system/object/tostring/). Permet de convertir des objets personnalisés en chaîne. |
## Voir aussi

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
