---
title: "metodo System::Text::EncoderFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Page per C++"
description: "metodo System::Text::EncoderFallbackBuffer::Fallback. Implementa la procedura di fallback reale in C++."
type: docs
weight: 100
url: /it/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


Implementa la procedura di fallback reale.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| charUnknown | char_t | Il codificatore di caratteri non riesce a codificare. |
| indice | int | Indice del carattere che ha generato l'errore. |

### ReturnValue

True se il buffer elabora caratteri sconosciuti, false se li ignora.

## Vedi anche

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


Implementa la procedura di fallback reale.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| charUnknownHigh | char_t | Parte alta della coppia surrogata che ha generato l'errore. |
| charUnknownLow | char_t | Parte bassa della coppia surrogata che ha generato l'errore. |
| indice | int | Indice del carattere che ha generato l'errore. |

### ReturnValue

True se il buffer elabora caratteri sconosciuti, false se li ignora.

## Vedi anche

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
