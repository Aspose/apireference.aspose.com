---
title: "System::Text::ICUEncoder::GetByteCount طريقة"
linktitle: "GetByteCount"
second_title: "Aspose.Page لـ C++"
description: "System::Text::ICUEncoder::GetByteCount طريقة. يحصل على عدد البايتات المطلوبة لتشفير مخزن مؤقت في C++."
type: docs
weight: 400
url: /ar/cpp/system.text/icuencoder/getbytecount/
---
## ICUEncoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


يحصل على عدد البايتات المطلوبة لترميز المخزن المؤقت.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
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
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetByteCount(const char_t *, int, bool) method


يحصل على عدد البايتات المطلوبة لترميز المخزن المؤقت.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| chars | const char_t * | الأحرف المراد ترميزها. |
| count | int | عدد الأحرف التي سيتم ترميزها. |
| تفريغ | bool | إذا كان صحيحًا، ينظف حالة المشفر الداخلية بعد الحساب. |

### ReturnValue

عدد البايتات المطلوبة لترميز المخزن.

## انظر أيضًا

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
