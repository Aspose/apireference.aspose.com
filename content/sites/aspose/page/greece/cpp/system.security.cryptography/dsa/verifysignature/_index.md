---
title: "System::Security::Cryptography::DSA::VerifySignature μέθοδος"
linktitle: "VerifySignature"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::DSA::VerifySignature μέθοδος. Επαληθεύει την υπογραφή DSA για τα καθορισμένα δεδομένα σε C++."
type: docs
weight: 800
url: /el/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


Επαληθεύστε την υπογραφή [DSA](../) για τα καθορισμένα δεδομένα.

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) υπογεγραμμένα με **rgb_signature**. |
| rgb_signature | ByteArrayPtr | υπογραφή [DSA](../). |

### ReturnValue

αληθές - εάν το **rgb_signature** ταιριάζει με την υπογραφή [DSA](../) που υπολογίστηκε στο **rgb_hash**, διαφορετικά - ψευδές.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
