---
title: "System::Security::Cryptography::RC2Managed::CreateDecryptor طريقة"
linktitle: "CreateDecryptor"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::RC2Managed::CreateDecryptor طريقة. ينشئ كائن فك التشفير بالمعلمات المحددة بواسطة كائن الخوارزمية في C++."
type: docs
weight: 100
url: /ar/cpp/system.security.cryptography/rc2managed/createdecryptor/
---
## RC2Managed::CreateDecryptor() method


ينشئ كائن فك التشفير مع معلمات محددة بواسطة كائن الخوارزمية.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## RC2Managed::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


ينشئ كائن فك التشفير مع معلمات صريحة.

```cpp
SharedPtr<ICryptoTransform> System::Security::Cryptography::RC2Managed::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | مفتاح التشفير في شكل مصفوفة بايت. |
| rgbIV | System::ArrayPtr\<uint8_t\> | القيمة الأولية في شكل مصفوفة بايت. |

### ReturnValue

كائن فك التشفير الذي تم إنشاؤه حديثًا.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [RC2Managed](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
