---
title: "طريقة System::Security::Cryptography::HashAlgorithm::TransformBlock"
linktitle: "TransformBlock"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::HashAlgorithm::TransformBlock. تعالج كتلة من البيانات وتنسخ البيانات إلى مصفوفة الإخراج في C++."
type: docs
weight: 800
url: /ar/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


يعالج كتلة من البيانات وينسخ البيانات إلى مصفوفة الإخراج.

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لقراءة البيانات من. |
| inputOffset | int | إزاحة مخزن الإدخال. |
| inputCount | int | عدد البايتات للمعالجة. |
| outputBuffer | ArrayPtr\<uint8_t\> | المخزن المؤقت للإخراج لنسخ البيانات إليه؛ nullptr لعدم النسخ. |
| outputOffset | int | إزاحة المخزن المؤقت للإخراج. |

### ReturnValue

عدد البايتات المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
