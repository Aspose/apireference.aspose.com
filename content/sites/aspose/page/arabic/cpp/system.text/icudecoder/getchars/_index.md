---
title: "طريقة System::Text::ICUDecoder::GetChars"
linktitle: "GetChars"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Text::ICUDecoder::GetChars. احصل على الأحرف الناتجة عن فك تشفير المخزن المؤقت في C++."
type: docs
weight: 500
url: /ar/cpp/system.text/icudecoder/getchars/
---
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


احصل على الأحرف الناتجة عن فك ترميز المخزن المؤقت.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | ArrayPtr\<uint8_t\> | البايتات لفك الترميز. |
| byteIndex | int | إزاحة مخزن الإدخال. |
| byteCount | int | حجم المخزن المؤقت للإدخال. |
| chars | ArrayPtr\<char_t\> | مخزن الأحرف الهدف. |
| charIndex | int | إزاحة مصفوفة الوجهة. |

### ReturnValue

عدد الأحرف المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


احصل على الأحرف الناتجة عن فك ترميز المخزن المؤقت.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | ArrayPtr\<uint8_t\> | البايتات لفك الترميز. |
| byteIndex | int | إزاحة مخزن الإدخال. |
| byteCount | int | حجم المخزن المؤقت للإدخال. |
| chars | ArrayPtr\<char_t\> | مخزن الأحرف الهدف. |
| charIndex | int | إزاحة مصفوفة الوجهة. |
| تفريغ | bool | إذا كان صحيحًا، ينظف حالة المفك الشفري الداخلية بعد الحساب. |

### ReturnValue

عدد الأحرف المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


احصل على الأحرف الناتجة عن فك ترميز المخزن المؤقت.

```cpp
virtual int System::Text::ICUDecoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | const uint8_t * | البايتات لفك الترميز. |
| byteCount | int | حجم المخزن المؤقت للإدخال. |
| chars | char_t * | مخزن الأحرف الهدف. |
| charCount | int | حجم مصفوفة الوجهة. |
| تفريغ | bool | إذا كان صحيحًا، ينظف حالة المفك الشفري الداخلية بعد الحساب. |

### ReturnValue

عدد الأحرف المكتوبة.

## انظر أيضًا

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
