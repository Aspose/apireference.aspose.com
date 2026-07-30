---
title: "Metodo System::Threading::Tasks::Delay"
linktitle: "Ritardo"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Tasks::Delay. Crea un task che si completa dopo un ritardo temporale in C++."
type: docs
weight: 1000
url: /it/cpp/system.threading.tasks/delay/
---
## System::Threading::Tasks::Delay(int32_t) method


Crea un task che si completa dopo un ritardo temporale.

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| millisecondsDelay | int32_t | Il numero di millisecondi da attendere prima di completare il task restituito, o -1 per attendere indefinitamente. |

### ReturnValue

Un task che rappresenta il ritardo temporale.

## Vedi anche

* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
## System::Threading::Tasks::Delay(int32_t, const CancellationToken\&) method


Crea un task che si completa dopo un ritardo temporale e può essere annullato.

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay, const CancellationToken &cancellationToken)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| millisecondsDelay | int32_t | Il numero di millisecondi da attendere prima di completare il task restituito, o -1 per attendere indefinitamente. |
| cancellationToken | const CancellationToken\& | Il token di cancellazione che può essere usato per annullare il ritardo. |

### ReturnValue

Un task che rappresenta il ritardo temporale.

## Vedi anche

* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
