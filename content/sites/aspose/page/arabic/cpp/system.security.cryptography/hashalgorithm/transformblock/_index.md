---
title: "System::Security::Cryptography::HashAlgorithm::TransformBlock طريقة"
linktitle: "TransformBlock"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::HashAlgorithm::TransformBlock طريقة. يعالج كتلة من البيانات وينسخ البيانات إلى مصفوفة الإخراج في C++."
type: docs
weight: 800
url: /ar/cpp/system.security.cryptography/hashalgorithm/transformblock/
---
## HashAlgorithm::TransformBlock method


يعالج كتلة من البيانات وينسخ البيانات إلى مصفوفة الإخراج.

```cpp
int System::Security::Cryptography::HashAlgorithm::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [المخزن](../../../system/buffer/) لقراءة البيانات منه. |
| inputOffset | int | إزاحة مخزن الإدخال. |
| inputCount | int | عدد البايتات التي سيتم معالجتها. |
| outputBuffer | ArrayPtr\<uint8_t\> | مخزن الإخراج لنسخ البيانات إليه؛ nullptr لعدم النسخ. |
| outputOffset | int | إزاحة مخزن الإخراج. |

### ReturnValue

عدد البايتات المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
