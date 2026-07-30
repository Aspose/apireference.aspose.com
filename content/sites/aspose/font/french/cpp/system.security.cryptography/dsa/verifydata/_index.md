---
title: "System::Security::Cryptography::DSA::VerifyData méthode"
linktitle: "VerifyData"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Security::Cryptography::DSA::VerifyData. Vérifie que la signature des données spécifiées est valide en C++."
type: docs
weight: 700
url: /fr/cpp/system.security.cryptography/dsa/verifydata/
---
## DSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Vérifie que la signature des données spécifiées est valide.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| données | const ByteArrayPtr\& | Données signées. |
| signature | const ByteArrayPtr\& | Données de signature. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. renvoie vrai si la signature est valide, sinon - faux. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Vérifie que la signature des données spécifiées est valide.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| données | const ByteArrayPtr\& | Données signées. |
| décalage | int32_t | Décalage dans **data**. |
| count | int32_t | Nombre d'octets à hacher. |
| signature | const ByteArrayPtr\& | Données de signature. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. renvoie vrai si la signature est valide, sinon - faux. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Vérifie que la signature du flux binaire spécifié est valide.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const StreamPtr\& | Données signées. |
| signature | const ByteArrayPtr\& | Données de signature. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. renvoie vrai si la signature est valide, sinon - faux. |

## Voir aussi

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
