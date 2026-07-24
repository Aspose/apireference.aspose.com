---
title: "طريقة System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash"
linktitle: "VerifyHash"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash. يتحقق من توقيع البيانات في C++."
type: docs
weight: 1800
url: /ar/cpp/system.security.cryptography/dsacryptoserviceprovider/verifyhash/
---
## DSACryptoServiceProvider::VerifyHash method


يفحص توقيع البيانات.

```cpp
bool System::Security::Cryptography::DSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | الملخص المحسوب للبيانات المستلمة. |
| str | const String\& | اسم خوارزمية التجزئة المستخدمة. |
| rgb_signature | const ByteArrayPtr\& | التوقيع كما تم استلامه. |

### ReturnValue

صحيح إذا كان التوقيع صالحًا، خطأ خلاف ذلك.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [DSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
