---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData μέθοδος"
linktitle: "VerifyData"
second_title: "Aspose.Page για C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData μέθοδος. Ελέγχει την υπογραφή δεδομένων σε C++."
type: docs
weight: 1800
url: /el/cpp/system.security.cryptography/rsacryptoserviceprovider/verifydata/
---
## RSACryptoServiceProvider::VerifyData method


Ελέγχει την υπογραφή δεδομένων.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg, const ByteArrayPtr &signature)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) για έλεγχο υπογραφής. |
| halg | const SharedPtr\<Object\>\& | Αλγόριθμος κατακερματισμού προς χρήση. |
| υπογραφή | const ByteArrayPtr\& | Υπογραφή όπως ελήφθη. |

### ReturnValue

True εάν η υπογραφή είναι έγκυρη, false διαφορετικά.

## Δείτε επίσης

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
