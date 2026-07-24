---
title: "طريقة System::Text::EncodingDecoder::Convert"
linktitle: "تحويل"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Text::EncodingDecoder::Convert. تحول البايتات إلى أحرف في C++."
type: docs
weight: 100
url: /ar/cpp/system.text/encodingdecoder/convert/
---
## EncodingDecoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


يحول البايتات إلى أحرف.

```cpp
void System::Text::EncodingDecoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | ArrayPtr\<uint8_t\> | البايتات لفك الترميز. |
| byteIndex | int | إزاحة مخزن الإدخال. |
| byteCount | int | حجم المخزن المؤقت للإدخال. |
| chars | ArrayPtr\<char_t\> | مخزن الأحرف الهدف. |
| charIndex | int | إزاحة مصفوفة الوجهة. |
| charCount | int | حجم مصفوفة الوجهة. |
| تفريغ | bool | إذا كان صحيحًا، ينظف حالة المفك الشفري الداخلية بعد الحساب. |
| bytesUsed | int\& | إشارة إلى المتغير لتخزين عدد البايتات المقروءة. |
| charsUsed | int\& | إشارة إلى المتغير لتخزين عدد الأحرف المكتوبة. |
| مكتمل | bool\& | إشارة إلى المتغيّر لتعيينه إلى true إذا استُنفد مخزن الإدخال وإلى false خلاف ذلك. |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [EncodingDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncodingDecoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


يحول البايتات إلى أحرف.

```cpp
void System::Text::EncodingDecoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | const uint8_t * | البايتات لفك الترميز. |
| byteCount | int | حجم المخزن المؤقت للإدخال. |
| chars | char_t * | مخزن الأحرف الهدف. |
| charCount | int | حجم مصفوفة الوجهة. |
| تفريغ | bool | إذا كان صحيحًا، ينظف حالة المفك الشفري الداخلية بعد الحساب. |
| bytesUsed | int\& | إشارة إلى المتغير لتخزين عدد البايتات المقروءة. |
| charsUsed | int\& | إشارة إلى المتغير لتخزين عدد الأحرف المكتوبة. |
| مكتمل | bool\& | إشارة إلى المتغيّر لتعيينه إلى true إذا استُنفد مخزن الإدخال وإلى false خلاف ذلك. |

## انظر أيضًا

* Class [EncodingDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
