---
title: "طريقة System::Security::Cryptography::RSA::VerifyHash"
linktitle: "VerifyHash"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::RSA::VerifyHash. تتحقق من أن توقيع التجزئة المحددة صالح في C++."
type: docs
weight: 1400
url: /ar/cpp/system.security.cryptography/rsa/verifyhash/
---
## RSA::VerifyHash method


يتحقق من صحة توقيع التجزئة المحددة.

```cpp
virtual bool System::Security::Cryptography::RSA::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الهاش | ByteArrayPtr | قيمة التجزئة للبيانات الموقّعة. |
| التوقيع | ByteArrayPtr | بيانات التوقيع. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. |
| حشو | SharedPtr\<RSASignaturePadding\> | وضع الحشو. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSA](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
