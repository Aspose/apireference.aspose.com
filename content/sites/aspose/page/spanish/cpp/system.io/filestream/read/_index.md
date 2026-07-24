---
title: "System::IO::FileStream::Read método"
linktitle: "Leer"
second_title: "Aspose.Page para C++"
description: "System::IO::FileStream::Read método. Lee la cantidad especificada de bytes del flujo y los escribe en el arreglo de bytes especificado en C++."
type: docs
weight: 1300
url: /es/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Lee la cantidad especificada de bytes del flujo y los escribe en la matriz de bytes especificada.

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| búfer | const ArrayPtr\<uint8_t\>\& | La matriz de bytes donde escribir los bytes leídos. |
| desplazamiento | int32_t | Una posición basada en cero en **buffer** donde comenzar a escribir. |
| count | int32_t | El número de bytes a leer. |

### ReturnValue

El número de bytes leídos.

## Ver también

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Lee la cantidad especificada de bytes del flujo y los escribe en la matriz de bytes especificada.

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| búfer | const System::Details::ArrayView\<uint8_t\>\& | La vista del arreglo de bytes a la que se escribirán los bytes leídos. |
| desplazamiento | int32_t | Una posición basada en cero en **buffer** donde comenzar a escribir. |
| count | int32_t | El número de bytes a leer. |

### ReturnValue

El número de bytes leídos.

## Ver también

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
