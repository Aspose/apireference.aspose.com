---
title: "System::Security::Cryptography::ECDsaBotan::HashData méthode"
linktitle: "HashData"
second_title: "Aspose.Font pour C++"
description: "System::Security::Cryptography::ECDsaBotan::HashData méthode. Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage spécifié en C++."
type: docs
weight: 700
url: /fr/cpp/system.security.cryptography/ecdsabotan/hashdata/
---
## ECDsaBotan::HashData(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) method


Calcule la valeur de hachage du tableau de données spécifié en utilisant l'algorithme de hachage spécifié.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(ByteArrayPtr data, int32_t offset, int32_t count, HashAlgorithmName hash_algorithm) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| data | ByteArrayPtr | [Data](../../../system.data/) à hacher. |
| décalage | int32_t | Décalage dans **data**. |
| count | int32_t | Nombre d'octets à hacher. |
| hash_algorithm | HashAlgorithmName | Algorithme de hachage. |

### ReturnValue

Données hachées.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::HashData(StreamPtr, HashAlgorithmName) method


Calcule la valeur de hachage du flux binaire spécifié en utilisant l'algorithme de hachage spécifié.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(StreamPtr stream, HashAlgorithmName hash_algorithm) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| flux | StreamPtr | Flux binaire à hacher. |
| hash_algorithm | HashAlgorithmName | Algorithme de hachage. |

### ReturnValue

Données hachées.

## Voir aussi

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
