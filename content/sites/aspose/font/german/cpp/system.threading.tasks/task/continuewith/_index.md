---
title: "System::Threading::Tasks::Task::ContinueWith Methode"
linktitle: "ContinueWith"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::Task::ContinueWith Methode. Erstellt eine Fortsetzung, die ausgeführt wird, wenn die Aufgabe in C++ abgeschlossen ist."
type: docs
weight: 800
url: /de/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith(const Action\<TaskPtr\>\&) method


Erstellt eine Fortsetzung, die ausgeführt wird, wenn der Task abgeschlossen ist.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) zum Ausführen, wenn diese Aufgabe abgeschlossen ist |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## Siehe auch

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Task::ContinueWith(const Func\<TaskPtr, TResult\>\&) method


Erstellt eine Fortsetzung, die ausgeführt wird, wenn der Task abgeschlossen ist.

```cpp
template<typename TResult> RTaskPtr<TResult> System::Threading::Tasks::Task::ContinueWith(const Func<TaskPtr, TResult> &continuationFunction)
```


| Parameter | Beschreibung |
| --- | --- |
| TResult | Ein Typ von Task-Ergebnis |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| continuationFunction | const Func\<TaskPtr, TResult\>\& | Funktion, um das Ergebnis zu erhalten, wenn diese Aufgabe abgeschlossen ist. |

### ReturnValue

[RTaskPtr](../../../system/rtaskptr/) A new task representing the continuation

## Siehe auch

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [Func](../../../system/func/)
* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
