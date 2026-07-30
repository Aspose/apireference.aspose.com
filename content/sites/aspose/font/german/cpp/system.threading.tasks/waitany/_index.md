---
title: "System::Threading::Tasks::WaitAny Methode"
linktitle: "WaitAny"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::WaitAny Methode. Wartet darauf, dass eines der bereitgestellten Task‑Objekte in C++ die Ausführung abschließt."
type: docs
weight: 2200
url: /de/cpp/system.threading.tasks/waitany/
---
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&) method


Wartet darauf, dass eines der bereitgestellten [Task](../task/)‑Objekte die Ausführung abschließt.

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Ein Array von [Task](../task/)-Instanzen, auf die gewartet werden soll. |

### ReturnValue

Der Index des abgeschlossenen Tasks im Task‑Array.

## Siehe auch

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::WaitAny(const ArrayPtr\<TaskPtr\>\&, const CancellationToken\&) method


Wartet darauf, dass eines der bereitgestellten [Task](../task/)‑Objekte die Ausführung abschließt.

```cpp
int32_t System::Threading::Tasks::WaitAny(const ArrayPtr<TaskPtr> &tasks, const CancellationToken &cancellationToken)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| tasks | const ArrayPtr\<TaskPtr\>\& | Ein Array von [Task](../task/)-Instanzen, auf die gewartet werden soll. |
| cancellationToken | const CancellationToken\& | Ein [CancellationToken](../../system.threading/cancellationtoken/), das während des Wartens auf den Abschluss der Tasks beobachtet wird. |

### ReturnValue

Der Index des abgeschlossenen Tasks im Task‑Array.

## Siehe auch

* Typedef [ArrayPtr](../../system/arrayptr/)
* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
