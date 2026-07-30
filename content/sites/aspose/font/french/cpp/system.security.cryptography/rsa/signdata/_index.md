---
title: "System::Security::Cryptography::RSA::SignData méthode"
linktitle: "SignData"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::RSA::SignData méthode. Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage et le remplissage spécifiés, et signe le résultat en C++."
type: docs
weight: 1000
url: /fr/cpp/system.security.cryptography/rsa/signdata/
---
## RSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage et le remplissage spécifiés, et signe le résultat.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| données | const ByteArrayPtr\& | Tableau de données d'entrée. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Mode de remplissage. renvoie la signature [RSA](../) pour les données d'entrée. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage et le remplissage spécifiés, et signe le résultat.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| données | const ByteArrayPtr\& | Tableau de données d'entrée. |
| décalage | int32_t | Décalage dans **data**. |
| count | int32_t | Nombre d'octets à utiliser comme données d'entrée. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Mode de remplissage. renvoie la signature [RSA](../) pour les données d'entrée. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::SignData(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Calcule la valeur de hachage du flux binaire spécifié en utilisant l'algorithme de hachage et le remplissage spécifiés, puis signe le résultat.

```cpp
ByteArrayPtr System::Security::Cryptography::RSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const StreamPtr\& | Flux binaire. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Mode de remplissage. renvoie la signature [RSA](../) pour les données d'entrée. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
