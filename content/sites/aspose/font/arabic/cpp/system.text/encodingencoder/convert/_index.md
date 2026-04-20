---
title: "طريقة System::Text::EncodingEncoder::Convert"
linktitle: "Convert"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::EncodingEncoder::Convert. تحول الأحرف إلى بايتات في C++."
type: docs
weight: 100
url: /ar/cpp/system.text/encodingencoder/convert/
---
## EncodingEncoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


يحوّل الأحرف إلى بايتات.

```cpp
virtual void System::Text::EncodingEncoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | الأحرف المراد ترميزها. |
| charIndex | int | إزاحة مخزن الإدخال. |
| charCount | int | حجم المخزن المؤقت للإدخال. |
| بايتات | ArrayPtr\<uint8_t\> | مخزن البايتات الوجهة. |
| byteIndex | int | إزاحة مصفوفة الوجهة. |
| byteCount | int | حجم مصفوفة الوجهة. |
| flush | bool | إذا كان true، ينظف حالة المشفر الداخلية بعد الحساب. |
| charsUsed | int\& | مرجع إلى المتغيّر لتخزين عدد الأحرف المقروءة. |
| bytesUsed | int\& | مرجع إلى المتغيّر لتخزين عدد البايتات المكتوبة. |
| completed | bool\& | مرجع إلى المتغيّر لتعيينه إلى true إذا استُهلك مخزن الإدخال وإلى false غير ذلك. |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncodingEncoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


يحوّل الأحرف إلى بايتات.

```cpp
virtual void System::Text::EncodingEncoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | const char_t * | الأحرف المراد ترميزها. |
| charCount | int | حجم المخزن المؤقت للإدخال. |
| بايتات | uint8_t * | مخزن البايتات الوجهة. |
| byteCount | int | حجم مصفوفة الوجهة. |
| flush | bool | إذا كان true، ينظف حالة المشفر الداخلية بعد الحساب. |
| charsUsed | int\& | مرجع إلى المتغيّر لتخزين عدد الأحرف المقروءة. |
| bytesUsed | int\& | مرجع إلى المتغيّر لتخزين عدد البايتات المكتوبة. |
| completed | bool\& | مرجع إلى المتغيّر لتعيينه إلى true إذا استُهلك مخزن الإدخال وإلى false غير ذلك. |

## انظر أيضًا

* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
