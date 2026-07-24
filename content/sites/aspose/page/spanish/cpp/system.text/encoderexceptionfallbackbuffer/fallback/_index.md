---
title: "System::Text::EncoderExceptionFallbackBuffer::Fallback método"
linktitle: "Fallback"
second_title: "Aspose.Page para C++"
description: "System::Text::EncoderExceptionFallbackBuffer::Fallback método. Maneja la falla de codificación en C++."
type: docs
weight: 200
url: /es/cpp/system.text/encoderexceptionfallbackbuffer/fallback/
---
## EncoderExceptionFallbackBuffer::Fallback(char_t, int) method


Maneja fallos de codificación.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| charUnknown | char_t | Caracteres desconocidos; ignorados. |
| índice | int | Desplazamiento de caracteres desconocidos; ignorado. |

### ReturnValue

Nunca devuelve realmente, lanza una excepción en su lugar.

## Ver también

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderExceptionFallbackBuffer::Fallback(char_t, char_t, int) method


Maneja fallos de codificación.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| charUnknownHigh | char_t | Parte alta del par sustituto que provocó el error. |
| charUnknownLow | char_t | Parte baja del par sustituto que provocó el error. |
| índice | int | Desplazamiento de carácter desconocido; ignorado. |

### ReturnValue

Nunca devuelve realmente, lanza una excepción en su lugar.

## Ver también

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
