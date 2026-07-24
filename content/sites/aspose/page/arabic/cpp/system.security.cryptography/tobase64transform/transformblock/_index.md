---
title: "طريقة System::Security::Cryptography::ToBase64Transform::TransformBlock"
linktitle: "TransformBlock"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Security::Cryptography::ToBase64Transform::TransformBlock. تُعالج كتلة من البيانات وتنسخ البيانات إلى مصفوفة الإخراج في C++."
type: docs
weight: 800
url: /ar/cpp/system.security.cryptography/tobase64transform/transformblock/
---
## ToBase64Transform::TransformBlock method


يعالج كتلة من البيانات وينسخ البيانات إلى مصفوفة الإخراج.

```cpp
int32_t System::Security::Cryptography::ToBase64Transform::TransformBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount, System::ArrayPtr<uint8_t> outputBuffer, int32_t outputOffset)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [المخزن](../../../system/buffer/) لقراءة البيانات منه. |
| inputOffset | int32_t | إزاحة مخزن الإدخال. |
| inputCount | int32_t | عدد البايتات التي سيتم معالجتها. |
| outputBuffer | System::ArrayPtr\<uint8_t\> | مخزن الإخراج لنسخ البيانات إليه؛ nullptr لعدم النسخ. |
| outputOffset | int32_t | إزاحة مخزن الإخراج. |

### ReturnValue

عدد البايتات المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
