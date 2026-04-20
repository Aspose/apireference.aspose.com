---
title: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature طريقة"
linktitle: "VerifySignature"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature طريقة. تحقق من توقيع DSA للبيانات المحددة في C++."
type: docs
weight: 1900
url: /ar/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


تحقق من توقيع [DSA](../../dsa/) للبيانات المحددة.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) موقّع بـ **rgb_signature**. |
| rgb_signature | ByteArrayPtr | توقيع [DSA](../../dsa/). |

### ReturnValue

صحيح - إذا كان **rgb_signature** يطابق توقيع [DSA](../../dsa/) المُحسب على **rgb_hash**، وإلا - خطأ.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
