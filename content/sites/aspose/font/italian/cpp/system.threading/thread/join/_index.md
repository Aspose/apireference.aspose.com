---
title: "Metodo System::Threading::Thread::Join"
linktitle: "Join"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Thread::Join. Unisce il thread gestito. Esegue un'attesa illimitata se necessario in C++."
type: docs
weight: 1400
url: /it/cpp/system.threading/thread/join/
---
## Thread::Join() method


Unisce il thread gestito. Esegue un'attesa illimitata se necessario.

```cpp
void System::Threading::Thread::Join()
```

## Vedi anche

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(int) method


Unisce il thread gestito. Esegue un'attesa limitata.

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| millisecondsTimeout | int | Timeout di attesa in millisecondi. |

### ReturnValue

True se il thread è stato unito con successo, false se il timeout è stato superato.

## Vedi anche

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Thread::Join(TimeSpan) method


Unisce il thread gestito. Esegue un'attesa limitata.

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| timeout | TimeSpan | Un [TimeSpan](../../../system/timespan/) impostato alla quantità di tempo da attendere per la terminazione del thread. |

### ReturnValue

True se il thread è stato unito con successo, false se il timeout è stato superato.

## Vedi anche

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
