---
title: "طريقة System::Text::ICUDecoder::GetChars"
linktitle: "GetChars"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::ICUDecoder::GetChars. احصل على الأحرف الناتجة عن فك ترميز المخزن المؤقت في C++."
type: docs
weight: 500
url: /ar/cpp/system.text/icudecoder/getchars/
---
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


احصل على الأحرف الناتجة عن فك ترميز مخزن مؤقت.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| بايتات | ArrayPtr\<uint8_t\> | البايتات للفك. |
| byteIndex | int | إزاحة مخزن الإدخال. |
| byteCount | int | حجم المخزن المؤقت للإدخال. |
| chars | ArrayPtr\<char_t\> | مخزن الأحرف الوجهة. |
| charIndex | int | إزاحة مصفوفة الوجهة. |

### ReturnValue

عدد الأحرف المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


احصل على الأحرف الناتجة عن فك ترميز مخزن مؤقت.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| بايتات | ArrayPtr\<uint8_t\> | البايتات للفك. |
| byteIndex | int | إزاحة مخزن الإدخال. |
| byteCount | int | حجم المخزن المؤقت للإدخال. |
| chars | ArrayPtr\<char_t\> | مخزن الأحرف الوجهة. |
| charIndex | int | إزاحة مصفوفة الوجهة. |
| flush | bool | إذا كان صحيحًا، ينظف حالة المفكّك الداخلية بعد الحساب. |

### ReturnValue

عدد الأحرف المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


احصل على الأحرف الناتجة عن فك ترميز مخزن مؤقت.

```cpp
virtual int System::Text::ICUDecoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| بايتات | const uint8_t * | البايتات للفك. |
| byteCount | int | حجم المخزن المؤقت للإدخال. |
| chars | char_t * | مخزن الأحرف الوجهة. |
| charCount | int | حجم مصفوفة الوجهة. |
| flush | bool | إذا كان صحيحًا، ينظف حالة المفكّك الداخلية بعد الحساب. |

### ReturnValue

عدد الأحرف المكتوبة.

## انظر أيضًا

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
