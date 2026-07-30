---
title: "System::Text::Encoder::GetBytes طريقة"
linktitle: "GetBytes"
second_title: "Aspose.Font لـ C++"
description: "System::Text::Encoder::GetBytes طريقة. احصل على البايتات الناتجة عن ترميز مخزن في C++."
type: docs
weight: 500
url: /ar/cpp/system.text/encoder/getbytes/
---
## Encoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


احصل على البايتات الناتجة عن ترميز مخزن مؤقت.

```cpp
virtual int System::Text::Encoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | الأحرف المراد ترميزها. |
| charIndex | int | إزاحة مصفوفة المصدر. |
| charCount | int | طول المصفوفة الفرعية للمصدر. |
| بايتات | ArrayPtr\<uint8_t\> | مخزن البايتات الوجهة. |
| byteIndex | int | إزاحة مخزن الوجهة. |
| flush | bool | إذا كان true، ينظف حالة المشفر الداخلية بعد الحساب. |

### ReturnValue

عدد البايتات المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


احصل على البايتات الناتجة عن ترميز مخزن مؤقت.

```cpp
virtual int System::Text::Encoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | const char_t * | الأحرف المراد ترميزها. |
| charCount | int | طول مصفوفة المصدر. |
| بايتات | uint8_t * | مخزن البايتات الوجهة. |
| byteCount | int | حجم مخزن الوجهة. |
| flush | bool | إذا كان true، ينظف حالة المشفر الداخلية بعد الحساب. |

### ReturnValue

عدد البايتات المكتوبة.

## انظر أيضًا

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
