---
title: "طريقة System::Security::Cryptography::HashAlgorithm::TransformFinalBlock"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Security::Cryptography::HashAlgorithm::TransformFinalBlock. يعالج آخر كتلة من البيانات ويحسب التجزئة في C++."
type: docs
weight: 900
url: /ar/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


يعالج الكتلة الأخيرة من البيانات ويحسب التجزئة.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [المخزن](../../../system/buffer/) لقراءة البيانات منه. |
| inputOffset | int | إزاحة مخزن الإدخال. |
| inputCount | int | عدد البايتات التي سيتم معالجتها. |

### ReturnValue

الهاش المحسوب لكامل تسلسل البيانات.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
