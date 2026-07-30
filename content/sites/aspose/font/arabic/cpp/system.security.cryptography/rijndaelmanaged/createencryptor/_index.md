---
title: "طريقة System::Security::Cryptography::RijndaelManaged::CreateEncryptor"
linktitle: "CreateEncryptor"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::RijndaelManaged::CreateEncryptor. ينشئ كائن تشفير مع المعلمات المحددة بواسطة كائن الخوارزمية في C++."
type: docs
weight: 200
url: /ar/cpp/system.security.cryptography/rijndaelmanaged/createencryptor/
---
## RijndaelManaged::CreateEncryptor() method


ينشئ كائن التشفير مع معلمات محددة بواسطة كائن الخوارزمية.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RijndaelManaged::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


ينشئ كائن التشفير مع معلمات صريحة.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RijndaelManaged::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | مفتاح التشفير في شكل مصفوفة بايت. |
| rgbIV | System::ArrayPtr\<uint8_t\> | القيمة الأولية في شكل مصفوفة بايت. |

### ReturnValue

كائن المشفر الذي تم إنشاؤه حديثًا.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RijndaelManaged](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
