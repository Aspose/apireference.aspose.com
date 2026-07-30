---
title: "System::Threading::WaitHandle::WaitAny metodo"
linktitle: "WaitAny"
second_title: "Aspose.Font per C++"
description: "System::Threading::WaitHandle::WaitAny metodo. Attende che uno qualsiasi degli handle venga attivato in C++."
type: docs
weight: 200
url: /it/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Attende che uno qualsiasi degli handle venga attivato.

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
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


Attende che uno qualsiasi degli handle venga attivato.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handle da attendere. |
| millisecondsTimeout | int | [Timeout](../../timeout/) da attendere, in millisecondi; -1 indica attesa infinita, 0 indica verifica e ritorno, i valori positivi sono timeout. |

### ReturnValue

Vero se qualche handle è stato attivato, falso se il timeout è scaduto.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Attende che uno qualsiasi degli handle venga attivato.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handle da attendere. |
| timeout | TimeSpan | Un [System::TimeSpan](../../../system/timespan/) che rappresenta il numero di millisecondi da attendere, oppure un [System::TimeSpan](../../../system/timespan/) che rappresenta -1 millisecondi per attendere indefinitamente. |

### ReturnValue

Vero se qualche handle è stato attivato, falso se il timeout è scaduto.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
