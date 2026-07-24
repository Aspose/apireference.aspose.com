---
title: "System::Threading::Tasks::ResultTask::ContinueWith Methode"
linktitle: "ContinueWith"
second_title: "Aspose.Page für C++"
description: "System::Threading::Tasks::ResultTask::ContinueWith-Methode. Erstellt eine Fortsetzung, die ausgeführt wird, wenn die Ergebnisaufgabe in C++ abgeschlossen ist."
type: docs
weight: 300
url: /de/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


Erstellt eine Fortsetzung, die ausgeführt wird, wenn die Ergebnis‑Task abgeschlossen ist.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) zum Ausführen, wenn diese Aufgabe abgeschlossen wird, wobei diese Ergebnisaufgabe empfangen wird |

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
* Library [Aspose.Page for C++](../../../)
