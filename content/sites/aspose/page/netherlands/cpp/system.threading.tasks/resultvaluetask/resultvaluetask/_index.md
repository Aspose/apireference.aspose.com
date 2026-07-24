---
title: "System::Threading::Tasks::ResultValueTask::ResultValueTask constructor"
linktitle: "ResultValueTask"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::ResultValueTask::ResultValueTask constructor. Maakt een lege, niet‑geïnitieerde ResultValueTask in C++."
type: docs
weight: 100
url: /nl/cpp/system.threading.tasks/resultvaluetask/resultvaluetask/
---
## ResultValueTask::ResultValueTask() constructor


Maakt een lege, niet‑geïnitieerde [ResultValueTask](../).

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask()
```

## Opmerkingen



De taak is niet voltooid en bevat geen resultaat. Poging om het resultaat op te halen zal een uitzondering veroorzaken.

## Zie ook

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


Maakt een [ResultValueTask](../) van een gedeelde pointer naar een [ResultTask<T>](../../resulttask/).

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| task | const RTaskPtr\<T\>\& | De taak om te wikkelen. Kan null zijn voor een lege taak. |
## Opmerkingen



De [ResultValueTask](../) zal de status en het resultaat van de opgegeven taak vertegenwoordigen.

## Zie ook

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


Maakt een voltooide [ResultValueTask](../) met het opgegeven resultaat.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| result | const T\& | De resultaatwaarde om te verpakken in een voltooide taak. |
## Opmerkingen



Dit maakt een succesvol voltooide taak die de waarde onmiddellijk retourneert.

## Zie ook

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
