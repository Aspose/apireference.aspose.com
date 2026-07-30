---
title: "Metodo System::Text::EncoderExceptionFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Font per C++"
description: "Metodo System::Text::EncoderExceptionFallbackBuffer::Fallback. Gestisce il fallimento della codifica in C++."
type: docs
weight: 200
url: /it/cpp/system.text/encoderexceptionfallbackbuffer/fallback/
---
## EncoderExceptionFallbackBuffer::Fallback(char_t, int) method


Gestisce i fallimenti di codifica.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| charUnknown | char_t | Caratteri sconosciuti; ignorati. |
| indice | int | Offset dei caratteri sconosciuti; ignorato. |

### ReturnValue

Non restituisce mai realmente, lancia invece un'eccezione.

## Vedi anche

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncoderExceptionFallbackBuffer::Fallback(char_t, char_t, int) method


Gestisce i fallimenti di codifica.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| charUnknownHigh | char_t | Parte alta della coppia surrogata che ha causato l'errore. |
| charUnknownLow | char_t | Parte bassa della coppia surrogata che ha causato l'errore. |
| indice | int | Offset del carattere sconosciuto; ignorato. |

### ReturnValue

Non restituisce mai realmente, lancia invece un'eccezione.

## Vedi anche

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
