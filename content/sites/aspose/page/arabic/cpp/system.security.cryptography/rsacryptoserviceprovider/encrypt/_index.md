---
title: "طريقة System::Security::Cryptography::RSACryptoServiceProvider::Encrypt"
linktitle: "Encrypt"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Security::Cryptography::RSACryptoServiceProvider::Encrypt. يشفر البيانات المدخلة باستخدام وضع الحشو المحدد في C++."
type: docs
weight: 400
url: /ar/cpp/system.security.cryptography/rsacryptoserviceprovider/encrypt/
---
## RSACryptoServiceProvider::Encrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


يشفر البيانات المدخلة باستخدام وضع الحشو المحدد.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| data | ByteArrayPtr | مصفوفة [Byte](../../../system/byte/) للتشفير. |
| حشو | SharedPtr\<RSAEncryptionPadding\> | وضع الحشو. |

### ReturnValue

البيانات المشفرة بصيغة مصفوفة بايت.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RSACryptoServiceProvider::Encrypt(const ByteArrayPtr\&, bool) method


يشفر الرسالة. غير مُنفّذ.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Encrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) للتشفير. |
| use_oaep | bool | True لاستخدام حشو OAEP، false لاستخدام حشو PKCS#1 v1.5. |

### ReturnValue

مصفوفة البيانات المشفرة.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
