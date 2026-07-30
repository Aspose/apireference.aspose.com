---
title: "System::Threading::Mutex::WaitOne metodo"
linktitle: "WaitOne"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Mutex::WaitOne. Blocca il mutex. Esegue un'attesa illimitata se necessario in C++."
type: docs
weight: 500
url: /it/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


Blocca il mutex. Esegue attesa illimitata se necessario.

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

Restituisce sempre true poiché non ritorna finché il mutex non è bloccato.

## Vedi anche

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(int) method


Blocca il mutex. Esegue attesa se necessario.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| millisecondsTimeout | int | Timeout di attesa in millisecondi. |

### ReturnValue

Restituisce true se il mutex è stato bloccato o false se il timeout è stato superato.

## Vedi anche

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


Blocca il mutex. Esegue attesa se necessario.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| timeout | TimeSpan | Un [System::TimeSpan](../../../system/timespan/) che rappresenta il numero di millisecondi da attendere, oppure un [System::TimeSpan](../../../system/timespan/) che rappresenta -1 millisecondi per attendere indefinitamente. |

### ReturnValue

Restituisce true se il mutex è stato bloccato o false se il timeout è stato superato.

## Vedi anche

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
