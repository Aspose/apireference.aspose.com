---
title: "System::Security::Cryptography::ECDsa::SignData metodo"
linktitle: "SignData"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::ECDsa::SignData metodo. Calcola il valore hash dell'array di dati specificato usando l'algoritmo hash specificato e firma il risultato in C++."
type: docs
weight: 700
url: /it/cpp/system.security.cryptography/ecdsa/signdata/
---
## ECDsa::SignData(const ByteArrayPtr\&, const HashAlgorithmName\&) method


Calcola il valore hash dell'array di dati specificato utilizzando l'algoritmo hash specificato e firma il risultato.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, const HashAlgorithmName &hash_algorithm)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dati | const ByteArrayPtr\& | Array di dati in input. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo di hash. restituisce la firma ECDSA per i dati di input. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::SignData(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) method


Calcola il valore hash dell'array di dati specificato utilizzando l'algoritmo hash specificato e firma il risultato.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const ByteArrayPtr &data, int32_t offset, int32_t count, const HashAlgorithmName &hash_algorithm)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dati | const ByteArrayPtr\& | Array di dati in input. |
| offset | int32_t | Scostamento in **data**. |
| count | int32_t | Numero di byte da utilizzare come dati di input. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo di hash. restituisce la firma ECDSA per i dati di input. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::SignData(const StreamPtr\&, const HashAlgorithmName\&) method


Calcola il valore hash del flusso binario specificato utilizzando l'algoritmo hash specificato e firma il risultato.

```cpp
virtual ByteArrayPtr System::Security::Cryptography::ECDsa::SignData(const StreamPtr &stream, const HashAlgorithmName &hash_algorithm)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | const StreamPtr\& | Flusso binario. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo di hash. restituisce la firma ECDSA per i dati di input. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [StreamPtr](../../../system/streamptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
