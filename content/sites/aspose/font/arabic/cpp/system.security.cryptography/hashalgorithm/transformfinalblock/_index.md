---
title: "طريقة System::Security::Cryptography::HashAlgorithm::TransformFinalBlock"
linktitle: "TransformFinalBlock"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Security::Cryptography::HashAlgorithm::TransformFinalBlock. تعالج الكتلة الأخيرة من البيانات وتحسب التجزئة في C++."
type: docs
weight: 900
url: /ar/cpp/system.security.cryptography/hashalgorithm/transformfinalblock/
---
## HashAlgorithm::TransformFinalBlock method


يعالج الكتلة الأخيرة من البيانات ويحسب التجزئة.

```cpp
ArrayPtr<uint8_t> System::Security::Cryptography::HashAlgorithm::TransformFinalBlock(ArrayPtr<uint8_t> inputBuffer, int inputOffset, int inputCount) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| inputBuffer | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لقراءة البيانات من. |
| inputOffset | int | إزاحة مخزن الإدخال. |
| inputCount | int | عدد البايتات للمعالجة. |

### ReturnValue

التجزئة المحسوبة للتسلسل الكامل للبيانات.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HashAlgorithm](../)
* Namespace [System::Security::Cryptography](../../)
* Library [Aspose.Font for C++](../../../)
