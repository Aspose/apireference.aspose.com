---
title: "System::Threading::TimerQueue class"
linktitle: "TimerQueue"
second_title: "Aspose.Page para C++"
description: "System::Threading::TimerQueue class. Cola que maneja objetos Timer. Esta es solo una implementación. Los objetos Timer se registran allí por sí mismos, no tiene que hacerlo para utilizarlos; use la API de la clase Timer en su lugar. Este es un tipo singleton con la gestión de memoria realizada mediante función(es) de acceso. Nunca debe crear instancias de él directamente en C++."
type: docs
weight: 1600
url: /es/cpp/system.threading/timerqueue/
---
## TimerQueue class


Cola que maneja objetos [Timer](../timer/). Esto es solo una implementación. Los objetos [Timer](../timer/) se registran allí por sí mismos, no tienes que hacerlo para usarlos - usa la API de la clase [Timer](../timer/) en su lugar. Este es un tipo singleton con la gestión de memoria realizada mediante función(es) de acceso. Nunca deberías crear instancias de él directamente.

```cpp
class TimerQueue
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Add](./add/)(Timer *) | Registra el temporizador en la cola. |
| [Delete](./delete/)(Timer *) | Elimina el temporizador de la cola. |
| static [GetInstance](./getinstance/)() | Singleton de implementación. |
| static [JoinWorkerThread](./joinworkerthread/)() | Une el hilo de trabajo. Espera indefinidamente si es necesario. |
| [operator=](./operator=/)(const TimerQueue\&) | Sin copia. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | Sin copia. |
## Ver también

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
