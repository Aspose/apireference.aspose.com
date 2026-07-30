---
title: "Metodo System::Threading::Tasks::FromCanceled"
linktitle: "FromCanceled"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Tasks::FromCanceled. Crea un task che è stato completato a causa della cancellazione con il token specificato in C++."
type: docs
weight: 1200
url: /it/cpp/system.threading.tasks/fromcanceled/
---
## System::Threading::Tasks::FromCanceled method


Crea un task che è stato completato a causa della cancellazione con il token specificato.

```cpp
TaskPtr System::Threading::Tasks::FromCanceled(const CancellationToken &cancellationToken)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| cancellationToken | const CancellationToken\& | Il token di cancellazione che ha causato l'annullamento del task. |

### ReturnValue

Un task annullato.

## Vedi anche

* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
