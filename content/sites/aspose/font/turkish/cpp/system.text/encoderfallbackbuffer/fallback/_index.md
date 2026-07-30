---
title: "System::Text::EncoderFallbackBuffer::Fallback yöntemi"
linktitle: "Fallback"
second_title: "Aspose.Font için C++"
description: "System::Text::EncoderFallbackBuffer::Fallback yöntemi. C++'ta gerçek geri dönüş prosedürünü uygular."
type: docs
weight: 100
url: /tr/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


Gerçek geri dönüş prosedürünü uygular.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| charUnknown | char_t | Karakter kodlayıcı kodlamayı başaramadı. |
| indeks | int | Hata oluşturan karakterin indeksi. |

### ReturnValue

Tampon bilinmeyen karakterleri işliyorsa doğru, yok sayıyorsa yanlış.

## Ayrıca Bakınız

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


Gerçek geri dönüş prosedürünü uygular.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| charUnknownHigh | char_t | Hata oluşturan surrogate çiftinin yüksek kısmı. |
| charUnknownLow | char_t | Hata oluşturan surrogate çiftinin düşük kısmı. |
| indeks | int | Hata oluşturan karakterin indeksi. |

### ReturnValue

Tampon bilinmeyen karakterleri işliyorsa doğru, yok sayıyorsa yanlış.

## Ayrıca Bakınız

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
