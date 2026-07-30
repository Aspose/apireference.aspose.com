---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash méthode"
linktitle: "VerifyHash"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash méthode. Vérifie que la signature du hachage spécifié est valide en C++."
type: docs
weight: 1900
url: /fr/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


Vérifie que la signature du hachage spécifié est valide.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| hachage | ByteArrayPtr | Valeur de hachage des données signées. |
| signature | ByteArrayPtr | Données de signature. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. |
| padding | SharedPtr\<RSASignaturePadding\> | Mode de remplissage. retourne true si la signature est valide, sinon - false. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


Vérifie la signature des données.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Hachage calculé pour les données reçues. |
| str | const String\& | Nom de l'algorithme de hachage utilisé. |
| rgb_signature | const ByteArrayPtr\& | Signature telle que reçue. |

### ReturnValue

True si la signature est valide, false sinon.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
