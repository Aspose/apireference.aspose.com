---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature طريقة"
linktitle: "VerifySignature"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature. يتحقق من التوقيع على البيانات في C++."
type: docs
weight: 300
url: /ar/cpp/system.security.cryptography/asymmetricsignaturedeformatter/verifysignature/
---
## AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


يتحقق من التوقيع على البيانات.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::ArrayPtr<uint8_t> rgbHash, System::ArrayPtr<uint8_t> rgbSignature)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| rgbHash | System::ArrayPtr\<uint8_t\> | [البيانات](../../../system.data/) موقّعة بـ **rgbSignature**. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | التوقيع الذي سيتم التحقق منه للبيانات. |

### ReturnValue

صحيح إذا نجح فحص التوقيع، خطأ خلاف ذلك.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) method


يتحقق من التوقيع على البيانات. غير مُنفّذ.

```cpp
virtual bool System::Security::Cryptography::AsymmetricSignatureDeformatter::VerifySignature(System::SharedPtr<HashAlgorithm> hash, System::ArrayPtr<uint8_t> rgbSignature)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الملخص | System::SharedPtr\<HashAlgorithm\> | الخوارزمية المستخدمة للتجزئة. |
| rgbSignature | System::ArrayPtr\<uint8_t\> | التوقيع الذي سيتم التحقق منه للبيانات. |

### ReturnValue

صحيح إذا نجح فحص التوقيع، خطأ خلاف ذلك.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HashAlgorithm](../../hashalgorithm/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [AsymmetricSignatureDeformatter](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
