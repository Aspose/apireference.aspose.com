---
title: "Método System::IO::Stream::FlushAsync"
linktitle: "FlushAsync"
second_title: "Aspose.Page para C++"
description: "Método System::IO::Stream::FlushAsync. Vacía de forma asíncrona todos los buffers de este stream, hace que los datos almacenados se escriban en el dispositivo subyacente y supervisa las solicitudes de cancelación en C++."
type: docs
weight: 900
url: /es/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


Borra de forma asíncrona todos los búferes de este flujo, hace que cualquier dato almacenado se escriba en el dispositivo subyacente y supervisa las solicitudes de cancelación.

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

Una tarea que representa la operación de vaciado asíncrona.

## Ver también

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


Borra de forma asíncrona todos los búferes de este flujo, hace que cualquier dato almacenado se escriba en el dispositivo subyacente y supervisa las solicitudes de cancelación.

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | El token para supervisar las solicitudes de cancelación. |

### ReturnValue

Una tarea que representa la operación de vaciado asíncrona.

## Ver también

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
