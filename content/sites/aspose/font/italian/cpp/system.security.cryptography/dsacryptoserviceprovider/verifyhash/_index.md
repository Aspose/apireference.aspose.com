---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash metodo"
linktitle: "VerifyHash"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash metodo. Verifica la firma dei dati in C++."
type: docs
weight: 1800
url: /it/cpp/system.security.cryptography/dsacryptoserviceprovider/verifyhash/
---
## DSACryptoServiceProvider::VerifyHash method


Controlla la firma dei dati.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
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
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
