---
title: "System::IO::FileStream::ReadAsync método"
linktitle: "ReadAsync"
second_title: "Aspose.Page para C++"
description: "System::IO::FileStream::ReadAsync método. Lee de forma asíncrona una secuencia de bytes del flujo actual, avanza la posición dentro del flujo en la cantidad de bytes leídos y supervisa las solicitudes de cancelación en C++."
type: docs
weight: 1400
url: /es/cpp/system.io/filestream/readasync/
---
## FileStream::ReadAsync method


Lee de forma asíncrona una secuencia de bytes del flujo actual, avanza la posición dentro del flujo en la cantidad de bytes leídos y supervisa las solicitudes de cancelación.

```cpp
RTaskPtr<int32_t> System::IO::FileStream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| búfer | const ArrayPtr\<uint8_t\>\& | La matriz de bytes donde escribir los bytes leídos. |
| desplazamiento | int32_t | Una posición basada en cero en **buffer** donde comenzar a escribir. |
| count | int32_t | El número de bytes a leer. |
| cancellationToken | const Threading::CancellationToken\& | El token para supervisar las solicitudes de cancelación. |

### ReturnValue

Una tarea que representa la operación de lectura asíncrona. El valor del parámetro TResult contiene el número total de bytes leídos en el buffer. El valor del resultado puede ser menor que la cantidad de bytes solicitada si la cantidad de bytes actualmente disponible es menor que la solicitada, o puede ser 0 (cero) si se ha alcanzado el final del flujo.

## Ver también

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
