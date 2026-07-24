---
title: "System::Text::Decoder::GetChars طريقة"
linktitle: "GetChars"
second_title: "Aspose.Page لـ C++"
description: "System::Text::Decoder::GetChars طريقة. احصل على الأحرف الناتجة عن فك تشفير مخزن مؤقت في C++."
type: docs
weight: 500
url: /ar/cpp/system.text/decoder/getchars/
---
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


احصل على الأحرف الناتجة عن فك ترميز المخزن المؤقت.

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
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
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


احصل على الأحرف الناتجة عن فك ترميز المخزن المؤقت.

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
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
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


احصل على الأحرف الناتجة عن فك ترميز المخزن المؤقت.

```cpp
virtual int System::Text::Decoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
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

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
