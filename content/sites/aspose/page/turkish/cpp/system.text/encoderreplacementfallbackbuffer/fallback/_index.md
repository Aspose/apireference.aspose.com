---
title: "System::Text::EncoderReplacementFallbackBuffer::Fallback yöntemi"
linktitle: "Fallback"
second_title: "Aspose.Page için C++"
description: "System::Text::EncoderReplacementFallbackBuffer::Fallback yöntemi. C++'de kodlama hatasını işler."
type: docs
weight: 200
url: /tr/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


Kodlama hatasını ele alır.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| charUnknown | char_t | Bilinmeyen karakter; yoksayıldı. |
| indeks | int | Bilinmeyen karakter konumu; yoksayıldı. |

### ReturnValue

Yerine koyma dizesi sağlanmış ve boş değilse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


Kodlama hatasını ele alır.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| charUnknownHigh | char_t | Hata tetikleyen surrogate çiftinin yüksek kısmı. |
| charUnknownLow | char_t | Hata tetikleyen surrogate çiftinin düşük kısmı. |
| indeks | int | Bilinmeyen karakter konumu; yoksayıldı. |

### ReturnValue

Yerine koyma dizesi sağlanmış ve boş değilse doğru, aksi takdirde yanlış.

## Ayrıca Bakınız

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
