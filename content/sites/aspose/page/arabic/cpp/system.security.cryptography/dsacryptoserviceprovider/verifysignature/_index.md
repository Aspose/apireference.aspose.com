---
title: "طريقة System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature"
linktitle: "VerifySignature"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature. تحقق من توقيع DSA للبيانات المحددة في C++."
type: docs
weight: 1900
url: /ar/cpp/system.security.cryptography/dsacryptoserviceprovider/verifysignature/
---
## DSACryptoServiceProvider::VerifySignature method


تحقق من توقيع [DSA](../../dsa/) للبيانات المحددة.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) موقّعة باستخدام **rgb_signature**. |
| rgb_signature | ByteArrayPtr | توقيع [DSA](../../dsa/). |

### ReturnValue

true - إذا كان **rgb_signature** يطابق توقيع [DSA](../../dsa/) المُحسب على **rgb_hash**، وإلا - false.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
