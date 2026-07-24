---
title: "System::Threading::Tasks::ValueTask::ValueTask constructor"
linktitle: "ValueTask"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::ValueTask::ValueTask constructor. Construeert een lege, niet-geïnitieerde ValueTask in C++."
type: docs
weight: 100
url: /nl/cpp/system.threading.tasks/valuetask/valuetask/
---
## ValueTask::ValueTask() constructor


Construeert een lege, niet-geïnitieerde [ValueTask](../).

```cpp
System::Threading::Tasks::ValueTask::ValueTask()
```

## Opmerkingen



De taak is niet voltooid en bevat geen resultaat. Poging om het resultaat op te halen zal een uitzondering veroorzaken.

## Zie ook

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


Construeert een [ValueTask](../) vanuit een gedeelde pointer naar een [Task](../../task/).

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| task | const TaskPtr\& | De taak om te wikkelen. Kan null zijn voor een lege taak. |
## Opmerkingen



De [ValueTask](../) zal de status van de opgegeven taak vertegenwoordigen.

## Zie ook

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
