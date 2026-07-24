---
title: "طريقة System::Security::Cryptography::ICryptoTransform::TransformFinalBlock"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Security::Cryptography::ICryptoTransform::TransformFinalBlock. يعالج آخر كتلة من البيانات ويحسب قيمة الإخراج في C++."
type: docs
weight: 400
url: /ar/cpp/system.security.cryptography/icryptotransform/transformfinalblock/
---
## ICryptoTransform::TransformFinalBlock method


يعالج آخر كتلة من البيانات ويحسب قيمة الإخراج.

```cpp
virtual ArrayPtr<uint8_t> System::Security::Cryptography::ICryptoTransform::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [المخزن](../../../system/buffer/) لقراءة البيانات منه. |
| inputOffset | int | إزاحة مخزن الإدخال. |
| inputCount | int | عدد البايتات التي سيتم معالجتها. |

### ReturnValue

تم حساب الإخراج لكامل تسلسل الإدخال.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Page for C++](../../../)
