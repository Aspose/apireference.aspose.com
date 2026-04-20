---
title: "System::Security::Cryptography::ToBase64Transform::TransformBlock طريقة"
linktitle: "TransformBlock"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::ToBase64Transform::TransformBlock طريقة. يعالج كتلة من البيانات وينسخ البيانات إلى مصفوفة الإخراج في C++."
type: docs
weight: 800
url: /ar/cpp/system.security.cryptography/tobase64transform/transformblock/
---
## ToBase64Transform::TransformBlock method


يعالج كتلة من البيانات وينسخ البيانات إلى مصفوفة الإخراج.

```cpp
int32_t System::Security::Cryptography::ToBase64Transform::TransformBlock(System::ArrayPtr<uint8_t> inputBuffer, int32_t inputOffset, int32_t inputCount, System::ArrayPtr<uint8_t> outputBuffer, int32_t outputOffset)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| inputBuffer | System::ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لقراءة البيانات من. |
| inputOffset | int32_t | إزاحة مخزن الإدخال. |
| inputCount | int32_t | عدد البايتات للمعالجة. |
| outputBuffer | System::ArrayPtr\<uint8_t\> | المخزن المؤقت للإخراج لنسخ البيانات إليه؛ nullptr لعدم النسخ. |
| outputOffset | int32_t | إزاحة المخزن المؤقت للإخراج. |

### ReturnValue

عدد البايتات المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ToBase64Transform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
