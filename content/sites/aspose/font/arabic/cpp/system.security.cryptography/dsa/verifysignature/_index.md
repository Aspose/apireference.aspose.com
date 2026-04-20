---
title: "طريقة System::Security::Cryptography::DSA::VerifySignature"
linktitle: "VerifySignature"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::DSA::VerifySignature. تحقق من توقيع DSA للبيانات المحددة في C++."
type: docs
weight: 800
url: /ar/cpp/system.security.cryptography/dsa/verifysignature/
---
## DSA::VerifySignature method


تحقق من توقيع [DSA](../) للبيانات المحددة.

```cpp
virtual bool System::Security::Cryptography::DSA::VerifySignature(ByteArrayPtr rgb_hash, ByteArrayPtr rgb_signature)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rgb_hash | ByteArrayPtr | [Data](../../../system.data/) موقّع بـ **rgb_signature**. |
| rgb_signature | ByteArrayPtr | توقيع [DSA](../). |

### ReturnValue

صحيح - إذا كان **rgb_signature** يطابق توقيع [DSA](../) المحسوب على **rgb_hash**، وإلا - خطأ.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [DSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
