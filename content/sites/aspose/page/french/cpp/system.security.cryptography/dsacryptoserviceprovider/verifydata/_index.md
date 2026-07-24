---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData method"
linktitle: "VerifyData"
second_title: "Aspose.Page pour C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData method. Vérifie la signature des données en C++."
type: docs
weight: 1700
url: /fr/cpp/system.security.cryptography/dsacryptoserviceprovider/verifydata/
---
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&) method


Vérifie la signature des données.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const ByteArrayPtr &signature)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) dont vérifier la signature. |
| signature | const ByteArrayPtr\& | Signature telle que reçue. |

### ReturnValue

Vrai si la signature est valide, faux sinon.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Vérifie que la signature des données spécifiées est valide.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| données | const ByteArrayPtr\& | Données signées. |
| signature | const ByteArrayPtr\& | Données de signature. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. renvoie true si la signature est valide, sinon - false. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Vérifie que la signature des données spécifiées est valide.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| données | const ByteArrayPtr\& | Données signées. |
| offset | int32_t | Décalage dans **data**. |
| count | int32_t | Nombre d'octets à hacher. |
| signature | const ByteArrayPtr\& | Données de signature. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. renvoie true si la signature est valide, sinon - false. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Vérifie que la signature du flux binaire spécifié est valide.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const StreamPtr\& | Données signées. |
| signature | const ByteArrayPtr\& | Données de signature. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. renvoie true si la signature est valide, sinon - false. |

## Voir aussi

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
