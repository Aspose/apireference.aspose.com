---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData method"
linktitle: "VerifyData"
second_title: "Aspose.Page per C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyData method. Verifica la firma dei dati in C++."
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
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) per cui verificare la firma. |
| firma | const ByteArrayPtr\& | Firma così ricevuta. |

### ReturnValue

True se la firma è valida, false altrimenti.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifica che la firma dei dati specificati sia valida.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dati | const ByteArrayPtr\& | Dati firmati. |
| firma | const ByteArrayPtr\& | Dati della firma. |
| `hash_algorithm` | `const HashAlgorithmName\&` | Algoritmo hash. restituisce true se la firma è valida, altrimenti - false. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifica che la firma dei dati specificati sia valida.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const ByteArrayPtr &data, int32_t offset, int32_t count, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dati | const ByteArrayPtr\& | Dati firmati. |
| offset | int32_t | Offset in **data**. |
| count | int32_t | Numero di byte da hashare. |
| firma | const ByteArrayPtr\& | Dati della firma. |
| `hash_algorithm` | `const HashAlgorithmName\&` | Algoritmo hash. restituisce true se la firma è valida, altrimenti - false. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## DSACryptoServiceProvider::VerifyData(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) method


Verifica che la firma del flusso binario specificato sia valida.

```cpp
bool System::Security::Cryptography::DSA::VerifyData(const StreamPtr &stream, const ByteArrayPtr &signature, const HashAlgorithmName &hash_algorithm)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| stream | `const StreamPtr\&` | Dati firmati. |
| firma | const ByteArrayPtr\& | Dati della firma. |
| `hash_algorithm` | `const HashAlgorithmName\&` | Algoritmo hash. restituisce true se la firma è valida, altrimenti - false. |

## Vedi anche

* Typedef [StreamPtr](../../../system/streamptr/)
* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
