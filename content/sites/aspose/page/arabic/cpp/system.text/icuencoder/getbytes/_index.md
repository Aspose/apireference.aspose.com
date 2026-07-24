---
title: "طريقة GetBytes في System::Text::ICUEncoder"
linktitle: "GetBytes"
second_title: "Aspose.Page لـ C++"
description: "طريقة GetBytes في System::Text::ICUEncoder. يحصل على البايتات الناتجة عن ترميز مخزن مؤقت في C++."
type: docs
weight: 500
url: /ar/cpp/system.text/icuencoder/getbytes/
---
## ICUEncoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


احصل على البايتات الناتجة عن ترميز المخزن المؤقت.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | الأحرف المراد ترميزها. |
| charIndex | int | إزاحة مصفوفة المصدر. |
| charCount | int | طول المصفوفة الفرعية للمصدر. |
| بايتات | ArrayPtr\<uint8_t\> | مخزن البايتات الوجهة. |
| byteIndex | int | إزاحة مخزن الوجهة. |
| تفريغ | bool | إذا كان صحيحًا، ينظف حالة المشفر الداخلية بعد الحساب. |

### ReturnValue

عدد البايتات المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


احصل على البايتات الناتجة عن ترميز المخزن المؤقت.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| chars | const char_t * | الأحرف المراد ترميزها. |
| charCount | int | طول مصفوفة المصدر. |
| بايتات | uint8_t * | مخزن البايتات الوجهة. |
| byteCount | int | حجم مخزن الوجهة. |
| تفريغ | bool | إذا كان صحيحًا، ينظف حالة المشفر الداخلية بعد الحساب. |

### ReturnValue

عدد البايتات المكتوبة.

## انظر أيضًا

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
