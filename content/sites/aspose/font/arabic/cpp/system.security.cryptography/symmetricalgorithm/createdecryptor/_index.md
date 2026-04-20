---
title: "System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor طريقة"
linktitle: "CreateDecryptor"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor طريقة. ينشئ مفكك تشفير مع المعلمات المرتبطة بكائن الخوارزمية في C++."
type: docs
weight: 100
url: /ar/cpp/system.security.cryptography/symmetricalgorithm/createdecryptor/
---
## SymmetricAlgorithm::CreateDecryptor() method


ينشئ مُفك تشفير مع المعلمات المرتبطة بكائن الخوارزمية.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor()
```


### ReturnValue

كائن فك التشفير الذي تم إنشاؤه حديثًا.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## SymmetricAlgorithm::CreateDecryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


ينشئ مُفك تشفير مع معلمات صريحة.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateDecryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | المفتاح للاستخدام. |
| rgbIV | System::ArrayPtr\<uint8_t\> | القيمة الأولية للاستخدام. |

### ReturnValue

كائن فك التشفير الذي تم إنشاؤه حديثًا.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
