---
title: "طريقة System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash"
linktitle: "VerifyHash"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash. تتحقق من صحة توقيع التجزئة المحددة في C++."
type: docs
weight: 1900
url: /ar/cpp/system.security.cryptography/rsacryptoserviceprovider/verifyhash/
---
## RSACryptoServiceProvider::VerifyHash(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) method


يتحقق من صحة توقيع التجزئة المحددة.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(ByteArrayPtr hash, ByteArrayPtr signature, const HashAlgorithmName &hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
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
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) method


يفحص توقيع البيانات.

```cpp
bool System::Security::Cryptography::RSACryptoServiceProvider::VerifyHash(const ByteArrayPtr &rgb_hash, const String &str, const ByteArrayPtr &rgb_signature)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | الهاش المحسوب للبيانات المستلمة. |
| str | const String\& | اسم خوارزمية التجزئة المستخدمة. |
| rgb_signature | const ByteArrayPtr\& | التوقيع كما تم استلامه. |

### ReturnValue

صحيح إذا كان التوقيع صالحًا، خطأ خلاف ذلك.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
