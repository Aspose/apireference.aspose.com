---
title: "System::Text::EncoderExceptionFallbackBuffer::Fallback method"
linktitle: "Fallback"
second_title: "Aspose.Page voor C++"
description: "System::Text::EncoderExceptionFallbackBuffer::Fallback method. Verwerkt coderingsfout in C++."
type: docs
weight: 200
url: /nl/cpp/system.text/encoderexceptionfallbackbuffer/fallback/
---
## EncoderExceptionFallbackBuffer::Fallback(char_t, int) method


Behandelt coderingsfout.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| charUnknown | char_t | Onbekende tekens; genegeerd. |
| index | int | Onbekende tekenverschuiving; genegeerd. |

### ReturnValue

Geeft nooit daadwerkelijk terug, gooit in plaats daarvan.

## Zie ook

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderExceptionFallbackBuffer::Fallback(char_t, char_t, int) method


Behandelt coderingsfout.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| charUnknownHigh | char_t | Hoge component van het surrogate-paar dat de fout veroorzaakte. |
| charUnknownLow | char_t | Lage component van het surrogate-paar dat de fout veroorzaakte. |
| index | int | Onbekende tekenverschuiving; genegeerd. |

### ReturnValue

Geeft nooit daadwerkelijk terug, gooit in plaats daarvan.

## Zie ook

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
