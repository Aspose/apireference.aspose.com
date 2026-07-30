---
title: "System::Security::Cryptography::DSA::SignData méthode"
linktitle: "SignData"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::DSA::SignData method. Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage spécifié, puis signe le résultat en C++."
type: docs
weight: 500
url: /fr/cpp/system.security.cryptography/dsa/signdata/
---
## DSA::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage spécifié, et signe le résultat.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| données | const ByteArrayPtr\& | Tableau de données d'entrée. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. Retourne la signature [DSA](../) pour les données d'entrée. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSA::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage spécifié, et signe le résultat.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| données | const ByteArrayPtr\& | Tableau de données d'entrée. |
| décalage | int32_t | Décalage dans **data**. |
| count | int32_t | Nombre d'octets à utiliser comme données d'entrée. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. Retourne la signature [DSA](../) pour les données d'entrée. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSA::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Calcule la valeur de hachage du flux binaire spécifié en utilisant l'algorithme de hachage spécifié, et signe le résultat.

```cpp
ByteArrayPtr System::Security::Cryptography::DSA::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const StreamPtr\& | Flux binaire. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. Retourne la signature [DSA](../) pour les données d'entrée. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
