---
title: "System::Text::Encoding::GetEncoding 方法"
linktitle: "GetEncoding"
second_title: "Aspose.Font 适用于 C++"
description: "System::Text::Encoding::GetEncoding 方法。 在 C++ 中通过名称获取编码。"
type: docs
weight: 4100
url: /zh/cpp/system.text/encoding/getencoding/
---
## Encoding::GetEncoding(const String\&) method


通过名称获取编码。

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| name | const String\& | [Encoding](../) 名称。 |

### ReturnValue

[Encoding](../) of specified name.

## 另见

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetEncoding(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


通过名称获取编码。

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| name | const String\& | [Encoding](../) 名称。 |
| encoder_fallback | const EncoderFallbackPtr\& | 用于编码的回退。 |
| decoder_fallback | const DecoderFallbackPtr\& | 用于解码的回退。 |

### ReturnValue

[Encoding](../) of specified name.

## 另见

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetEncoding(int) method


通过代码页获取编码。

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| codepage | int | 代码页编号。 |

### ReturnValue

[Encoding](../) of specified codepage.

## 另见

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetEncoding(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


通过代码页获取编码。

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| codepage | int | 代码页编号。 |
| encoder_fallback | const EncoderFallbackPtr\& | 用于编码的回退。 |
| decoder_fallback | const DecoderFallbackPtr\& | 用于解码的回退。 |

### ReturnValue

[Encoding](../) of specified codepage.

## 另见

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
