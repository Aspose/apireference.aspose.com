---
title: "System::Text::EncoderReplacementFallbackBuffer::Fallback-metod"
linktitle: "Fallback"
second_title: "Aspose.Page för C++"
description: "System::Text::EncoderReplacementFallbackBuffer::Fallback-metod. Hanterar kodningsfel i C++."
type: docs
weight: 200
url: /sv/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


Hantera kodningsfel.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| charUnknown | char_t | Okänt tecken; ignorerat. |
| index | int | Okänd teckenposition; ignorerat. |

### ReturnValue

Sant om ersättningssträngen är angiven och inte är tom, annars falskt.

## Se även

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


Hantera kodningsfel.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| charUnknownHigh | char_t | Hög del av surrogatpar som utlöste felet. |
| charUnknownLow | char_t | Låg del av surrogatpar som utlöste felet. |
| index | int | Okänd teckenposition; ignorerat. |

### ReturnValue

Sant om ersättningssträngen är angiven och inte är tom, annars falskt.

## Se även

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
