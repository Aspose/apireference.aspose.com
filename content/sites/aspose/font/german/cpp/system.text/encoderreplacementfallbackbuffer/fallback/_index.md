---
title: "System::Text::EncoderReplacementFallbackBuffer::Fallback Methode"
linktitle: "Fallback"
second_title: "Aspose.Font für C++"
description: "System::Text::EncoderReplacementFallbackBuffer::Fallback Methode. Behandelt Codierungsfehler in C++."
type: docs
weight: 200
url: /de/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


Behandelt Kodierungsfehler.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| charUnknown | char_t | Unbekanntes Zeichen; ignoriert. |
| Index | int | Unbekannte Zeichenposition; ignoriert. |

### ReturnValue

Wahr, wenn eine Ersetzungszeichenfolge bereitgestellt wird und nicht leer ist, andernfalls falsch.

## Siehe auch

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


Behandelt Kodierungsfehler.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| charUnknownHigh | char_t | Hoher Teil des Surrogatpaars, das den Fehler ausgelöst hat. |
| charUnknownLow | char_t | Niedriger Teil des Surrogatpaars, das den Fehler ausgelöst hat. |
| Index | int | Unbekannte Zeichenposition; ignoriert. |

### ReturnValue

Wahr, wenn eine Ersetzungszeichenfolge bereitgestellt wird und nicht leer ist, andernfalls falsch.

## Siehe auch

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
