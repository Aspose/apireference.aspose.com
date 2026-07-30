---
title: "طريقة System::Text::Decoder::Convert"
linktitle: "Convert"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::Decoder::Convert. يحول البايتات إلى أحرف في C++."
type: docs
weight: 100
url: /ar/cpp/system.text/decoder/convert/
---
## Decoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


يحوّل البايتات إلى أحرف.

```cpp
virtual void System::Text::Decoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| بايتات | ArrayPtr\<uint8_t\> | البايتات للفك. |
| byteIndex | int | إزاحة مخزن الإدخال. |
| byteCount | int | حجم المخزن المؤقت للإدخال. |
| chars | ArrayPtr\<char_t\> | مخزن الأحرف الوجهة. |
| charIndex | int | إزاحة مصفوفة الوجهة. |
| charCount | int | حجم مصفوفة الوجهة. |
| flush | bool | إذا كان صحيحًا، ينظف حالة المفكّك الداخلية بعد الحساب. |
| bytesUsed | int\& | مرجع إلى المتغيّر لتخزين عدد البايتات المقروءة. |
| charsUsed | int\& | مرجع إلى المتغيّر لتخزين عدد الأحرف المكتوبة. |
| completed | bool\& | مرجع إلى المتغيّر لتعيينه إلى true إذا استُهلك مخزن الإدخال وإلى false غير ذلك. |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Decoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


يحوّل البايتات إلى أحرف.

```cpp
virtual void System::Text::Decoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| بايتات | const uint8_t * | البايتات للفك. |
| byteCount | int | حجم المخزن المؤقت للإدخال. |
| chars | char_t * | مخزن الأحرف الوجهة. |
| charCount | int | حجم مصفوفة الوجهة. |
| flush | bool | إذا كان صحيحًا، ينظف حالة المفكّك الداخلية بعد الحساب. |
| bytesUsed | int\& | مرجع إلى المتغيّر لتخزين عدد البايتات المقروءة. |
| charsUsed | int\& | مرجع إلى المتغيّر لتخزين عدد الأحرف المكتوبة. |
| completed | bool\& | مرجع إلى المتغيّر لتعيينه إلى true إذا استُهلك مخزن الإدخال وإلى false غير ذلك. |

## انظر أيضًا

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
