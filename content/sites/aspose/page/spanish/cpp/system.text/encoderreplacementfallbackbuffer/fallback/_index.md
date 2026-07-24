---
title: "Método System::Text::EncoderReplacementFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Page para C++"
description: "Método System::Text::EncoderReplacementFallbackBuffer::Fallback. Maneja fallos de codificación en C++."
type: docs
weight: 200
url: /es/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


Maneja fallos de codificación.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| charUnknown | char_t | Carácter desconocido; ignorado. |
| índice | int | Posición de carácter desconocida; ignorada. |

### ReturnValue

True si se proporciona una cadena de reemplazo y no está vacía, false en caso contrario.

## Ver también

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


Maneja fallos de codificación.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| charUnknownHigh | char_t | Parte alta del par sustituto que provocó el error. |
| charUnknownLow | char_t | Parte baja del par sustituto que provocó el error. |
| índice | int | Posición de carácter desconocida; ignorada. |

### ReturnValue

True si se proporciona una cadena de reemplazo y no está vacía, false en caso contrario.

## Ver también

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
