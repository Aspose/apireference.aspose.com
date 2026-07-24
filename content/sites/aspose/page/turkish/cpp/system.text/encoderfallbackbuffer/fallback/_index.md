---
title: "System::Text::EncoderFallbackBuffer::Fallback metodu"
linktitle: "Fallback"
second_title: "Aspose.Page için C++"
description: "System::Text::EncoderFallbackBuffer::Fallback metodu. C++'ta gerçek geri dönüş prosedürünü uygular."
type: docs
weight: 100
url: /tr/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


Gerçek geri dönüş prosedürünü uygular.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| charUnknown | char_t | Karakter kodlayıcı kodlayamaz. |
| indeks | int | Hatanın tetiklediği karakterin indeksi. |

### ReturnValue

Tampon bilinmeyen karakterleri işliyorsa doğru, yok sayıyorsa yanlış.

## Ayrıca Bakınız

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


Gerçek geri dönüş prosedürünü uygular.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| charUnknownHigh | char_t | Hata tetikleyen surrogate çiftinin yüksek kısmı. |
| charUnknownLow | char_t | Hata tetikleyen surrogate çiftinin düşük kısmı. |
| indeks | int | Hatanın tetiklediği karakterin indeksi. |

### ReturnValue

Tampon bilinmeyen karakterleri işliyorsa doğru, yok sayıyorsa yanlış.

## Ayrıca Bakınız

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
