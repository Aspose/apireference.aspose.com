---
title: "System::Text::EncoderFallbackBuffer::Fallback metod"
linktitle: "Fallback"
second_title: "Aspose.Page för C++"
description: "System::Text::EncoderFallbackBuffer::Fallback metod. Implementerar den faktiska reservproceduren i C++."
type: docs
weight: 100
url: /sv/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


Implementerar den faktiska fallback‑proceduren.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| charUnknown | char_t | Teckenkodaren misslyckas med att koda. |
| index | int | Index för tecken som utlöste felet. |

### ReturnValue

Sant om bufferten behandlar okända tecken, falskt om den ignorerar dem.

## Se även

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


Implementerar den faktiska fallback‑proceduren.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| charUnknownHigh | char_t | Hög del av surrogatpar som utlöste felet. |
| charUnknownLow | char_t | Låg del av surrogatpar som utlöste felet. |
| index | int | Index för tecken som utlöste felet. |

### ReturnValue

Sant om bufferten behandlar okända tecken, falskt om den ignorerar dem.

## Se även

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
