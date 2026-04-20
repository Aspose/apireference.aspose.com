---
title: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash طريقة"
linktitle: "SignHash"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider::SignHash طريقة. يحسب التوقيع للقيمة التجزئة المحددة في C++."
type: docs
weight: 1700
url: /ar/cpp/system.security.cryptography/rsacryptoserviceprovider/signhash/
---
## RSACryptoServiceProvider::SignHash(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) method


يحسب التوقيع لقيمة التجزئة المحددة.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(ByteArrayPtr hash, HashAlgorithmName hash_algorithm, SharedPtr<RSASignaturePadding> padding) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| الهاش | ByteArrayPtr | قيمة التجزئة. |
| hash_algorithm | HashAlgorithmName | خوارزمية التجزئة. |
| padding | SharedPtr\<RSASignaturePadding\> | وضع الحشو. إرجاع توقيع [RSA](../../rsa/) للهاش المحدد. |

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSASignaturePadding](../../rsasignaturepadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::SignHash(const ByteArrayPtr\&, const String\&) method


يحسب التوقيع للقيمة المدخلة المحددة. غير مُنفّذ.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::SignHash(const ByteArrayPtr &rgb_hash, const String &str)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rgb_hash | const ByteArrayPtr\& | قيمة التجزئة للبيانات التي سيتم توقيعها. |
| str | const String\& | معرف خوارزمية التجزئة المستخدمة لإنشاء التجزئة. |

### ReturnValue

[RSA](../../rsa/) signature for specified data.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [String](../../../system/string/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
