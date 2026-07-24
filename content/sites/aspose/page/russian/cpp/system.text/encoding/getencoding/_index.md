---
title: "Метод System::Text::Encoding::GetEncoding"
linktitle: "GetEncoding"
second_title: "Aspose.Page для C++"
description: "Метод System::Text::Encoding::GetEncoding. Получает кодировку по имени в C++."
type: docs
weight: 4100
url: /ru/cpp/system.text/encoding/getencoding/
---
## Encoding::GetEncoding(const String\&) method


Получает кодировку по имени.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | const String\& | Имя [Encoding](../). |

### ReturnValue

[Encoding](../) of specified name.

## См. также

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


Получает кодировку по имени.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | const String\& | Имя [Encoding](../). |
| encoder_fallback | const EncoderFallbackPtr\& | Запасной вариант для кодирования. |
| decoder_fallback | const DecoderFallbackPtr\& | Запасной вариант для декодирования. |

### ReturnValue

[Encoding](../) of specified name.

## См. также

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(int) method


Получает кодировку по кодовой странице.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| codepage | int | Номер кодовой страницы. |

### ReturnValue

[Encoding](../) of specified codepage.

## См. также

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetEncoding(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


Получает кодировку по кодовой странице.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| codepage | int | Номер кодовой страницы. |
| encoder_fallback | const EncoderFallbackPtr\& | Запасной вариант для кодирования. |
| decoder_fallback | const DecoderFallbackPtr\& | Запасной вариант для декодирования. |

### ReturnValue

[Encoding](../) of specified codepage.

## См. также

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
