---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature طريقة"
linktitle: "VerifySignature"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature طريقة. يتحقق من توقيع تجزئة البيانات في C++."
type: docs
weight: 400
url: /ar/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/verifysignature/
---
## RSAPKCS1SignatureDeformatter::VerifySignature method


يتحقق من توقيع تجزئة البيانات.

```cpp
virtual bool System::Security::Cryptography::RSAPKCS1SignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | تم حساب التجزئة للبيانات. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | تم استلام التوقيع للبيانات. |

### ReturnValue

صحيح إذا كان التوقيع صالحًا، خطأ خلاف ذلك.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RSAPKCS1SignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
