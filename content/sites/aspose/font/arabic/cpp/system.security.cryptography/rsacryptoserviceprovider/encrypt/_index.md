---
title: "طريقة System::Security::Cryptography::RSACryptoServiceProvider::Encrypt"
linktitle: "تشفير"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::RSACryptoServiceProvider::Encrypt. تقوم بتشفير البيانات المدخلة باستخدام وضع الحشو المحدد في C++."
type: docs
weight: 400
url: /ar/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


يشفر البيانات المدخلة باستخدام وضع الحشو المحدد.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) مصفوفة لتشفيرها. |
| حشو | SharedPtr\<RSAEncryptionPadding\> | وضع الحشو. |

### ReturnValue

بيانات مشفّرة بصيغة مصفوفة بايت.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


يشفر الرسالة. غير مُطبق.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) للتشفير. |
| use_oaep | bool | True لاستخدام حشو OAEP، false لاستخدام حشو PKCS#1 v1.5. |

### ReturnValue

مصفوفة البيانات المشفرة.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
