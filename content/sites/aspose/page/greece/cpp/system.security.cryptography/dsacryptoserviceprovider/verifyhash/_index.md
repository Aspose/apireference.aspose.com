---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash μέθοδος"
linktitle: "VerifyHash"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash μέθοδος. Ελέγχει την υπογραφή δεδομένων σε C++."
type: docs
weight: 1800
url: /el/cpp/system.security.cryptography/dsacryptoserviceprovider/verifyhash/
---
## DSACryptoServiceProvider::VerifyHash method


Ελέγχει την υπογραφή δεδομένων.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | Hash υπολογισμένο για τα ληφθέντα δεδομένα. |
| str | const String\& | Όνομα του αλγορίθμου κατακερματισμού που χρησιμοποιείται. |
| rgb_signature | const ByteArrayPtr\& | Υπογραφή όπως ελήφθη. |

### ReturnValue

True εάν η υπογραφή είναι έγκυρη, false διαφορετικά.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
