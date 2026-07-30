---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash metodo"
linktitle: "SignHash"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash metodo. Calcola la firma per il valore hash specificato in C++."
type: docs
weight: 1700
url: /it/cpp/system.security.cryptography/rsacryptoserviceprovider/signhash/
---
## RSACryptoServiceProvider::SignHash(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) method


Calcola la firma per il valore hash specificato.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| hash | ByteArrayPtr | Valore hash. |
| hash_algorithm | HashAlgorithmName | Algoritmo hash. |
| padding | SharedPtr\<RSASignaturePadding\> | Modalità di padding. restituisce la firma [RSA](../../rsa/) per l'hash specificato. |

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::SignHash(const ByteArrayPtr\&, const String\&) method


Calcola la firma del valore di input specificato. Non implementato.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Valore hash dei dati da firmare. |
| str | const String\& | Identificatore dell'algoritmo hash usato per creare l'hash. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
