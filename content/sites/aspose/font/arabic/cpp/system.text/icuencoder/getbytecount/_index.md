---
title: "طريقة System::Text::ICUEncoder::GetByteCount"
linktitle: "GetByteCount"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::ICUEncoder::GetByteCount. يحصل على عدد البايتات المطلوبة لترميز مخزن مؤقت في C++."
type: docs
weight: 400
url: /ar/cpp/system.text/icuencoder/getbytecount/
---
## ICUEncoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


يحصل على عدد البايتات المطلوبة لترميز مخزن مؤقت.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | الأحرف المراد ترميزها. |
| index | int | [Buffer](../../../system/buffer/) الإزاحة. |
| count | int | عدد الأحرف المراد ترميزها. |
| flush | bool | إذا كان true، ينظف حالة المشفر الداخلية بعد الحساب. |

### ReturnValue

عدد البايتات المطلوبة لترميز المخزن.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoder::GetByteCount(const char_t *, int, bool) method


يحصل على عدد البايتات المطلوبة لترميز مخزن مؤقت.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | const char_t * | الأحرف المراد ترميزها. |
| count | int | عدد الأحرف المراد ترميزها. |
| flush | bool | إذا كان true، ينظف حالة المشفر الداخلية بعد الحساب. |

### ReturnValue

عدد البايتات المطلوبة لترميز المخزن.

## انظر أيضًا

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
