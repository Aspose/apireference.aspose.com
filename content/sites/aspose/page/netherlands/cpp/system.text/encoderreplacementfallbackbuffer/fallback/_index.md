---
title: "System::Text::EncoderReplacementFallbackBuffer::Fallback method"
linktitle: "Fallback"
second_title: "Aspose.Page voor C++"
description: "System::Text::EncoderReplacementFallbackBuffer::Fallback-methode. Behandelt coderingsfouten in C++."
type: docs
weight: 200
url: /nl/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


Behandelt coderingsfout.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| charUnknown | char_t | Onbekend teken; genegeerd. |
| index | int | Onbekende tekenpositie; genegeerd. |

### ReturnValue

Waar als een vervangingsreeks is opgegeven en niet leeg is, anders onwaar.

## Zie ook

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


Behandelt coderingsfout.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| charUnknownHigh | char_t | Hoge component van het surrogate-paar dat de fout veroorzaakte. |
| charUnknownLow | char_t | Lage component van het surrogate-paar dat de fout veroorzaakte. |
| index | int | Onbekende tekenpositie; genegeerd. |

### ReturnValue

Waar als een vervangingsreeks is opgegeven en niet leeg is, anders onwaar.

## Zie ook

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
