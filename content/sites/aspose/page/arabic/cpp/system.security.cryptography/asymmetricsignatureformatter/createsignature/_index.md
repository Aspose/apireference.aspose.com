---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature طريقة"
linktitle: "CreateSignature"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature طريقة. معلومات RTTI في C++."
type: docs
weight: 100
url: /ar/cpp/system.security.cryptography/asymmetricsignatureformatter/createsignature/
---
## AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr\<uint8_t\>) method


معلومات RTTI.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr<uint8_t> rgbHash)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) لحساب التجزئة لـ. |

### ReturnValue

التوقيع المحسوب في شكل مصفوفة بايت.
## ملاحظات


ينشئ التوقيع للبيانات المحددة.
## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr\<HashAlgorithm\>) method


ينشئ التوقيع للقيمة المختصرة المحددة.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr<HashAlgorithm> hash)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الملخص | System::SharedPtr\<HashAlgorithm\> | خوارزمية التجزئة للاستخدام عند إنشاء التوقيع. |

### ReturnValue

التوقيع المحسوب في شكل مصفوفة بايت.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
