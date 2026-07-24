---
title: "System::Threading::Tasks::ValueTask::ValueTask Konstruktor"
linktitle: "ValueTask"
second_title: "Aspose.Page für C++"
description: "System::Threading::Tasks::ValueTask::ValueTask Konstruktor. Konstruiert ein leeres, nicht initialisiertes ValueTask in C++."
type: docs
weight: 100
url: /de/cpp/system.threading.tasks/valuetask/valuetask/
---
## ValueTask::ValueTask() constructor


Konstruiert ein leeres, nicht initialisiertes [ValueTask](../).

```cpp
System::Threading::Tasks::ValueTask::ValueTask()
```

## Hinweise



Die Aufgabe ist nicht abgeschlossen und enthält kein Ergebnis. Der Versuch, das Ergebnis abzurufen, löst eine Ausnahme aus.

## Siehe auch

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


Konstruiert ein [ValueTask](../) aus einem gemeinsamen Zeiger auf ein [Task](../../task/).

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aufgabe | const TaskPtr\& | Die Aufgabe, die eingewickelt werden soll. Kann für eine leere Aufgabe null sein. |
## Hinweise



Der [ValueTask](../) wird den Zustand der bereitgestellten Aufgabe darstellen.

## Siehe auch

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
