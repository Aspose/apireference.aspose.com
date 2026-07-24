---
title: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash طريقة"
linktitle: "VerifyHash"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash طريقة. يتحقق من أن توقيع التجزئة المحددة صالح في C++."
type: docs
weight: 1900
url: /ar/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


يتحقق من أن توقيع التجزئة المحددة صالح.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الملخص | ByteArrayPtr | قيمة التجزئة للبيانات الموقعة. |
| التوقيع | ByteArrayPtr | بيانات التوقيع. |
| hash_algorithm | const HashAlgorithmName\& | خوارزمية التجزئة. |
| حشو | SharedPtr\<RSASignaturePadding\> | وضع الحشو. إرجاع true إذا كان التوقيع صالحًا، وإلا - false. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


يفحص توقيع البيانات.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
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
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
