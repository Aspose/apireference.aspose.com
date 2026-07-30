---
title: "System::Security::Cryptography::ECDsa::VerifyData metodo"
linktitle: "VerifyData"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::ECDsa::VerifyData metodo. Verifica che la firma dei dati specificati sia valida in C++."
type: docs
weight: 900
url: /it/cpp/system.security.cryptography/ecdsa/verifydata/
---
## ECDsa::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifica che la firma dei dati specificati sia valida.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dati | const ByteArrayPtr\& | Dati firmati. |
| signature | const ByteArrayPtr\& | Dati della firma. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo di hash. restituisce true se la firma è valida, altrimenti - false. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifica che la firma dei dati specificati sia valida.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dati | const ByteArrayPtr\& | Dati firmati. |
| offset | int32_t | Scostamento in **data**. |
| count | int32_t | Numero di byte da hashare. |
| signature | const ByteArrayPtr\& | Dati della firma. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo di hash. restituisce true se la firma è valida, altrimenti - false. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## ECDsa::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifica che la firma del flusso binario specificato sia valida.

```cpp
bool System::Security::Cryptography::ECDsa::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | const StreamPtr\& | Dati firmati. |
| signature | const ByteArrayPtr\& | Dati della firma. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo di hash. restituisce true se la firma è valida, altrimenti - false. |

## Vedi anche

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
