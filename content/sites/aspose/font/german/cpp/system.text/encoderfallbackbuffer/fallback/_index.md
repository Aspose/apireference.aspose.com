---
title: "System::Text::EncoderFallbackBuffer::Fallback Methode"
linktitle: "Fallback"
second_title: "Aspose.Font für C++"
description: "System::Text::EncoderFallbackBuffer::Fallback Methode. Implementiert das eigentliche Fallback-Verfahren in C++."
type: docs
weight: 100
url: /de/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


Implementiert das eigentliche Fallback-Verfahren.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| charUnknown | char_t | Zeichencodierer schlägt beim Codieren fehl. |
| Index | int | Index des Zeichens, das den Fehler ausgelöst hat. |

### ReturnValue

Wahr, wenn der Puffer unbekannte Zeichen verarbeitet, falsch, wenn er sie ignoriert.

## Siehe auch

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


Implementiert das eigentliche Fallback-Verfahren.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| charUnknownHigh | char_t | Hoher Teil des Surrogatpaars, das den Fehler ausgelöst hat. |
| charUnknownLow | char_t | Niedriger Teil des Surrogatpaars, das den Fehler ausgelöst hat. |
| Index | int | Index des Zeichens, das den Fehler ausgelöst hat. |

### ReturnValue

Wahr, wenn der Puffer unbekannte Zeichen verarbeitet, falsch, wenn er sie ignoriert.

## Siehe auch

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
