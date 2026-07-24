---
title: "System::Threading::Semaphore::WaitOne metodo"
linktitle: "WaitOne"
second_title: "Aspose.Page per C++"
description: "System::Threading::Semaphore::WaitOne metodo. Blocca il semaforo. Esegue attesa illimitata se necessario in C++."
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
* Library [Aspose.Page for C++](../../../)
## Semaphore::WaitOne(int) method


Blocca il semaforo. Esegue attesa se necessario.

```cpp
virtual bool System::Threading::Semaphore::WaitOne(int millisecondsTimeout) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| millisecondsTimeout | int | Timeout di attesa in millisecondi. |

### ReturnValue

Restituisce true se il semaforo è stato bloccato o false se il timeout è scaduto.

## Vedi anche

* Class [Semaphore](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
