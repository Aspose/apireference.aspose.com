---
title: "Método System::IO::MemoryStream::TryGetBuffer"
linktitle: "TryGetBuffer"
second_title: "Aspose.Page para C++"
description: "Método System::IO::MemoryStream::TryGetBuffer. Devuelve la matriz de bytes sin signo a partir de la cual se creó este flujo en C++."
type: docs
weight: 1800
url: /es/cpp/system.io/memorystream/trygetbuffer/
---
## MemoryStream::TryGetBuffer method


Devuelve la matriz de bytes sin signo con la que se creó este flujo.

```cpp
bool System::IO::MemoryStream::TryGetBuffer(ArraySegment<uint8_t> &buffer)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| búfer | ArraySegment\<uint8_t\>\& | matriz de bytes - parámetro de salida. Cuando este método devuelve verdadero, el segmento de matriz de bytes del cual se creó este flujo; cuando devuelve falso, este parámetro se establece al valor predeterminado. |

### ReturnValue

Verdadero si la conversión tuvo éxito.

## Ver también

* Class [ArraySegment](../../../system/arraysegment/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
