---
title: "System::Text::Encoding::GetEncoding メソッド"
linktitle: "GetEncoding"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::Encoding::GetEncoding メソッド。C++ で名前からエンコーディングを取得します。"
type: docs
weight: 4100
url: /ja/cpp/system.text/encoding/getencoding/
---
## Encoding::GetEncoding(const String\&) method


名前でエンコーディングを取得します。

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | const String\& | [Encoding](../) 名。 |

### ReturnValue

[Encoding](../) of specified name.

## 参照

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


名前でエンコーディングを取得します。

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | const String\& | [Encoding](../) 名。 |
| encoder_fallback | const EncoderFallbackPtr\& | エンコーディングに使用するフォールバック。 |
| decoder_fallback | const DecoderFallbackPtr\& | デコードに使用するフォールバック。 |

### ReturnValue

[Encoding](../) of specified name.

## 参照

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(int) method


コードページでエンコーディングを取得します。

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| codepage | int | コードページ番号。 |

### ReturnValue

[Encoding](../) of specified codepage.

## 参照

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


コードページでエンコーディングを取得します。

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| codepage | int | コードページ番号。 |
| encoder_fallback | const EncoderFallbackPtr\& | エンコーディングに使用するフォールバック。 |
| decoder_fallback | const DecoderFallbackPtr\& | デコードに使用するフォールバック。 |

### ReturnValue

[Encoding](../) of specified codepage.

## 参照

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
