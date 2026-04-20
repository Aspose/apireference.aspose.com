---
title: "طريقة System::Security::Cryptography::RSACryptoServiceProvider::Decrypt"
linktitle: "فك التشفير"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::RSACryptoServiceProvider::Decrypt. تقوم بفك تشفير البيانات المدخلة باستخدام وضع الحشو المحدد في C++."
type: docs
weight: 200
url: /ar/cpp/system.security.cryptography/rsacryptoserviceprovider/decrypt/
---
## RSACryptoServiceProvider::Decrypt(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) method


يفك تشفير البيانات المدخلة باستخدام وضع الحشو المحدد.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(ByteArrayPtr data, SharedPtr<RSAEncryptionPadding> padding) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| data | ByteArrayPtr | [Byte](../../../system/byte/) مصفوفة لفك التشفير. |
| حشو | SharedPtr\<RSAEncryptionPadding\> | وضع الحشو. |

### ReturnValue

البيانات المفكوكة في صيغة مصفوفة بايت.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [RSAEncryptionPadding](../../rsaencryptionpadding/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RSACryptoServiceProvider::Decrypt(const ByteArrayPtr\&, bool) method


يفك تشفير الرسالة. غير مُطبق.

```cpp
ByteArrayPtr System::Security::Cryptography::RSACryptoServiceProvider::Decrypt(const ByteArrayPtr &rgb, bool use_oaep)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rgb | const ByteArrayPtr\& | [Data](../../../system.data/) لفك التشفير. |
| use_oaep | bool | True لاستخدام حشو OAEP، false لاستخدام حشو PKCS#1 v1.5. |

### ReturnValue

مصفوفة البيانات المفكوكة.

## انظر أيضًا

* Typedef [ByteArrayPtr](../../../system/bytearrayptr/)
* Class [RSACryptoServiceProvider](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
