---
title: "System::Text::Encoding::GetEncoding méthode"
linktitle: "GetEncoding"
second_title: "Aspose.Font pour C++"
description: "System::Text::Encoding::GetEncoding méthode. Obtient l'encodage par nom en C++."
type: docs
weight: 4100
url: /fr/cpp/system.text/encoding/getencoding/
---
## Encoding::GetEncoding(const String\&) method


Obtient l'encodage par nom.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| name | const String\& | Nom [Encoding](../). |

### ReturnValue

[Encoding](../) of specified name.

## Voir aussi

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetEncoding(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


Obtient l'encodage par nom.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(const String &name, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| name | const String\& | Nom [Encoding](../). |
| encoder_fallback | const EncoderFallbackPtr\& | Valeur de repli à utiliser pour l'encodage. |
| decoder_fallback | const DecoderFallbackPtr\& | Valeur de repli à utiliser pour le décodage. |

### ReturnValue

[Encoding](../) of specified name.

## Voir aussi

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [String](../../../system/string/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetEncoding(int) method


Obtient l'encodage par page de codes.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| codepage | int | Numéro de page de code. |

### ReturnValue

[Encoding](../) of specified codepage.

## Voir aussi

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetEncoding(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) method


Obtient l'encodage par page de codes.

```cpp
static EncodingPtr System::Text::Encoding::GetEncoding(int codepage, const EncoderFallbackPtr &encoder_fallback, const DecoderFallbackPtr &decoder_fallback)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| codepage | int | Numéro de page de code. |
| encoder_fallback | const EncoderFallbackPtr\& | Valeur de repli à utiliser pour l'encodage. |
| decoder_fallback | const DecoderFallbackPtr\& | Valeur de repli à utiliser pour le décodage. |

### ReturnValue

[Encoding](../) of specified codepage.

## Voir aussi

* Typedef [EncodingPtr](../../../system/encodingptr/)
* Typedef [EncoderFallbackPtr](../../../system/encoderfallbackptr/)
* Typedef [DecoderFallbackPtr](../../../system/decoderfallbackptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
