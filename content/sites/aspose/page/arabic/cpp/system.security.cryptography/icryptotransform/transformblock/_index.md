---
title: "طريقة System::Security::Cryptography::ICryptoTransform::TransformBlock"
linktitle: "TransformBlock"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Security::Cryptography::ICryptoTransform::TransformBlock. معلومات RTTI في C++."
type: docs
weight: 300
url: /ar/cpp/system.security.cryptography/icryptotransform/transformblock/
---
## ICryptoTransform::TransformBlock method


معلومات RTTI.

```cpp
virtual int System::Security::Cryptography::ICryptoTransform::TransformBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount, ArrayPtr<uint8_t> outputBuffer, int outputOffset)=0
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
## ملاحظات


يعالج كتلة من البيانات وينسخ البيانات إلى مصفوفة الإخراج.
## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
