---
title: "System::Threading::Tasks::ResultTask::ResultTask‑konstruktor"
linktitle: "ResultTask"
second_title: "Aspose.Page för C++"
description: "System::Threading::Tasks::ResultTask::ResultTask‑konstruktor. Intern implementation. Inte avsedd för användarkod i C++."
type: docs
weight: 100
url: /sv/cpp/system.threading.tasks/resulttask/resulttask/
---
## ResultTask::ResultTask() constructor


Intern implementation. Inte för användarkod.

```cpp
System::Threading::Tasks::ResultTask<T>::ResultTask()
```

## Anmärkningar


Intern konstruktor för att skapa oinitierade resultat‑tasks
## Se även

* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultTask::ResultTask(const Func\<T\>\&) constructor


Skapar en [ResultTask](../) med en funktion som returnerar ett värde.

```cpp
System::Threading::Tasks::ResultTask<T>::ResultTask(const Func<T> &function)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| funktion | const Func\<T\>\& | Funktionen som ska köras asynkront och som returnerar ett resultat |

## Se även

* Class [Func](../../../system/func/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultTask::ResultTask(const T\&) constructor


Intern konstruktor för att skapa resultattasks med angivet resultat.

```cpp
System::Threading::Tasks::ResultTask<T>::ResultTask(const T &result)
```

## Se även

* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
