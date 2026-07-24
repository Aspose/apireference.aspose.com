---
title: "Metodo System::Text::EncoderReplacementFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Page per C++"
description: "Metodo System::Text::EncoderReplacementFallbackBuffer::Fallback. Gestisce il fallimento della codifica in C++."
type: docs
weight: 200
url: /it/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


Gestisce il fallimento della codifica.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| charUnknown | char_t | Carattere sconosciuto; ignorato. |
| indice | int | Posizione del carattere sconosciuta; ignorata. |

### ReturnValue

Vero se la stringa di sostituzione è fornita e non è vuota, falso altrimenti.

## Vedi anche

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


Gestisce il fallimento della codifica.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| charUnknownHigh | char_t | Parte alta della coppia surrogata che ha generato l'errore. |
| charUnknownLow | char_t | Parte bassa della coppia surrogata che ha generato l'errore. |
| indice | int | Posizione del carattere sconosciuta; ignorata. |

### ReturnValue

Vero se la stringa di sostituzione è fornita e non è vuota, falso altrimenti.

## Vedi anche

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
