---
title: "System::Security::Cryptography::ECDsaBotan::HashData metodo"
linktitle: "HashData"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::ECDsaBotan::HashData metodo. Calcola il valore hash dell'array di dati specificato usando l'algoritmo hash specificato in C++."
type: docs
weight: 700
url: /it/cpp/system.security.cryptography/ecdsabotan/hashdata/
---
## ECDsaBotan::HashData(ByteArrayPtr, int32_t, int32_t, HashAlgorithmName) method


Calcola il valore hash dell'array di dati specificato usando l'algoritmo di hash specificato.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(ByteArrayPtr data, int32_t offset, int32_t count, HashAlgorithmName hash_algorithm) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| data | ByteArrayPtr | [Data](../../../system.data/) da hashare. |
| offset | int32_t | Scostamento in **data**. |
| count | int32_t | Numero di byte da hashare. |
| hash_algorithm | HashAlgorithmName | Algoritmo hash. |

### ReturnValue

Dati hashati.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsaBotan::HashData(StreamPtr, HashAlgorithmName) method


Calcola il valore hash del flusso binario specificato usando l'algoritmo di hash specificato.

```cpp
ByteArrayPtr System::Security::Cryptography::ECDsaBotan::HashData(StreamPtr stream, HashAlgorithmName hash_algorithm) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | StreamPtr | Flusso binario da hashare. |
| hash_algorithm | HashAlgorithmName | Algoritmo hash. |

### ReturnValue

Dati hashati.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsaBotan](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
