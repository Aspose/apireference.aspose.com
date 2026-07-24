---
title: "طريقة System::Security::Cryptography::ECDsa::VerifyHash"
linktitle: "VerifyHash"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Security::Cryptography::ECDsa::VerifyHash. تتحقق من توقيع البيانات في C++."
type: docs
weight: 1000
url: /ar/cpp/system.security.cryptography/ecdsa/verifyhash/
---
## ECDsa::VerifyHash method


يفحص توقيع البيانات.

```cpp
virtual bool System::Security::Cryptography::ECDsa::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الملخص | ByteArrayPtr | الملخص المحسوب للبيانات المستلمة. |
| التوقيع | ByteArrayPtr | التوقيع كما تم استلامه. |

### ReturnValue

صحيح إذا كان التوقيع صالحًا، خطأ خلاف ذلك.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
