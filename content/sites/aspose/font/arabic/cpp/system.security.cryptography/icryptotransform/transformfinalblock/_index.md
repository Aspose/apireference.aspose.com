---
title: "طريقة System::Security::Cryptography::ICryptoTransform::TransformFinalBlock"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::ICryptoTransform::TransformFinalBlock. تعالج الكتلة الأخيرة من البيانات وتحسب قيمة الإخراج في C++."
type: docs
weight: 400
url: /ar/cpp/system.security.cryptography/icryptotransform/transformfinalblock/
---
## ICryptoTransform::TransformFinalBlock method


يعالج الكتلة الأخيرة من البيانات ويحسب قيمة الإخراج.

```cpp
virtual ArrayPtr<uint8_t> System::Security::Cryptography::ICryptoTransform::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount)=0
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لقراءة البيانات من. |
| inputOffset | int | إزاحة مخزن الإدخال. |
| inputCount | int | عدد البايتات للمعالجة. |

### ReturnValue

تم حساب الإخراج لكامل تسلسل الإدخال.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICryptoTransform](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
