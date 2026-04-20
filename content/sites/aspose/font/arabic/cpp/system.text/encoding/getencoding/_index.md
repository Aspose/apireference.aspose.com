---
title: "طريقة System::Text::Encoding::GetEncoding"
linktitle: "GetEncoding"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::Encoding::GetEncoding. يحصل على الترميز حسب الاسم في C++."
type: docs
weight: 4100
url: /ar/cpp/system.text/encoding/getencoding/
---
## Encoding::GetEncoding(const String\&) method


يحصل على الترميز بالاسم.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | const String\& | اسم [Encoding](../). |

### ReturnValue

[Encoding](../) of specified name.

## انظر أيضًا

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetEncoding(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


يحصل على الترميز بالاسم.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| name | const String\& | اسم [Encoding](../). |
| encoder_fallback | const EncoderFallbackPtr\& | البديل لاستخدامه في الترميز. |
| decoder_fallback | const DecoderFallbackPtr\& | البديل لاستخدامه في فك الترميز. |

### ReturnValue

[Encoding](../) of specified name.

## انظر أيضًا

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetEncoding(int) method


يحصل على الترميز بصفحة الشيفرة.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| codepage | int | رقم صفحة الترميز. |

### ReturnValue

[Encoding](../) of specified codepage.

## انظر أيضًا

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetEncoding(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


يحصل على الترميز بصفحة الشيفرة.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| codepage | int | رقم صفحة الترميز. |
| encoder_fallback | const EncoderFallbackPtr\& | البديل لاستخدامه في الترميز. |
| decoder_fallback | const DecoderFallbackPtr\& | البديل لاستخدامه في فك الترميز. |

### ReturnValue

[Encoding](../) of specified codepage.

## انظر أيضًا

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
