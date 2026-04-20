---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData طريقة"
linktitle: "VerifyData"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyData طريقة. يتحقق من توقيع البيانات في C++."
type: docs
weight: 1800
url: /ar/cpp/system.security.cryptography/rsacryptoserviceprovider/verifydata/
---
## RSACryptoServiceProvider::VerifyData method


يفحص توقيع البيانات.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyData(const ByteArrayPtr &buffer, const SharedPtr<Object> &halg, const ByteArrayPtr &signature)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ByteArrayPtr\& | [Data](../../../system.data/) للتحقق من التوقيع الخاص به. |
| halg | const SharedPtr\<Object\>\& | خوارزمية التجزئة للاستخدام. |
| التوقيع | const ByteArrayPtr\& | التوقيع كما تم استلامه. |

### ReturnValue

صحيح إذا كان التوقيع صالحًا، خطأ خلاف ذلك.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
