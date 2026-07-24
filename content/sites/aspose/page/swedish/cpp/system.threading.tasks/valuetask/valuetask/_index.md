---
title: "System::Threading::Tasks::ValueTask::ValueTask-konstruktor"
linktitle: "ValueTask"
second_title: "Aspose.Page för C++"
description: "System::Threading::Tasks::ValueTask::ValueTask-konstruktor. Skapar ett tomt, oinitierat ValueTask i C++."
type: docs
weight: 100
url: /sv/cpp/system.threading.tasks/valuetask/valuetask/
---
## ValueTask::ValueTask() constructor


Skapar ett tomt, oinitierat [ValueTask](../).

```cpp
System::Threading::Tasks::ValueTask::ValueTask()
```

## Anmärkningar



Uppgiften är inte slutförd och innehåller inget resultat. Försök att hämta resultatet kommer att kasta ett undantag.

## Se även

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


Skapar ett [ValueTask](../) från en delad pekare till en [Task](../../task/).

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| uppgift | const TaskPtr\& | Uppgiften att omsluta. Kan vara null för en tom uppgift. |
## Anmärkningar



Den [ValueTask](../) kommer att representera tillståndet för den angivna uppgiften.

## Se även

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
