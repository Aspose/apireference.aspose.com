---
title: "طريقة System::Text::Encoding::Convert"
linktitle: "تحويل"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Text::Encoding::Convert. يحول البايتات بين ترميزين في C++."
type: docs
weight: 3000
url: /ar/cpp/system.text/encoding/convert/
---
## Encoding::Convert(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) method


يحوّل البايتات بين ترميزين.

```cpp
static ArrayPtr<uint8_t> System::Text::Encoding::Convert(const EncodingPtr &src_encoding, const EncodingPtr &dst_encoding, const ArrayPtr<uint8_t> &bytes)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| src_encoding | const EncodingPtr\& | ترميز المصدر. |
| dst_encoding | const EncodingPtr\& | ترميز الوجهة. |
| بايتات | const ArrayPtr\<uint8_t\>\& | البايتات للتحويل. |

### ReturnValue

البايتات المحوّلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::Convert(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) method


يحوّل البايتات بين ترميزين.

```cpp
static ArrayPtr<uint8_t> System::Text::Encoding::Convert(const EncodingPtr &src_encoding, const EncodingPtr &dst_encoding, const ArrayPtr<uint8_t> &bytes, int index, int count)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| src_encoding | const EncodingPtr\& | ترميز المصدر. |
| dst_encoding | const EncodingPtr\& | ترميز الوجهة. |
| بايتات | const ArrayPtr\<uint8_t\>\& | البايتات للتحويل. |
| الفهرس | int | بداية القطعة. |
| count | int | حجم الشريحة. |

### ReturnValue

البايتات المحوّلة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
