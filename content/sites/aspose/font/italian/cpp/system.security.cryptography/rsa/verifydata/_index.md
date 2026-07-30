---
title: "Metodo System::Security::Cryptography::RSA::VerifyData"
linktitle: "VerifyData"
second_title: "Aspose.Font per C++"
description: "Metodo System::Security::Cryptography::RSA::VerifyData. Verifica che la firma dei dati specificati sia valida in C++."
type: docs
weight: 1300
url: /it/cpp/system.security.cryptography/rsa/verifydata/
---
## RSA::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Verifica che la firma dei dati specificati sia valida.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dati | const ByteArrayPtr\& | Dati firmati. |
| signature | const ByteArrayPtr\& | Dati della firma. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo hash. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Modalità di padding. restituisce true se la firma è valida, altrimenti - false. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Verifica che la firma dei dati specificati sia valida.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dati | const ByteArrayPtr\& | Dati firmati. |
| offset | int32_t | Scostamento in **data**. |
| count | int32_t | Numero di byte da hashare. |
| signature | const ByteArrayPtr\& | Dati della firma. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo hash. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Modalità di padding. restituisce true se la firma è valida, altrimenti - false. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSA::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) method


Verifica che la firma del flusso binario specificato sia valida.

```cpp
bool System::Security::Cryptography::RSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm, const SharedPtr<RSASignaturePadding> &padding)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | const StreamPtr\& | Dati firmati. |
| signature | const ByteArrayPtr\& | Dati della firma. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo hash. |
| padding | const SharedPtr\<RSASignaturePadding\>\& | Modalità di padding. restituisce true se la firma è valida, altrimenti - false. |

## Vedi anche

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
