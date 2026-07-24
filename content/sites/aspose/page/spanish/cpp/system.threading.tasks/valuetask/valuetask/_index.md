---
title: "Constructor System::Threading::Tasks::ValueTask::ValueTask"
linktitle: "ValueTask"
second_title: "Aspose.Page para C++"
description: "Constructor System::Threading::Tasks::ValueTask::ValueTask. Construye un ValueTask vacío y sin inicializar en C++."
type: docs
weight: 100
url: /es/cpp/system.threading.tasks/valuetask/valuetask/
---
## ValueTask::ValueTask() constructor


Construye un [ValueTask](../) vacío y sin inicializar.

```cpp
System::Threading::Tasks::ValueTask::ValueTask()
```

## Observaciones



La tarea no está completada y no contiene resultado. Intentar obtener el resultado lanzará una excepción.

## Ver también

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


Construye un [ValueTask](../) a partir de un puntero compartido a un [Task](../../task/).

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| task | const TaskPtr\& | La tarea a envolver. Puede ser nula para una tarea vacía. |
## Observaciones



El [ValueTask](../) representará el estado de la tarea proporcionada.

## Ver también

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
