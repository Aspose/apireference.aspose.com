---
title: "System::Text::Encoding::GetEncoding 메서드"
linktitle: "GetEncoding"
second_title: "C++용 Aspose.Page"
description: "System::Text::Encoding::GetEncoding 메서드. C++에서 이름으로 인코딩을 가져옵니다."
type: docs
weight: 4100
url: /ko/cpp/system.text/encoding/getencoding/
---
## Encoding::GetEncoding(const String\&) method


이름으로 인코딩을 가져옵니다.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | const String\& | [Encoding](../) 이름. |

### ReturnValue

[Encoding](../) of specified name.

## 또 보기

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


이름으로 인코딩을 가져옵니다.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | const String\& | [Encoding](../) 이름. |
| encoder_fallback | const EncoderFallbackPtr\& | 인코딩에 사용할 폴백. |
| decoder_fallback | const DecoderFallbackPtr\& | 디코딩에 사용할 폴백. |

### ReturnValue

[Encoding](../) of specified name.

## 또 보기

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(int) method


코드 페이지로 인코딩을 가져옵니다.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| codepage | int | 코드 페이지 번호. |

### ReturnValue

[Encoding](../) of specified codepage.

## 또 보기

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


코드 페이지로 인코딩을 가져옵니다.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| codepage | int | 코드 페이지 번호. |
| encoder_fallback | const EncoderFallbackPtr\& | 인코딩에 사용할 폴백. |
| decoder_fallback | const DecoderFallbackPtr\& | 디코딩에 사용할 폴백. |

### ReturnValue

[Encoding](../) of specified codepage.

## 또 보기

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
