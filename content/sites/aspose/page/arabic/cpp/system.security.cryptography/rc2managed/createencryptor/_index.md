---
title: "System::Security::Cryptography::RC2Managed::CreateEncryptor طريقة"
linktitle: "CreateEncryptor"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::RC2Managed::CreateEncryptor طريقة. ينشئ كائن التشفير مع المعلمات المحددة بواسطة كائن algorithm في C++."
type: docs
weight: 200
url: /ar/cpp/system.security.cryptography/rc2managed/createencryptor/
---
## RC2Managed::CreateEncryptor() method


ينشئ كائن التشفير مع معلمات محددة بواسطة كائن الخوارزمية.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
## RC2Managed::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


ينشئ كائن التشفير مع معلمات صريحة.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RC2Managed::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | مفتاح التشفير في شكل مصفوفة بايت. |
| rgbIV | System::ArrayPtr\<uint8_t\> | القيمة الأولية في شكل مصفوفة بايت. |

### ReturnValue

كائن التشفير الذي تم إنشاؤه حديثًا.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
