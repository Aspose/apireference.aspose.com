---
title: "System::Threading::Tasks::ResultTask::ContinueWith Methode"
linktitle: "ContinueWith"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith Methode. Erstellt eine Fortsetzung, die ausgeführt wird, wenn die ResultTask in C++ abgeschlossen ist."
type: docs
weight: 400
url: /de/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith(const Action\<RTaskPtr\<T\>\>\&) method


Erstellt eine Fortsetzung, die ausgeführt wird, wenn der Ergebnis‑Task abgeschlossen ist.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) zum Ausführen, wenn diese Aufgabe abgeschlossen ist und diese ResultTask empfängt |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## Hinweise



Die Fortsetzungsaktion erhält diese [ResultTask](../), um auf den Ergebniswert zuzugreifen

## Siehe auch

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Action\<TaskPtr\>\&) method


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
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Func\<RTaskPtr\<T\>, TNewResult\>\&) method


Erstellt eine Fortsetzung, die ausgeführt wird, wenn der Ergebnis‑Task abgeschlossen ist.

```cpp
template<typename TNewResult> RTaskPtr<TNewResult> System::Threading::Tasks::ResultTask<T>::ContinueWith(const Func<RTaskPtr<T>, TNewResult> &continuationFunction)
```


| Parameter | Beschreibung |
| --- | --- |
| TNewResult | Ergebnistyp der Aufgabenfortsetzung |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| continuationFunction | const Func\<RTaskPtr\<T\>, TNewResult\>\& | Funktion, um das Fortsetzungsergebnis zu erhalten, wenn diese Aufgabe abgeschlossen ist, und diese ResultTask empfängt |

### ReturnValue

[RTaskPtr](../../../system/rtaskptr/) A new task representing the continuation
## Hinweise



Die Fortsetzungsfunktion erhält dieses [ResultTask](../), um auf den Ergebniswert zuzugreifen.

## Siehe auch

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [Func](../../../system/func/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ResultTask::ContinueWith(const Func\<TaskPtr, TResult\>\&) method


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
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
