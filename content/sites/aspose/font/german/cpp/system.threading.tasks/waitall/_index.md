---
title: "System::Threading::Tasks::WaitAll Methode"
linktitle: "WaitAll"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::WaitAll Methode. Wartet darauf, dass alle bereitgestellten Task‑Objekte ihre Ausführung in C++ abschließen."
type: docs
weight: 2000
url: /de/cpp/system.threading.tasks/waitall/
---
## System::Threading::Tasks::WaitAll(const ArrayPtr\<TaskPtr\>\&) method


Wartet darauf, dass alle bereitgestellten [Task](../task/)-Objekte ihre Ausführung abschließen.

```cpp
void System::Threading::Tasks::WaitAll(const ArrayPtr<TaskPtr> &tasks)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Ein Array von [Task](../task/)-Instanzen, auf die gewartet werden soll. |

## Siehe auch

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WaitAll(const ArrayPtr\<TaskPtr\>\&, const CancellationToken\&) method


Wartet darauf, dass alle bereitgestellten [Task](../task/)-Objekte ihre Ausführung abschließen.

```cpp
void System::Threading::Tasks::WaitAll(const ArrayPtr<TaskPtr> &tasks, const CancellationToken &cancellationToken)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Ein Array von [Task](../task/)-Instanzen, auf die gewartet werden soll. |
| cancellationToken | const CancellationToken\& | Ein [CancellationToken](../../system.threading/cancellationtoken/), das während des Wartens auf den Abschluss der Tasks beobachtet wird. |

## Siehe auch

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
