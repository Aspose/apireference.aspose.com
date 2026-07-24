---
title: "طريقة Convert في System::Text::ICUEncoder"
linktitle: "تحويل"
second_title: "Aspose.Page لـ C++"
description: "طريقة Convert في System::Text::ICUEncoder. يحول الأحرف إلى بايتات في C++."
type: docs
weight: 300
url: /ar/cpp/system.text/icuencoder/convert/
---
## ICUEncoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


يحوّل الأحرف إلى بايتات.

```cpp
virtual void System::Text::ICUEncoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | الأحرف المراد ترميزها. |
| charIndex | int | إزاحة مخزن الإدخال. |
| charCount | int | حجم المخزن المؤقت للإدخال. |
| بايتات | ArrayPtr\<uint8_t\> | مخزن البايتات الوجهة. |
| byteIndex | int | إزاحة مصفوفة الوجهة. |
| byteCount | int | حجم مصفوفة الوجهة. |
| تفريغ | bool | إذا كان صحيحًا، ينظف حالة المشفر الداخلية بعد الحساب. |
| charsUsed | int\& | إشارة إلى المتغيّر لتخزين عدد الأحرف المقروءة. |
| bytesUsed | int\& | إشارة إلى المتغيّر لتخزين عدد البايتات المكتوبة. |
| مكتمل | bool\& | إشارة إلى المتغيّر لتعيينه إلى true إذا استُنفد مخزن الإدخال وإلى false خلاف ذلك. |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


يحوّل الأحرف إلى بايتات.

```cpp
virtual void System::Text::ICUEncoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| chars | const char_t * | الأحرف المراد ترميزها. |
| charCount | int | حجم المخزن المؤقت للإدخال. |
| بايتات | uint8_t * | مخزن البايتات الوجهة. |
| byteCount | int | حجم مصفوفة الوجهة. |
| تفريغ | bool | إذا كان صحيحًا، ينظف حالة المشفر الداخلية بعد الحساب. |
| charsUsed | int\& | إشارة إلى المتغيّر لتخزين عدد الأحرف المقروءة. |
| bytesUsed | int\& | إشارة إلى المتغيّر لتخزين عدد البايتات المكتوبة. |
| مكتمل | bool\& | إشارة إلى المتغيّر لتعيينه إلى true إذا استُنفد مخزن الإدخال وإلى false خلاف ذلك. |

## انظر أيضًا

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
