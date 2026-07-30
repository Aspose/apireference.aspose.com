---
title: "Metodo System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash"
linktitle: "VerifyHash"
second_title: "Aspose.Font per C++"
description: "Metodo System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash. Verifica che la firma dell'hash specificato sia valida in C++."
type: docs
weight: 1900
url: /it/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


Verifica che la firma dell'hash specificato sia valida.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| hash | ByteArrayPtr | Valore hash dei dati firmati. |
| signature | ByteArrayPtr | Dati della firma. |
| hash_algorithm | const HashAlgorithmName\& | Algoritmo hash. |
| padding | SharedPtr\<RSASignaturePadding\> | Modalità di padding. restituisce true se la firma è valida, altrimenti - false. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


Controlla la firma dei dati.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Hash calcolato per i dati ricevuti. |
| str | const String\& | Nome dell'algoritmo hash utilizzato. |
| rgb_signature | const ByteArrayPtr\& | Firma così come ricevuta. |

### ReturnValue

True se la firma è valida, false altrimenti.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
