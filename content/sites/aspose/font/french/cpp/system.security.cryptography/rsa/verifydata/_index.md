---
title: "System::Security::Cryptography::RSA::VerifyData méthode"
linktitle: "VerifyData"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::RSA::VerifyData méthode. Vérifie que la signature des données spécifiées est valide en C++."
type: docs
weight: 1300
url: /fr/cpp/system.security.cryptography/rsa/verifydata/
---
## RSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Vérifie que la signature des données spécifiées est valide.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| données | const ByteArrayPtr\& | Données signées. |
| signature | const ByteArrayPtr\& | Données de signature. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Mode de remplissage. retourne true si la signature est valide, sinon - false. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Vérifie que la signature des données spécifiées est valide.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| données | const ByteArrayPtr\& | Données signées. |
| décalage | int32_t | Décalage dans **data**. |
| count | int32_t | Nombre d'octets à hacher. |
| signature | const ByteArrayPtr\& | Données de signature. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Mode de remplissage. retourne true si la signature est valide, sinon - false. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Vérifie que la signature du flux binaire spécifié est valide.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const StreamPtr\& | Données signées. |
| signature | const ByteArrayPtr\& | Données de signature. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Mode de remplissage. retourne true si la signature est valide, sinon - false. |

## Voir aussi

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
