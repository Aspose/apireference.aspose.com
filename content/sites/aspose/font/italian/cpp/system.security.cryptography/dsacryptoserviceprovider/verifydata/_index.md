---
title: "metodo System::Security::Cryptography::DSACryptoServiceProvider::VerifyData"
linktitle: "VerifyData"
second_title: "Aspose.Font per C++"
description: "metodo System::Security::Cryptography::DSACryptoServiceProvider::VerifyData. Verifica la firma dei dati in C++."
type: docs
weight: 1700
url: /it/cpp/system.security.cryptography/dsacryptoserviceprovider/verifydata/
---
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&) method


Controlla la firma dei dati.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const ByteArrayPtr &signature)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) per verificare la firma. |
| signature | const ByteArrayPtr\& | Firma così come ricevuta. |

### ReturnValue

True se la firma è valida, false altrimenti.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifica che la firma dei dati specificati sia valida.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dati | const ByteArrayPtr\& | Dati firmati. |
| signature | const ByteArrayPtr\& | Dati della firma. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo di hash. restituisce true se la firma è valida, altrimenti - false. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifica che la firma dei dati specificati sia valida.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
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
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifica che la firma del flusso binario specificato sia valida.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | const StreamPtr\& | Dati firmati. |
| signature | const ByteArrayPtr\& | Dati della firma. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo di hash. restituisce true se la firma è valida, altrimenti - false. |

## Vedi anche

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
