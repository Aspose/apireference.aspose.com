---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature μέθοδος"
linktitle: "VerifySignature"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature μέθοδος. Επαληθεύει την υπογραφή του κατακερματισμού δεδομένων σε C++."
type: docs
weight: 400
url: /el/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/verifysignature/
---
## RSAPKCS1SignatureDeformatter::VerifySignature method


Επαληθεύει την υπογραφή του hash των δεδομένων.

```cpp
virtual bool System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | Ο κατακερματισμός υπολογίστηκε για τα δεδομένα. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | Λήφθηκε η υπογραφή για τα δεδομένα. |

### ReturnValue

True εάν η υπογραφή είναι έγκυρη, false διαφορετικά.

## Δείτε επίσης

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RSAPKCS1SignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
