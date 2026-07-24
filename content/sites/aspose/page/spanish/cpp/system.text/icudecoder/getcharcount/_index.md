---
title: "Método System::Text::ICUDecoder::GetCharCount"
linktitle: "GetCharCount"
second_title: "Aspose.Page para C++"
description: "System::Text::ICUDecoder::GetCharCount método. Obtiene el número de caracteres necesarios para decodificar un búfer en C++."
type: docs
weight: 400
url: /es/cpp/system.text/icudecoder/getcharcount/
---
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


Obtiene la cantidad de caracteres necesarios para decodificar un búfer.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Bytes a decodificar. |
| index | int | Desplazamiento de [Buffer](../../../system/buffer/). |
| count | int | Número de bytes a decodificar. |

### ReturnValue

Número de caracteres requeridos para decodificar el búfer.

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


Obtiene la cantidad de caracteres necesarios para decodificar un búfer.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Bytes a decodificar. |
| index | int | Desplazamiento de [Buffer](../../../system/buffer/). |
| count | int | Número de bytes a decodificar. |
| flush | bool | Si es verdadero, limpia el estado interno del decodificador después del cálculo. |

### ReturnValue

Número de caracteres requeridos para decodificar el búfer.

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetCharCount(const uint8_t *, int, bool) method


Obtiene la cantidad de caracteres necesarios para decodificar un búfer.

```cpp
virtual int System::Text::ICUDecoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| bytes | const uint8_t * | Bytes a decodificar. |
| count | int | Número de bytes a decodificar. |
| flush | bool | Si es verdadero, limpia el estado interno del decodificador después del cálculo. |

### ReturnValue

Número de caracteres requeridos para decodificar el búfer.

## Ver también

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
