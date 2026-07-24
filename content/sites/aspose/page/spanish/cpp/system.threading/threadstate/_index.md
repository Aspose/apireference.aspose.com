---
title: "System::Threading::ThreadState enum"
linktitle: "ThreadState"
second_title: "Aspose.Page para C++"
description: "System::Threading::ThreadState enum. Estado del hilo en C++."
type: docs
weight: 2000
url: /es/cpp/system.threading/threadstate/
---
## ThreadState enum


Estado del hilo.

```cpp
enum class ThreadState
```

### Valores

| Nombre | Valor | Descripción |
| --- | --- | --- |
| Running | 0 | [Thread](../thread/) está en ejecución. |
| StopRequested | 1 | Se ha solicitado detener [Thread](../thread/). |
| SuspendRequested | 2 | Se ha solicitado suspender [Thread](../thread/). |
| Fondo | 4 | El hilo se está ejecutando en segundo plano. |
| Unstarted | 8 | [Thread](../thread/) no se ha iniciado. |
| Stopped | 16 | [Thread](../thread/) está detenido. |
| WaitSleepJoin | 32 | [Thread](../thread/) está esperando ser unido. |
| Suspended | 64 | [Thread](../thread/) está suspendido. |
| AbortRequested | 128 | [Thread](../thread/) se ha solicitado la abortación. |
| Aborted | 256 | [Thread](../thread/) ha sido abortado. |

## Ver también

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
