---
title: "System::IO::FileStream::FlushAsync método"
linktitle: "FlushAsync"
second_title: "Aspose.Page para C++"
description: "System::IO::FileStream::FlushAsync método. Borra de forma asíncrona todos los búferes de este flujo, hace que cualquier dato almacenado se escriba en el dispositivo subyacente y supervisa las solicitudes de cancelación en C++."
type: docs
weight: 500
url: /es/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


Borra de forma asíncrona todos los búferes de este flujo, hace que cualquier dato almacenado se escriba en el dispositivo subyacente y supervisa las solicitudes de cancelación.

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | El token para supervisar las solicitudes de cancelación. |

### ReturnValue

Una tarea que representa la operación de vaciado asíncrona.

## Ver también

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
