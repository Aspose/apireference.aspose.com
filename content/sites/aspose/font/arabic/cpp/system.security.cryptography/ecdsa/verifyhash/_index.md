---
title: "طريقة System::Security::Cryptography::ECDsa::VerifyHash"
linktitle: "VerifyHash"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::ECDsa::VerifyHash. يتحقق من توقيع البيانات في C++."
type: docs
weight: 1000
url: /ar/cpp/system.security.cryptography/ecdsa/verifyhash/
---
## ECDsa::VerifyHash method


يفحص توقيع البيانات.

```cpp
virtual bool System::Security::Cryptography::ECDsa::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الهاش | ByteArrayPtr | الهاش المحسوب للبيانات المستلمة. |
| التوقيع | ByteArrayPtr | التوقيع كما تم استلامه. |

### ReturnValue

صحيح إذا كان التوقيع صالحًا، خطأ خلاف ذلك.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [ECDsa](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
