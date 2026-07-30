---
title: "System::Threading::Tasks::FromCanceled Methode"
linktitle: "FromCanceled"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::FromCanceled Methode. Erstellt einen Task, der aufgrund einer Stornierung mit dem angegebenen Token in C++ abgeschlossen ist."
type: docs
weight: 1200
url: /de/cpp/system.threading.tasks/fromcanceled/
---
## System::Threading::Tasks::FromCanceled method


Erstellt einen Task, der aufgrund einer Stornierung mit dem angegebenen Token abgeschlossen ist.

```cpp
TaskPtr System::Threading::Tasks::FromCanceled(const CancellationToken &cancellationToken)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| cancellationToken | const CancellationToken\& | Das Stornierungstoken, das den Task abgebrochen hat. |

### ReturnValue

Ein abgebrochener Task.

## Siehe auch

* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
