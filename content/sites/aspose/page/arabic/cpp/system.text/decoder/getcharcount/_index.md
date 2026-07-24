---
title: "System::Text::Decoder::GetCharCount طريقة"
linktitle: "GetCharCount"
second_title: "Aspose.Page لـ C++"
description: "System::Text::Decoder::GetCharCount طريقة. يحصل على عدد الأحرف المطلوبة لفك تشفير مخزن مؤقت في C++."
type: docs
weight: 400
url: /ar/cpp/system.text/decoder/getcharcount/
---
## Decoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


يحصل على عدد الأحرف المطلوبة لفك ترميز المخزن المؤقت.

```cpp
virtual int System::Text::Decoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | ArrayPtr\<uint8_t\> | البايتات لفك الترميز. |
| index | int | [Buffer](../../../system/buffer/) الإزاحة. |
| count | int | عدد البايتات المطلوب فك تشفيرها. |

### ReturnValue

عدد الأحرف المطلوبة لفك تشفير المخزن المؤقت.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


يحصل على عدد الأحرف المطلوبة لفك ترميز المخزن المؤقت.

```cpp
virtual int System::Text::Decoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | ArrayPtr\<uint8_t\> | البايتات لفك الترميز. |
| index | int | [Buffer](../../../system/buffer/) الإزاحة. |
| count | int | عدد البايتات المطلوب فك تشفيرها. |
| تفريغ | bool | إذا كان صحيحًا، ينظف حالة المفك الشفري الداخلية بعد الحساب. |

### ReturnValue

عدد الأحرف المطلوبة لفك تشفير المخزن المؤقت.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetCharCount(const uint8_t *, int, bool) method


يحصل على عدد الأحرف المطلوبة لفك ترميز المخزن المؤقت.

```cpp
virtual int System::Text::Decoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| بايتات | const uint8_t * | البايتات لفك الترميز. |
| count | int | عدد البايتات المطلوب فك تشفيرها. |
| تفريغ | bool | إذا كان صحيحًا، ينظف حالة المفك الشفري الداخلية بعد الحساب. |

### ReturnValue

عدد الأحرف المطلوبة لفك تشفير المخزن المؤقت.

## انظر أيضًا

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
