---
title: "System::Threading::Tasks::ResultValueTask::ResultValueTask-Konstruktor"
linktitle: "ResultValueTask"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::ResultValueTask::ResultValueTask-Konstruktor. Erstellt ein leeres, nicht initialisiertes ResultValueTask in C++."
type: docs
weight: 100
url: /de/cpp/system.threading.tasks/resultvaluetask/resultvaluetask/
---
## ResultValueTask::ResultValueTask() constructor


Konstruiert ein leeres, nicht initialisiertes [ResultValueTask](../).

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask()
```

## Hinweise



Die Aufgabe ist nicht abgeschlossen und enthält kein Ergebnis. Der Versuch, das Ergebnis abzurufen, löst eine Ausnahme aus.

## Siehe auch

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


Konstruiert ein [ResultValueTask](../) aus einem Shared Pointer zu einem [ResultTask<T>](../../resulttask/).

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Aufgabe | const RTaskPtr\<T\>\& | Die Aufgabe, die verpackt werden soll. Kann für eine leere Aufgabe null sein. |
## Hinweise



Das [ResultValueTask](../) wird den Zustand und das Ergebnis der bereitgestellten Aufgabe darstellen.

## Siehe auch

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


Konstruiert ein abgeschlossenes [ResultValueTask](../) mit dem angegebenen Ergebnis.

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| result | const T\& | Der Ergebniswert, der in einer abgeschlossenen Aufgabe verpackt werden soll. |
## Hinweise



Dies erstellt eine erfolgreich abgeschlossene Aufgabe, die den Wert sofort zurückgibt.

## Siehe auch

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
