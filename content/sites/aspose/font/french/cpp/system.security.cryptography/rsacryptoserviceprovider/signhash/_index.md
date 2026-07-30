---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash méthode"
linktitle: "SignHash"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash méthode. Calcule la signature pour la valeur de hachage spécifiée en C++."
type: docs
weight: 1700
url: /fr/cpp/system.security.cryptography/rsacryptoserviceprovider/signhash/
---
## RSACryptoServiceProvider::SignHash(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) method


Calcule la signature pour la valeur de hachage spécifiée.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| hachage | ByteArrayPtr | Valeur de hachage. |
| hash_algorithm | HashAlgorithmName | Algorithme de hachage. |
| padding | SharedPtr\<RSASignaturePadding\> | Mode de remplissage. renvoie la signature [RSA](../../rsa/) pour le hachage spécifié. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::SignHash(const ByteArrayPtr\&, const String\&) method


Calcule la signature de la valeur d'entrée spécifiée. Non implémenté.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Valeur de hachage des données à signer. |
| str | const String\& | Identifiant de l'algorithme de hachage utilisé pour créer le hachage. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
