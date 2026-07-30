---
title: "System::Text::EncoderReplacementFallbackBuffer::Fallback metodo"
linktitle: "Fallback"
second_title: "Aspose.Font per C++"
description: "System::Text::EncoderReplacementFallbackBuffer::Fallback metodo. Gestisce il fallimento della codifica in C++."
type: docs
weight: 200
url: /it/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


Gestisce i fallimenti di codifica.

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
* Library [Aspose.Font for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


Gestisce i fallimenti di codifica.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| charUnknownHigh | char_t | Parte alta della coppia surrogata che ha causato l'errore. |
| charUnknownLow | char_t | Parte bassa della coppia surrogata che ha causato l'errore. |
| indice | int | Posizione del carattere sconosciuta; ignorata. |

### ReturnValue

Vero se la stringa di sostituzione è fornita e non è vuota, falso altrimenti.

## Vedi anche

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
