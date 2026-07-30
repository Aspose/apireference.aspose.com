---
title: "System::Security::Cryptography::ECDsa::SignData méthode"
linktitle: "SignData"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::ECDsa::SignData méthode. Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage spécifié, et signe le résultat en C++."
type: docs
weight: 700
url: /fr/cpp/system.security.cryptography/ecdsa/signdata/
---
## ECDsa::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage spécifié, et signe le résultat.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| données | const ByteArrayPtr\& | Tableau de données d'entrée. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. renvoie la signature ECDSA pour les données d'entrée. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage spécifié, et signe le résultat.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| données | const ByteArrayPtr\& | Tableau de données d'entrée. |
| décalage | int32_t | Décalage dans **data**. |
| count | int32_t | Nombre d'octets à utiliser comme données d'entrée. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. renvoie la signature ECDSA pour les données d'entrée. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Calcule la valeur de hachage du flux binaire spécifié en utilisant l'algorithme de hachage spécifié, et signe le résultat.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | const StreamPtr\& | Flux binaire. |
| hash_algorithm | const HashAlgorithmName\& | Algorithme de hachage. renvoie la signature ECDSA pour les données d'entrée. |

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
