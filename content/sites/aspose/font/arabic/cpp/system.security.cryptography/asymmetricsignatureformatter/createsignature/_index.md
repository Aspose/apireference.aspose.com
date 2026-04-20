---
title: "طريقة System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature"
linktitle: "CreateSignature"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature. معلومات RTTI في C++."
type: docs
weight: 100
url: /ar/cpp/system.security.cryptography/asymmetricsignatureformatter/createsignature/
---
## AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr\<uint8_t\>) method


معلومات RTTI.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::ArrayPtr<uint8_t> rgbHash)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [Data](../../../system.data/) لحساب التجزئة له. |

### ReturnValue

التوقيع المحسوب في شكل مصفوفة بايت.
## ملاحظات


ينشئ التوقيع للبيانات المحددة.
## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr\<HashAlgorithm\>) method


ينشئ التوقيع للقيمة التجزئة المحددة.

```cpp
virtual System::ArrayPtr<uint8_t> System::Security::Cryptography::AsymmetricSignatureFormatter::CreateSignature(System::SharedPtr<HashAlgorithm> hash)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الهاش | System::SharedPtr\<HashAlgorithm\> | خوارزمية التجزئة المستخدمة عند إنشاء التوقيع. |

### ReturnValue

التوقيع المحسوب في شكل مصفوفة بايت.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Class [AsymmetricSignatureFormatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
