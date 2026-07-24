---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature μέθοδος"
linktitle: "VerifySignature"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature μέθοδος. Επαληθεύει την υπογραφή DSA για τα καθορισμένα δεδομένα σε C++."
type: docs
weight: 1900
url: /el/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


Επαληθεύστε την υπογραφή [DSA](../../dsa/) για τα καθορισμένα δεδομένα.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) υπογεγραμμένα με **rgb_signature**. |
| rgb_signature | ByteArrayPtr | υπογραφή [DSA](../../dsa/). |

### ReturnValue

αληθές - εάν το **rgb_signature** ταιριάζει με την υπογραφή [DSA](../../dsa/) που υπολογίζεται στο **rgb_hash**, διαφορετικά - ψευδές.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
