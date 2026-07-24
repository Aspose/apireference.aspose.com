---
title: "System::Threading::WaitHandle::WaitAny metodo"
linktitle: "WaitAny"
second_title: "Aspose.Page per C++"
description: "Metodo System::Threading::WaitHandle::WaitAny. Attende che uno qualsiasi degli handle venga attivato in C++."
type: docs
weight: 200
url: /it/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Attende che uno qualsiasi dei handle venga attivato.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handle da attendere. |

### ReturnValue

Vero quando ogni elemento in waitHandles ha ricevuto un segnale; altrimenti il metodo non ritorna mai.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


Attende che uno qualsiasi dei handle venga attivato.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handle da attendere. |
| millisecondsTimeout | int | [Timeout](../../timeout/) da attendere, in millisecondi; -1 indica attesa infinita, 0 indica controllo e ritorno, i valori positivi sono timeout. |

### ReturnValue

True se qualche handle è stato attivato, false se il timeout è stato superato.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Attende che uno qualsiasi dei handle venga attivato.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handle da attendere. |
| timeout | TimeSpan | Un [System::TimeSpan](../../../system/timespan/) che rappresenta il numero di millisecondi da attendere, oppure un [System::TimeSpan](../../../system/timespan/) che rappresenta -1 millisecondi per attendere indefinitamente. |

### ReturnValue

True se qualche handle è stato attivato, false se il timeout è stato superato.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
