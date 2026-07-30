---
title: "System::Security::Cryptography::RSA::VerifyHash metodo"
linktitle: "VerifyHash"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::RSA::VerifyHash metodo. Verifica che la firma dell'hash specificato sia valida in C++."
type: docs
weight: 1400
url: /it/cpp/system.security.cryptography/rsa/verifyhash/
---
## RSA::VerifyHash method


Verifica che la firma dell'hash specificato sia valida.

```cpp
virtual bool System::Security::Cryptography::RSA::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding)
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
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
