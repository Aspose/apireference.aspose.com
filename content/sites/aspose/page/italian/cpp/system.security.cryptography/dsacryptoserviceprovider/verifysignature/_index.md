---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature method"
linktitle: "VerifySignature"
second_title: "Aspose.Page per C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature method. Verifica la firma DSA per i dati specificati in C++."
type: docs
weight: 1900
url: /it/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


Verifica la firma [DSA](../../dsa/) per i dati specificati.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) firmati con **rgb_signature**. |
| rgb_signature | ByteArrayPtr | [DSA](../../dsa/) firma. |

### ReturnValue

true - se **rgb_signature** corrisponde alla firma [DSA](../../dsa/) calcolata su **rgb_hash**, altrimenti - false.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
