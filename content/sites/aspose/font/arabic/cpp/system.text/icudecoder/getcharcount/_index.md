---
title: "طريقة System::Text::ICUDecoder::GetCharCount"
linktitle: "GetCharCount"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::ICUDecoder::GetCharCount. يحصل على عدد الأحرف المطلوبة لفك ترميز المخزن المؤقت في C++."
type: docs
weight: 400
url: /ar/cpp/system.text/icudecoder/getcharcount/
---
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


يحصل على عدد الأحرف المطلوبة لفك ترميز مخزن مؤقت.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| بايتات | ArrayPtr\<uint8_t\> | البايتات للفك. |
| index | int | [Buffer](../../../system/buffer/) الإزاحة. |
| count | int | عدد البايتات المطلوب فك تشفيرها. |

### ReturnValue

عدد الأحرف المطلوبة لفك ترميز المخزن المؤقت.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


يحصل على عدد الأحرف المطلوبة لفك ترميز مخزن مؤقت.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| بايتات | ArrayPtr\<uint8_t\> | البايتات للفك. |
| index | int | [Buffer](../../../system/buffer/) الإزاحة. |
| count | int | عدد البايتات المطلوب فك تشفيرها. |
| flush | bool | إذا كان صحيحًا، ينظف حالة المفكّك الداخلية بعد الحساب. |

### ReturnValue

عدد الأحرف المطلوبة لفك ترميز المخزن المؤقت.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::GetCharCount(const uint8_t *, int, bool) method


يحصل على عدد الأحرف المطلوبة لفك ترميز مخزن مؤقت.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| بايتات | const uint8_t * | البايتات للفك. |
| count | int | عدد البايتات المطلوب فك تشفيرها. |
| flush | bool | إذا كان صحيحًا، ينظف حالة المفكّك الداخلية بعد الحساب. |

### ReturnValue

عدد الأحرف المطلوبة لفك ترميز المخزن المؤقت.

## انظر أيضًا

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
