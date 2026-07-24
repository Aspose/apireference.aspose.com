---
title: "System::Text::EncoderFallbackBuffer::Fallback methode"
linktitle: "Fallback"
second_title: "Aspose.Page voor C++"
description: "System::Text::EncoderFallbackBuffer::Fallback methode. Implementeert de daadwerkelijke fallback-procedure in C++."
type: docs
weight: 100
url: /nl/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


Implementeert de daadwerkelijke fallback‑procedure.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| charUnknown | char_t | Karaktercoder faalt bij het coderen. |
| index | int | Index van het teken dat de fout veroorzaakte. |

### ReturnValue

True als de buffer onbekende tekens verwerkt, false als hij ze negeert.

## Zie ook

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


Implementeert de daadwerkelijke fallback‑procedure.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| charUnknownHigh | char_t | Hoge component van het surrogate-paar dat de fout veroorzaakte. |
| charUnknownLow | char_t | Lage component van het surrogate-paar dat de fout veroorzaakte. |
| index | int | Index van het teken dat de fout veroorzaakte. |

### ReturnValue

True als de buffer onbekende tekens verwerkt, false als hij ze negeert.

## Zie ook

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
