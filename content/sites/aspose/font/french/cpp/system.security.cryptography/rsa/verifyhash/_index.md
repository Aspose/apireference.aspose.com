---
title: "System::Security::Cryptography::RSA::VerifyHash méthode"
linktitle: "VerifyHash"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::RSA::VerifyHash méthode. Vérifie que la signature du hachage spécifié est valide en C++."
type: docs
weight: 1400
url: /fr/cpp/system.security.cryptography/rsa/verifyhash/
---
## RSA::VerifyHash method


Vérifie que la signature du hachage spécifié est valide.

```cpp
virtual bool System::Security::Cryptography::RSA::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding)
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
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
