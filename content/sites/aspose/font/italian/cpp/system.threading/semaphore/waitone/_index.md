---
title: "Metodo System::Threading::Semaphore::WaitOne"
linktitle: "WaitOne"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Semaphore::WaitOne. Blocca il semaforo. Esegue un'attesa illimitata se necessario in C++."
type: docs
weight: 500
url: /it/cpp/system.threading/semaphore/waitone/
---
## Semaphore::WaitOne() method


Blocca il semaforo. Esegue attesa illimitata se necessario.

```cpp
virtual bool System::Threading::Semaphore::WaitOne() override
```


### ReturnValue

Restituisce sempre true poiché non ritorna finché il semaforo non è bloccato.

## Vedi anche

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Semaphore::WaitOne(int) method


Blocca il semaforo. Esegue attesa se necessario.

```cpp
virtual bool System::Threading::Semaphore::WaitOne(int millisecondsTimeout) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| millisecondsTimeout | int | Timeout di attesa in millisecondi. |

### ReturnValue

Restituisce true se il semaforo è stato bloccato o false se il timeout è stato superato.

## Vedi anche

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
