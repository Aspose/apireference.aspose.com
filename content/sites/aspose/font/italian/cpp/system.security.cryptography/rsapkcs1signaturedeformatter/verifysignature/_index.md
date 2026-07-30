---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature metodo"
linktitle: "VerifySignature"
second_title: "Aspose.Font per C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature metodo. Verifica la firma dell'hash dei dati in C++."
type: docs
weight: 400
url: /it/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/verifysignature/
---
## RSAPKCS1SignatureDeformatter::VerifySignature method


Verifica la firma dell'hash dei dati.

```cpp
virtual bool System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | Hash calcolato per i dati. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Firma ricevuta per i dati. |

### ReturnValue

True se la firma è valida, false altrimenti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RSAPKCS1SignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
