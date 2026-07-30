---
title: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor طريقة"
linktitle: "CreateEncryptor"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor طريقة. ينشئ مشفرًا بالمعلمات المرتبطة بكائن الخوارزمية في C++."
type: docs
weight: 200
url: /ar/cpp/system.security.cryptography/symmetricalgorithm/createencryptor/
---
## SymmetricAlgorithm::CreateEncryptor() method


ينشئ مُشفّر مع المعلمات المرتبطة بكائن الخوارزمية.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor()
```


### ReturnValue

كائن المشفر الذي تم إنشاؤه حديثًا.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
## SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) method


ينشئ مشفرًا باستخدام معلمات صريحة.

```cpp
virtual SharedPtr<ICryptoTransform> System::Security::Cryptography::SymmetricAlgorithm::CreateEncryptor(System::ArrayPtr<uint8_t> rgbKey, System::ArrayPtr<uint8_t> rgbIV)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| rgbKey | System::ArrayPtr\<uint8_t\> | المفتاح للاستخدام. |
| rgbIV | System::ArrayPtr\<uint8_t\> | القيمة الأولية للاستخدام. |

### ReturnValue

كائن المشفر الذي تم إنشاؤه حديثًا.

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICryptoTransform](../../icryptotransform/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [SymmetricAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
