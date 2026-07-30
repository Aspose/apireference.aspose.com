---
title: "System::Text::EncoderExceptionFallbackBuffer::Fallback Methode"
linktitle: "Fallback"
second_title: "Aspose.Font für C++"
description: "System::Text::EncoderExceptionFallbackBuffer::Fallback Methode. Behandelt einen Kodierungsfehler in C++."
type: docs
weight: 200
url: /de/cpp/system.text/encoderexceptionfallbackbuffer/fallback/
---
## EncoderExceptionFallbackBuffer::Fallback(char_t, int) method


Behandelt Kodierungsfehler.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| charUnknown | char_t | Unbekannte Zeichen; ignoriert. |
| Index | int | Unbekannter Zeichenversatz; ignoriert. |

### ReturnValue

Gibt nie tatsächlich zurück, wirft stattdessen eine Ausnahme.

## Siehe auch

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncoderExceptionFallbackBuffer::Fallback(char_t, char_t, int) method


Behandelt Kodierungsfehler.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| charUnknownHigh | char_t | Hoher Teil des Surrogatpaars, das den Fehler ausgelöst hat. |
| charUnknownLow | char_t | Niedriger Teil des Surrogatpaars, das den Fehler ausgelöst hat. |
| Index | int | Unbekannter Zeichenversatz; ignoriert. |

### ReturnValue

Gibt nie tatsächlich zurück, wirft stattdessen eine Ausnahme.

## Siehe auch

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
