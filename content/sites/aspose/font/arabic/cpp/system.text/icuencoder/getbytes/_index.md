---
title: "System::Text::ICUEncoder::GetBytes طريقة"
linktitle: "GetBytes"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::ICUEncoder::GetBytes. احصل على البايتات الناتجة عن ترميز مخزن مؤقت في C++."
type: docs
weight: 500
url: /ar/cpp/system.text/icuencoder/getbytes/
---
## ICUEncoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


احصل على البايتات الناتجة عن ترميز مخزن مؤقت.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
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
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


احصل على البايتات الناتجة عن ترميز مخزن مؤقت.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
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

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
