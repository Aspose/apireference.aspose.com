---
title: "System::Text::EncoderExceptionFallbackBuffer::Fallback metod"
linktitle: "Fallback"
second_title: "Aspose.Page för C++"
description: "System::Text::EncoderExceptionFallbackBuffer::Fallback metod. Hanterar kodningsfel i C++."
type: docs
weight: 200
url: /sv/cpp/system.text/encoderexceptionfallbackbuffer/fallback/
---
## EncoderExceptionFallbackBuffer::Fallback(char_t, int) method


Hantera kodningsfel.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| charUnknown | char_t | Okända tecken; ignorerade. |
| index | int | Okänt teckenförskjutning; ignorerad. |

### ReturnValue

Returnerar aldrig faktiskt, kastar istället.

## Se även

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderExceptionFallbackBuffer::Fallback(char_t, char_t, int) method


Hantera kodningsfel.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| charUnknownHigh | char_t | Hög del av surrogatpar som utlöste felet. |
| charUnknownLow | char_t | Låg del av surrogatpar som utlöste felet. |
| index | int | Okänt teckenförskjutning; ignorerad. |

### ReturnValue

Returnerar aldrig faktiskt, kastar istället.

## Se även

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
