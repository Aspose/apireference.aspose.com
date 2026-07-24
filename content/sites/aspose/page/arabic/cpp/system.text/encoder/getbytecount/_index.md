---
title: "System::Text::Encoder::GetByteCount طريقة"
linktitle: "GetByteCount"
second_title: "Aspose.Page لـ C++"
description: "System::Text::Encoder::GetByteCount طريقة. يحصل على عدد البايتات المطلوبة لترميز مخزن في C++."
type: docs
weight: 400
url: /ar/cpp/system.text/encoder/getbytecount/
---
## Encoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


يحصل على عدد البايتات المطلوبة لترميز المخزن المؤقت.

```cpp
virtual int System::Text::Encoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | الأحرف المراد ترميزها. |
| index | int | [Buffer](../../../system/buffer/) الإزاحة. |
| count | int | عدد الأحرف التي سيتم ترميزها. |
| تفريغ | bool | إذا كان صحيحًا، ينظف حالة المشفر الداخلية بعد الحساب. |

### ReturnValue

عدد البايتات المطلوبة لترميز المخزن.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoder::GetByteCount(const char_t *, int, bool) method


يحصل على عدد البايتات المطلوبة لترميز المخزن المؤقت.

```cpp
virtual int System::Text::Encoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| chars | const char_t * | الأحرف المراد ترميزها. |
| count | int | عدد الأحرف التي سيتم ترميزها. |
| تفريغ | bool | إذا كان صحيحًا، ينظف حالة المشفر الداخلية بعد الحساب. |

### ReturnValue

عدد البايتات المطلوبة لترميز المخزن.

## انظر أيضًا

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
