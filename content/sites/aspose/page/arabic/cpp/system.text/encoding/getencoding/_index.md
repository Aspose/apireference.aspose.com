---
title: "System::Text::Encoding::GetEncoding method"
linktitle: "GetEncoding"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Text::Encoding::GetEncoding. يحصل على الترميز حسب الاسم في C++."
type: docs
weight: 4100
url: /ar/cpp/system.text/encoding/getencoding/
---
## Encoding::GetEncoding(const String\&) method


يحصل على الترميز حسب الاسم.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| name | const String\& | اسم [Encoding](../). |

### ReturnValue

[Encoding](../) of specified name.

## انظر أيضًا

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


يحصل على الترميز حسب الاسم.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| name | const String\& | اسم [Encoding](../). |
| encoder_fallback | const EncoderFallbackPtr\& | البديل للاستخدام في الترميز. |
| decoder_fallback | const DecoderFallbackPtr\& | البديل للاستخدام في فك الترميز. |

### ReturnValue

[Encoding](../) of specified name.

## انظر أيضًا

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(int) method


يحصل على الترميز حسب صفحة الشيفرة.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| codepage | int | رقم صفحة الترميز. |

### ReturnValue

[Encoding](../) of specified codepage.

## انظر أيضًا

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


يحصل على الترميز حسب صفحة الشيفرة.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| codepage | int | رقم صفحة الترميز. |
| encoder_fallback | const EncoderFallbackPtr\& | البديل للاستخدام في الترميز. |
| decoder_fallback | const DecoderFallbackPtr\& | البديل للاستخدام في فك الترميز. |

### ReturnValue

[Encoding](../) of specified codepage.

## انظر أيضًا

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
