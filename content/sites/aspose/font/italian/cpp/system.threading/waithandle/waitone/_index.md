---
title: "System::Threading::WaitHandle::WaitOne metodo"
linktitle: "WaitOne"
second_title: "Aspose.Font per C++"
description: "System::Threading::WaitHandle::WaitOne metodo. Attende che l'handle venga attivato per un periodo illimitato in C++."
type: docs
weight: 600
url: /it/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


Attende che l'handle venga attivato per un periodo illimitato.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

Restituisce sempre vero poiché non si verifica alcun timeout.

## Vedi anche

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(int) method


Attende che l'handle venga attivato.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) da attendere, in millisecondi; -1 indica attesa infinita, 0 indica verifica e ritorno, i valori positivi sono timeout. |

### ReturnValue

Vero se l'handle è stato attivato, falso se il timeout è scaduto.

## Vedi anche

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


Attende che l'handle venga attivato.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) da attendere, in millisecondi; -1 indica attesa infinita, 0 indica verifica e ritorno, i valori positivi sono timeout. |
| exitContext | bool | Se vero, l'attesa dovrebbe rilasciare il lock sull'handle prima di attendere. |

### ReturnValue

Vero se l'handle è stato attivato, falso se il timeout è scaduto.

## Vedi anche

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


Attende che l'handle venga attivato.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| timeout | TimeSpan | Un [System::TimeSpan](../../../system/timespan/) che rappresenta il numero di millisecondi da attendere, oppure un [System::TimeSpan](../../../system/timespan/) che rappresenta -1 millisecondi per attendere indefinitamente. |

### ReturnValue

Vero se l'handle è stato attivato, falso se il timeout è scaduto.

## Vedi anche

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
