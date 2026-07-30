---
title: "System::Security::Cryptography::DSA::VerifySignature metodo"
linktitle: "VerifySignature"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::DSA::VerifySignature metodo. Verifica la firma DSA per i dati specificati in C++."
type: docs
weight: 800
url: /it/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


Verifica la firma [DSA](../) per i dati specificati.

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) firmato con **rgb_signature**. |
| rgb_signature | ByteArrayPtr | Firma [DSA](../). |

### ReturnValue

vero - se **rgb_signature** corrisponde alla firma [DSA](../) calcolata su **rgb_hash**, altrimenti - falso.

## Vedi anche

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
