---
title: "طريقة System::Security::Cryptography::ToBase64Transform::TransformFinalBlock"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Security::Cryptography::ToBase64Transform::TransformFinalBlock. تُعالج الكتلة الأخيرة من البيانات وتحسب قيمة الإخراج في C++."
type: docs
weight: 900
url: /ar/cpp/system.security.cryptography/tobase64transform/transformfinalblock/
---
## ToBase64Transform::TransformFinalBlock method


يعالج آخر كتلة من البيانات ويحسب قيمة الإخراج.

```cpp
System::ArrayPtr<uint8_t> System::Security::Cryptography::ToBase64Transform::TransformFinalBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [المخزن](../../../system/buffer/) لقراءة البيانات منه. |
| inputOffset | int32_t | إزاحة مخزن الإدخال. |
| inputCount | int32_t | عدد البايتات التي سيتم معالجتها. |

### ReturnValue

تم حساب الإخراج لكامل تسلسل الإدخال.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
